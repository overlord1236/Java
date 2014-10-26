package com.luxoft.training.lab2.employees;

public class EmpPayByHours extends Employees {
	
	int wage;
	int rate;
	int amountOfHours;
	
	public EmpPayByHours(){
		//wage = super.wage;
		//rate = super.rate;
		amountOfHours = 1;
	}
	
	public EmpPayByHours(int wage, int rate){
		this.wage = wage;
		this.rate = rate;
	}
	
	void setHours(int amountOfMonths){
		this.amountOfHours = amountOfMonths;
	}
	
	int getPay(){
		return wage = amountOfHours * rate;
	}
		
}
