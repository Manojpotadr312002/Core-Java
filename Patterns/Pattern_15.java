import java.io.*;
import java.util.*;
class Pattern_15{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    if(n%2!=0) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i<n/2 && j>n/2)||(i>n/2 && j<n/2)) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Enter the odd number only");
		}
    
  }
}
