//if all the digits in a number is even it is called as evon number
import java.util.Scanner;
class Evon{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int count=0;
        int even=0;
        while(num!=0)
        {
            int last = num % 10;
            count++;
            if(last%2==0)
            {
                even++;
            }
            num=num/10;
        }
        if(count==even)
        {

            System.out.println("It is a evon number");
        }
        else{
            System.out.println("It is not a evon number");
        }
    }
}