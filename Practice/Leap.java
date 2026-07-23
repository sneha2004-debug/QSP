import java.util.Scanner;
class Leap{
    public static void main(String args[])
    {
        // int year = 2017;
        // if((year%4==0 && year%100!=0) || year%400==0)
        // {
        //     System.out.println("LEap Year");
        // }
        // else{
        //     System.out.println("Not a Leap year");
        // }


        // for(int i=1;i<=100;i++)
        // {
        //     if((i%4==0 && i%100!=0) || i%400==0)
        //     {
        //         System.out.println(i);
        //     }
            
        // }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year :");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println("Leap year");

        }
        else{
            System.out.println("Not a Leap year");
        }
    }

}