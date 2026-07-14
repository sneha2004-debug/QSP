import java.util.Scanner;
class Tourist{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a city you want to visit :");
        System.out.println("Pune");
        System.out.println("Nashik");
        System.out.println("Shirdi");
        
        String city =sc.nextLine();
        switch(city)
        {
            case "Pune":
                {
                    System.out.println("Famous Tourist places in Pune are :");
                    System.out.println("Lohgad Fort");
                    System.out.println("Shanivar vada");
                    System.out.println("Khadakwasla Dam");
                    System.out.println("Do come and visit us !!!");
                    break;
                }
            case "Nashik":
                {
                    System.out.println("Famous Tourist places in Nashik are :");
                    System.out.println("Godavari Ghat ");
                    System.out.println("Grape Embassy");
                    System.out.println("Boat Club");
                    System.out.println("Do come and visit us !!!");
                    break;
                }
            case "Shirdi":
                {
                    System.out.println("Famous Tourist places in Shirdi are :");
                    System.out.println("Sai baba Temple");
                    System.out.println("Sai Dham");
                    System.out.println("Do come and visit us !!!");
                    break;
                    
                }
            default :
            {
                System.out.println("Enter a valid city");
            }
        }


    }
}