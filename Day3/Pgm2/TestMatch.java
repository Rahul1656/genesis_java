package com.ltts1;

	public class TestMatch extends Match{
		public float calculateRunRate() {
			return ((getTarget()-getCurrentscore())/(90-getCurrentover()));
		}
		public int calculateBalls() {
			int remballs=Math.round(getCurrentover()%((int)getCurrentover())*10);
			return ((90-(int)getCurrentover())*6)-remballs;
		}
		public void display(double reqRunrate,int balls) {
			System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+balls+" balls");
			System.out.printf("Required Runrate: %.2f",reqRunrate);
		}
	}
