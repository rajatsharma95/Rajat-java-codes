//Multilevel Inheritance using Runtime Polymorphism/Overriding

package Inheritancewithoverriding;

public class Box1 {
	int length;
	int breadth;
	Box1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	int calc()//overriding
	{
		int area;
		area=length*breadth;
		return area;
	}

}
