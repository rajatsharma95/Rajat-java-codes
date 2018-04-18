package Abstraction;

public class DemoAbs1 extends Abstractclassname{ //when we take the mouse on the DemoAbs1 on 3rd line then the compiler is giving us the option "Add unimplemented methods" click on that and we will automatically get the lines from  11 to 21

	int x,y;
	DemoAbs1(int x,int y) //constructor
	{
		this.x=x;
		this.y=y;
		start(x,y); //it go the class Abstractclassname, to the method void start(int l,int b)
	}
	
	@Override
	void area(int l, int b) {
		int area;
		area=l*b;
		System.out.println("Area is - "+area);
		
	}
	@Override
	void vol(int l, int b, int h) {
		// TODO Auto-generated method stub
		
	}
}