package array_2D;
import java.io.*;
import java.util.*;

public class Array2D {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of array : ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int a[][] = new int[rows][columns];

		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
