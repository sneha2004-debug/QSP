class Automorphic 
{
	public static void main(String[] args) 
	{
		int num=45;
		int sq=num*num;
		int deno=1;
		for(int i=sq;sq!=0;sq/=10)
		{
			deno=deno*10;
		}
		if(sq%deno==num)
		{
			System.out.println(+num+" is Automorphic number");
		}
		else
		{
			System.out.println(+num+" is Not Automorphic Number");
		}
		
	}
}
