import java.util.Scanner;
class SmallTwo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans = n1<n2 ? n1 : n2;
        System.out.println("Smallest Number is : "+ans);
    }
   
}