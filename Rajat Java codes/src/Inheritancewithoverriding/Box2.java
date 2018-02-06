package Inheritancewithoverriding;

public class Box2 extends Box1{
	int height;
	Box2(int length,int breadth,int height)
	{
		super(length,breadth);
		this.height=height;
		
	}
	int calc()//overriding
	{
		System.out.println("Area is - "+super.calc()); //Calling the cal() of Box1, which is returning the area and here we are printing that area of Box1
		int vol;
		vol=length*breadth*height;
		return vol;
	}

}