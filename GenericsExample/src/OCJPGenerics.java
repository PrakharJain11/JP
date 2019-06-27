import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.SortedSet;

public class OCJPGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Number> list1 = null;
		List<Integer> list2 = null;
		list1 = list2;
		*/
		//SortedSet<Number> set1 = null;
		
		/*SortedSet<? extends Number> set21 = new SortedSet<Integer>();
		List<? extends Number> list = new ArrayList<Integer>();
		SortedSet<? extends Number> list1 = new SortedSet<Integer>();
		set1 = set2;
		set1.add(10);
		set1.add(10.5);
		set2.add(new Integer(10));
		*/
		List<String> list = new ArrayList<String>();
		list.add("hi");
		//list.add(1212);
		
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println("kkkkkkkkkkkk");
			System.out.println(list.get(i));
		}
		/*
		SortedSet<Number> set1 = null;
		SortedSet<? extends Integer> set2 = null;
		//set2 = set1;
		
		Queue<? extends Number> q1 = null;
		Queue<? super Integer> q2 = null;
		q1 = q2;
		
		Queue<? super Number> q1 = null;
		Queue<? extends Integer> q2 = null;
		//q1 = q2;
		
*/	}

}
