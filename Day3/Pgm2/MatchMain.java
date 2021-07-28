package com.ltts1;

import java.util.Scanner;
public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter the match format");
		System.out.println("1. ODI\n2. T20\n3. Test");
		ch=sc.nextInt();
		System.out.println("Enter the Current score");
		int score=sc.nextInt();
		System.out.println("Enter the current Over");
		float over=sc.nextFloat();
		System.out.println("Enter the Target Score");
		int t=sc.nextInt();
		sc.close();
		System.out.println("Requirements:");
		if(ch==1) {
			ODIMatch m=new ODIMatch();
			m.setCurrentscore(score);
			m.setCurrentover(over);
			m.setTarget(t);
			float reqRunrate=m.calculateRunRate();
			int balls=m.calculateBalls();
			m.display(reqRunrate,balls);
			
		}
		else if(ch==3) {
			TestMatch m=new TestMatch();
			m.setCurrentscore(score);
			m.setCurrentover(over);
			m.setTarget(t);
			float reqRunrate=m.calculateRunRate();
			int balls=m.calculateBalls();
			m.display(reqRunrate,balls);

		}
		else if(ch==2) {
			T20Match m=new T20Match();
			m.setCurrentscore(score);
			m.setCurrentover(over);
			m.setTarget(t);
			float reqRunrate=m.calculateRunRate();
			int balls=m.calculateBalls();
			m.display(reqRunrate,balls);
		}
		
	}

}
