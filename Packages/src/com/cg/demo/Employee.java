package com.cg.demo;

public class Employee {

	int id;
	String name;
	float salary;
	 void display() {
		 System.out.println(id+" "+name+" "+salary);
	 }
Employee(){
	System.out.println("no value initialized");
}
Employee(int i,String n,float h){
	id=i;
	name=n;
	salary=h;
	
}
	
}
