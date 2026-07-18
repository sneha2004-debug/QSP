import java.util.Scanner;
class XylemPalindrome{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int rev=0;
        int sumOfMid=0;
        int sumOfEnd=num%10;
        
        for(int i=num;i!=0;i/=10)
        {
            int last = i % 10;
            rev = rev * 10 + last;

        }
        System.out.println("The reverse number is : "+rev);
        if(rev==num)
        {
            System.out.println("It is palindrome");
            
            if(num<=99)
            {
                System.out.println("The number is phloem");
            }
            else{
                num=num/10;
                while(num>9)
                {
                    int last = num % 10 ;
                    sumOfMid += last;
                    num /=10;
                }
                sumOfEnd += num ;
                if(sumOfEnd==sumOfEnd)
                {
                    System.out.println("It is a Xylem number");
                }
                else{
                    System.out.println("It is a Phloem number");
                }
            }
        }
        

    }
}