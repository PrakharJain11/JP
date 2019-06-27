package com.prakharjain.functionalInterface;

import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = i->i%2==0;
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));
	}

}
