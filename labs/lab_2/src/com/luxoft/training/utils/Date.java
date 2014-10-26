package com.luxoft.training.utils;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(){
		day = 1;
		month = 1;
		year = 1970;
	}
	
	public void setDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String getDate(){
		String date = day+"."+month+"."+year;
		System.out.println(date);
		return date;
	}
}
