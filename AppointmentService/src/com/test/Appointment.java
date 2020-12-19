package com.test;

import java.util.*;
import java.util.Date;



public class Appointment {
	final String ID;
	String description;
	Date date;
	
	//constructor
	public Appointment(String ID, Date date, String description) {
		Date currentDate = new Date();
		
		if(date != null && currentDate.before(date))
			this.date=date; 
		else {
			System.out.println("Your input was invalid");
			
		}
		if(ID.length() <=10 ) { //check less than 10
			this.ID = ID;
	} else {
		this.ID = "";
		System.out.println("Your input was invalid");
	}
		
	if(description.length() <= 50) //check if it's less than 50
		this.description = description;
	else {
		System.out.println("Your input was invalid");
	}

}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getID() {
		return ID;
	}
}

