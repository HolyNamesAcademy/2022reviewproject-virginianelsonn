import java.util.Scanner;

public class Main {
    /**
     * Start program execution
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Keep looping until the user gives us valid input
        while (true) {
            // Get desired program from user
            System.out.print("Enter \"Shapes\" or \"S\" to run Shapes, \"BankAccount\" or \"B\" to run BankAccountManager,"
                + " or \"ArrayList\" or \"A\" to run ArrayListPractice:\t");
            String program = scanner.next();

            // Run desired program
            if (program.equalsIgnoreCase("s") || program.toLowerCase().equals("shapes")) {
                Shapes.Run();
                break;
            }
            else if (program.toLowerCase().equals("b") || program.toLowerCase().equals("bankAccount")) {
                BankAccountManager.Run();
                break;
            }
            else if (program.equalsIgnoreCase("a") || program.equalsIgnoreCase("arraylist")) {
                ArrayListPracticeMain.Run();
                break;
            }
            else {
                System.out.println("Sorry, the input was invalid.");
            }
        }
    }

}
