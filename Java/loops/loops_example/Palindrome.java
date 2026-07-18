import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0)
        {
            int last = num%10;
            rev = rev * 10 + last;
            num=num/10;
        }
        System.out.println("The reverse of "+temp+" is "+rev);
        if(rev==temp)
        {
            System.out.println("It is a palindrome number ");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
    }
}