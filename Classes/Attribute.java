import java.io.*;
import java.util.*;
public class Attribute {
  int x = 5;

  public static void main(String[] args) {
    Attribute myObj1 = new Attribute();  // Object 1
    Attribute myObj2 = new Attribute();  // Object 2
    
    myObj2.x = 25;
    
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
