package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

class Data1<T>
{
	T obj;
	public Data1(T obj) {
		this.obj = obj;
	}
	public T getobj() {
		return obj;
	}
	public String tostring() {
		return "Data1 [obj=" + obj + "]";
		
	}
}
public class Prog1 {

	public static void main(String[] args) {
		List<Data1<Object>> l1 = new LinkedList<>();
		l1.add(new Data1<Object>("mango"));
		l1.add(new Data1<Object>(1));
		l1.add(new Data1<Object>('c'));
		l1.add(new Data1<Object>(1.1));System.out.println(l1);

	}

}
