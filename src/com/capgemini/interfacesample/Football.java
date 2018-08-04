package com.capgemini.interfacesample;

//class Football is implementing interface Game so its play() method will be overridden
public class Football implements Game { 
	
	@Override
	public void play() {
		System.out.println("Let's play Football");
	}

}
