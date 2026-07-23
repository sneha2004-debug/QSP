import java.util.Scanner;
class LeapMethod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a yaer : ");
        int start = sc.nextInt();
        System.out.print("Enter the last year : ");
        int last =sc.nextInt();
        int count=0;
        for(;start<=last;start++)
        {
            if(isLeap(start))
            {   
                count++;
                
            }
        }
        System.out.println(count);
    }

    public static boolean isLeap(int start)
    {
        if((start%4==0 && start%100!=0) || start%400==0 )
        {
            return true;
        }
        else{
            return false;
        }

    }
}