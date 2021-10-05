import java.util.*;
{
abstract class Demo
{
abstract void display()
}
class Sample extends Demo
{
void display()
{
System.out.println("Abstract class");
}
}
Class Abst
{
public static void main(String[] args)
{
Sample obj= new Sample();
obj.display();
}
}