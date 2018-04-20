package interfaces;

public class InterfaceDemo implements I1,I2{

@Override
public void display() {
// TODO Auto-generated method stub
System.out.println("Display "+x);
int res=I1.display(10,80);
System.out.println("///////"+res);
}

@Override
public void show1() {
// TODO Auto-generated method stub
System.out.println("Show1 "+i); //i is declared in the class I1
int x=I1.display(120,50);
System.out.println("///////"+x);

}

@Override
public void show() {
// TODO Auto-generated method stub
I1.super.show(); //if we want to call the method show of class I1
}

}