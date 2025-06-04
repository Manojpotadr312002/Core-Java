import java.io.*;
import java.util.*;
class Pattern_12{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    if(n%2==0 && n>6) {
		for(int i=1; i<n; i++) {
			for(int j=1; j<n; j++) {
				
				if(i==1 || j==1 || i==n-1 || j==n-1 || i==j || i+j==n || i==n/2 || j==n/2) {
				
						System.out.print("* ");
						
					}
		
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Enter the even digit only and grater than 6");
		}
    
  }
}
