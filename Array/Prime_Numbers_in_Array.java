import java.io.*;
import java.util.*;
class PrimeCheck
  {
    public static void main(String args []){

      //print the prime number in array
		int n;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter " + n + " elements:");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("----- Prime Numbers in Array -----");
		for(int i=0; i<n; i++) {
		int x=2; 
		while(x<=a[i]){
				if(a[i]%x==0) {
					break;
				}
				x++;
		      }	
			
				if(a[i]==x) {
					
					System.out.println(a[i]);
				
			}
		}
      
  }
  }
