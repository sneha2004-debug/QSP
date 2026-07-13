import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What you want to perform ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int n1=sc.nextInt();
        switch(n1)
        {
            case 1:
                {   
                    System.out.println("ADDITION");
                    System.out.println("Enter two numbers:");
                    int n2 = sc.nextInt();
                    int n3 = sc.nextInt();
                    int sum= n2 + n3 ;
                    System.out.println("The addition of "+n1+" and "+n2+" is "+sum );
                    break;
                }
            case 2:
                {   
                    System.out.println("SUBTRACTION");
                    System.out.println("Enter two numbers:");
                    int n4=sc.nextInt();
                    int n5=sc.nextInt();
                    int sub=n4 - n5 ;
                    System.out.println("The subtraction of "+n4+" and "+n5+" is "+sub);
                    break;
                }
            case 3:
                {   
                    System.out.println("MULTIPLICATION");
                    System.out.println("Enter Two Numbers :");
                    int n6=sc.nextInt();
                    int n7=sc.nextInt();
                    int mul=n6 * n7 ;
                    System.out.println("The Multiplication of "+n6+" and "+n7+" is "+mul);
                    break;
                }
            case 4:
                {   
                    System.out.println("DIVISION");
                    System.out.println("Enter Two Numbers :");
                    int n8=sc.nextInt();
                    int n9=sc.nextInt();
                    int div= n8 / n9 ;
                    System.out.println("The division of "+n8+" and "+n9+" is "+div);
                    break;
                }
            default :
            {
                System.out.println("Enter a Valid Input");
            }
        }
    }
}