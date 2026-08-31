import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Array to store salary and years of service
        double[][] employeeData = new double[10][2];

        // c. Array to store bonus and new salary
        double[][] bonusData = new double[10][2];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // d. Taking input for 10 employees
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            // Check for invalid values
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input! Salary and years of service cannot be negative.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        // e. Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            double bonus;

            // More than 5 years → 5%, otherwise → 2%
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            // Store bonus and new salary
            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;

            // Calculate totals
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // f. Display results
        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary = " + employeeData[i][0]);
            System.out.println("Years of Service = " + employeeData[i][1]);
            System.out.println("Bonus = " + bonusData[i][0]);
            System.out.println("New Salary = " + bonusData[i][1]);
        }

        System.out.println("\n----- Total -----");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}