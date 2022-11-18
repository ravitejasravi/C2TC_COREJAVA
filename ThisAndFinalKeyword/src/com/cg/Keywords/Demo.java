package com.cg.Keywords;
class demo1{
  demo1(){
	  System.out.println("hello");
  }
  demo1(int x){
	  this();
	  System.out.println(x);
	  
  }
}

public class Demo {

	public static void main(String[] args) {
		demo1 d=new demo1(10);
		

	}

}
