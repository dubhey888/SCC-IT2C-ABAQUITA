
package abaquita;

import java.util.Scanner;
public class accounts {

    private account[] accounts;

    public void manageAccounts() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of accounts to create: ");
        int numberOfAccounts = scanner.nextInt();
        scanner.nextLine();

        accounts = new account[numberOfAccounts];

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Username: ");
            String username = scanner.nextLine();

            String password;
            do {
                System.out.print("Password: ");
                password = scanner.nextLine();
            } while (!validatePassword(password));

            accounts[i] = new account(id, firstName, lastName, email, username, password);

            System.out.println("Account created successfully!\n");
        }

        System.out.println("Accounts Created:");
        for (account account : accounts) {
            account.displayAccountInfo();
        }
    }

    private boolean validatePassword(String password) {
        if (password.length()<8){
            System.out.println("Password must be at least 8 characters.");
            return false;
        }
        if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain both lowercase and uppercase letters.");
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one number.");
            return false;
        }
        String[] commonPasswords = {"admin", "1234", "password"};
        for (String commonPass : commonPasswords) {
            if (password.equalsIgnoreCase(commonPass)) {
                System.out.println("Password cannot be a common password.");
                return false;
            }
        }
        return true;
    }
}

