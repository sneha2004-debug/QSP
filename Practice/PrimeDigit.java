import java.util.Scanner;
class PrimeDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int last=num %10;
            if(last==2 || last==3 || last==5 ||last==7)
            {
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}