import java.util.*;
public class printarray {
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		int[] arr=new int[10];
		int[] arr1= {4,3,2,4};
		System.out.println("enter 10 elements in the array= ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sn.nextInt();
		}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("the elements in array is " +arr[i]);
			}
			for(int var:arr1)
			{
				System.out.println(var);
			}
		}


	}


