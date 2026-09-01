import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {
                if (marks[j] < marks[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with first unsorted element
            int temp = marks[i];
            marks[i] = marks[minIndex];
            marks[minIndex] = temp;
        }

        System.out.println("Exam scores in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}