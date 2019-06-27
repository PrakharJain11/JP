package com.prakharjain.sorting;

public class BubbleSortExample {
	
	public static void BubbleSort(int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void print(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {10,20,22,11,15,8,40,4,2,40};
		BubbleSort(arr);
		print(arr);
		
	}
}
