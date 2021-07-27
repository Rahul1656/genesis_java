package com.ltts;

public class Vehicle 
{
  protected String make;
  protected String vehicleNumber;
  protected String fuelType;
  protected int fuelCapacity;
  protected int cc;
  
  
  public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
  {
	  this.make=make;
	  this.vehicleNumber=vehicleNumber;
	  this.fuelType=fuelType;
	  this.fuelCapacity=fuelCapacity;
	  this.cc=cc;  
  }
  
  void displayMake()
  {
	  System.out.println("***"+getMake()+"***");
  }
  
  void displayBasicInfo()
  {
	  System.out.println("Vehicle number:"+getVehicleNumber());
	  System.out.println("Fuel Capacity:"+getFuelCapacity());
	  if(getFuelType().equals("1"))
	  {
		  System.out.println("Fuel Type:Petrol");  
	  }
	  else
	  {
		  System.out.println("Fuel Type:Diesel");
	  }
	  System.out.println("CC:"+getCc());
  }
  
  void displayDetailInfo()
  {
	  
  }

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getVehicleNumber() {
	return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}

public String getFuelType() {
	return fuelType;
}

public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

public int getFuelCapacity() {
	return fuelCapacity;
}

public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}

public int getCc() {
	return cc;
}

public void setCc(int cc) {
	this.cc = cc;
}

}
