import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] id = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = id[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && id[j] > key) {
                id[j + 1] = id[j];
                j--;
            }

            // Insert key at correct position
            id[j + 1] = key;
        }

        System.out.println("Employee IDs in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(id[i] + " ");
        }

        sc.close();
    }
}