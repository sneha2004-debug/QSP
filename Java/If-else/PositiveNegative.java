import java.util.Scanner;
class PositiveNegative
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n1 = sc.nextInt();
        if(n1>=0)
        {
            System.out.println("Number Is Positive");

        }
        else{
            System.out.println("Number is Negative");
        }
    }
}