package com.prakharjain.sorting;

import java.util.Scanner;

public class QuickSortStringArrayEx {
		public static void main(String[] args) {
			String[] arr = new String[] {"aa","bb"};
			
			int n;
	        String temp;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of names you want to enter:");
	        n = s.nextInt();
	        String names[] = new String[n];
	        Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter all the names:");
	        for(int i = 0; i < n; i++)
	        {
	            names[i] = s1.nextLine();
	        }
			
			//String[] arr = new String[1] {"kjlkj"};
			for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (names[i].compareTo(names[j])>0) 
	                {
	                    temp = names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	        }
			
			
		}
}
