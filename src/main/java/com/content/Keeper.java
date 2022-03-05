package com.content;

public class Keeper {
	private int keeperId;
	private String name;
	private String dateofbirth;
	private String email;
	private String phone;
	private String rank;
	public int getKeeperId() {
		return keeperId;
	}
	public void setKeeperId(int keeperId) {
		this.keeperId = keeperId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Keeper(int _keeperId, String _name, String _dateofbirth, String _email, String _phone, String _rank) {
		this.keeperId = _keeperId;
		this.name = _name;
		this.dateofbirth = _dateofbirth;
		this.email = _email;
		this.phone = _phone;
		this.rank = _rank;
	}
	public Keeper( String _name, String _dateofbirth, String _email, String _phone, String _rank) {
		this.name = _name;
		this.dateofbirth = _dateofbirth;
		this.email = _email;
		this.phone = _phone;
		this.rank = _rank;
	}

}
