import java.util.*;
public class array {

	public static void main(String[] args) {
		
		
		//maximum and minimum element in array
		int n;
		System.out.print("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}

  }
}
