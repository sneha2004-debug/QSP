import java.util.Scanner;
class PositiveNegativeConditional
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n1 = sc.nextInt();
        String ans = n1 >= 0 ? "Positive" : "Negative";
        System.out.println("The Number is "+ans);
    }
}