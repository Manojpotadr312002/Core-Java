package ITPreneur;

public class StringInArray {

	public static void main(String[] args) {


		java.lang.String str1= "Manoj";
		String str2= "Potdar";
		
		int len = str1.length();
		System.out.println("The String is "+str1+" and the length is "+len);
		
		System.out.println("The character is :"+str1.charAt(4));
		
		System.out.println("The sub-string is :"+str1.substring(3));
		
		System.out.println("The sub-string is :"+str2.substring(1,5));
		
		System.out.println("The after cancating is :"+str1.concat(" "+str2));

	}

}
