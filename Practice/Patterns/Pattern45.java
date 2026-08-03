class Pattern45 
{
	public static void main(String[] args) 
	{
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("0 ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
