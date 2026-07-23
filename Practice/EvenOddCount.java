import java.util.Scanner;
class EvenOddCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int even=0;
        int odd=0;
        while(num!=0)
        {
            int last = num % 10;
            if(last%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
            num /=10;
        }
        System.out.println("Even digit count = "+even);
        System.out.println("Odd digit count = "+odd);
    }
}