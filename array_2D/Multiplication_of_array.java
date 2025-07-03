import java.io.*;
import java.util.*;
class Array2D{
  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of rows and columns : ");
	int rows = sc.nextInt();
	int columns = sc.nextInt();
	int arr[][]=new int[rows][columns];
		System.out.println("Enter the "+rows*columns+" elements in array arr");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("Enter the arr["+i+"]["+j+"] :");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int brr[][]=new int[rows][columns];
		System.out.println("Enter the "+rows*columns+" elements in array brr");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("Enter the brr["+i+"]["+j+"] :");
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		int crr[][]=new int[rows][columns];
		System.out.println("multiplication of array : ");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				for(int k=0; k<columns; k++) {
					crr[i][j] += arr[i][k] * brr[k][j];
				}
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	
  }
}
