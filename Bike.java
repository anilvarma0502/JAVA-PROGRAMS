import java.util.*
class Vehicle
{
System.out.println("Vehicle is running");
}
class Bike extends Vehicle
{
void run()
{
super.run();
System.out.println("Bike is running");
}
public static void main(String[] args)
{
Bike obj = new Bike();
obj.run();
}
}