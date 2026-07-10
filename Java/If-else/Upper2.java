import java.util.Scanner;
class Upper2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        if(ch>=65 && ch<=90)
        {
            System.out.println("The Character is in Uppercase");
        }
        if(ch>=97 && ch<=122)
        {
            System.out.println("The Character is in Lowercase");
        }
        if(ch>=48 && ch<=57)
        {
            System.out.println("The Character is a Digit");
        }
        if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch>=48 && ch<=57)))
        {
            System.out.println("The Character is a Special Character");
        }
    }
}