package Abstraction;

public class MainClass {

	public static void main(String[] args) {
		Abstractclassname obj;
		obj=new DemoAbs1(10,100);
		
		obj=new DemoAbs2(55,98,99);
		
//		 Abstractclassname obj1=new Abstractclassname(); //This declaration is invalid in the Abstraction because the data on which we are referring is anonymous so we have another method which will refer to the data by another method called anonymous class
	   
	/*	Abstract classname obj1=new Abstractclassname() {  //here we donot put semicolon to end this line(13), instead of that we are putting the braces (the opening brace is at line 13 and the closing brace is at line 15)
			
		} */   //Here Abstract classname obj1=new Abstractclassname()  has braces so this is called anonymous class

		
	 Abstractclassname obj1=new Abstractclassname() {  //here we are creating object of Abstractclassname but we can't create the reference of the abstract class because it refers to the anonymous data, so we create the anonymous class or yhan pe hm anonymous class banare hain

			@Override
			void area(int l, int b) {
				// TODO Auto-generated method stub
				
			}

			@Override
			void vol(int l, int b, int h) {
				// TODO Auto-generated method stub
				
			}
			
		};

	}

}