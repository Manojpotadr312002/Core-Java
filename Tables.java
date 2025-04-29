public class Tables {

	public static void main(String[] args) {
		
		System.out.println("------ Using for loop ------");
		System.out.println("------ Print the table of 5 ------");
		int n=5;
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
		System.out.println();
		
		
		
		System.out.println("------ Using while loop ------");
		System.out.println("------ Print the table of 5 ------");
		int a=5,i=1;
		while(i<=10) {
			System.out.println(a*i);
			i++;
		}
		System.out.println();
		
		
		
		System.out.println("------ Using do-while loop ------");
		System.out.println("------ Print the table of 5 ------");
		int x=5,j=1;
		do{
			System.out.println(x*j);
			j++;
		}
		while(j<=10);
		System.out.println();

	}

}
