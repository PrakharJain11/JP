
public class Gen<Integer> {
	Integer ob;
	Gen(Integer ob)
	{
		this.ob = ob;
	}
	
	public boolean add(String ob)
	{
		return true;
	}
	
	public void show()
	{
		System.out.println("The type of Obj is: "+ob.getClass());
	}
	
	public Integer getOb()
	{
		return ob;
	}
}
