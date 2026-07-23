import java.util.Scanner;
class Maximum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int max=0;
        while(num!=0)
        {
            int last = num % 10 ;
            if(last>max)
            {
                max=last;
            }
            num/=10;
        }
        System.out.println("The largest digit of the number is "+max);
    }
}