import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] age = new int[n];

        System.out.println("Enter students' ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            age[i] = sc.nextInt();
        }

        // Count array for ages 10 to 18
        int[] count = new int[19];

        // Store frequency of each age
        for (int i = 0; i < n; i++) {
            count[age[i]]++;
        }

        // Calculate cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Output array
        int[] output = new int[n];

        // Place elements in correct positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[age[i]] - 1] = age[i];
            count[age[i]]--;
        }

        // Copy output back to age array
        for (int i = 0; i < n; i++) {
            age[i] = output[i];
        }

        System.out.println("Student ages in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(age[i] + " ");
        }

        sc.close();
    }
}