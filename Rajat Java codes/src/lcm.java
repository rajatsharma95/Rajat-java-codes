import java.util.*;
public class lcm {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=sn.nextInt(), b=sn.nextInt(), r=1,hcf,c,d;
		c=a; d=b;		
		if(a>b) {
			while(r!=0) {
				r=a%b;
				a=b;
				b=r;
			}
			hcf=a;
			
		}
		else {
			while(r!=0) {
				r=b%a;
				b=a;
				a=r;
			}
			hcf=b;
		}
		int lcm=(c*d)/hcf;
		System.out.println("LCM is:"+lcm);

	}

}


