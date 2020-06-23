package com.te;

public class Car extends Vehicles {


	public Car() {
	
	}

	public Car(String type, String model_no, String model_name, String owner_name, String owner_details) {
		super(type, model_no, model_name, owner_name, owner_details);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 public String retrieve() {
		 String str = getType();
		 
	 if(str ==null) {
		 throw new TypeException("Vehicle Type Not Set");
	 }else {
		 str.concat(model_no).concat(model_name).concat(owner_details).concat(owner_name);
	 }
	return str;
	 }

}
