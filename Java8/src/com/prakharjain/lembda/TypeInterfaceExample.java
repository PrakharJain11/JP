package com.prakharjain.lembda;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringLengthLembde lengthLembda = (String s)-> s.length();
		System.out.println(lengthLembda.StringLength("Reddy"));
		
		
	}
	
	
	interface StringLengthLembde{
		public int StringLength(String s);
	}

}
