import java.io.*;
import java.util.*;
class Pattern_9{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();
    
    if(n%2!=0) {
    			int i, star=n, space=0;
    			for(i=0; i<n; i++) {
    				for(int j=0; j<space; j++) {
    					System.out.print(" ");
    				}
    				for(int j=0; j<star; j++) {
    					System.out.print("*");
    				}
    				System.out.println();
    				
    				if(i<n/2) {
    					space++;
    					star-=2;
    				}
    				else {
    					space--;
    					star+=2;
    				}
    			}
    		}
    		else {
    			System.out.println("Enter the odd digit only.....!");
    		}
  }
}
