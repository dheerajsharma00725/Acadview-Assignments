import java.util.Scanner;
class add{
	public static void main(String args[]){
	int n1,n2,sum;
	System.out.println("Enter First Number");
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	System.out.println("Enter Second Number");
	n2=sc.nextInt();
	sum=n1+n2;
	System.out.println("Sum = "+ sum);
	}
}