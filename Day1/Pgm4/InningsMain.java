package com.ltts1;
import java.util.Scanner;
public class InningsMain {

	public static void main(String[] args)
	{ 
		String name,Session;
		int runs;
		Innings i=new Innings();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team name:");
		name=sc.next();
		i.setTeamname(name);
		System.out.println("Enter session:");
		Session=sc.next();
		i.setInnings(Session);
		System.out.println("Enter runs:");
		runs=sc.nextInt();
		i.setRuns(runs);
		i.displayInningsDetails();
	}

}
