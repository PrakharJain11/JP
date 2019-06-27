package com.prakharjain.sorting;

public class QuickSortExamplePrac {
	
	public static int[] quickSort(int[] arr)
	{
		int pivot = getPivot(arr);
		
		
		System.out.println(pivot);
		return arr;
	}
	
	public static int getPivot(int[] arr)
	{
		int temp = arr.length-1/2;
		System.out.println(temp);
		int no = arr[(arr.length-1)/2];
		return no;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,1,9,4,40,20,11,4,2,50};
		quickSort(arr);
		
	}
}
