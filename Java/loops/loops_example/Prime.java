import java.util.Scanner;
class Prime{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int count=0;
        if(num==0 || num==1)
        {
            System.out.println("Nor Prime Not composite");
        }
        else{
            int deno=2;
            while(deno<num)
            {
                if(num%deno==0)
                {
                   count++;
                }
                
                deno++;
            }
            if(count==0)
            {
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Composite Number");
            }

        }
    }
}