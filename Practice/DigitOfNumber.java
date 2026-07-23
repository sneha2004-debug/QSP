import java.util.Scanner;
class DigitOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        Digit(num);

    }
    public static void Digit(int num)
    {
        while(num!=0)
        {
            int last = num % 10 ;
            System.out.println(last);
            num /= 10 ;
        }
    }
}