package Abstraction;


abstract public class Abstractclassname {
	int l,b,h;
	
 abstract void	area(int l,int b); //Declaration of abstract class
 abstract void vol(int l,int b,int h);
 void start(int l,int b)
 {
	 area(l,b); //here we go to the class Demoabs1, to the method void area(int l, int b)
	 
	}
 void start(int l,int b,int h)
 {
	 vol(l,b,h);
 }

}