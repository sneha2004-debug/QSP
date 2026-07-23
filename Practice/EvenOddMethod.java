class EvenOddMethod
{
    public static void main(String args[])
    {
        int even=0;
        int odd=0;
        for(int i=1;i<=100;i++)
        {
            if(isEven(i))
            {
                System.out.println("Even No : "+i);
                even++;
            }
        }
        System.out.println(even);
        
        for(int i=1;i<=100;i++)
        {
            if(isOdd(i))
            {
                System.out.println("Odd no : "+i);
                odd++;
            }
        }
        System.out.println(odd);
    }
    public static boolean isEven(int i)
    {   
        
        if(i%2==0)
        {
            
            return true;
        }
        return false;
        
    }
    public static boolean isOdd(int i)
    {
        if(i%2!=0)
        {
           
            return true;
        }
        return false;
    }
}