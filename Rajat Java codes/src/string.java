import java.util.*;

public class string {
//we don't use (import java.util.*) because here we donot require the scanner sn=new scanner(System.in)
	public static void main(String[] args) {
	
		
		
		//1st
		String s1="I am a classy boy ";
		String s2="You are not classy girl";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		
		
		//2nd
		/*String s="welcoMetohmt";
		String s1="WELCOMETOHMT";
		char c=s.charAt(1);//printing the character at index 1
		if(s.equalsIgnoreCase(s1)) // this will compare the string s and s1 but donot compare their Uppercase & lowercase
		{
			System.out.println("God is great");
		}
		else
		{
			System.out.println("God is not great");
		}*/
		
		
		//3rd
		
		/*String s="welcoMetohmt";
		char c[]=s.toCharArray(); //Changing string s into the character array
		c[0] = Character.toUpperCase(c[0]);  //uppercasing the 0th index
		c[5]=Character.toLowerCase(c[5]);    //lowercasing the 5th index
		String str=new String(c);         //converting char array into string
		System.out.println(str);
		
	*/
		
		//4th
		/*
		String s="Rajat";
		char a[]=s.toCharArray();
		for(int i=(s.length()/2);i>=0;i--)
		{
			System.out.println(a[i]);
		}
		for(int i=((s.length()/2)+1);i<s.length();i++)
		{
			System.out.println(a[i]);
		}
	*/

	}

}
