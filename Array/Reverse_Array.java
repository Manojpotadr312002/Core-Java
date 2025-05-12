import java.util.*;
public class array {

	public static void main(String[] args) {
		
		//print the array in reverse direction
		// Integers 
		int n;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Original Array");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("After Reverse the Array");
		for(int i=n-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}



		//print the array in reverse direction
		// Character 
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
  
