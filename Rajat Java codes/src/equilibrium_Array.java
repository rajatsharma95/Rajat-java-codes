
public class equilibrium_Array {
	/*LEFT SIDE ARRAY = RIGHTSIDEARRAY*/
	/*// In 1st iteration s=38(sum of whole array)
	// then 38-3 =35 because sum-=arr[i];
	as 38 != leftsum(0 because leftsum was initialised to 0)
	leftsum= 0+3;
	now on 2nd iteration from 2nd for loop ON 26 line
	s=35-15 =20 bcause sum-=arr[i];
	as 20 != leftsum {here leftsum=3)
	leftsum=3+15 = 18
	now on 3rd iteration of 2nd for loop ON 26 line
	s=20-2 = 18 because sum-=arr[i];
	HERE l==s	
	so, it will print the value at that index*/

	int equilibrium(int arr[], int n)
	{
	int sum = 0;      // initialize sum of whole array
	int leftsum = 0; // initialize leftsum

	/* Find sum of the whole array */
	for (int i = 0; i < n; ++i)
	sum += arr[i];  // Giving sum of the whole array
	System.out.println("+1->"+sum);

	for (int i = 0; i < n; ++i)
	{
	sum -= arr[i]; // sum is now right sum for index i
	System.out.println("+2->"+sum);

	if (leftsum == sum)
	return arr[i];

	leftsum += arr[i];
	}
	/* If no equilibrium index found, then return 0 */
	return -1;
	}
	public static void main(String[] args)
	{
	equilibrium_Array equi = new equilibrium_Array();
	int arr[] = {3,15,2,9,9};
	int arr_size = arr.length;
	System.out.println("First equilibrium index is " + 
	equi.equilibrium(arr, arr_size));
	}

}
