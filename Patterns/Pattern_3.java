import java.io.*;
import java.util.*;
class Pattern_3{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++) {
				for(int space=0; space<n-1-i; space++) {
					System.out.print(" "+" ");
				}
				for(int j=0; j<=2*i; j++) {
					
							System.out.print("* ");	
				}
				System.out.println();
			}
    
  }
}
