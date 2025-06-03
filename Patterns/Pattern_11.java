import java.io.*;
import java.util.*;
class Pattern_11{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    int count = 1;
		char ch='a';
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2==0) {
					System.out.print(count+"\t");
					count++;
				}
				else {
					System.out.print(ch+"\t");
					ch++;
				}
			}	
			System.out.println();
		}
    
  }
}
