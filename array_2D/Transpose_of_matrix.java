import java.io.*;
import java.util.*;
class Array2D{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of array : ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();

	  // Transpose of array
	
		System.out.println("Enter the "+rows*columns+" elements in array a: ");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("Enter the a["+i+"]["+j+"] :");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Transpose of matrix...");
		int trr[][]=new int[rows][columns];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				trr[i][j]=a[j][i];
				System.out.print(trr[i][j]+" ");
			}
			System.out.println();
		}
  }
}
