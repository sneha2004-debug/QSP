import java.util.Scanner;
class Evon{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int count=0;
        int even=0;
        while(num!=0)
        {
            int last=num%10;
            count++;
            if(last%2==0)
            {
                even++;
            }
            num/=10;
        }
        if(count==even)
        {
            System.out.println("Evon Number");
        }
        else{
            System.out.println("Not a Evon number");
        }
    }
}