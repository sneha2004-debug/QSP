class Pattern11 
{
	public static void main(String[] args) 
	{
		int n=4;
		int b=(n*2)-1;
		int c=1;
		for(int i=1;i<=n;i++)
		{
			int a=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(a +" ");
				a= (j%2!=0) ? a+b:a+c;
				if(a<=9) System.out.print(" ");
			}
			b=b-2;
			c=c+2;
			System.out.println();
		}
		
	}
}
