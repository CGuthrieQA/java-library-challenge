package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	protected String name;
	protected int age;

	List<Item> checkedOutItems = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void checkoutItem(String input) {
		for ( Item i : Library.libraryItems ) {
			if ( i.getName().equals(input) && i.isCheckedOut == false ) {
				
				i.setIsCheckedOut(true);
				checkedOutItems.add(i);
				
				System.out.println(this.name + " checked out " + input);
				
			} else if ( i.getName().equals(input) && i.isCheckedOut == true ) {
				System.out.println("the item is already checked out");
			}
		}
	}
	
	public void returnItem(String input) {
		for ( Item i : checkedOutItems ) {
			if ( i.getName().equals(input)) {
				
				i.setIsCheckedOut(false);
				Library.updateItem(i);
				checkedOutItems.remove(i);
				
				System.out.println(this.name + " returned " + input);
				
			} 
		}
	}

}
