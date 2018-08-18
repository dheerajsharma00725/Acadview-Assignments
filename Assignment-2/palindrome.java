
import java.util.Scanner;
class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int reversedInteger = 0, remainder, originalInteger;
        System.out.println("Enter number");
        int num=in.nextInt();

        originalInteger = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome ");
        else
            System.out.println(originalInteger + " is not a palindrome ");
    }
}