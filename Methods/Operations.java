package Methods;

import java.util.Scanner;

public class Operations {
	
	public static void addition(int a, int b) {
		System.out.println("The addition is :"+(a+b));
	}
	
	public static void substraction(int a, int b) {
		System.out.println("The substraction is :"+(a-b));	
	}
	
	public static void multiplication(int a, int b) {
		System.out.println("The multiplication is :"+a*b);
	}
	
	public static void division(int a, int b) {
		System.out.println("The division is :"+ a/b);
	}
	
	public static void modulas(int a, int b) {
		System.out.println("The addition is :"+ a%b);
	}

	public static void main(String[] args) {
		
		Operations m = new Operations();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		m.addition(a,b);
		m.substraction(a,b);
		m.multiplication(a,b);
		m.division(a,b);
		m.modulas(a,b);
		

	}

}
