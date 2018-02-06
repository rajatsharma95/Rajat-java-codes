package Inheritancewithoverriding;

public class Box3 extends Box2{
	int cost;
   Box3(int length,int breadth,int height,int cost)
   {
	   super(length,breadth,height);
	   this.cost=cost;
   }
   int calc()//overriding
   {
	  System.out.println("Vol is - "+super.calc()); //Calling the calc() of Box2
	   cost=length*breadth*100;
	   return cost;
   }
   void display()
   {
	  
	   System.out.println("Cost is - "+calc());//calling the calc() of Box3
   }
}
