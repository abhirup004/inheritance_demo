package com.abhirup.inherit.model;

public class A {
	private int noA;
	private String strA;
	public A() {
		super();
		System.out.println("Without argument constructor in A");
	}
	public A(int noA, String strA) {
		super();
		System.out.println("With argument constructor in A");
		this.noA = noA;
		this.strA = strA;
	}
	
	public int getNoA() {
		return noA;
	}
	public void setNoA(int noA) {
		this.noA = noA;
	}
	public String getStrA() {
		return strA;
	}
	public void setStrA(String strA) {
		this.strA = strA;
	}
	@Override
	public String toString() {
		return "A [noA=" + noA + ", strA=" + strA + "]";
	}
	
}
