package com.qa.main;

public abstract class Item {
	
	protected String name;
	protected Boolean isCheckedOut;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsCheckedOut() {
		return isCheckedOut;
	}
	public void setIsCheckedOut(Boolean isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}
	
}
