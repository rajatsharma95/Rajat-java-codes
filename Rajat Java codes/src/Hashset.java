import java.util.HashSet;  // I can also use * in place of Hashset because it will
                           //import all the Classes like ArrayList,Scanner,array etc.
public class Hashset {

	public static void main(String[] args) {	
		
		HashSet arr =new HashSet();
		arr.add("rajat");
		arr.add("is");
		arr.add("rajat");
		System.out.println(arr);  //As we are using Hasset therefore 
		                          //the duplicate elements are not allowed therefore
		                          //"rajat" is removed in the output
		
		
	/*	2nd example*/
		HashSet <String> arr1=new HashSet();  //As i have mentioned <String>
		                                         //called generic feature 
		                                         //so, only string elements are allowed in the Hashset
		arr1.add("only");
		arr1.add("String is");
		arr1.add("allowed because of generic feature<string>");
		System.out.println(arr1);
		
		
        /*     3rd example*/
		HashSet arr2=new HashSet();
		arr2.add("rajat");
		arr2.add("is marvellous");
		arr2.remove("is marvellous"); // it will remove "is marvellous" from the Hashset"
		System.out.println(arr2);
	}

}
