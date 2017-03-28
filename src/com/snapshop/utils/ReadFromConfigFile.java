package com.snapshop.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromConfigFile {

	private final String propertiesFilename = "C:\\Users\\Gift\\SnapShopService\\SnapShopService\\config.properties";

	public ReadFromConfigFile() {
		// TODO Auto-generated constructor stub
	}

	public String getContent(String key) {
		Properties properties = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(propertiesFilename);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties.getProperty(key);
	}

	public static void main(String args[]) {
		System.out.println(new ReadFromConfigFile().getContent("GCV_ENDPOINT"));
	}

}
