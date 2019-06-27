package com.prakharjain.CountingWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(10);
		list.add(21);
		list.add(11);
		
		System.out.println(list);
		
		//List<Integer> list1 = list.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		//long list1 = list.stream().filter(i->i%2 == 0).count();
		Stream<Integer> list1 = list.stream().filter(i->i%2==0).distinct();
		System.out.println(list1.count());
	}

}
