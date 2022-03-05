package com.content;

public class Enclosure {
	private int enclosureId;
	private String type;
	private String location;
	public int getEnclosureId() {
		return enclosureId;
	}
	public void setEnclosureId(int enclosureId) {
		this.enclosureId = enclosureId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Enclosure(int _enclosureId, String _type, String _location) {
		this.enclosureId=_enclosureId;
		this.type=_type;
		this.location=_location;
	}
	public Enclosure(String _type, String _location) {
		this.type=_type;
		this.location=_location;
	}
}
