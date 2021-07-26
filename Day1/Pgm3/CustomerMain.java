  
package com.ltts2;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) 
	{
        Customer cu=new Customer();
        String details;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details:");
        details=sc.next();
        String[] arrOfStr = details.split(",");
		cu.setName(arrOfStr[0]);
		cu.setAdress(arrOfStr[1]);
		cu.setMobile(arrOfStr[2]);
		
		System.out.println("Name:"+cu.getName());
		System.out.println("Address:"+cu.getAdress());
		System.out.println("Phone:"+cu.getMobile());
	}

}
