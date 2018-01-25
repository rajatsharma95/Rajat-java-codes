import java.util.*;
public class printpattern2 {
	public static void main(String[] args)
	{
		 Scanner sn=new Scanner(System.in);
		    System.out.println("how many rows or cols u want to print");
		      int n=sn.nextInt();
		      int i,j;
		    for(i=0;i<n;i++)
		     {     
		     for(j=n-1;j>=i;j--)
		     {
		    	 System.out.print("*");
		    	 
		     }System.out.println(" ");//if user input is 4, then this line prints the space at a[0][4] in first and then goes into the next line, a[1][3] at second and and then goes into the next line, a[2][1] and and then goes into the next line, a[3][0]  
		    	
		     }
	}
	}

