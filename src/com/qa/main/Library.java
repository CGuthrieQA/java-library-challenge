package com.qa.main;

import java.util.ArrayList;

import java.util.List;

public class Library {
	
	// might have to change this variable type
	public static List<Item> libraryItems = new ArrayList<>();
	
	public void addToLibrary(Item input) {
		libraryItems.add(input);
	}
	
	public void removeFromLibrary(Item input) {
		libraryItems.remove(input);
	}
	
	public static void updateItem(Item input) {
		for ( Item i : libraryItems ) {
				i.setIsCheckedOut(input.isCheckedOut);
		}
	}
	
	List<Person> libraryPeople = new ArrayList<>();
	
	public void registerPerson(Person input) {
		libraryPeople.add(input);
	}
	
	public void deletePerson(Person input) {
		libraryPeople.remove(input);
	}
	
	public void updatePerson(Person input) {
		for ( Person i : libraryPeople ) {
			i.setAge(input.age);
			i.setName(input.name);
			i.checkedOutItems = input.checkedOutItems;
		}
	}
	
}
