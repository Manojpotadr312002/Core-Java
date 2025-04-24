package ITPreneur;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		String i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		a = sc.nextByte();   //Accepts integer values from -128 to 127.
		
		System.out.println("Enter the value of b : ");
		b = sc.nextShort();  //Accepts integer values from -32,768 to 32,767.
		
		System.out.println("Enter the value of c : ");
		c = sc.nextInt();  //Accepts integers from -2,147,483,648 to 2,147,483,647.
		
		System.out.println("Enter the value of d : ");
		d = sc.nextLong();  //Accepts long integers in the range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
		
		System.out.println("Enter the value of e : ");
		e = sc.nextFloat();   // 6-9 significant figures
		
		System.out.println("Enter the value of f : ");
		f = sc.nextDouble();  //15-16 significant figures
		
		System.out.println("Enter the value of g : ");
		g = sc.next().charAt(0);
		
		System.out.println("Enter the value of h : ");
		h = sc.nextBoolean();  //Only accepts "true" or "false"
		sc.nextLine();
		
		System.out.println("Enter the value of i : ");
		i = sc.nextLine();
		
		
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		System.out.println("g : "+g);
		System.out.println("h : "+h);
		System.out.println("i : "+i);

	}

}
