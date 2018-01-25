/*printing the pattern as
4
   * 
  ** 
 *** 
****   */
import java.util.*;
public class printpattern1 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
	    System.out.println("how many rows or cols u want to print");
	      int n=sn.nextInt();
	      int i,j,k;
	      for(i=0;i<n;i++)
	      {
	    	  for(j=n-1;j>i;j--)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  
	    	  for(k=0;k<=i;k++)
	    	  {
	    		  System.out.print("*");
	    	  }System.out.println(" ");
	      }
	 

	}

}

