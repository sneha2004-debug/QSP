import java.util.Scanner;
class Duck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int count=0;
        while(num>9)
        {
            int last = num % 10 ;
            if(last==0)
            {
                count++;
            }
            num/=10;

        }
        if(num==0)
        {
            System.out.println("The entered number is not a Duck number");
        }
        else if(count>0)
        {
            System.out.println("The entered number is a Duck number");
        }
        else{
            System.out.println("The Entered number is not a Duck Number");
        }
    }
}