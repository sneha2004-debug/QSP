class Pattern40 
{
	public static void main(String[] args) 
	{
		int n=4;
		int num=1;
		char ch='a';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
