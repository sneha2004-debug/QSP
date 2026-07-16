import java.util.Scanner;
class EvenOdd{
    public static void main(String args[])
    {   
        int even=0;
        int odd=0;
        for(int i=1;i<=125;i++)
        {
            if(i%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The total even numbers is :"+even);
        System.out.println("The total odd numbers is :"+odd);
    }
}