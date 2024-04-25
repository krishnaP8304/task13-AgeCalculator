import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their birthdate in the specified format
        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateStr = scanner.nextLine();

        // Parse the input birthdate string into a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the difference between the birthdate and current date
        Period period = Period.between(birthdate, currentDate);

        // Retrieve the years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Display the age
        System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");

        scanner.close();
    }
}
