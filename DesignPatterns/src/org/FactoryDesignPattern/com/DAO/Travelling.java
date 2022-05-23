package org.FactoryDesignPattern.com.DAO;

import org.FactoryDesignPattern.com.DTO.Delhi;
import org.FactoryDesignPattern.com.DTO.Gujarath;
import org.FactoryDesignPattern.com.DTO.Rajasthan;

public class Travelling {
	
	private Travelling() {
	}
	
	public static Travel getTravelDetails(TravelPlace travelPlace, String language, String food, 
			                              String famousPlace, boolean isBus, boolean isFlight) {
		switch(travelPlace) {
		
		case DELHI:
			return new Delhi(language, food, famousPlace, isBus, isFlight);
			
		case RAJASTHAN:
			return new Rajasthan(language, food, famousPlace, isBus, isFlight);
			
		case GUJARATH:
			return new Gujarath(language, food, famousPlace, isBus, isFlight);
			
		default:
			throw new RuntimeException("Invalid Computer Type!!");
		}
		
	}

}
