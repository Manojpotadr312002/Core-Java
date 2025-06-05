import java.io.*;
import java.util.*;
class Pattern_13{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    if(n%2==0) {
			for(int i=1; i<n; i++) {
				for(int j=1; j<n; j++) {
					
					if(i==3 || j==3 || i==n-3 || j==n-3 || i==j || i+j==n) {
					
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
				System.out.println("Enter the even digit only.....!");
			}
    
  }
}
