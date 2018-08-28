class Base
{
	public void displayParent()
	{
		System.out.println("Parent()");
	}
}
class Derived extends Base
{
	public void displayChild()
	{
		System.out.println("Derived()");
		super.displayParent();		
	}
}
class Main
{
	public static void main(String[] x)
	{
		Derived obj = new Derived();
		
		obj.displayChild();
	}
}