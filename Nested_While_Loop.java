package ITPreneur;

public class Nested_While_Loop {

	public static void main(String[] args) {
		
		// print your name multiple time using nested-loop  
		// i.e name print 20 times
		int i=1;
		while(i<=5) {
			int j=1; 
			while(j<=4) {
				System.out.print("Manoj"+""+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
				
				
				
		// print your name multiple time using nested-loop  
		// i.e name print 20 times
		int i=1;
		while(i<=2) {
			int j=1; 
			while(j<=2) {
				int k=1;
				while(k<=5) {
				System.out.print("Manoj"+""+"\t");
				k++;
				}
			System.out.println();
			j++;
		    }
		System.out.println();
		i++;
	    }
				
				
				
		// * pattern
		int i=1;
		while(i<=5) {
	    	int j=1; 
	    	while(j<=5){
				System.out.print("* ");
				j++;
			}
	    	i++;
			System.out.println();
		}
				
				
				
		// Multiplication Table (1 to 10)
		int i=1; 
		while(i<=10){
			int j=1; 
			while(j<=10){
				System.out.print(i * j+"\t");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
