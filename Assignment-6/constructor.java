class Test
{
	Test()
	{
		System.out.println("Default Constructor.");
	}
	
	Test(int a)
	{
		this();							
		}
}
class Main
{
	public static void main(String args[])
	{
		Test obj = new Test();		
		}
}