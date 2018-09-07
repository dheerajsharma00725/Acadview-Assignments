import java.util.Scanner;
class Vowels{
	public static String RemoveVowels(String str){
		return str.replaceAll("[aAeEiIoOuU]","");
	}
public static void main(String [] args){
	System.out.print("Enter String: ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	System.out.println(RemoveVowels(str));
	}
}