import java.util.List;

public class GenericBoundedTypes<T extends Runnable> {
	public static void main(String[] args)
	{
		/*GenericBoundedTypes<Thread> t1 = new GenericBoundedTypes<Thread>();
		GenericBoundedTypes<String> t1 = new GenericBoundedTypes<String>();*/
		
		List<? extends Number> list1 = null;
		List<Integer> list2 = null;
		list1 = list2;
	}
}
