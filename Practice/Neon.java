import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num :");
        int num=sc.nextInt();
        int sqr=num*num;
        int sum=0;
        while(sqr!=0)
        {
            int last=sqr%10;
            sum+=last;
            sqr/=10;
            
        }
        if(sum==num)
        {
            System.out.println("It is a neon number");
        }
        else{
            System.out.println("It is not a neon number");
        }
    }
}