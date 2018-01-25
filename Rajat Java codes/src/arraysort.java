import java.util.*;
public class arraysort {
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("How many elements do you want to sort");
		int n=sn.nextInt();
		System.out.println("Enter the elements which you want to sort");
		int arr[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			 arr[i]=sn.nextInt();
		}
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[j]; 
					 arr[j]=arr[i];
					 arr[i]=temp;
				 }
			 }
			 
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(+arr[i]);
		 }
		}
	}



