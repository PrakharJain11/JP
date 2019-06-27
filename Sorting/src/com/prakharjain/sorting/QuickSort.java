package com.prakharjain.sorting;

public class QuickSort {

	private static void QuicksortImpl(int[] arr, int left, int right)
	{
		int index = partition(arr,left,right);//10,9,8,7,6,5,4,3,2,1
		
		//System.out.println("index:"+index);
		if(left < index -1)
			QuicksortImpl(arr,left,index-1);
		if(index < right)
			QuicksortImpl(arr, index, right);
	}
	private static int partition(int[] arr, int left, int right)
	{
		int pivot = arr[(left+right)/2];
		while(left<=right)
		{
			while(arr[left]<pivot) left ++;
			while(arr[right]>pivot) right --;
			if(left <= right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left ++;
				right --;
			}
		}
		return left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {10,9,8,7,6,5,4,3,2,1};
				
		QuicksortImpl(array, 0, array.length -1); 
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]+"");
		}
		
	}

}
