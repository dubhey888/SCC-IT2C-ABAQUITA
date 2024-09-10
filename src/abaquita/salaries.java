
package abaquita;


import java.util.Scanner;

public class salaries {

    public void totalsalary() {
        Scanner sc = new Scanner(System.in);
        salary[] emp = new salary[100];

        System.out.print("Enter no. of Employees: ");
        int nums = sc.nextInt();

        int totalSalaryForRequest = 0;
        int totalDeductions = 0;
        int totalSalaryToRelease = 0;

        for (int y = 0; y < nums; y++) {
            System.out.println("Enter details of Employee " + (y + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Rate per Hour: ");
            int rate = sc.nextInt();
            System.out.print("Hours Worked: ");
            int hours = sc.nextInt();
            System.out.print("Total Deduction: ");
            int ded = sc.nextInt();

            emp[y] = new salary();
            emp[y].addemployees(id, name, rate, hours, ded);

            totalSalaryForRequest += emp[y].gross;
            totalDeductions += emp[y].ded;
            totalSalaryToRelease += emp[y].netp;
        }

        salary.printHeader();

        for (int y = 0; y < nums; y++) {
            emp[y].Employees();
        }

        System.out.println("\nTotal Salary for Request: " + totalSalaryForRequest);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Total Salary to Release: " + totalSalaryToRelease);
    }
}