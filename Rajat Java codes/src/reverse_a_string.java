
public class reverse_a_string {

	public static void main(String[] args) {
		
		String a="ABCD";
		
		StringBuilder sb=new StringBuilder();
		sb=sb.append(a); 
		sb=sb.reverse();
		System.out.println("Reverse of a string is  " +sb);
		

	}

}
