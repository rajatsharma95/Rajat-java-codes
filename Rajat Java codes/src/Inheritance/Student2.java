package Inheritance;


public class Student2 extends Student1{

	double m1,m2,m3;
	public Student2(int id, String name, String std, double m1, double m2, double m3) {
		super(id, name, std);
	
		
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	void display1()
	{
		display();
		
	}
	double cal()
	{
		double result = ((m1+m2+m3)/3);
		return result;
	}
}
