package firstpack;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {


		// Insert and Display array element
		// 1D array
		int arr[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in array: ");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		

		// Insert and Display array element
		// 2D array
		int arr[][]= new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in array: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		
		
		// Insert and Display array element
		// 3D array
		int arr[][][]= new int[2][2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in array: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<3; k++) {
			       arr[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<3; k++) {
			       System.out.print(arr[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
