class PrimeLoop
{
    public static void main(String args[])
    {
        
        for(int i=100;i<=150;i++)
        {
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
            }
        }
    }
}