import java.util.*;
public class anagram {
	public static void main(String[] args) {
	Scanner sn =new Scanner(System.in);
	System.out.println("enter string 1");
	String s1= sn.nextLine();
    System.out.println("enter string 2");
    String s2= sn.nextLine();
    int c=s1.length();
    int d=s2.length();
    	if(c==d)
    	{
    		 char a[]= s1.toCharArray();//The method toCharArray() returns an Array of chars after converting a String into sequence of characters. The returned array length is equal to the length of the String and the sequence of chars in Array matches the sequence of characters in the String
    		Arrays.sort(a); //sorting the character array
    		String sorted=new String(a); //storing the sorted result in the String sorted
    		char b[]=s2.toCharArray();
    		Arrays.sort(b);
    		String sorted1=new String(b);
    		if(sorted.equals(sorted1))  //comparing the each element of sorted and sorted 1 one by one
    		{
    			System.out.println("It is an anagram");
    		}
    		else
    		{
    			System.out.println("Not an anagram");
    		}
    				
    	}
}
}
