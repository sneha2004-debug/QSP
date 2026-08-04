class Triangle9
{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i+j>=n+1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--)
        {
            for(int k=1;k<=n;k++)
            {
                if(i+k>=n+1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}