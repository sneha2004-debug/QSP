class Demo1
{
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            if(isEven(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}