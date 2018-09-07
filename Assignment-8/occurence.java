import java.util.Scanner;

class Occurrence
{
	public static void main(String[] x)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = s.nextLine();
		
		System.out.print("Enter a string to search: ");
		String substr = s.nextLine();
		
		System.out.println("\nThe entered string : " + str);
		
		int l1 = str.length();
		int l2 = substr.length();
		int limit = l1 - l2;
		boolean found = false;
		
	
		
		for(int i=0;i<=limit;i++)
		{
			String enteredString = str.substring(i,i+l2);
			
			if(enteredString.equals(substr))
			{
				System.out.println(" 'Found '" + enteredString);
				found = true;
			}
		}
		
		if(found == false)
			System.out.println("Not found.");
		
		s.close();
	}
}