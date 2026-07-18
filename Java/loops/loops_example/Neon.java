//A Neon Number is a number where the sum of the digits of its square is equal to the original number.
// first take input from user
// then take square of number
// the extract the squared number
// and take sum of the digits of the squared number
// then compare the original number and sum of extracted digits
import java.util.Scanner;
class Neon{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int square=num*num;
        int sum=0;
        System.out.println("The Square of the "+num+" is "+square);
        while(square!=0)
        {
            int last = square %10 ;
            sum = sum + last ;
            square /=10;
            
        }
        if(sum==num)
        {
            System.out.println("It is a Neon Number");
        }
        else
        {
            System.out.println("It is not a Neon Number");
        }
    }
}