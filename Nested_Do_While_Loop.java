package ITPreneur;

public class Nested_Do_While_Loop {

	public static void main(String[] args) {
		
		// print your name multiple time using nested-loop  
				// i.e name print 20 times
				int i=1;
				do {
					int j=1;
					do {
						System.out.print("Manoj"+""+"\t");
						j++;
					}
					while(j<=5);
					i++;
					System.out.println();
				}
				while(i<=4);
				 
				
						
						
						
				// print your name multiple time using nested-loop  
				// i.e name print 20 times
				int i=1;
				do {
					int j=1;
					do {
						int k=1;
						do {
							System.out.print("Manoj"+"\t");
							k++;
						}
						while(k<=2);
						j++;
						System.out.println();
					}
					while(j<=5);
					i++;
					System.out.println();
				}
				while(i<=2);
						
						
				
				
						
				// * pattern
				int i=1;
				do {
					int j=1;
					do {
						System.out.print("* ");
						j++;
					}
					while(j<=5);
					i++;
					System.out.println();
				}
				while(i<=5);
						
						
						
				

	}

}
