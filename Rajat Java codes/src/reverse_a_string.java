
public class reverse_a_string {

	public static void main(String[] args) {
		
		String a="ABCD";
		
		StringBuilder sb=new StringBuilder(); //here we are creating the empty string Builder with the initial capacity of 16
		                                      //refer to https://www.javatpoint.com/StringBuilder-class

		sb=sb.append(a); // here the Stringbuilder sb will concatenate the String a as ABCD
		sb=sb.reverse(); //now here the Stringbuilder sb will reverse the string
		System.out.println("Reverse of a string is  " +sb);
		
	}

}

//String is immutable means we cannot change its value, therefore we use Stringbuilder because it makes the 
//string mutable i.e we can make any changes to the String