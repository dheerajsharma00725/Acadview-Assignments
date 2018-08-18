import java.util.Scanner;
class leapYear{
public static void main(String[] args) {
	int year;
System.out.println("Enter Year");
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if((year % 400 ==0) || ((year % 4 ==0) && (year % 100 !=0)))
System.out.println(year + "is leap Year");
else
	System.out.println("Not a leap year");

}
}