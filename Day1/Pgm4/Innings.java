package com.ltts1;

public class Innings 
{
	private String teamname;
	private String innings;
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInnings() {
		return innings;
	}
	public void setInnings(String innings) {
		this.innings = innings;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void displayInningsDetails()
	{
		
		System.out.println("Name:"+getTeamname());
		System.out.println("Scored:"+getRuns());
		if(getInnings().equals("First"))
		{
		 System.out.println("Need 201 to win");
		}
		else
		{
		 System.out.println("Match Ended");
		}
	}

}
