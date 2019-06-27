package com.prakharjain.ComparableComparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		//return (m1.getRating()<m2.getRating())?-1:(m1.getRating()>m2.getRating())?1:0;
		return (m1.getRating()>m2.getRating())?1:(m1.getRating()<m2.getRating())?-1:0;
	}
	
}
