import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LexigraphicalSubString {
	public static void main(String[] args)
	{
		System.out.println("Enter with Input");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------->"+sc.nextLine());
		String str = "welcometojava";
		
		
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		
		
		System.out.println(str.length());
		
		TreeSet<String> ts = new TreeSet<String>();
		for(int i = 0; i<=str.length()-3; i++)
		{
			ts.add(str.substring(i, i+3));
			int size = ts.size();
		}
		System.out.println("\"Prakhar\"");
		
		//Arrays.sort(subStr);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);
	}
}
