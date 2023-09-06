import java.util.Scanner;

public class PasswordStrengthChecker {

    /**
     * Check the strength of a password based on certain criteria.
     *
     * @param password The password to be evaluated.
     * @return A string indicating the strength of the password (Weak, Reasonable,
     *         Strong, VeryStrong).
     */
    public String check(String password) {
        // Initialize the criteria met counter to 0
        int criteriaMet = 0;

        // Check for the minimum length
        if (password.length() >= 10) {
            criteriaMet++;
        }

        // Check for at least one digit
        if (containsDigit(password)) {
            criteriaMet++;
        }

        // Check for a combination of upper and lower case characters
        if (containsUpperCase(password) && containsLowerCase(password)) {
            criteriaMet++;
        }

        // Check for at least one symbol
        if (containsSymbol(password)) {
            criteriaMet++;
        }

        // Determine password strength based on the number of criteria met
        if (criteriaMet <= 1) {
            return "Weak";
        } else if (criteriaMet == 2) {
            return "Reasonable";
        } else if (criteriaMet == 3) {
            return "Strong";
        } else {
            return "VeryStrong";
        }
    }

    /**
     * Check if a string contains at least one digit.
     *
     * @param str The string to be checked.
     * @return True if the string contains at least one digit, false otherwise.
     */
    private boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if a string contains at least one upper case character.
     *
     * @param str The string to be checked.
     * @return True if the string contains at least one upper case character, false
     *         otherwise.
     */
    private boolean containsUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if a string contains at least one lower case character.
     *
     * @param str The string to be checked.
     * @return True if the string contains at least one lower case character, false
     *         otherwise.
     */
    private boolean containsLowerCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if a string contains at least one allowed symbol.
     *
     * @param str The string to be checked.
     * @return True if the string contains at least one allowed symbol, false
     *         otherwise.
     */
    private boolean containsSymbol(String str) {
        String allowedSymbols = "/(&$#)-!_@%=";
        for (char c : str.toCharArray()) {
            if (allowedSymbols.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create an instance of PasswordStrengthChecker
        PasswordStrengthChecker checker = new PasswordStrengthChecker();
        // System.out.println(checker.check("Password"));
        // System.out.println(checker.check("Tom4s!K8s1"));
        // System.out.println(checker.check("P3teR20-3"));

        // Display an introductory message
        System.out.println("\n\n[/] Password Strength Checker [\\]\n");
        System.out.print(">>Please enter a password to check its strength: ");

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        String passwordToTest = scanner.nextLine();

        // Call the check method to evaluate the entered password
        String result = checker.check(passwordToTest);

        // Display the result
        System.out.println("\nPassword Strength: " + result + "\n\n");

        // Close the scanner
        scanner.close();
    }
}
