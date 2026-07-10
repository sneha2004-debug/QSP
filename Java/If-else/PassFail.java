import java.util.Scanner;
class PassFail{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marksr");
        int n1=sc.nextInt();
        if(n1>=35)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}