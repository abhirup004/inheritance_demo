package com.abhirup.inherit;

import com.abhirup.inherit.model.B;

public class App {

	public static void main(String[] args) {
		B obj1= new B(10, "AA", 20, "BB");
		System.out.println(obj1.displayA());
		System.out.println(obj1);
	}

}
