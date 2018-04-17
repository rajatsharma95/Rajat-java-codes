import java.util.LinkedList;
import java.util.*;

public class Oueue {

	public static void main(String[] args) {
		
		
		Queue q=new LinkedList();  //in place of LinkedList() I can also write new PriorityQueue()
		q.add("Rajat"); 
		q.add("is");
		q.add("always");
		q.add("best");
		q.remove("always");		
		System.out.println(q);
		
		
	
		

	}

}
