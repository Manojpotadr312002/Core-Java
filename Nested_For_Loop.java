package ITPreneur;

public class Nested_For_Loop {

	public static void main(String[] args) {
		
		// print your name multiple time using nested-loop  
		// i.e name print 20 times
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=4; j++) {
				System.out.println("Manoj");
			}
		}
		
		
		
		// print your name multiple time using nested-loop  
		// i.e name print 20 times
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("Manoj");
			}
		}
		
		
		
		// * pattern
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// Multiplication Table (1 to 10)
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(i * j+"\t");
			}
			System.out.println();
		}
	}

}
