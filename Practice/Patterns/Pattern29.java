class Pattern29 
{
	public static void main(String[] args) 
	{
		int n=4;
		int a=1;
		char ch='a';
		for(int i=1;i<=n;i++)
		{
			ch = (char)('a' + i - 1);
				a=i;
			for(int j=1;j<=n;j++)
			{
				
				if(j%2!=0)
				{
					System.out.print(a+" ");
					a+=4;
				}
				else
				{
					System.out.print(ch +" ");
					ch+=4;
				}
			}
			System.out.println();
		}
	}
}
