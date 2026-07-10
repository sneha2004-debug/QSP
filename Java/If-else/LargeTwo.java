import java.util.Scanner;
class LargeTwo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
        {
            System.out.println(+n1+"is Largest");
        }
        else{
            System.out.println(+n2+" is Largest");
        }
    }
}