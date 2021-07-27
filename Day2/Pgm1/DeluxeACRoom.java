package com.ltts1;

public class DeluxeACRoom extends DeluxeRoom
{
	protected int ratePerSqFeet;
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=12;
	}
	/*
	public void SetratePerSqFeet(int ratePerSqFeet)
	{
		this.ratePerSqFeet=ratePerSqFeet;
		super.setRatePerSqFeet(ratePerSqFeet);
		super.getRatePerSqFeet();
	}
    */
	public int getRatePerSqFeet()
	{
		
		if(hasWifi==true)
		{
		  return calculateTariff(ratePerSqFeet+2);
		}
		else
		{
		   return calculateTariff(ratePerSqFeet);
		}
	}
  
}
