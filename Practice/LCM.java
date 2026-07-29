import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to find its LCM :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int large=n1>n2?n1:n2;
		for(int i=1;;i++)
		{
			if((large*i)%n1==0 && (large*i)%n2==0)
			{
				System.out.println("The LCM of "+n1+" and "+n2+ " is "+(large*i));
				break;
			}
		}
	}
}
