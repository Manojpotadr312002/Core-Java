package TechnoLearn;

public class Cross_Plus {

	public static void main(String[] args) {
		
		// * pattern rhombas
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j>=6-i && j<=4+i && j<=14-i && j>=i-4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		// cross pattern using *
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==j)||(i+j==6)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		// plus pattern using *
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==3 || i==3)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
