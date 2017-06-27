//Taimur Sohrab
//AddressBook 

import java.util.*;

public class AddressBook {
	private String name;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	//getters
	public String getName(){
		return this.name;
	}
	public String getStreet(){
		return this.street;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public int getZip(){
		return this.zip;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setZip(int zip){
		this.zip = zip;
	}
	
	public String display(){
		String text = name + "\n" + street + "\n" + city + ", " + state + " " + zip;
		return text;
	}
	
	public static void main(String[]args){
		AddressBook john = new AddressBook();
		john.setName("John Wayne");
		john.setStreet("123 Oak St");
		john.setCity("Springfield");
		john.setState("Oregon");
		john.setZip(23423);
		
		System.out.println(john.display());
	}
	
}
