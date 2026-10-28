import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateExplorer {

    private LocalDate date;
    private Scanner scanner;

    public DateExplorer() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        DateExplorer explorer = new DateExplorer();
        explorer.start();
    }

    public void start() {
        System.out.print("Enter a date (format yyyy-MM-dd): ");
        String input = scanner.nextLine();

        try {
            // Requirement 2: Use LocalDate.parse() to convert input into a LocalDate object
            date = LocalDate.parse(input);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return;
        }

        int choice;
        // Requirement 7: Use a loop to keep displaying the menu until the user chooses Exit
        do {
            displayMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.next(); // clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Requirement 3: Use a switch statement to handle the menu options
            switch (choice) {
                case 1:
                    displayMonth();
                    break;
                case 2:
                    displayYear();
                    break;
                case 3:
                    displayDayOfWeek();
                    break;
                case 4:
                    checkLeapYear();
                    break;
                case 5:
                    lookBackMonths();
                    break;
                case 6:
                    System.out.println("Exiting DateExplorer. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 6.");
            }
            System.out.println();
        } while (choice != 6);
    }

    private void displayMenu() {
        System.out.println("\n--- Date Explorer Menu ---");
        System.out.println("1. Display Month");
        System.out.println("2. Display Year");
        System.out.println("3. Display Day of Week");
        System.out.println("4. Check if Leap Year");
        System.out.println("5. Look Back by Months");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    // Requirement 8: Create methods like displayMonth()
    // Requirement 5: Use getMonth()
    public void displayMonth() {
        System.out.println("Month: " + date.getMonth() + " (" + date.getMonthValue() + ")");
    }

    // Requirement 8: Create methods like displayYear()
    // Requirement 5: Use getYear()
    public void displayYear() {
        System.out.println("Year: " + date.getYear());
    }

    // Requirement 5: Use getDayOfWeek()
    public void displayDayOfWeek() {
        System.out.println("Day of Week: " + date.getDayOfWeek());
    }

    // Requirement 6: Use an if-else statement to check whether the entered year is a leap year
    public void checkLeapYear() {
        int year = date.getYear();
        if (date.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Requirement 4 & 8: Use minusMonths() in a lookBackMonths() method
    public void lookBackMonths() {
        System.out.print("Enter number of months to look back: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next();
        }
        long monthsToSubtract = scanner.nextLong();
        scanner.nextLine(); // consume newline

        LocalDate pastDate = date.minusMonths(monthsToSubtract);
        System.out.println(monthsToSubtract + " months before " + date + " was: " + pastDate);
    }
}