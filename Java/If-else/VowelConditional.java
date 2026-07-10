import java.util.Scanner;
class VowelConditional{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Lowercase character: ");
        char ch = sc.next().charAt(0);
        System.out.println((ch >= 'a' && ch <= 'z') ? ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "It is a Vowel" : "It is a Consonant") : "Invalid Input" );
    }
}