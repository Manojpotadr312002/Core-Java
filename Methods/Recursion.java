public class Recursion {

	 public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	}

	public static int add(int start, int end) {
		    if (end > start) {
		      return end + add(start, end - 1);
		    } else {
		      return end;
		    }
		}

	public static void main(String[] args) {
		
		int result = sum(10);
	    System.out.println(result);

		int result1 = add(5, 10);
	    System.out.println(result1);
	  }
	 
}
