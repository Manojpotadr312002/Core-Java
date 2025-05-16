import java.io.*;
import java.util.*;
public class Array{
  public static void main(String args []){
    //print the fibonacci series in array
    		int n;
    		System.out.print("Enter the size of array: ");
    		Scanner sc = new Scanner(System.in);
    		n = sc.nextInt();
    		
    		System.out.println("Enter the first two numbers: ");
    		int a[]=new int [n];
    		for(int i=0; i<2; i++) {
    			a[i] = sc.nextInt();
    		}
    		
    		
    		System.out.print(a[0]+" "+a[1]+" ");
    		
    		for(int i=2;i<n;i++) {
    			
    			a[i]=a[0]+a[1];
    			a[0]=a[1];
    			a[1]=a[i];
    			
    			System.out.print(a[i]+" ");
    			}
  } 
}
