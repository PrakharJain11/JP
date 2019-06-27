package com.prakhar.forEach;

public class Cards {
	private int CardID;
	private String CardName;
	private String CardType;
	private String CardCategory;
	public int getCardID() {
		return CardID;
	}
	public void setCardID(int cardID) {
		CardID = cardID;
	}
	public String getCardName() {
		return CardName;
	}
	public void setCardName(String cardName) {
		CardName = cardName;
	}
	public String getCardType() {
		return CardType;
	}
	public Cards(int cardID, String cardName, String cardType, String cardCategory) {
		//super();
		CardID = cardID;
		CardName = cardName;
		CardType = cardType;
		CardCategory = cardCategory;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getCardCategory() {
		return CardCategory;
	}
	public void setCardCategory(String cardCategory) {
		CardCategory = cardCategory;
	}
	
	
	
}
