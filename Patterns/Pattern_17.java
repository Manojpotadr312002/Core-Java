import java.io.*;
import java.util.*;
class Pattern_17{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++) {
	for(int space=0; space<n-1-i; space++) {
		System.out.print(" "+" ");
	}
	for(int j=0; j<=2*i; j++) {
		if(i==n-1 || j==0 || j==2*i) {
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
