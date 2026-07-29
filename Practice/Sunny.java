//A sunny number is a number where the next consecutive number (N + 1) is a perfect square.
import java.util.Scanner;
class Sunny{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int sum=num+1;
        boolean flag=false;
        for(int i=1;i<=num/2;i++)
        {
            if((i*i)==sum)
            {
                flag=true;
                break;
            }
            else
            {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println("It is a Sunny Number");
        }
        else{
            System.out.println("It is not a Sunny Number");
        }
    }
}