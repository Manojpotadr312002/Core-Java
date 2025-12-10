import java.io.*;
import java.util.*;

public class Attributes {
	
	final int y = 10;
	int x = 5;
	String name = "Manoj";

	public static void main(String[] args) {
		
		Attributes myObj1 = new Attributes();
		Attributes myObj2 = new Attributes();
		
		myObj1.x = 25;
	
		System.out.println(myObj1.x);
		System.out.println(myObj2.y);

		myObj2.x =23;
		
		System.out.println("Name of student is "+myObj1.name+" and age is "+myObj2.x);
		
	}

}
