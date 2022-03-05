package com.content;

public class Animal {
	private int Animal_ID;
	private String Animal_Name;
	private String Gender;
	private int Year;
	private int enclosures_ID;
	private int Species_ID;
	private int Diet_ID;
	private int Keeper_ID;
	private String Name;
	private int TotalAnimal;
	public int getAnimal_ID() {
		return Animal_ID;
	}
	public void setAnimal_ID(int animal_ID) {
		Animal_ID = animal_ID;
	}
	public String getAnimal_Name() {
		return Animal_Name;
	}
	public void setAnimal_Name(String animal_Name) {
		Animal_Name = animal_Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getEnclosures_ID() {
		return enclosures_ID;
	}
	public void setEnclosures_ID(int enclosures_ID) {
		this.enclosures_ID = enclosures_ID;
	}
	public int getSpecies_ID() {
		return Species_ID;
	}
	public void setSpecies_ID(int species_ID) {
		Species_ID = species_ID;
	}
	public int getDiet_ID() {
		return Diet_ID;
	}
	public void setDiet_ID(int diet_ID) {
		Diet_ID = diet_ID;
	}
	public int getKeeper_ID() {
		return Keeper_ID;
	}
	public void setKeeper_ID(int keeper_ID) {
		Keeper_ID = keeper_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTotalAnimal() {
		return TotalAnimal;
	}
	public void setTotalAnimal(int totalAnimal) {
		TotalAnimal = totalAnimal;
	}
	public Animal(String _Gender, String _Animal_Name, int _Animal_ID, int _Year, int _enclosures_ID, int _Species_ID,
			int _Diet_ID, int _Keeper_ID) {
		this.Animal_ID=_Animal_ID;
		this.Animal_Name=_Animal_Name;
		this.Gender=_Gender;
		this.Year=_Year;
		this.enclosures_ID=_enclosures_ID;
		this.Species_ID=_Species_ID;
		this.Diet_ID=_Diet_ID;
		this.Keeper_ID=_Keeper_ID;
	}
	public Animal(String _Animal_Name, String _Gender, int _Year, int _enclosures_ID, int _Species_ID,
			int _Diet_ID, int _Keeper_ID) {
		this.Animal_Name=_Animal_Name;
		this.Gender=_Gender;
		this.Year=_Year;
		this.enclosures_ID=_enclosures_ID;
		this.Species_ID=_Species_ID;
		this.Diet_ID=_Diet_ID;
		this.Keeper_ID=_Keeper_ID;
	}
	public Animal(int _Animal_ID, String _Animal_Name, String _Gender, int _Year, int _Keeper_ID, String _Name) {
		this.Animal_ID=_Animal_ID;
		this.Animal_Name=_Animal_Name;
		this.Gender=_Gender;
		this.Year=_Year;
		this.Keeper_ID=_Keeper_ID;
		this.Name=_Name;
	}
	public Animal(String _Name, int _TotalAnimal) {
		this.Name=_Name;
		this.TotalAnimal=_TotalAnimal;
	}
	public Animal(int _Animal_ID,String _Animal_Name, String _Gender, int _Year, int _enclosures_ID, int _Species_ID,
			int _Diet_ID, int _Keeper_ID) {
		this.Animal_ID=_Animal_ID;
		this.Animal_Name=_Animal_Name;
		this.Gender=_Gender;
		this.Year=_Year;
		this.enclosures_ID = _enclosures_ID;
		this.Species_ID =  _Species_ID;
		this.Diet_ID= _Diet_ID;
		this.Keeper_ID=_Keeper_ID;
	}
}
