
public class SecondClass extends FirstClass{

	public void abc(int a, int b)
	{
		System.out.println("This is from the sub class"+ "Argument 1 is" +a +"Argument 2 is" +b);
		super.abc(5, 6);
	}
	
}
