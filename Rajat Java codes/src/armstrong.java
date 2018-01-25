import java.util.*;
public class armstrong {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int a=sn.nextInt();
		int rem,sum=0,num;
		num=a;
		while(a>0) {
			rem=a%10;
			rem=(rem*rem*rem);
			sum=sum+rem;
			a=a/10;
			
			
		}
		if(num==sum) {
			System.out.println("Number is Armstrong");
		}
		else
			System.out.println("Number is NOT Armstrong");

	}

}

