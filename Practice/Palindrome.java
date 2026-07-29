import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int rev=0;
        for(int i=num;i!=0;i/=10)
        {
            int last=i%10;
            rev=rev*10+last;
            
        }
        if(rev==num)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}