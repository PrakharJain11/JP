package com.prakharjain.StringExamples;

public class GetAnagram {
	
	void givenString_whenSortJava8_thenSorted() {
	    String sorted = "bdca".chars()
	      .sorted()
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    
	    System.out.println(sorted);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAnagram ga = new GetAnagram();
		ga.givenString_whenSortJava8_thenSorted();
		/*String str = "abcd";
		String str1 = "badc";
		*/
		
	}

}
