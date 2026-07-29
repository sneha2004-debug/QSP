import java.util.Scanner;
class Power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Base Number");
        int base=sc.nextInt();
        System.out.println("Enter a raise Number");
        int raise=sc.nextInt();
        int power=1;
        for(int i=1;i<=raise;i++)
        {
            power=power*base;
        }
        System.out.println(power);
    }
}