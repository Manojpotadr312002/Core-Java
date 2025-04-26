package ITPreneur;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("case-1:The number is even or odd");
		System.out.println("case-2:The number is positive or negative");
		System.out.println("case-3:The number is greater or smaller");
		int choice=2 ,a=2,b=3;
		switch(choice) {
		case 1:
			if(a%2==0) {
			System.out.println("Number is even");
			}
			else {
				System.out.println("Number is odd");
			}
			break;
		case 2:
			if(a>=0) {
			System.out.println("Number is positive");
			}
			else {
				System.out.println("Number is negative");
			}
			break;
		case 3:
			if(a>b) {
			System.out.println("Number a is greater than b");
			}
			else {
				System.out.println("Number a is less than b");
			}
			break;
		}
		

	}

}
