class Pattern10 
{
	public static void main(String[] args) 
	{
		int n=3;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			a=i;
			for(int j=1;j<=n;j++)
				{
					System.out.print(a +" ");
					a=a+n;
				}
			System.out.println();	
			
		}
		
	}
}
