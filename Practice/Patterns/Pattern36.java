class Pattern36 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=n;i>=1;i--)
		{
			int num=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+" ");
				num+=n;
			}
			System.out.println();
			
		}
	}
}
