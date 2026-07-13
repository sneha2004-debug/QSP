import java.util.Scanner;
class Input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Full Name:");
        String name=sc.nextLine();
        System.out.println("Enter your number");
        long num=sc.nextLong();
        System.out.println(name);
        System.out.println(num);

    }
}