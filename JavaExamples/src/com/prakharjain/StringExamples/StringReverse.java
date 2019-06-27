package com.prakharjain.StringExamples;

public class StringReverse {
	
	private static String reverse(String str)
	{	
		
		System.out.println("Str:"+str);
		//base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        System.out.println(str.substring(1) + str.charAt(0));
        System.out.println("str.charAt(0):"+str.charAt(0));
        return reverse(str.substring(1));

	}
	
	public static void main(String[] args)
	{
		String str = "Jain";
		
		String reverseStr = "";

		reverseStr = reverse(str);
		
		System.out.println("Rev:"+reverseStr);
		
	}
}
