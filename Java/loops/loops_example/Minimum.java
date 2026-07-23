import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int min = num % 10 ;
        while(num!=0)
        {
            int last = num % 10;
            if(last<min)
            {
                min=last;
            }
            num /= 10;

        }
        System.out.println("The Minimum digit from the number is "+min);
    }
}