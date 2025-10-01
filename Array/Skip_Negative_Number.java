import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {3, -1, 7, 0, 9};

    for (int n : numbers) {
      if (n < 0) {
        continue; // skip negative numbers
      }
      if (n == 0) {
        break; // stop loop when zero is found
      }
      System.out.println(n);
    }
  }
}
