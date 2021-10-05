import java.util.Scanner; 
class Student
{ 
 int sno; 
 String sname; 
 Student() 
 { 
  sno=1; 
  sname="rama";
 }
  Student(int sno1,String sname1)
  {
   this.sno=sno1;
   this.sname=sname1;
  } 
  Student( Student s)
  {
   sno=s.sno;
   sname=s.sname;
  }


  void display()
  { 
   System.out.println(sno + " " +  sname);
  } 
  public static void main(String args[])
  {
   Student s=new Student();
   s.display();
   Student s1=new Student(3,"sita");
   s1.display();
   Scanner ob=new Scanner(System.in); 
    System.out.println("Enter Student number");

   int sno2=ob.nextInt();
   System.out.println("Enter Student name");


   String sname2=ob.next();
   Student s3=new Student(sno2,sname2);
   s3.display();

   Student s4=new Student(s3);

    System.out.println("s3 is copied to s4");
    s4.display();
  }
 }