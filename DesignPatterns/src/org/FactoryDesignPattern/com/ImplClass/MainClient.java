package org.FactoryDesignPattern.com.ImplClass;

import org.FactoryDesignPattern.com.DAO.Travel;
import org.FactoryDesignPattern.com.DAO.TravelPlace;
import org.FactoryDesignPattern.com.DAO.Travelling;

public class MainClient {
	
	public static void main(String[] args) {
		
		Travel travelDelhi = Travelling.getTravelDetails(TravelPlace.DELHI, "Hindi", "CholeBhature", "Rashtrapthi Bhavan", true, true);
		System.out.println("Delhi Specialities:: " + travelDelhi);
		
		Travel travelGujarath = Travelling.getTravelDetails(TravelPlace.GUJARATH, "Gujarathi", "Dhokla", "Dwarakadish Mandir", true, true);
		System.out.println("Gujarath Specialities:: " + travelGujarath);
		
		Travel travelRajasthan = Travelling.getTravelDetails(TravelPlace.RAJASTHAN, "Rajasthani", "Kachori", "Hawamahal", true, false);
		System.out.println("Rajasthan Specialities:: " + travelRajasthan);
	}

}
