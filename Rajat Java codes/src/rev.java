
public class rev {
	public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("I am a classy boy");//In place of String we are using stringbuffer because reverse function is not defined in the String class, but it is defined in the Stringbuffer 
	/*string buffer-
	Java provides the StringBuffer and String classes, and the String class is used to manipulate character strings that cannot be changed. Simply stated, objects of type String are read only and immutable. The StringBuffer class is used to represent characters that can be modified.*/
	String s2="You are not classy girl";
	System.out.println(s1.reverse());
	
	}
}

