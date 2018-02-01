// package Employee;
import java.util.*;
public class Employee{
	String name;//ye hme likhna padega because in (this.salary) at 15th line, this (String name) is that string which is storing the value of the name1
	int id;
	String bloodgroup;
	int salary;
	int intime;
	int days;
	int outtime;
    int time;
	
	public Employee(String name1,int id,String bloodgroup,int days,int time) 
	{
		this(days,time); //ise this(days,time) ko phaile hi call krna padega if we call it after (this.bloogroup) in the 18th line than this(days,time) will not work 
		this.name=name1;
		this.id=id;
		this.bloodgroup=bloodgroup;

	}
	
	public Employee(int salary,int intime,int outtime,String name,int id,String bloodgroup,int days,int time)
	{
		this(name,id,bloodgroup,days,time);
		this.salary=salary;
		this.intime=intime;
		this.outtime=outtime;
		    
	}
	
	
    Employee(int days,int time) //for leaves //constructor
    {
    	this.time=time;
    	this.days=days;
    	
    }
    
    
    
    
    void showdetails() //method
    {
    	System.out.println("name:" +name);
	    System.out.println("id is:" +id);
	    System.out.println("bloodgroup is" +bloodgroup);
	    System.out.println("intime is" +intime);
	    System.out.println("outtime is:" +outtime);
	    System.out.println("no. of leaves taken in the month" +days);
    }
  
    void salarycount()
    {
    	
      this.days=days;
    	this.time=time;
    
    	if(days<=2)
    	
    	{ if(time>=8)
    		
    		System.out.println("No ");
    		
    	else if(time<4)
    	{
    		System.out.println("full day deducted");
    		salary=(salary*12)/365/time;
    		System.out.print("Hourly salary is   " +salary);
    		
    		
    	}
    	else if(time>4 && time<8)
    	{
    		System.out.println("half day deducted");
    		salary=(salary*12)/365/time;
    	System.out.print("Hourly salary is   "+salary);
    	    
    	    
    	}
    	else
    	{
    		System.out.println("Offday");
    		salary=(salary*12)/365/time;
    		System.out.print("Hourly salary is   "+salary);
    		
    	}
    	}
    }
    
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the name, id and bloodgroup of the employee");
		String name=sn.nextLine();
        int id=sn.nextInt();
		String bloodgroup=sn.next();
		
		
		System.out.println("Enter the  salary intime and outtime");
		int salary=sn.nextInt();
		int intime=sn.nextInt();
		int outtime=sn.nextInt();
		
		
		System.out.println("Enter no. of leaves taken and the working hours");
		int leave=sn.nextInt();
		int time=sn.nextInt();
		Employee obj=new Employee(salary,intime,outtime,name,id,bloodgroup,leave,time);
		
		 obj.showdetails();
		 obj.salarycount();
		

	}
	

}