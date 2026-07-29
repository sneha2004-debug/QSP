import java.util.Scanner;
class DigitPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int count=0;
        int prime=0;
        while(num!=0)
        {
            int last=num%10;
            count++;
            if(last==2 || last==3 || last==5 || last==7)
            {
                prime++;
            }
            num/=10;
        }
        if(prime==count)
        {
            System.out.println("All digits of are Prime");
        }
        else{
            System.out.println("All digits of are not Prime");
        }
    }
}