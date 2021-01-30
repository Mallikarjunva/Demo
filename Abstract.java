abstract class Parent
{
	abstract void method1();
	abstract void method2();
	public void displayName()
	{
	System.out.println("Name is 'kalam'");	
	}
	Parent()
	{
		System.out.println("Default constructor");
	}
	static 
	{
		System.out.println("static block");
	}
}
class Child extends Parent
{
	void method1()
	{
		System.out.println("method1() implementation child");
	}
	void method2()
	{
		System.out.println("method2() implementation child");
	}
	public void childclassmethod()
	{
		System.out.println("child class method");
	}
}
public class Abstract {
public static void main (String args[]) {
	Parent p=new Child();
	p.method1();
	p.method2();
	p.displayName();
	
	System.out.println("************");
	
	Child ch=new Child();
	ch.method1();
	ch.method2();
	ch.childclassmethod();
}
}
