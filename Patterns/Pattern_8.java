import java.io.*;
import java.util.*;
class Pattern_8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    if(n%2!=0) {
	int i, star=(n/2);
	for(i=0; i<n; i++) {
		for(int j=0; j<=star; j++) {
			System.out.print("*");
		}
		System.out.println();
				
		if(i<n/2) {
			star--;
		}
		else {
			star++;
		}
	}
     }
     else {
	System.out.println("Enter the odd digit only.....!");
     }
    
  }
}
