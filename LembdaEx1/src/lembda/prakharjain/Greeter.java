package lembda.prakharjain;

public class Greeter {
	public void greet(Greeting greeting)
	{
		//greeting.perform();
		greeting.perform();
		//System.out.println("In greet method");
	}
	
	public static void main(String[] args)
	{
		Greeter greeter = new Greeter();
		//Greeting helloWorldGreeting = new HelloWorldGreeting();
		//greeter.greet(helloWorldGreeting);
		
		Greeting myLambdaFunction = () -> System.out.println("Hello World");
		
		Greeting innerClassGreeting = new Greeting()
		{
			public void perform()
			{
				System.out.println("Hello World");
			}
		};
		
		//myLambdaFunction.perform();
		//innerClassGreeting.perform();
		greeter.greet(myLambdaFunction);
		greeter.greet(innerClassGreeting);
		
	}
	

}

/*interface MyLambda {
	void foo();

}
*/