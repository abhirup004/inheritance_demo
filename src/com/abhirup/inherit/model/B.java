package com.abhirup.inherit.model;

public class B extends A{
	private int noB;
	private String strB;
	public B() {
		super();
		System.out.println("Without argument constructor in B");
	}
	public B(int noA, String strA, int noB, String strB) {
		super(noA, strA);
		System.out.println("With argument constructor in B");
		this.noB=noB;
		this.strB=strB;
	}
	public int getNoB() {
		return noB;
	}
	public void setNoB(int noB) {
		this.noB = noB;
	}
	public String getStrB() {
		return strB;
	}
	public void setStrB(String strB) {
		this.strB = strB;
	}
	public String displayA() {
		return "A[noA=" + getNoA() + ", strA=" + getStrA()+ "]";
	}
	@Override
	public String toString() {
		return "B [noB=" + noB + ", strB=" + strB + "]";
	}
	
}
