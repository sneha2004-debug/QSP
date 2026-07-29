import java.util.Scanner;
class FactorsCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int count=1;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}