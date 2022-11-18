package com.cg.StaticKeyword;

class emplo{
	int rollno;
	String name;
	static String college="Siet";
	emplo(int r,String n){
		rollno=r;
		name=n;
		
	}
	static void change()
{
		college="sit";
		}
	void display() {
		System.out.println(rollno+ " "+name+ " "+college);
	}
}
public class Main {

	public static void main(String[] args) {
	 emplo e1=new emplo(01,"Ram");
	 emplo e2=new emplo(02,"Sita");
	 e1.change();
	 e1.display();
	 e2.display();

	}

}
