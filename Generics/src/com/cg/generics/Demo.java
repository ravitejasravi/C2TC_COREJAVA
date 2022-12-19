package com.cg.generics;

import java.util.ArrayList;
import java.util.List;

class sugg
{
	public <E>void display(List<E> obj) {
		for(E i:obj) {
			System.out.println(i);
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		sugg s =new sugg();
		s.display(obj);
		List<String> r = new ArrayList<>();
		r.add("Ram");
		r.add("Raj");
		r.add("Hanuma");
		sugg s1 =new sugg();
		s1.display(r);

	}

}
