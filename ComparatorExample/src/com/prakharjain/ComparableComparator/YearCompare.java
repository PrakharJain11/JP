package com.prakharjain.ComparableComparator;

import java.util.Comparator;

public class YearCompare implements Comparator<Movie> {
	
	public int compare(Movie m1, Movie m2)
	{
		return (m1.getYear()<m2.getYear()?-1:(m2.getYear()<m1.getYear())?1:0);
		
	}

	
}
