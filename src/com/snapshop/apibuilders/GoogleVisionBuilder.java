package com.snapshop.apibuilders;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import com.snapshop.utils.ReadFromConfigFile;

public class GoogleVisionBuilder {

	private final String GCV_API_URL = "GCV_ENDPOINT";
	URL serverUrl;
	URLConnection urlConnection;
	HttpURLConnection httpConnection;
	public Boolean isMockResponse = false;

	public GoogleVisionBuilder(Boolean isMock) {
		// TODO Auto-generated constructor stub
		this.isMockResponse = isMock;
		try {
			serverUrl = new URL(new ReadFromConfigFile().getContent(GCV_API_URL));
			urlConnection = serverUrl.openConnection();
			httpConnection = (HttpURLConnection) urlConnection;

			httpConnection.setRequestMethod("POST");
			httpConnection.setRequestProperty("Content-Type", "application/json");
			httpConnection.setDoOutput(true);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String callGoogleCloudVision() {

		try {

			if (!isMockResponse) {
				String testImg = new ReadFromConfigFile().getContent("IMG");
				BufferedWriter httpRequestBodyWriter = new BufferedWriter(
						new OutputStreamWriter(httpConnection.getOutputStream()));

				// httpRequestBodyWriter.write("{\"requests\": [{ \"features\":
				// [ {\"type\": \"WEB_DETECTION\""
				// + "}], \"image\": {\"source\": { \"gcsImageUri\":" + "
				// \"gs://snapshopapp/lipstick.webp\"}}}]}");

				String jsonString = "{\'requests\':  [{ \'features\':  [ {\'type\': \'WEB_DETECTION\'}], \'image\': {\'content\': \'"
						+ testImg + "\'}}]}";

				httpRequestBodyWriter.write(jsonString);

				httpRequestBodyWriter.close();

				if (httpConnection.getInputStream() == null) {
					System.out.println("No stream");
					return jsonString;
				}

				Scanner httpResponseScanner = new Scanner(httpConnection.getInputStream());
				String resp = "";
				while (httpResponseScanner.hasNext()) {
					String line = httpResponseScanner.nextLine();
					resp += line;
				}

				System.out.println(resp);

				httpResponseScanner.close();
				return resp;
			} else {
				System.out.println("RETURNING MOCK RESPONSE");
				return new ReadFromConfigFile().getContent("MOCK_RESPONSE");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new GoogleVisionBuilder().callGoogleCloudVision();

	}

}
