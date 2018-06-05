import java.util.Arrays;

public class merge_two_array {
	public static void main(String[] args)
    {
				
		int c=0;
		int arr1[]= {1,2,4,3};
		int arr2[]= {5,6,7,8,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int merge[]= new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			merge[i]=arr1[i]; // arr1 is store in merge[]
			c++;              // when all the values of arr1[] is inserted into merge[i] then c=4
		}
		for(int i=0;i<arr2.length;i++)
		{
			merge[c]=arr2[i];  // now arr2 is stored in merge[4,5,6,7,8] as the value of c is 4 in the 16th line
			c++;               // c is incremented 
		}
		for(int i=0;i<merge.length;i++)
		{
			System.out.println(merge[i]);   //print the merge array
		}
		}

}
