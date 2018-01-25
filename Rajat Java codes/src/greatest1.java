import java.util.*;
public class greatest1 {
	public static void main(String[] args) {
	      System.out.println("enter the 3 numbers");
	      Scanner sn=new Scanner(System.in);
	      int a=sn.nextInt(); //scans the no.
	      int b=sn.nextInt();
	      int c=sn.nextInt();
	      int d= a>b?a:b>c?b:c;
	      System.out.println("The biggest number is " +d);

	}

}

