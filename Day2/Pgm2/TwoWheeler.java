package com.ltts;

public class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;
	
    public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		super.displayMake();
		super.displayBasicInfo();
	}


    void displayDetailInfo()
    {
    	System.out.println("---Detail Information---");
    	System.out.println("Kick Start Available:"+isKickStartAvailable());
    }


	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}


	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
  
}
