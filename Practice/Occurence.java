import java.util.Scanner;
class Occurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        System.out.println("Enter a digit ");
        int digit=sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int last=num%10;
            if(last==digit)
            {
                count++;
            }
            num/=10;
        }
        System.out.println("The Occurence of the given digit is "+count);
    }
}