package com.ltts1;

public class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=10;
	}

	


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
	
/*	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	} */  
}
