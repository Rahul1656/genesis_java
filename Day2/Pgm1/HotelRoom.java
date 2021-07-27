package com.ltts1;

public class HotelRoom
{
  protected String hotelName;
  protected int numberOfSqFeet;
  protected boolean hasTV;
  protected boolean hasWifi;
  
  public HotelRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
  {
	  this.hotelName=hotelName;
	  this.numberOfSqFeet=numberOfSqFeet;
	  this.hasTV=hasTV;
	  this.hasWifi=hasWifi;
  }
  public int calculateTariff(int traffic)
  {
	 return numberOfSqFeet*traffic; 
  }
  public int getRatePerSqFeet()
  {
	  return 0;
  }
  
  
  
}
