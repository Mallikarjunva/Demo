abstract class Nnnn
{
	abstract void method1();
	abstract void method2();
	public void displayName()
	{
		System.out.println("Name is kalam");
	}
}
abstract class Child1 extends Nnnn
{
	void method1()
	{
		System.out.println("method1() implementation by child");
	}
	public void child1classmethod()
	{
		System.out.println("child1 class method");
	}
}
class Child2 extends Child1
{
	void method2()
	{
		System.out.println("method2() implementation by child");
	}
	public void child2classmethod()
	{
		System.out.println("child2 class method");
	}
}
public class AbsMultilevel {

	public static void main(String[] args) {
		Nnnn n=new Child2();
		n.method1();
		n.method2();
		n.displayName();
		
		System.out.println("****************");
		
		Child1 ch=new Child2();
		ch.method1();
		ch.method2();
		ch.displayName();
		ch.child1classmethod();
	System.out.println("********************");
	
	Child2 ch2=new Child2();
	ch2.method1();
	ch2.method2();
	ch2.displayName();
	ch2.child1classmethod();
	ch2.child2classmethod();

	}

}
