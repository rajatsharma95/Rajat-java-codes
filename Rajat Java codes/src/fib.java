import java.util.*;
public class fib {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Enter the numbers you want to print upto:");
		int limit=sn.nextInt();
		int a=0,b=1,c;
		System.out.println("Fibonnaci Series is as Follows:");
		if(limit==1)
			System.out.println(a);
		if(limit==2) {
			System.out.println(a);
			System.out.println(b);
		}
		for(int i=2;i<limit;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}