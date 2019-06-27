
public class Person {
	private String name;
	private String country;
	
	
	public String getName() {
		return name;
	}
	
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
