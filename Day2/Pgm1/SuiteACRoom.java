package com.ltts1;

public class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=15;
		
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
	/*
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	} */ 
}
