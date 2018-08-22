import java.util.Scanner;
class even{
public static void main(String args[]){
int num,i;
Scanner scan=new Scanner(System.in);
System.out.println("Enter integer");
num=scan.nextInt();
for(i=1;i<=num;i++){
		if(i%2==0)
			System.out.println(""+i);
}
}
}