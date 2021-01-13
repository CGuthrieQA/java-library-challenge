package com.qa.main;

public class CD extends Item implements RunTimable {

	@Override
	public void runTime(int time) {
		System.out.println("runtime: " + time);
	}
	
}
