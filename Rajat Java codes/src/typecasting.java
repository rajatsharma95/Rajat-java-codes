import java.util.*;
public class typecasting {
	public static void main(String[] args)
	{
		char a = 'C';
		   int b = a;
		   System.out.println("My First Program " +b); 
		// double to int
			double d = 65.87d;
			int e = (int) d; //here we are doing the explicit conversion because yhan bada(double) datatype convert hora hai chote(int) me which is not possible, so therefore hmne yhan typecasting ki
			System.out.println("ans. is " +e);

	//float to double
	    float f = 76.98f;
		   double g = f; 
	    System.out.println("ans. is " +g);
		 
		//String to int
	  String h = "78945";
	  int i = Integer.parseInt(h); 
		 System.out.println("ans. is " +i); 
		 
		// double to string
		 double j= 54.87d;
		 String k = Double.toString(j); //double of 54.87d ko string me convert krdo 
	  System.out.println("ans. is " +k);
		 
		 //int to boolean
	  int l = 6;
	  int m = 8;
	  boolean n = (l == m);
	  System.out.println("ans. is " +n);

	 //boolean to string
		boolean o = true;
	 String p = Boolean.toString(o);   
		 System.out.println("ans. is " +p);
		 
		 //byte to short
		 byte q = 100;
		 short r = q;
		 System.out.println("ans. is " +r);
		 
		 //short to double
		 short s=12;
		 double t= s; //this is called implicit conversion because here chota(short) datatype is converting into bada datatype(double) which is possible
		 System.out.println("ans. is " +t);	
		
		 
		 //string to short 
		 String u = "7995";
		 short v = Short.valueOf(u); 
		 System.out.println("ans. is " +v);
		  
		 //int to char
		  int w=75;
		  char x= (char)w;
		  System.out.println("ans. is " +x);
		
		  //long to string
	  long y=100000000;
	  String z= Long.toString(y);
	  System.out.println("ans. is " +z);
		  
		   //string to float
		   String aa="4589";
		   float bb= Float.parseFloat(aa); //String ko float me convert krdo
		   System.out.println("ans. is " +bb);
		   	 
		  
	}
	
}
