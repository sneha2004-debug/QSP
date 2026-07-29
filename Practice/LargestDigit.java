import java.util.Scanner;
class LargestDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int max=0;
        while(num!=0)
        {
            int last=num%10;
            if(last>max)
            {
                max=last;
            }
            num/=10;
        }
        System.out.println(max);
    }
}