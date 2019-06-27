package com.prakharjain.StringExamples;

import java.util.Collections;
import java.util.List;

public class SingletonListExample {
	public static void main(String[] argv) 
	        throws Exception 
	    { 
	  
	        try { 
	  
	            // create singleton list 
	            // using method singletonList() method 
	            List<String> list = Collections.singletonList("E"); 
	  
	            // print the list 
	            System.out.println("singletonList : " + list); 
	        } 
	  
	        catch (IllegalArgumentException e) { 
	            System.out.println("Exception thrown : " + e); 
	        } 
	    } 
}
