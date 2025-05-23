package Array;

import java.util.Scanner;

public class Array_Reverse {

	public static void main(String[] args) {
		
	
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		n = sc.nextInt();
		
		char a[]= new char[n];
		
		System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);  
        }
		
		System.out.println("----- Original Array -----");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("----- After Reverse the Array -----");
		for(int i=n-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}

	}

}
