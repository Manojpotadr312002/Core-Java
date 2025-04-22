package ITPreneur;

public class palindrom_armstrong {

	public static void main(String[] args) {
		
		//palindrom number
		int n=6006,sum=0,r,n1;
		n1=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}

		
		//armstrong number
		int n=370,sum=0,r,n1;
		n1=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		
	}

}
