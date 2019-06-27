package com.prakharjain.sorting;

public class SelectionSort {
	
	public static void Sort(int[] arr)
	{
		int j;
		for(int i=0; i<arr.length-1; i++)
		{
			int temp = arr[i+1];
			
			for(j=2; j<arr.length; j++)
			{
				if(temp>arr[j])
				{
					temp = arr[j];
				}
			}
			System.out.println("temp"+temp);
			swap(i+1,j,arr);
		}
	}
	public static void swap(int temp,int i, int[] arr)
	{
		arr[i] = temp;
		
	}
	
	public static void print(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,20,11,22,7,4,44,22,34,100,0,4,9,2,22};
		
		Sort(arr);
		print(arr);

	}

}
