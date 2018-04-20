package interfaces;

public interface I2 {
int x=10;
void display();
void show1();
public default void show()
{
System.out.println("Hello default T2");
}

}