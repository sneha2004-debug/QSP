class Pattern
{
    public static void main(String args[])
    {
        int n=4;
        char ch=(char)('a'+(n*2)-1);
        for(int i=1;i<=n;i++)
        {
            int num=i;
            for(int j=1;j<=n;j++)
            {
                if(j%2!=0)
                {
                    System.out.print(num+ " ");
                    num+=n;
                }
                else{
                    System.out.print(ch+ " ");
                    ch-=n;
                }

            }
            ch+=(char)2*n+1;
            System.out.println();
        }
    }
}