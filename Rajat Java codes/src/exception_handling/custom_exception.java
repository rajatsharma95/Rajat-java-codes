package exception_handling;
//import java.io.IOException; //IOException which we use to inherit as the parent class in the line 5 is defined in this hydrophyle



	/*public class custom_exception extends IOException{ //IOException is an inbuilt method/exception and is defined in the 2nd line
		
		   public custom_exception(String name) { // CustomException() is the constructor because it has the same name as the class name
			super(name);  // calling "name" from the IOException by using super
			System.out.println("The nameis"+name); //printing name of that exception
		}

	}*/

public class custom_exception extends Exception{ //Exception is an inbuilt method/exception 
public static void main(String[] args)
{
	try
	{
		int age=-4;
		if(age<=0)
		{
			throw new custom_exception();
		}
		else
		{
			System.out.println("the age is"+age);
		}
	}
	catch(Exception e)
	{
	  System.out.println(e);
	  System.out.println("Age cann't be negative");
	}
}
}
