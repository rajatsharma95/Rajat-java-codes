import java.util.*;
public class prime {
	public static void main(String[] args) {
	System.out.println("Enter the no.to check prime or not");
	 Scanner sn=new Scanner(System.in);
	 int var=sn.nextInt(), i,flag=0;
	 for(i=2;i<var/2;i++)
	 {
		 if(var%i == 0 )
		 {
			 //System.out.println("not prime");
			 flag=1;
			 break;
	     }
	 }
		 if(flag==1)
		 {
	 System.out.println("not prime");
		 }
		 else
			 System.out.println("prime");

}
}
