import java.util.Scanner;
class DemoOdd
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Start number : ");
        int start=sc.nextInt();
        System.out.print("Enter last number : ");
        int last=sc.nextInt();
        for(;start<=last;start++)
        {
            if(isOdd(start))
            {
                System.out.println(start);
            }
        }
    }
    public static boolean isOdd(int num)
    {
        if(num%2!=0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}