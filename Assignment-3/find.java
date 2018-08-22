import java.util.Scanner;
class find
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        int [] a = {1,4,6,7,8,9,10};
        System.out.println("Enter number to find");
        x = s.nextInt();
        for(i = 0; i < a.length; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}