package com.prakharjain.StringExamples;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Prakhar Jain";
		
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				int counter = map.get(c);
				map.put(c, ++counter);
				
			}
			else
				map.put(c, 1);
		}
		
	}

}
