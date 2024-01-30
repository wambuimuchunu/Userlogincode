import java.util.Scanner;

public class userlogin {
    String CORRECT_USERNAME = "username";
    String CORRECT_PASSWORD = "password123";

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int attempts = 3;

       while (attempts > 0) {
           System.out.print("Enter username: ");
           String username = scanner.nextLine();

           System.out.print("Enter password (each character will be echoed): ");
           String password = "";
           // Read each character of the password individually
           while (true) {
               char ch = scanner.next().charAt(0);
               password += ch;  // Append character to password
               System.out.print("*");  // Print asterisk to mask input
               if (ch == '\n') {  // Check for newline character (Enter key)
                   break;
               }
           }

           if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
               System.out.println("\nLogin successful!");
               break;
           } else {
               System.out.println("\nInvalid username or password.");
               attempts--;
               if (attempts > 0) {
                   System.out.println("You have " + attempts + " attempts remaining.");
               }
           }
       }

       if (attempts == 0) {
           System.out.println("Too many attempts. Access denied.");
       }
   }
}
