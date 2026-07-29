class ReverseLoop
{
    public static void main(String args[])
    {
        for(int i=200;i<=500;i++)
        {   
            int temp=i;
            int rev=0;
            while(temp!=0)
            {
                int last=temp%10;
                rev=rev*10+last;
                temp/=10;
            }
            System.out.println(rev);
        }
    }
}