import java.util.ArrayList;  // I can also use * in place of Arraylist because it will import all the Classes like HashSet,Scanner,array etc.
public class Arraylist {

	public static void main(String[] args) {
		
		
		
		ArrayList arr =new ArrayList();
		arr.add("rajat");
		arr.add("is");
		arr.add("rajat");
		System.out.println(arr);  //As we are using Arraylist therefore 
		                          //the duplicate elements are allowed therefore
		                          //"rajat" is not removed in the output
		
		
	/*	2nd example*/
		ArrayList <String> arr1=new ArrayList();  //As i have mentioned <String>
		                                         //called generic feature 
		                                         //so, only string elements are allowed in the arraylist
		arr1.add("only");
		arr1.add("String is");
		arr1.add("allowed because of generic feature<string>");
		System.out.println(arr1);
		
		
        /*     3rd example*/
		ArrayList arr2=new ArrayList();
		arr2.add("rajat");
		arr2.add("is marvellous");
		arr2.remove("is marvellous"); // it will remove "is marvellous" from the ArrayList"
		System.out.println(arr2);
	}

}
