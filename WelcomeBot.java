import java.util.Scanner;
 //import java.regex.Pattern;
//import java.regex.Matcher;
public class WelcomeBot {


     private static int getValidStudentNumber(Scanner scanner) {
        int studentNumber;
        while (true) {
            System.out.print("Enter your student number: ");
            String input = scanner.nextLine();
            try {
                studentNumber = Integer.parseInt(input);
                if (studentNumber > 0) {
                    break;
                } else {
                    System.out.println("Student number must be a positive integer. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid student number.");
            }
           
        }
        
      return studentNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        String name = scanner.nextLine();
        System.out.println("Student enter your name:"+name);
        
        String lastName = scanner.nextLine();
        System.out.println("Enter your last name:"+lastName);
      
        String studentNumber = scanner.nextLine();
        System.out.println("Enter your student number:"+studentNumber);
        getValidStudentNumber(scanner);
    }
}
