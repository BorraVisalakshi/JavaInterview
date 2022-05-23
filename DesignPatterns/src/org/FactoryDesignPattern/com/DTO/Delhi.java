package org.FactoryDesignPattern.com.DTO;

import org.FactoryDesignPattern.com.DAO.Travel;

public class Delhi implements Travel{

	private String language;
	private String food;
	private String famousPlace;
	private boolean isBus;
	private boolean isFlight;
	
	public Delhi(String language, String food, String famousPlace, boolean isBus, boolean isFlight) {
		super();
		this.language = language;
		this.food = food;
		this.famousPlace = famousPlace;
		this.isBus = isBus;
		this.isFlight = isFlight;
	}
    
	@Override
	public String language() {
		
		return this.language;
	}

	@Override
	public String food() {
		
		return this.food;
	}

	@Override
	public String famousPlace() {
		
		return this.famousPlace;
	}

	@Override
	public boolean isBus() {
		
		return this.isBus;
	}

	@Override
	public boolean isFlight() {
		
		return this.isFlight;
	}

	@Override
	public String toString() {
		return "Delhi [language=" + language + ", food=" + food + ", famousPlace=" + famousPlace + ", isBus=" + isBus
				+ ", isFlight=" + isFlight + "]";
	}
	
	
	

}
