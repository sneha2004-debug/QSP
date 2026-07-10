import java.util.Scanner;
class PassFailConditional{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marks");
        int n1=sc.nextInt();
        String ans = n1>=35 ? "Pass" : "Fail";
        System.out.println("You are "+ans);
    }
}