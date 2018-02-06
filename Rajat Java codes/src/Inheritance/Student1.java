package Inheritance;

public class Student1
{ 
final int x=100;
int id;
String name;
String std;

	Student1(int id,String name,String std)
	{
this.id=id;
this.name=name;
this.std=std;

	}
void display()
{
	System.out.println("Name "+name);
	System.out.println("Id "+id);
	System.out.println("Std "+std);
}
}