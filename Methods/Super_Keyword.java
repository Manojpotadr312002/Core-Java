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
	
	void display() {
		area(4);
		super.area(4);
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		
		ob.display();
		
	}

}
