import java.util.*;
class array{
  public static void main(String args[]){

    //total sum of array elements
		int n;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("---- Insert Element in Array ----");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<n; i++) {
			sum=sum+a[i];
		}
		System.out.println("Total sum of array element is "+sum);
    
  }
}
