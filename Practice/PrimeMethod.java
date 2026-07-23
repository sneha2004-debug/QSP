class PrimeMethod
{
    public static void main(String args[])
    {   
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            if(isPrime(i))
            {
                sum=sum+i;
            }
        }
        System.out.println("The sum of prime digits between 1 to 100 is "+sum);
    }

    public static boolean isPrime( int i)
    {
        if(i<=1)
        {
            return false;
        }
        else
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    return false;
                }

            }
            return true;
        }
    }
}