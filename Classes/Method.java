public class Method {
	
	static void myStaticMethod() {
		System.out.println("Static method...!");
	}

	public void myPublicMethod() {
		System.out.println("Public method...!");
	}

	public static void main(String[] args) {
		
		myStaticMethod();
		
		
		Method obj = new Method();
		obj.myPublicMethod();

	}

}
