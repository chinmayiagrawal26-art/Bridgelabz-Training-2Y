import java.util.Scanner;

public class LargestSecLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Create array of size 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d. Loop until number becomes 0
        while (number != 0) {

            // e. Get last digit and store it
            digits[index] = number % 10;

            // f. Increment index
            index++;

            // If array is full, break
            if (index == maxDigit) {
                break;
            }

            // Remove last digit
            number = number / 10;
        }

        // g. Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        sc.close();
    }
}