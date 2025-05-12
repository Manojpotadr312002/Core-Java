import java.util.*;
public class array {

	public static void main(String[] args) {
		
		//print the array in reverse direction
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

  }
}
  
