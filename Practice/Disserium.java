class Disserium 
{
	public static void main(String[] args) 
	{
		int num=145;
		int sum=0;
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			count++;
		}
		for(int i=num;i!=0;i/=10)
		{
			int power=1;
			int last=i%10;
			for(int j=1;j<=count;j++)
			{
				power=power*last;
			}
			sum+=power;
			count--;
		}
		if(sum==num)
		{
			System.out.println("Disserium Number");
		}
		else
		{
			System.out.println("Not a Disserium Number");
		}
	}
}
