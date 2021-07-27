package com.ltts;

import java.util.Scanner;
public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String make,vehicle_no;
		int ch;
		String ch1;
		String system;
		int no_doors;
		int capacity,cc;
		System.out.println("1. Four Wheeler\n2. Two Wheeler \n");
		//ch=sc.nextInt();
		System.out.println("Enter Vehicle Type:");
		ch=sc.nextInt();
		System.out.println("Vehicle Make:");
		make=sc.next();
		System.out.println("Vehicle Number:");
		vehicle_no=sc.next();
		System.out.println("Fuel Type:");
		System.out.println("1. Petrol\n2. Diesel \n");
		ch1=sc.next();
		System.out.println("Fuel Capacity:");
		capacity=sc.nextInt();
		System.out.println("Engine CC:");
		cc=sc.nextInt();
		if(ch==1) 
		{
		  System.out.println("Audio system:");
		  system=sc.next();
		  System.out.println("Number of doors:");
		  no_doors=sc.nextInt();
		  FourWheeler f=new FourWheeler(make,vehicle_no,ch1,capacity,cc);
		  f.setAudioSystem(system);
		  f.setNumberOfDoors(no_doors);
		  f.displayDetailInfo();
		}

		else if(ch==2)
		{
			 System.out.println("Kick Start Available(yes/no):");
			  String w=sc.next();
		     TwoWheeler t=new TwoWheeler(make,vehicle_no,ch1,capacity,cc);
			boolean kick_start;
			if(w.equalsIgnoreCase("yes"))
				kick_start=true;
			else
				kick_start=false;
		  t.setKickStartAvailable(kick_start);
		  
		  t.displayDetailInfo();
		    
		}
	}

}
