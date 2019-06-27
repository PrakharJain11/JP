package com.prakhar.Stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		List<String> listString = new ArrayList<>();
		
		String str = "Kobe Is is The the best player In in Basketball basketball game .";
		
		listString.add("Sita");
		listString.add("Gita");
		listString.add("Kaki");
		listString.add("Rakhi");
		listString.add("Ritu");
		listString.add("Lalli");
		listString.add("laviA");
		listString.add("dAddu");
		list.add(10);
		list.add(9);
		list.add(4);
		list.add(20);
		list.add(1);
		list.add(20);
		list.add(4);
		list.add(40);
		list.add(2);
		list.add(8);
		
		List<Integer> list1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		
		
		//System.out.println(str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Object::toString,Collectors.))
		str.chars()
		   .mapToObj(i -> (char)i)
		   .distinct()
		   .filter(x -> x != ' ')
		   .sorted()
		   .forEach(System.out::print);
		//Char[] ch = str.chars().mapToObj(i -> (char) i).
		
		"AabkKliPpPA".chars().mapToObj(i -> (char)i).distinct().sorted().forEach(System.out::print);
		//"AabkKliPpPA".chars().map(String::toLowerCase)args
		
		list.stream().map(String::toLowerCase).
		
		//String str = "Kobe Is is The the best player In in Basketball basketball game .";
		//m List<String> list = new ArrayList<>();

		// the actual operation
		TreeSet<String> seen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		list.removeIf(s -> !seen.add(s));

		// just for debugging
		System.out.println(String.join(" ", list));
		
		System.out.println(list1);
		List<Integer> list2 = list.stream().map(i->i+5).collect(Collectors.toList());
		//List<Integer> list3 = list.stream().map(i->{ if(i<=30) i+5}).collect(Collectors.toList());
		long noOfFailedStudent = list.stream().filter(i->i<17).count();
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedList:"+sortedList);
		
		List<Integer> sortedListCustomized = list.stream().sorted((i1,i2)->(i2<i1)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println("SortedListCustomized:"+sortedListCustomized);
		
		System.out.println(noOfFailedStudent);
		System.out.println(list2);
		List<String> strList = listString.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(strList);
		
	}
*/
}
