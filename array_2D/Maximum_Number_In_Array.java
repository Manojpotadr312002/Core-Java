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
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("Enter the a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int max = 0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				if(max<a[i][j]) {
					max = a[i][j];
				}
			}
		}
		System.out.println("The maximum number in array is "+max);

  }

}
