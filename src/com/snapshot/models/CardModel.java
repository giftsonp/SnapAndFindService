package com.snapshot.models;

import java.util.ArrayList;

public class CardModel {

	public CardModel() {
		// TODO Auto-generated constructor stub
	}

	private String cardName;
	private ArrayList<ShopModel> listOfCards;

	public ArrayList<ShopModel> getListOfCards() {
		return listOfCards;
	}

	public void setListOfCards(ArrayList<ShopModel> listOfCards) {
		this.listOfCards = listOfCards;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

}
