package ITPreneur;

public class Conditional_Statement {

	public static void main(String[] args) {
		 
		// if statement
		int m = 10;
		
		System.out.println("------- if statement --------");
		
		if(m>20) {
			System.out.println("The value of 'm' is greater than 20");
		}
		System.out.println("The value of 'm' is less than 20");
		System.out.println();
		
		
		// if-else statement
		System.out.println("------- if-else statement --------");
		
		if(m<20) {
			System.out.println("The value of 'm' is less than 20");
		}
		else {
			System.out.println("The value of 'm' is greater than 20");
		}
		System.out.println();
		
		
		
		//Nested-if statement
		System.out.println("------- Nested-if statement --------");
		int x = 10;
		int y = 20;
		
		if(x>y) 
		{
			if(y>20)
			{
				System.out.println("True");
			}
			else {
				System.out.println("y is less than 20");
			}
		}
		else {
			System.out.println("x is less than y");
		}
		System.out.println();
		
		
		
		//if-else-ladder statement
		System.out.println("------- if-else-ladder statement --------");
		int a=2,b=8,c=6;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("All are equal");
		}
		
	}
}
