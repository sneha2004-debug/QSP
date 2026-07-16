import java.util.Scanner;
class SumProduct{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        int product = 1;
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        while(num!=0)
        {
            int last = num % 10 ;
            sum = sum + last;
            product = product * last ;
            num = num / 10 ; 
        }
        
        System.out.println("The Sum of the digits is : "+sum);
        System.out.println("The Product of the digits is :"+product);
        if(sum==product)
        {
            System.out.println("The sum and product is Equal");
        }
        else{
            System.out.println("The sum and product is not equal");
        }
    }
}