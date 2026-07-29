import java.util.Scanner;
class Prime{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int count=0;
        if(num<=1)
        {
            System.out.println("Not a Prime Number");
        }
        else{
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }

    }
}