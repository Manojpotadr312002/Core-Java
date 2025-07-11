import java.io.*;
import java.util.*;
class Pattern_18{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();

    // Outer loop to handle the upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
              
                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }
                
                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Outer loop to handle the lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
              
                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }
                
                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    
  }
}
