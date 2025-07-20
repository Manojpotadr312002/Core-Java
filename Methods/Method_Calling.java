import java.util.Scanner;

public class Call_Method {
	
	public static void addition(int a, int b) {
		System.out.println("The addition is :"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Operations m = new Operations();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		m.addition(a,b);
		
	}

}
