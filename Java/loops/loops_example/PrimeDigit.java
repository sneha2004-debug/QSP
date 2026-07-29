//check if all the digit is prime in a number
import java.util.Scanner;
class PrimeDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int num=sc.nextInt();
        int prime=0;
        int count=0;
        while(num!=0)
        {
            int last = num % 10;
            count++;
            if(last==0 || last==1)
            {
                System.out.println("Not prime not composite");
            }
            else{
                for(int i=2;i<last;i++)
                {
                    if(last%i==0)
                    {
                        System.out.println("Not a prime number");
                        break;
                    }
                    else
                    {
                        prime++;
                    }
                }
            }
            
             num/=10;      
        }
        


    }
}
    
        