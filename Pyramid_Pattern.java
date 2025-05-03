package TechnoLearn;

public class Pyramid_Pattern {

	public static void main(String[] args) {
		
		// pyramid "*"
		  int n=5; 
		  
		  for(int i=0; i<n; i++)  
		  {  
		   for(int k=i;k<n;k++)
		   {
				System.out.print("  ");
		   }
		   
		     for(int j=1; j<=i*2+1; j++)  
		     {  
		       System.out.print("* ");  
		     }	 
		     System.out.println();
		  }
		  
		
		
		// reverse pyramid "*"
		int n=5; 
		  
		for(int i=n-1; i>=0; i--)  
		  {  
		   for(int k=n;k>i;k--)
		   {
				System.out.print("  ");
		   }
		   
		     for(int j=1; j<=i*2+1; j++)  
		     {  
		       System.out.print("* ");  
		     }	 
		     System.out.println();
		  }
		  
		  
		  
		// rhombus pattern "*"
		  int n=5; 
		  
		  for(int i=0; i<n; i++)  
		  {  
		   for(int k=i;k<n;k++)
		   {
				System.out.print("  ");
		   }
		   
		     for(int j=1; j<=i*2+1; j++)  
		     {  
		       System.out.print("* ");  
		     }	 
		     System.out.println();
		  }
		  
		  for(int i=n-2; i>=0; i--)  
		  {  
		   for(int k=n;k>i;k--)
		   {
				System.out.print("  ");
		   }
		   
		     for(int j=1; j<=i*2+1; j++)  
		     {  
		       System.out.print("* ");  
		     }	 
		     System.out.println();
		  }
		 
		
		
		
		// pyramid "A,B,C,...."
		int n=5; 
		char ch='A';
		  
		  for(int i=0; i<n; i++)  
		  {  
		   for(int k=i;k<n;k++)
		   {
				System.out.print("  ");
		   }
		   
		     for(int j=1; j<=i*2+1; j++)  
		     {  
		       System.out.print(ch+" "); 
		     }	 
		     System.out.println();
		     ch++;
		  }
		
		
		
		
		//reverse pyramid "A,B,C,..."
		int n=5; 
		char ch='A';
		
		for(int i=n-1; i>=0; i--)  
		  {  
		   for(int k=n;k>i;k--)
		   {
				System.out.print("  ");
		   }
		   
		     for(int j=1; j<=i*2+1; j++)  
		     {  
		       System.out.print(ch+" "); 
		     }	 
		     System.out.println();
		     ch++;
		  }

	}

}
