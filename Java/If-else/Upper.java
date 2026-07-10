import java.util.Scanner;
class Upper{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println("The Character is in Uppercase");
        }
        if(ch>='a' && ch<='z')
        {
            System.out.println("The Character is in Lowercase");
        }
        if(ch>='0' && ch<='9')
        {
            System.out.println("The Character is a Digit");
        }
        if (!((ch >= 'A' && ch <= 'Z')||( ch >= 'a' && ch <= 'z') ||( ch >= '0' && ch<= '9')))
        {
            System.out.println("The character is a Special Character");
        }
    }
}