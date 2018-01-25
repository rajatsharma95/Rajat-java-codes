import java.util.*;
public class greatest {
	public static void main(String[] args)
	{
		System.out.println("Enter the 3 no.'s");
		Scanner sn=new Scanner(System.in);
		 int a=sn.nextInt(); //scans the 1st no.
		  int b=sn.nextInt();//scans the 2nd no.
		  int c=sn.nextInt();// scans the third no.
		  if(a>b && a>c)
		  {
			  System.out.println("A is bigger");
		  }
		  else if(b>a && b>c)
		  {
			  System.out.println("B is greater");
		  }
		  else if(c>a && c>b)
		  {
			  System.out.println("C is bigger");
		  }
		  if(a==b)
		  {
			  if(b==c)
			  System.out.println("A and B and C are equal");
			  else 
				  System.out.println("A and B are equal");
		  }
		  else if(b==c)
		  {
			  System.out.println("B and C are equal");
		  }
		  else if(c==a)
		  {
			  System.out.println("A and C are equal");
		  }
		  else
		  {
			  System.out.println("no number is equal");
		  }
	}
}

