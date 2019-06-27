	package com.prakharjain.StringExamples;

public class TestExample {

	public String sayHi(String str) {
		if(str == "Hi")
			return "Hi";
		
		return "Nice";
	}
	public static void main(String[] args)
	{
		TestExample te = new TestExample();
		te.sayHi("Bye");
	}
}
