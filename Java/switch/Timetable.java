import java.util.Scanner;
class Timetable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Day");
        String day=sc.nextLine();
        switch(day)
        {
            case "Monday" :
                {
                    System.out.println("Your Subject for monday are :");
                    System.out.println("Maths");
                    System.out.println("English");
                    break;
                }
            case "Tuesday" :
                {
                    System.out.println("Your Subjects for Tuesday are :");
                    System.out.println("Maths");
                    System.out.println("Marathi");
                    break;
                }
            case "Wednesday" :
                {
                    System.out.println("Your Subjects for Wednesday are :");
                    System.out.println("Chemistry");
                    System.out.println("English");
                    break;
                }
            case "Thursday" :
                {
                    System.out.println("Your Subjects for Thursday are :");
                    System.out.println("Hindi");
                    System.out.println("English");
                    break;
                }
            case "Friday" :
                {
                    System.out.println("Your Subjects for Friday are :");
                    System.out.println("History");
                    System.out.println("Biology");
                    break;
                }
            case "Saturday" :
                {
                    System.out.println("Your Subjects for Saturday are :");
                    System.out.println("Maths");
                    System.out.println("Marathi");
                    break;
                }
            case "Sunday" :
                {
                    System.out.println("Do your Self Study");
                   
                    break;
                }
            default :
            {
                System.out.println("Enter a Valid day");
            }
        }
    }
}