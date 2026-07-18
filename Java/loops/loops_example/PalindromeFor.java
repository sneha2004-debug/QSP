import java.util.Scanner;
class PalindromeFor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        int rev=0;
        for(int i=num;i!=0;i=i/10)
        {
            int last = i % 10;
            rev= rev * 10 +last;
        }
        System.out.println("The reverse of the number is :"+rev);
        if(num==rev)
        {
            System.out.println("It is a palindrome");

        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}