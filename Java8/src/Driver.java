import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args)
	{	
		List<Person> persons = populateWithData();
		System.out.println("Obtain US based & Non US Based person using partion by & groupting by");
		System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"))).values());
		
		
		Map<Boolean, List<Person>> p1 = persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US")));
		
		
		System.out.println("Count US based & Non US Based person using partion by & groupting by");
		System.out.println("Obtain the person in each country & count them by using groupting by");
		System.out.println("Obtain US & Non US persons using partioning by & map names to upper case using mapping");
		System.out.println("Obtain the person in each county using grouping by & map names to upper case using mapping");
	}
	
	static List<Person> populateWithData()
	{
		List<Person> personList = new ArrayList<Person>();
		
		Person person01 = new Person("person01", "US");
		Person person02 = new Person("person02", "UK");
		Person person03 = new Person("person03", "SPain");
		Person person04 = new Person("person04", "India");
		Person person05 = new Person("person05", "Germany");
		Person person06 = new Person("person06", "US");
		Person person07 = new Person("person07", "Russia");
		Person person08 = new Person("person08", "UK");
		Person person09 = new Person("person09", "India");
		Person person10 = new Person("person10", "Germany");
		
		personList.add(person01);
		personList.add(person02);
		personList.add(person03);
		personList.add(person04);
		personList.add(person05);
		personList.add(person06);
		personList.add(person07);
		personList.add(person08);
		personList.add(person09);
		personList.add(person10);
		
		return personList;
	}
}
