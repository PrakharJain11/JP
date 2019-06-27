package com.prakharjain.ComparableComparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2)
	{
		System.out.println("----------------->"+m2.getName().compareTo(m1.getName()));
		return (m2.getName().compareTo(m1.getName()));
	}
}