package com.luxoft.training.lab2;
import com.luxoft.training.lab2.employees.*;

public class PaymentCalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees [] employ = new Employees [5];
		employ[0] = new EmplPayByMonth();
		employ[1] = new EmplPayByMonth("Ivan", 100,100,2);
		System.out.println(employ[0]);
		System.out.println(employ[1]);
		employ[0].getDate();
		employ[0].setDate(13, 10, 14);
		employ[0].getDate();
	}
	
	
	
}
