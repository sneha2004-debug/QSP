class Armstrong 
{
	public static void main(String[] args) 
	{
		int num=154;
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			count++;
		}
		int sum=0;
		for(int i=num;i!=0;i/=10)
		{
			int power=1;
			int last=i%10;
			for(int j=1;j<=count;j++)
			{
				power=power*last;
			}
			sum=sum+power;
		}
		if(num==sum)
		{
			System.out.println("It is a Armstrong Number ");
		}
		else
		{
			System.out.println("It is not a Armstrong number ");
		}
	}
}
