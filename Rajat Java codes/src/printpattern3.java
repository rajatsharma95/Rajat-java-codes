/*
 * enter n
4
*  *
 ** 
 ** 
*  *
*/
import java.util.*;
public class printpattern3 {

	public static void main(String[] arg)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("enter n");
		int n=sn.nextInt();
	    for (int i = 0; i < n; i++) {
	    	
	        for (int j = 0; j < n; j++) {
	        	
	            if (i== j || i + j == n - 1) 
	            {
	                System.out.print("*");
	            } 
	            else 
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
	}
