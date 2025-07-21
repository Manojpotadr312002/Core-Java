package Methods;

public class Overloading {
	
	public static void area(int a) {
		System.out.println("Area of square :"+(a*a));
	}
	
	public static void area(int a, int b) {
		System.out.println("Area of rectangle :"+(a*b));
	}
	
	public static void area(double r) {
		System.out.println("Area of circle :"+(3.14*r*r));
	}

	public static void main(String[] args) {
		
		Overloading ol = new Overloading();
		
		ol.area(4);
		ol.area(2,5);
		ol.area(3.1);

	}

}
