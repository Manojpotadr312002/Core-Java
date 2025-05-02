package ITPreneur;

public class Patterns {

	public static void main(String[] args) {
		
		// right angled triangle "*"
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// reverse right angled triangle "*"
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// right angled triangle "1,2,3...."
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		// right angled triangle "1,2,3...."
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		// reverse right angled triangle "1,2,3...."
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		// reverse right angled triangle "1,2,3...."
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		// right angled triangle "A-Z"
		int n=5;
		char ch='A';    // ch="use any alphabet(lowercase/uppercase also)"
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		
		// reverse right angled triangle "A-Z"
		int n=5;
		char ch='A';     // ch="use any alphabet(lowercase/uppercase also)"
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
	}
}
