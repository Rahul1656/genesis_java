package com.ltts3;
import java.util.Scanner;
public class CompanyMain {

	public static void main(String[] args) 
	{
	   int flag=0;
	   Company c=new Company();
	   String c_name;
	   String employees;
	   String team_lead;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the company name:");
       c_name=sc.nextLine();
       c.setName(c_name);
       System.out.println("Enter the employees:");
       employees=sc.next();
       c.setEmployees(employees);
       System.out.println("Enter TeamLead:");
       team_lead=sc.next();
       c.setTeamlead(team_lead);
       
       String[] arrOfStr = employees.split(",");
       //sample output
       
       System.out.println("Name:"+c.getName());
       System.out.println("Emploees:"+c.getEmployees());
       for(int i=0;i<arrOfStr.length;i++)
       {
    	   if(team_lead.equals(arrOfStr[i]))
    	   {
    		   flag++;
    		   break;
    	   }
       }
       if(flag == 1)
       {
       System.out.println("Lead:"+c.getTeamlead());
       }
       else
       {
    	   System.out.println("Invalid input.");
       }
       
	}

}
