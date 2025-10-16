package ITPreneur;

import java.io.*;
import java.util.*;

public class loops {

	public static void main(String[] args) {
		
		
		// for loop
		System.out.println("------- for loop -------");
		System.out.println("Print 1 to 10 numbers");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		// while loop
		System.out.println("------- while loop -------");
		System.out.println("Print 1 to 10 numbers");
		int j=1;
			while(j<=10) {
				System.out.println(j);
				j++;
			}
				
		
		// do-while loop
		System.out.println("------- do-while loop -------");
		System.out.println("Print 1 to 10 numbers");
		int k=1;
			do {
				System.out.println(k);
				k++;
			}
		while(k<=10);
	}

}


