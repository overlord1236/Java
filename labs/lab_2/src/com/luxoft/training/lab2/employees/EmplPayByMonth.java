package com.luxoft.training.lab2.employees;

public class EmplPayByMonth extends Employees {
	
	private int wage;
	private int rate;
	private int amountOfMonths;
	
	public EmplPayByMonth(){
		wage = 100;
		rate = 100;
		amountOfMonths = 1;
		super.firstName = "Boris";
	}
	
	public EmplPayByMonth(String firstName,int wage, int rate, int amountOfMonths){
		this.wage = wage;
		this.rate = rate;
		this.amountOfMonths = amountOfMonths;
		super.firstName = firstName;
	}
	
	public void setMonth(int amountOfMonths){
		this.amountOfMonths = amountOfMonths;
	}
	
	public int getPay(){
		return wage = amountOfMonths * rate;
	}
	@Override
    public String toString(){
    	return "Name of employer = "+super.firstName+" "+super.lastName;
    }
}
