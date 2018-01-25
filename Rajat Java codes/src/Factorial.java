import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sn.nextInt();
		int fact=1;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial is:"+fact);
	}
}

