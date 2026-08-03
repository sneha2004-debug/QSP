class  Pattern46
{
	public static void main(String[] args) 
	{
		int n=4;
		int a=1;
		char ch='a';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
