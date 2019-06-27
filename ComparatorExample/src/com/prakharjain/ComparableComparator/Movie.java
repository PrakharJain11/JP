package com.prakharjain.ComparableComparator;

public class Movie implements Comparable<Movie>{
	private double rating;
	private String name;
	private int year;
	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.year-m.year;
	}
	public Movie(String name, double rating,  int year) {
		//super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
