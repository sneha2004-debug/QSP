import java.util.Scanner;
class FrequencyOfDigit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        System.out.println("Enter a digit ");
        int digit =sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int last = num%10;
            if(last==digit)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println("The count of digit "+digit+" is "+count);
    }
}