package com.ltts1;

public abstract class Match
{
	private int currentscore,target;
	private float currentover;
	
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate,int balls);
}
