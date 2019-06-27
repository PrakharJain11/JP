package com.prakharjain.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUtil {
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Ram", "Ayodhya");
		map.put("Krishna", "Vrindavan");
		map.put("Gautam", "GayaJi");
		map.put("Mahaveer", "Kundalpur");
		
		//Map.Entry<String, String> mapEntry = (Entry<String, String>) map.entrySet();
		
		Set<Entry<String,String>> entries = map.entrySet();
		
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Entering into map:"+entry.getKey());
			
		}
		
		Comparator<Entry<String,String>> valueComparator = new Comparator<Entry<String,String>>(){
			public int compare(Entry<String, String> e1, Entry<String, String> e2) {
				String v1 = e1.getValue();
				String v2 = e2.getValue();
				return v1.compareTo(v2);
				
			}
		};
		
		List<Entry<String,String>> listOfEntries = new ArrayList<Entry<String,String>>(entries);
		Collections.sort(listOfEntries, valueComparator);
		
Map<String, String> sortedByValue = new HashMap<String, String>(listOfEntries.size());
        
        // copying entries from List to Map
        for(Entry<String, String> entry : listOfEntries){
        	System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue());
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("HashMap after sorting entries by values ");
        Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
        
        for(Entry<String, String> mapping : entrySetSortedByValue){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
	
	}
}
