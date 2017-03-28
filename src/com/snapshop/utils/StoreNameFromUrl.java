package com.snapshop.utils;

import java.net.MalformedURLException;
import java.net.URL;

public class StoreNameFromUrl {

	public StoreNameFromUrl() {
		// TODO Auto-generated constructor stub
	}

	public String getStoreNameFromUrl(String url) {
		String storeName = null;

		try {
			URL stringToUrl = new URL(url);
			stringToUrl.getHost();
			storeName = stringToUrl.getHost().replace("www.", "");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return storeName;
	}

}
