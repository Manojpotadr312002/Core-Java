package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorting {

	public static void main(String[] args) {
		
		//Sort the array in ascending order
//			int n;
//			System.out.print("Enter the size of array: ");
//			Scanner sc = new Scanner(System.in);
//			n = sc.nextInt();
//			
//			int a[] = new int[n];
//			for(int i=0; i<n; i++) {
//				a[i] = sc.nextInt();
//			}
//			
//			System.out.println("----- Original Array -----");
//			for(int i=0; i<n; i++) {
//				System.out.print(a[i]+" ");
//			}
//			
//			System.out.println();
//			
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<n; j++) {
//					
//					// Ascending order
//					if(a[i]<a[j]) {
//						int t=a[i];
//						a[i]=a[j];
//						a[j]=t;
//					}
//					
//				}
//			}
//			
//			System.out.println("----- Array After Sorting -----");
//			for(int i=0; i<n; i++) {
//				System.out.print(a[i]+" ");
//			}

		
		
		
		
		//Sort the array in descending order
//			int n;
//			System.out.print("Enter the size of array: ");
//			Scanner sc = new Scanner(System.in);
//			n = sc.nextInt();
//				
//			int a[] = new int[n];
//			for(int i=0; i<n; i++) {
//				a[i] = sc.nextInt();
//			}
//			
//			System.out.println("----- Original Array -----");
//			for(int i=0; i<n; i++) {
//				System.out.print(a[i]+" ");
//			}
//				
//			System.out.println();
//				
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<n; j++) {
//						
//					// Descending order
//					if(a[i]>a[j]) {
//						int t=a[i];
//						a[i]=a[j];
//						a[j]=t;
//					}
//				}
//			}
//			
//			System.out.println("----- Array After Sorting -----");
//			for(int i=0; i<n; i++) {
//				System.out.print(a[i]+" ");
//			}
		
		
		
		
		// Sort the array
		
		int n;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
			
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("----- Original Array -----");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
			
	}
}
