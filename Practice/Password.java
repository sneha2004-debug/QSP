import java.util.Scanner;
class Password
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pin=1234;
        int count=1;
        do{
            System.out.println("Enter Password :");
            int pass=sc.nextInt();
            if(pin==pass)
            {
                System.out.println("Login successful");
                break;
            }
            count++;
        }while(count<=3);
        if(count>3)
        {
            System.out.println("3 attempts completed ! Try again later");
        }
    }
}
