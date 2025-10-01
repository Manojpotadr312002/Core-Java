import java.io.*;
import java.util.*;

class array{
	public static void main(String args[]){
//Exchange position of elements in array
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n =  sc.nextInt();
		
		System.out.println("Enter the element in array : ");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("-----Original Array-----");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n----- Enter the positions which Exchange the element -----");
		int position1 = sc.nextInt();
		int position2 = sc.nextInt();
		
		position1 = position1 -1;
		position2 = position2 -1;
		
		if(position1<n && position2<n) {
			for(int i=0; i<n; i++) {
				if(i==position1) {
				int t = a[i];	
				a[i]=a[position2];
				a[position2] = t;
				}
			 
			}
			
			System.out.print("After exchange element in array: ");
			for(int i=0; i<n; i++) {
				System.out.print(a[i]+" ");
			}
			}
			else {
				System.out.print(" position is invalid... ");
				
			}
	}
}
