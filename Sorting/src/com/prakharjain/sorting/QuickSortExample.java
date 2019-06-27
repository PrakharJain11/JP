package com.prakharjain.sorting;

public class QuickSortExample {
	
	public static void QuickSort(int[] array, int left, int right) // 10,9,8,7,6,5,4,3,2,1
	{
		int index = partition(array,left,right);
		//System.out.println("index:"+index);
		if(left < index -1)
			QuickSort(array,left,index-1);
		if(index < right)
			QuickSort(array, index, right);
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static int partition(int array[],int left,int right)
	{
		int pivot = array[(left+right)/2]; //4,2,8,1,5,10,4,8,2
		while(left<=right)
		{
			while(array[left]<pivot) left++;
			while(array[right]>pivot) right--;
			if(left<=right)
			{
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				
				left ++;
				right --;
			}
			System.out.print("-----------");
			for(int i=0; i<array.length; i++)
			{
				System.out.print(" "+array[i]);
			}
			//System.out.println();
			
		}
		/*for (int i : array) {
			System.out.println("Iteration1:"+array[i]);
		}
*/		return left;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int[] array = new int[] {10,9,8,7,6,5,4,3,2,1};
		System.out.println("2,9,8,7,6,10");
			int[] array = new int[] {4,2,8,1,5,10,4,8,2};
			
			QuickSort(array,0,array.length -1);
			
			
	}

}
