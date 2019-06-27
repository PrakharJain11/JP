
public class GenDemo {
	
	public static void main(String[] args)
	{
		Gen<String> g1 = new Gen<String>("durga");
		g1.add("Durga");
		//g1.add(10);
		g1.show();
		
		System.out.println(g1.getOb());
	
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getOb());
	}
}
