package ITPreneur;

public class ifelseladder {

	public static void main(String[] args) {
		
		// Program-1
		System.out.println("choice-1:Number is Even or Odd");
		System.out.println("choice-2:Greatest number or Smaller number");
		System.out.println("choice-3:Number is positive or negative");
		
		int choice=2,a=-66,b=8;
		if(choice==1) {
			if(a%2==0) {
				System.out.println("Number a is even");
			}
			else {
				System.out.println("Number a is odd");
			}
		}
		else if(choice==2) {
			if(a>b) {
				System.out.println("Number a is greater than b");
			}
			else {
				System.out.println("Number a is small than b");
			}
		}
		else if(choice==3) {
			if(a>=0) {
				System.out.println("Number a is positive");
			}
			else {
				System.out.println("Number a is negative");
			}
		}
		else {
			System.out.println("Invalid choice value");
		}
		
		
		
		
		// Program-2
		System.out.println("choice-1:Area of Circle");
		System.out.println("choice-2:Area of Rectangle");
		System.out.println("choice-3:Area of Square");
		
		int choice=2,height=5,width=4,side=6,radius=3,areaofRectangle,areaofSquare;
		double areaofCircle;
		if(choice==1) {
			areaofCircle = 3.14 * radius * radius;
			System.out.println("Area of Circle is "+areaofCircle);
		}
		else if(choice==2) {
			areaofRectangle = height * width;
			System.out.println("Area of Rectangle is "+areaofRectangle);
		}
		else if(choice==3) {
			areaofSquare = side * side;
			System.out.println("Area of Square is "+areaofSquare);
		}
		else {
			System.out.println("Invalid choice value");
		}

		
		
		
		// Program-3
		int n=50;
		for(int i=1;i<=n;i=i+1) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+"-"+"Java Language");
			}
			else if(i%3==0) {
				System.out.println(i+"-"+"Java");
			}
			else if(i%5==0) {
				System.out.println(i+"-"+"Language");
			}
		}
		
		
	}

}
