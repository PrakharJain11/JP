import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKeys {
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
	
		hmap.put(10,"A");
		hmap.put(1,"B");
		hmap.put(4,"D");
		hmap.put(2,"k");
		hmap.put(8,"B");
		hmap.put(8,"A");
		hmap.put(6,"L");
		hmap.put(9,"I");
		hmap.put(22,"A");
		hmap.put(21,"B");
		
		System.out.println("Before Sorting");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Entry) iterator.next();
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());
			
		}
		
		Map<Integer,String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting");
		Set<Entry<Integer,String>> set2 = map.entrySet();
		Iterator<Entry<Integer, String>> iterator2 = set2.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry me2 = (Entry) iterator2.next();
			System.out.print(me2.getKey() + " : ");
			System.out.println(me2.getValue());
		}	
	}
}
