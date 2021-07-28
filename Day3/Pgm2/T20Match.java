package com.ltts1;

public class T20Match extends Match{
	public float calculateRunRate() {
		return ((getTarget()-getCurrentscore())/(20-getCurrentover()));
	}
	public int calculateBalls() {
		int remballs=Math.round(getCurrentover()%((int)getCurrentover())*10);
		return ((20-(int)getCurrentover())*6)-remballs;
	}
	public void display(double reqRunrate,int balls) {
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+balls+" balls");
		System.out.printf("Required Runrate: %.2f",reqRunrate);
	}
}
