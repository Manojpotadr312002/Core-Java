import java.io.*;
import java.util.*;
class Array2D{
  public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows and columns of array : ");
	int rows = sc.nextInt();
	int columns = sc.nextInt();

	int a[][] = new int[rows][columns];
	System.out.println("Enter the "+rows*columns+" elements in array a :");
	for(int i=0; i<rows; i++)
		{
		for(int j=0; j<columns; j++){
			System.out.print("Enter the a["+i+"]["+j+"] : ");
			a[i][j] = sc.nextInt();
		}
	}
	System.out.println();

	int b[][] = new int[rows][columns];
	System.out.println("Enter the "+rows*columns+" elements in array b : ");
	for(int i=0; i<rows; i++)
		{
		for(int j=0; j<columns; j++){
			System.out.print("Enter the b["+i+"]["+j+"] : ");
			b[i][j] = sc.nextInt();
		}
	}
	System.out.println();

	int c[][] = new int[rows][columns];
	System.out.println("Addition of Array : ");
	for(int i=0; i<rows; i++)
		{
		for(int j=0; j<columns; j++){
			c[i][j] = a[i][j] + b[i][j];
		}
	}
	System.out.println();

	for(int i=0; i<rows; i++)
		{
		for(int j=0; j<columns; j++){
			System.out.print(c[i][j] +" ");
		}
		System.out.println();
	}
	
  }
}
