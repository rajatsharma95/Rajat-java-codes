//printing modulous b/w the given range using method
import java.util.*;
public class Count {
	int solution(int a,int b,int k)
	{
		int i,count=0;
		for(i=a;i<b;i++)
		{
			if(i%k==0)
			{
				count++;
			}
			/*no need to write continue because loop will not exit also if i don't write continue because if the condition fails then it will go into the else but as there is nothing in else condition therefore it will not exit until for(i=a;i<b;i++) condtion fails*/
				
		}
		return count;
	}
	
	
	public static void main(String[] args)
	{
		Count obj=new Count();
	 
		System.out.println("Enter the first number");
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt(); 
		System.out.println("Enter the second no.");
		
		int b=sn.nextInt();//sn is enough to scan infinite numbers and their is no need to create sn1=sn1.nextInt(),sn2=sn2.nextInt();;
		System.out.println("Enter the no. for modulous");
		
		int k=sn.nextInt();  //sn is enough to scan infinite numbers and their is no need to create sn1=sn1.nextInt(),sn2=sn2.nextInt();;
		int l=obj.solution(a,b,k);
		
		System.out.print("The numbers between the given range of " +a+ " and " +b+ " is " +l);
		
	}

}