package ITPreneur;

public class loops_example {

	public static void main(String[] args) {

		// addition of n number
		int n=50,sum=0;
		for(int i=1;i<=n;i=i+1) {
			sum=sum+i;
		}
		System.out.println("Addition of 1 to 50 Number is "+sum);
		
		
		
		// square of n numbers
		int n=20;
		for(int i=1;i<=n;i=i+1) {
			System.out.println(i+"*"+i+"="+i*i);
		}
		
		
		
		//fibonacci series
		int n=10,n1=0,n2=1,n3=0;
			System.out.print(n1+" "+n2+" ");
			
		for(int i=3;i<=n;i=i+1) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			}
		
		
		
		//Prime numbers
		int n=100,a;
		for(int i=2;i<=n;i++) {
			for(a=2;a<=i;a++) {
				if(i%a==0) {
					break;
				}	
			}
			if(i==a) {
				System.out.println(i);
			}
		}
		
		
		
		//factorial number
		int n=5,fact=1;
		
		for(int i=1;i<=n;i=i+1) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		
		
		//Reverse the Number
		int n=12345,r,sum=0,n1;
		n1=n;
		for(int i=1;i<=5;i++)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
		
		
		
		//Palindrome Number
		int n=12321,r,sum=0,n1;
		n1=n;
		for(int i=1;i<=5;i++)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("The number is palindrom");
		}
		else {
			System.out.println("The number is not palindrom");
		}
		
		
		
		//Armstrong Number
		int n=153,r,sum=0,n1;
		n1=n;
		for(;n!=0;n=n/10)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("The number is armstrong");
		}
		else {
			System.out.println("The number is not armstrong");
		}

	}

}
