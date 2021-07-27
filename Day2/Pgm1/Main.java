package com.ltts1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room");
		System.out.println("Select Room Type:");
		ch=sc.nextInt();
		sc.nextLine();
		System.out.println("Hotel Name:");
		String hotel=sc.nextLine();
		System.out.println("Room Square Feet Area:");
		int sqftarea=sc.nextInt();
		sc.nextLine();
		System.out.println("Room has TV (yes/no):");
		String t=sc.next();
		System.out.println("Room has Wifi (yes/no):");
		String w=sc.next();
		sc.close();
		boolean tv,wifi;
		if(t.equalsIgnoreCase("yes"))
			tv=true;
		else
			tv=false;
		if(w.equalsIgnoreCase("yes"))
			wifi=true;
		else
			wifi=false;
		if(ch==1)
		{
			
		 DeluxeRoom d=new DeluxeRoom(hotel,sqftarea,tv,wifi);
		 //d.setRatePerSqFeet(10);
		 System.out.println("Room Tariff per day is:"+d.getRatePerSqFeet());
			
		}
		else if(ch==2)
		{
			DeluxeACRoom da=new DeluxeACRoom(hotel,sqftarea,tv,wifi);
			//da.SetratePerSqFeet(12);
			 System.out.println("Room Tariff per day is:"+da.getRatePerSqFeet());
		}
		else
		{
			SuiteACRoom s=new SuiteACRoom(hotel,sqftarea,tv,wifi);
			//s.setRatePerSqFeet(15);
			 System.out.println("Room Tariff per day is:"+s.getRatePerSqFeet());
		}
		
	}

}
