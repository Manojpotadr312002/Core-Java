import java.io.*;
import java.util.*;
class Array2D{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of array : ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();

    		int a[][] = new int [rows][columns];
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("Enter the a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

	  	System.out.println("Before sorting array: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	       //Descending order
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++){ 
				for(int k=0; k<rows; k++) {
					for(int l=0; l<columns; l++) {
						if(a[i][j]>a[k][l]) {
							int t=a[i][j];
							a[i][j]=a[k][l];
							a[k][l]=t;
						}
					}
				}
			}
		}
				
		System.out.println("After sorting array: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
  }
}
