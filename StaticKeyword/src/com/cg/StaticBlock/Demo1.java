package com.cg.StaticBlock;

class student{
	int rollno;
	String name;
	static String college="Siet";
	static {
		college="SIET";
	}
	student(int r, String n){
		rollno=r;
		name=n;
		
	}
	static void change() {
		college="Sit";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		student s1=new student(44,"David");
		student s2=new student(55,"Jack");
		s1.change();
		s1.display();
		s2.display();
		

	}

}
