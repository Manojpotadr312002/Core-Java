import java.io.*;
import java.util.*;

class Square{
	public static void area(int a) {
		System.out.println("Area of square :"+(a*a));
	}
}

class Circle extends Square{
	public static void area(int r) {
		System.out.println("Area of circle :"+(3.14*r*r));
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Square ob = new Circle();
		
		ob.area(4);

	}

}
