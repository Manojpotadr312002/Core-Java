public class Return_Value {
	
	static int myMethod(int x) {
	    return 5 + x;
	}

	static int myMethod(int x, int y) {
	    return x + y;
	}
	
	static int myMethod(int x, int y, int z) {
	    return x + y - z ;
	}

	public static void main(String[] args) {
		
		System.out.println(myMethod(3));
		System.out.println(myMethod(2,3));
		
		int a = myMethod(5,6,4);
		System.out.println(a);

	}

}
