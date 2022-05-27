package demoJavaPkg;

public class democlass 
{
	
static int a=10; 
void func1()
{
	System.out.println(a);
	System.out.println(democlass.a);
	System.out.println(new democlass().a);
}
public static void main(String args[])
{
	System.out.println("value of a is:" + a);
	new democlass().func1();
}

}
