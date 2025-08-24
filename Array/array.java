package ITPreneur;
import java.util.*;
public class array {

	public static void main(String[] args) {
		
		
		//maximum and minimum element in array
//		int n;
//		System.out.print("Enter the size of array:");
//		Scanner sc = new Scanner(System.in);
//		n=sc.nextInt();
//		
//		int a[]=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		int max=a[0];
//		for(int i=0;i<n;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println("The maximum element in array is "+max);
//		
//		int min=a[0];
//		for(int i=0;i<n;i++) {
//			if(a[i]<min) {
//				min=a[i];
//			}
//		}
//		System.out.println("The minimum element in array is "+min);
		
		
		
		//print the array in reverse direction
//		int n;
//		System.out.print("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		int a[] = new int[n];
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.println("Original Array");
//		for(int i=0; i<n; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println("After Reverse the Array");
//		for(int i=n-1; i>=0; i--) {
//			System.out.print(a[i]+" ");
//		}
		
		
		
		//print the prime number in array
//		int n;
//		System.out.print("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		System.out.println("Enter " + n + " elements:");
//		int a[] = new int[n];
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.println("----- Prime Numbers in Array -----");
//		for(int i=0; i<n; i++) {
//		int x=2; 
//		while(x<=a[i]){
//				if(a[i]%x==0) {
//					break;
//				}
//				x++;
//		      }	
//			
//				if(a[i]==x) {
//					
//					System.out.println(a[i]);
//				
//			}
//		}
		
		
		
		//total sum of array elements
//		int n;
//		System.out.print("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		int a[] = new int[n];
//		System.out.println("---- Insert Element in Array ----");
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		int sum=0;
//		for(int i=0; i<n; i++) {
//			sum=sum+a[i];
//		}
//		System.out.println("Total sum of array element is "+sum);
	
	
	
		//print the fibonacci series in array
//		int n;
//		System.out.print("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		System.out.println("Enter the first two numbers: ");
//		int a[]=new int [n];
//		for(int i=0; i<2; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		
//		System.out.print(a[0]+" "+a[1]+" ");
//		
//		for(int i=2;i<n;i++) {
//			
//			a[i]=a[0]+a[1];
//			a[0]=a[1];
//			a[1]=a[i];
//			
//			System.out.print(a[i]+" ");
//			}
		
		
		//Insert the element in array
//		int n;
//		System.out.print("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		int a[] = new int[n];
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<n; i++) {
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.print("\nEnter the new element in array: ");
//		int NewElement = sc.nextInt();
//		
//		System.out.print("Enter the position of array: ");
//		int position = sc.nextInt();
//		
//	
//			if(position < 1 || position > n) {
//				System.out.println("invalid position");
//				return;
//			}
//		int[]newArray = new int[n+1];
//		for(int i=0,j=0; i<newArray.length; i++) {
//			if(i == position - 1) {
//				newArray[i]=NewElement;
//			}
//			else {
//				newArray[i]=a[j];
//				j++;
//			}
//			System.out.print(newArray[i]+" ");
//		}
		
		
		//Sort the array in ascending order
		int n;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				// Ascending order
				if(a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
//				
//				// Descending order
////				if(a[i]>a[j]) {
////					int t=a[i];
////					a[i]=a[j];
////					a[j]=t;
////				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		//Delete element in array
//		int n;
//		System.out.print("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		System.out.print("Enter the "+n+" element of array: ");
//		int a[] = new int[n];
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.print("Original Array: ");
//		for(int i=0; i<n; i++) {
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.print("\nEnter the position for delete element of array: ");
//		int position = sc.nextInt();
//		
//		position = position-1;
//		
//		
//		if(position<n) {
//		for(int i=position; i<n-1; i++) {
//			a[i] = a[i+1];
//		}
//		
//		System.out.print("After delete element in array: ");
//		for(int i=0; i<n-1; i++) {
//			System.out.print(a[i]+" ");
//		}
//		}
//		else {
//			System.out.print(" position is invalid... ");
//			
//		}
		
		
		
		//Exchange position of elements in array
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of array : ");
//		n =  sc.nextInt();
//		
//		System.out.println("Enter the element in array : ");
//		int a[] = new int[n];
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.println("-----Original Array-----");
//		for(int i=0; i<n; i++) {
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.println("\n----- Enter the positions which Exchange the element -----");
//		int position1 = sc.nextInt();
//		int position2 = sc.nextInt();
//		
//		position1 = position1 -1;
//		position2 = position2 -1;
//		
//		if(position1<n && position2<n) {
//			for(int i=0; i<n; i++) {
//				if(i==position1) {
//				int t = a[i];	
//				a[i]=a[position2];
//				a[position2] = t;
//				}
//			 
//			}
//			
//			System.out.print("After exchange element in array: ");
//			for(int i=0; i<n; i++) {
//				System.out.print(a[i]+" ");
//			}
//			}
//			else {
//				System.out.print(" position is invalid... ");
//				
//			}
		
		
	}


	
}
