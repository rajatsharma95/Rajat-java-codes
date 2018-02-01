import java.util.*;
public class typeconversion {
	int convertma(int a)
	{
		int b=a*1000;
		return b;
	}
	int convertmb(int c)
	{
		int d=c*1000;
		return d;
	}
	int convertmc(int e)
	{
		int f=e*1000;
		return f;
	}
   int convertmd(int g)
   {
	   int h=g*60;
	   return h;
   }
	public static void main(String[] args) {
		typeconversion obj=new typeconversion();
	System.out.println("Enter the type of conversion");
	Scanner sn=new Scanner(System.in);
	do{
	System.out.println("Press 1 for km to m");
	System.out.println("Press 2 for l to ml");
	System.out.println("Press3 for kg to g");
	System.out.println("Press 4 for min to sec");
	int var=sn.nextInt();
	
	
		switch(var)
	
	{
	case 1:
		System.out.println("Enter for km to m");
		int a=sn.nextInt();
		int h=obj.convertma(a);
		System.out.println(h);
		System.out.println("Press anything except 1,2,3,4 to ext the loop");
		break;
	case 2:
		System.out.println("Enter for l to ml");
		int b=sn.nextInt();
		int i=obj.convertmb(b);
		System.out.println(i);
		System.out.println("Press anything except 1,2,3,4 to ext the loop");
		break;
	case 3:
		System.out.println("Enter for kg to g");
		int c=sn.nextInt();
		int j=obj.convertmc(c);
		System.out.println(j);
		System.out.println("Press anything except 1,2,3,4 to ext the loop");
		break;
	case 4:
		System.out.println("Enter for min to sec");
		int g=sn.nextInt();
		int k=obj.convertmd(g);
		System.out.println(+k);
		System.out.println("Press anything except 1,2,3,4 to ext the loop");
		break;

	default:
		System.out.println("EXIT"); 
		System.exit(0); //exiting the switch condition
		
		}
	}while(true);

}
}