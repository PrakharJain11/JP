package com.prakhar.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Java8ForEachEx {
	
	
	public static void main(String[] args)
	{
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		ArrayList<Cards> cards = new ArrayList<Cards>();
		
		cards.add(new Cards(101, "WeddingCard1", "Wedding1", "Golden"));
		cards.add(new Cards(102, "WeddingCard2", "Wedding2", "Platinum"));
		cards.add(new Cards(104, "WeddingCard4", "Wedding4", "Silver"));
		cards.add(new Cards(103, "WeddingCard3", "Wedding3", "Golden"));
		
		items.forEach((k,v)->System.out.println("Item:"+ k + "  count:"+v));
		
		items.forEach((k,v)->{
			System.out.println("Item:"+ k + "  Count:"+v);
			if("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
		
		cards.stream().forEach(i->{
		System.out.println("The Square of: "+i.getCardID());
		});
		
		Cards[] i = cards.stream().toArray(Cards[]::new);
		
		/*for (Integer integer : i) {
			System.out.println(i);
		}
	*/	
		Stream.of(i).forEach(System.out::println);
		
	}
	

}
