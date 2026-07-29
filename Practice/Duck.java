import java.util.Scanner;
class Duck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int last=num%10;
            if(last==0)
            {
                count++;
            }
            num/=10;
        }
        if(count>0)
        {
            System.out.println("Duck Number");
        }
        else{
            System.out.println("Not a Duck number");
        }
    }
}