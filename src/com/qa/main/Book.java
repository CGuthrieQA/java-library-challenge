package com.qa.main;

public class Book extends Item implements PageCountable {
	
	@Override
	public void pageCount(int pages) {
		System.out.println("pagecount: " + pages);
	}
	
}
