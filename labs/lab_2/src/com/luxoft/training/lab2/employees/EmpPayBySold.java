package com.luxoft.training.lab2.employees;

public class EmpPayBySold extends Employees {
	
	private int wage;
	private int rate;
	private int sumOfSold;
	private int percentForSold;
	
	public EmpPayBySold(){
		//wage = super.wage;
		//rate = super.rate;
		sumOfSold = 10;
		percentForSold = 5;
	}
	
	public EmpPayBySold(int wage, int rate, int sumOfSold, int percentForSold){
		this.wage = wage;
		this.rate = rate;
		this.sumOfSold = sumOfSold;
		this.percentForSold = percentForSold;
	}
	
	void setPercent(int percent){
		this.percentForSold = percent;
	}
	
	void setSumOfSold(int sold){
		this.sumOfSold = sold;
	}
	
	int getPay(){
		return wage = (sumOfSold/100*percentForSold);
	}	
	
		
	
}
