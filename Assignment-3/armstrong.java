
import java.util.Scanner;class Armstrong{  
  public static void main(String[] args)  {  
   Scanner scanner = new Scanner(System.in);
    int c=0,a,temp;  
    System.out.println("Enter number:");
    int n = scanner.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  