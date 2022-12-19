package com.cg.generics;
class Info<k extends Integer,v extends String>
{
	k key;
	v value;
	
	public Info(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	
}
public class GenericBoundry {

	public static void main(String[] args) {
		Info<Integer,String> b= new Info<Integer,String>(100,"Ram");
		System.out.println(b.getKey());
		System.out.println(b.getValue());
	}

}
