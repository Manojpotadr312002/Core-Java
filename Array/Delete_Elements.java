import java.io.*;
import java.util.*;
public class Array{
	public static void main(String args []){
		//Delete element in array
		int n;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.print("Enter the "+n+" element of array: ");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Original Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nEnter the position for delete element of array: ");
		int position = sc.nextInt();
		
		position = position-1;
		
		if(position<n) {
		for(int i=position; i<n-1; i++) {
			a[i] = a[i+1];
		}
		
		System.out.print("After delete element in array: ");
		for(int i=0; i<n-1; i++) {
			System.out.print(a[i]+" ");
		}
		}
		else {
			System.out.print(" position is invalid... ");
			
		}
	}
}
