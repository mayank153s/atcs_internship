class A
{
int a;
  public A()                          
  {                                     
  System.out.println("A");             
   }                                  
}
class B extends A
{
int b;
public B()
{
super(4);  
System.out.println("B");
}
}
class Constructor
{
public static void main(String[]args)
{
B obj=new B();


}
}
//when subclass object is formed then first constructor
//of base class is called and then sub class