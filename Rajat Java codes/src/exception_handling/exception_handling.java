package exception_handling;

public class exception_handling {
	 public static void main(String[] args) {
	
		 int k=10;
	try {
				int i=k/0;// here we write the exception/error after this line the JVM or compiler go to the catch block
				System.out.println("This line will not execute because after the error in the try block at 8th line the Jvm or the compiler will go to the catch block directly");
	}
	catch(Exception e) //Here the JVM or compiler will check that which type of exception occured at line 10 like at 10 we have a ArithmeticException
	{
		System.out.println("Exception is"+e);
	}

}
}