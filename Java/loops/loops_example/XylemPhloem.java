// If the middle digits sum and end digits sum is equal then it is called as Xylem and if it is not same it is called as Phlyem
import java.util.Scanner;
class XylemPhloem{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int sumOfMid=0;
        int sumOfEnd=num%10;
        num=num/10;
        if(num<0)
        {
            System.out.println("The entered number is negative we cannot check if it is Xylem or phylem ");
            
        }
        else
        {
            if(num<99)
            {
                System.out.println("It is a Phylem");
            }
            else
            {
                while(num>9)
                {
                    sumOfMid=sumOfMid+(num%10);
                    num/=10;
                }
            }
        
            sumOfEnd=sumOfEnd + (num%10);
            if(sumOfEnd==sumOfMid)
            {
                System.out.println("It is a Xylem");

            }
            else{
                System.out.println("It is a Phylem");
            }
        }
        
    }
}