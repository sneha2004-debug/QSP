import java.util.Scanner;
class Vowel{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a LowerCase Character");
        char ch=sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("It is a Vowel");
        }

        if((ch >= 'a' && ch <= 'z') &&
           !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
        {
            System.out.println("It is a Consonant");
        }

        if(!(ch >= 'a' && ch <= 'z'))
        {
            System.out.println("Invalid Input");
        }
    }
}