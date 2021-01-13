package com.qa.main;

public class DvD extends Item implements RunTimable {

	@Override
	public void runTime(int time) {
		System.out.println("runtime: " + time);
	}

}
