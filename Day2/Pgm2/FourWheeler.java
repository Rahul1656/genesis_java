package com.ltts;

public class FourWheeler extends Vehicle 
{
	private String audioSystem;
	private int numberOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) 
	{
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		super.displayMake();
		System.out.println("---Basic Information---");
		super.displayBasicInfo();
	}
	
	void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("Number of Doors:"+getNumberOfDoors());
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
