package com.prakharjain.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MovieTest {
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Tare Zameen par", 8.4, 2010));
		list.add(new Movie("2 States", 9.4, 2017));
		list.add(new Movie("A Wednesday", 8.4, 2011));
		list.add(new Movie("3 Idiots", 8.48, 2000));
		list.add(new Movie("Lagaan", 8.4, 2010));
		list.add(new Movie("Chak De India", 8.9, 2018));
		
		new Movie(101, 2000, 24,"Amit")
		
		
		Collections.sort(list);
		//System.out.println(list.stream().collect(Collectors.toList()));
		for (Movie movie : list) {
			System.out.println(movie.getRating()+"  Name:"+movie.getName()+"  Year"+movie.getYear());
		}
		
		RatingCompare ratingCompare = new RatingCompare();
		NameCompare nameCompare = new NameCompare();
		
		Collections.sort(list, nameCompare);
		System.out.println("Name Compare");
		for (Movie movie : list) {
			System.out.println("Rating:"+ movie.getRating() +"  Name:"+ movie.getName()+"  Year:"+movie.getYear());
		}

		
		Collections.sort(list, ratingCompare);
		System.out.println("Rating Compare");
		for (Movie movie : list) {
			System.out.println("Rating:"+ movie.getRating() +"  Name:"+ movie.getName()+"  Year:"+movie.getYear());
		}
		
		List<Movie> movie1 = list.stream().sorted((i1,i2)->i1.getName().compareTo(i2.getName())).collect(Collectors.toList());
		
		
		System.out.println("Java8");
		for (Movie movie : movie1) {
			System.out.println("Rating:"+ movie.getRating() +"  Name:"+ movie.getName()+"  Year:"+movie.getYear());
		}
		
				
	}
}
