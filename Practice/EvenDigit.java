import java.util.Scanner;
class EvenDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=1;i<=100;i++)
        {
            if(isEven(i))
            {
                count++;
            }
        }
        System.out.println("Total even numbers from 1 to 100 is "+count);
       
    }
    public static boolean isEven(int num)
    {
       
            if(num%2==0)
            {
                return true;
            }
            else{
                return false;
            }
            
    }
}