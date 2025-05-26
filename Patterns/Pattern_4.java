import java.io.*;
import java.util.*;
class Pattern_4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    if(n>5) {
		for(int i=1; i<n; i++) {
			for(int j=1; j<n; j++) {
				if(i==1 || j==1 || i==n-1 || j==n-1 || i==j || i+j==n) {
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
			System.out.println("Enter the value of n is greater then 5......!");
		}
    
  }
}
