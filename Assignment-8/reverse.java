import java.util.*;
class String1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String original=s.nextLine();
		StringBuilder s1=new StringBuilder();
		s1.append(original);
		s1=s1.reverse();
		System.out.print(s1);
	}
}