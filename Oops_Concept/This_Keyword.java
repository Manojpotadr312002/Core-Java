public class Main {
  int x;

  public Main(int x) {
    this.x = x; // refers to the class variable x
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
