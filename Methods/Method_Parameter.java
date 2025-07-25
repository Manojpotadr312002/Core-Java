import java.util.Scanner;

public class Method_Parameter {
	
	public static void MyInfo(String name, int age) {
		System.out.println(name+" is "+age+" years old...!");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and age : ");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		MyInfo(name,age);
	}

}
