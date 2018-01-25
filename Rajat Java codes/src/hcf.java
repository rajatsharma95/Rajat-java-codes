import java.util.*;
public class hcf {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=sn.nextInt(), b=sn.nextInt(), r=1;
		
		if(a>b) {
			while(r!=0) {
				r=a%b;
				a=b;
				b=r;
			}
			System.out.println("HCF is:"+a);
			
		}
		else {
			while(r!=0) {
				r=b%a;
				b=a;
				a=r;
			}
			System.out.println("HCF is:"+b);
		}

	}

}

