package com.content;

public class Diet {
	private int dietId;
	private String dietType;
	private int numberoffeed;
	public int getDietId() {
		return dietId;
	}
	public void setDietId(int dietId) {
		this.dietId = dietId;
	}
	public String getDietType() {
		return dietType;
	}
	public void setDietType(String dietType) {
		this.dietType = dietType;
	}
	public int getNumberoffeed() {
		return numberoffeed;
	}
	public void setNumberoffeed(int numberoffeed) {
		this.numberoffeed = numberoffeed;
	}
	public Diet(int _dietId, String _dietType, int _numberoffeed) {
		this.dietId=_dietId;
		this.dietType= _dietType;
		this.numberoffeed=_numberoffeed;
	}
	public Diet(String _dietType, int _numberoffeed) {
		this.dietType= _dietType;
		this.numberoffeed=_numberoffeed;
		
	}
}
