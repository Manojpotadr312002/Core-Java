package ITPreneur;

public class Operators {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		// Arithmetic Operators
		System.err.println(a+b);  // 100 + 200 = 300
		System.err.println(a-b);  // 100 - 200 = -100
		System.err.println(a*b);  // 100 * 200 = 20000
		System.err.println(b/a);  // 200 / 100 = 2
		System.err.println(b%a);  // 200 % 100 = 0
		
		
		// Relational Operators
		System.err.println(a<b);  // true
		System.err.println(a>=b);  // false
		System.err.println(a!=100);  // false
		System.err.println(a==b);  // false
		System.err.println(a<=b);  // true
				
		
		// Assignment Operators
		a+=20;
		System.err.println(a);    //100 + 20 = 120
		
		b-=50;
		System.err.println(b);   //200 - 50 = 150
		
		a*=b;
		System.err.println(a);   // 120 * 150 = 18000
		
		a/=100;
		System.err.println(a);   // 18000 / 100 = 180
		
		b%=15;
		System.err.println(b);   // 150 % 15 = 0
			
		
		
		// Logical Operators
		int n=10,m=20;
		System.err.println(n<m && m>5);  // true
		System.err.println(n>=m || n<m);  // true
		System.err.println(!(n!=10) || n>m );  // true
		System.err.println(!(n!=10) && n>m );  // false
		System.err.println(n==m || m<n);  // false
		

		
		// Bitwise Operators
		System.err.println(1&2);  // 0
		System.err.println(1|2);  // 3
		System.err.println(10&20);  // 0
		System.err.println(10|20);  // 30
		System.err.println(~(20));  // -21
		System.err.println(~(-20));  // 19
	}

}
