package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.Date;


public class Employees extends Date{
	public String firstName;
	public String lastName;
	public String position;
	//int wage = 1000; // З/П
	//int rate = 100; //  Ставка сотрудника
	Date date = new Date();
	
	public Employees(){
		this.firstName = "Ivan";
		this.lastName = "Ivanov";
		this.position = "Cleaner";
		//this.rate = 100;
	}
	public Employees(String firstName, String lastName, String position){
		this.firstName= firstName;
		this.lastName = lastName;
		this.position = position;
		//this.rate = rate;
	}
	
}

