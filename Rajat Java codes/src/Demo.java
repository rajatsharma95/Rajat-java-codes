// Demo for this keyword

public class Demo {
	int x;
	int a;
	public Demo() // Default constructor
	{
	
		System.out.println("Default Constructor : "+x);
	}
	
	public Demo(int x) {
		this.x = x;
		
	}
	
	public Demo(int x,int a) {
		this(x);
		this.a=a;
		
	}
	
	public void show()
	{
		System.out.println("a = "+a);
		System.out.println("x = "+x);
	}
	
	public void Add()
	{
		int res = a+x;
		System.out.println("res = "+res);
	}
	
	
	
	public static void main(String[] args) {
		Demo obj;
	obj = new Demo(); //Here we are giving the reference to the default constructor at line 6 which will return 0 because default value of the x in is 0
	obj.show();
	obj.Add();
	obj = new Demo(12,90);
	obj.show();
	obj.Add();
	
	}
	}