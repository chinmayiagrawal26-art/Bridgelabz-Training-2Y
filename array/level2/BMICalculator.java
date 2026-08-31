import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            double weight;
            do {
                System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
                weight = sc.nextDouble();
                if (weight < 0) {
                    System.out.println("Invalid weight! Enter a positive value.");
                }
            } while (weight < 0);
            double height;
            do {
                System.out.print("Enter height of person " + (i + 1) + " in meters: ");
                height = sc.nextDouble();
                if (height < 0) {
                    System.out.println("Invalid height! Enter a positive value.");
                }

            } while (height < 0);
            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " m");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
        }
        sc.close();
    }
}