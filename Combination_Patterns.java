package TechnoLearn;

public class Combination_Patterns {

	public static void main(String[] args) {
		
		// right angled triangle using combination of character and number
		char ch='A';
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0) {
					System.out.print(ch);
					}
				else{
					System.out.print(i/2+1);
				}
			}
			if(i%2==0) {
				ch++;
			}
			System.out.println();
		}

		
		// pyramid using combination of character and number
		char ch='A';
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(j>=6-i && j<=4+i && i%2!=0) {
					System.out.print(ch);
					}
				else if(j>=6-i && j<=4+i && i%2==0) {
					
					System.out.print(i/2);
					}
				else{
					System.out.print(" ");
				}
			}
			if(i%2!=0) {
				ch++;
			}
			System.out.println();
		}

	}

}
