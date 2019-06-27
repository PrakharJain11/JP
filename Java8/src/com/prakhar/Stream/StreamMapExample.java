package com.prakhar.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		List<String> sortedList = new ArrayList<>();
		
		ArrayList<String> list = new ArrayList<>();
		
		marks.add(10);
		marks.add(5);
		marks.add(20);
		marks.add(12);
		marks.add(10);
		marks.add(8);
		marks.add(20);
		
		list.add("Ranveer");
		list.add("Zukerberg");
		list.add("Pichayi");
		list.add("Nadela");
		list.add("Ajit Jain");
		
		
		
		
		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
				
		};
		
		List<Integer> updateMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		long  count = marks.stream().map(i->i+5).count();
		long count1 = marks.stream().filter(i->i>10).count();
		//sortedList = (ArrayList<Integer>) marks.stream().sorted().collect(Collectors.toList());
		//sortedList = (ArrayList<Integer>) marks.stream().sorted((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0).collect(Collectors.toList());
		//sortedList = (ArrayList<Integer>) marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		sortedList = list.stream().sorted(c).collect(Collectors.toList());
		
		Integer min = marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer max = marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Count1"+count1);
		System.out.println("Count: "+count);
		System.out.println(updateMarks);
		System.out.println("SortedList: "+sortedList);
		
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
		
		marks.stream().forEach(System.out::println);
	}

}


