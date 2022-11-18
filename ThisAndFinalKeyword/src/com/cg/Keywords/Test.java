package com.cg.Keywords;

class student{
	int rollno;
	String name;
	float fee;
	student(int r,String n,float f){
		this.rollno=r;
		this.name=n;
		this.fee=f;
	}
	void display() {
		System.out.println(rollno+ " "+name+" "+fee);
	}
}

public class Test {

	public static void main(String[] args) {
		student s=new student(101,"Raj",50000f);
		student s1=new student(150,"Ram",80000f);
		s1.display();
		s.display();
		

	}

}
