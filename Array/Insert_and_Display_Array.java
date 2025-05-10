package Array;

import java.util.Scanner;

public class Insert_and_Display_Array {

	public static void main(String[] args) {
		
		// Insert and Display array element
				
				int arr[]= new int[5];
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the numbers in array: ");
				for(int i=0; i<5; i++) {
					arr[i] = sc.nextInt();
				}
				
				System.out.println("---- Display Array ----");
				for(int i=0; i<5; i++) {
					System.out.print(arr[i]+"\t");
				}

	}

}
