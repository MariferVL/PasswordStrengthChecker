# Password Strength Checker

This Java program evaluates the strength of a password based on specified criteria. It checks if the password meets the following requirements:

- Should contain at least one symbol. Allowed symbols are: /(&$#)-!_@%=
- Should contain at least 1 digit
- Should contain a combination of upper and lower case characters
- Minimum length of 10 characters

The program classifies the password strength into the following categories:

- Weak: 1 criterion or less met
- Reasonable: 2 criteria met
- Strong: 3 criteria met
- VeryStrong: 4 criteria met

## How to Use

1. Clone or download this repository to your local machine.

2. Compile the `PasswordStrengthChecker.java` file using a Java compiler. You can do this by running the following command in your terminal:

   ```bash
   javac PasswordStrengthChecker.java
    ```

    Run the program with the following command:

    ```bash
    java PasswordStrengthChecker
    ```

    The program will display an introductory message and prompt you to enter a password to check its strength.

    Enter the password and press Enter.

    The program will evaluate the password and display its strength in the console.

Restrictions

    This program uses only Java SE classes (Java version 11 or higher) and does not rely on external libraries.


Author

This program was created by [María-Fernanda Villalobos](https://github.com/MariferVL).

License

This project is open-source and available under the MIT License.