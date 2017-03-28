package com.snapshop.logic;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.snapshop.apibuilders.GoogleVisionBuilder;
import com.snapshop.utils.StoreNameFromUrl;
import com.snapshot.models.CardModel;
import com.snapshot.models.MainResponseModel;
import com.snapshot.models.ShopModel;

public class ReponseBuilder {

	public ReponseBuilder() {
		// TODO Auto-generated constructor stub
	}

	public String buildMainResponse() {

		JsonParser parser = new JsonParser();
		ArrayList<ShopModel> listOfShops = null;
		CardModel cardModel = new CardModel();
		MainResponseModel mainResponseModel = new MainResponseModel();
		ArrayList<CardModel> listOfCards = new ArrayList<CardModel>();

		try {
			listOfShops = buildItemsArray(parser.parse(new GoogleVisionBuilder(true).callGoogleCloudVision())
					.getAsJsonObject().get("responses").getAsJsonArray().get(0).getAsJsonObject().get("webDetection")
					.getAsJsonObject().get("pagesWithMatchingImages").getAsJsonArray());

		} catch (Exception e) {
			System.out.println(e);
		}

		cardModel.setCardName("Actual Response");
		cardModel.setListOfCards(listOfShops);

		listOfCards.add(cardModel);
		listOfCards.add(cardModel);
		listOfCards.add(cardModel);

		mainResponseModel.setCards(listOfCards);

		Gson gson = new Gson();
		System.out.println(gson.toJson(mainResponseModel));

		return gson.toJson(mainResponseModel);
	}

	private ArrayList<ShopModel> buildItemsArray(JsonArray arrayOfMatchingImages) {

		ShopModel shop;
		ArrayList<ShopModel> listOfShops = new ArrayList<ShopModel>();
		for (JsonElement ele : arrayOfMatchingImages) {
			shop = new ShopModel();
			shop.setStoreName(
					new StoreNameFromUrl().getStoreNameFromUrl(ele.getAsJsonObject().get("url").getAsString()));
			shop.setStoreUrl(ele.getAsJsonObject().get("url").getAsString());
			listOfShops.add(shop);
		}
		return listOfShops;
	}

	public static void main(String args[]) {

		new ReponseBuilder().buildMainResponse();
	}

}
