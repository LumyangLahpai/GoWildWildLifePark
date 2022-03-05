package com.content;

public class Species {
	private int speciesId;
	private String speciesType;
	private String speciesGroup;
	private String conversationStatus;
	private String lifeStyle;
	public int getSpeciesId() {
		return speciesId;
	}
	public void setSpeciesId(int speciesId) {
		this.speciesId = speciesId;
	}
	public String getSpeciesType() {
		return speciesType;
	}
	public void setSpeciesType(String speciesType) {
		this.speciesType = speciesType;
	}
	public String getSpeciesGroup() {
		return speciesGroup;
	}
	public void setSpeciesGroup(String speciesGroup) {
		this.speciesGroup = speciesGroup;
	}
	public String getConversationStatus() {
		return conversationStatus;
	}
	public void setConversationStatus(String conversationStatus) {
		this.conversationStatus = conversationStatus;
	}
	public String getLifeStyle() {
		return lifeStyle;
	}
	public void setLifeStyle(String lifeStyle) {
		this.lifeStyle = lifeStyle;
	}
	public Species(int _speciesId, String _speciesType, String _speciesGroup, String _conversationStatus, String _lifeStyle) {
		this.speciesId=_speciesId;
		this.speciesType=_speciesType;
		this.speciesGroup=_speciesGroup;
		this.conversationStatus=_conversationStatus;
		this.lifeStyle=_lifeStyle;
	}
	public Species(String _speciesType, String _speciesGroup, String _conversationStatus, String _lifeStyle) {
		this.speciesType=_speciesType;
		this.speciesGroup=_speciesGroup;
		this.conversationStatus=_conversationStatus;
		this.lifeStyle=_lifeStyle;
	}
}
