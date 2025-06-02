import java.io.*;
import java.util.*;
class Pattern_10{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    int count = 1;
		char ch = 'a';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j%2 != 0) {
					System.out.print(ch+"\t");
					ch++;
				}
				else {
					System.out.print(count+"\t");
					count++;
				}
			}	
			System.out.println();
		}
    
  }
}
