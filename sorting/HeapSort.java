import java.util.Scanner;

public class HeapSort {

    // Heapify the array
    public static void heapify(int[] salary, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && salary[left] > salary[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && salary[right] > salary[largest]) {
            largest = right;
        }

        // If largest is not the root
        if (largest != i) {

            int temp = salary[i];
            salary[i] = salary[largest];
            salary[largest] = temp;

            // Heapify the affected subtree
            heapify(salary, n, largest);
        }
    }

    // Heap Sort
    public static void heapSort(int[] salary) {

        int n = salary.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salary, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Move largest element to the end
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            // Reheapify remaining elements
            heapify(salary, i, 0);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of applications: ");
        int n = sc.nextInt();

        int[] salary = new int[n];

        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        heapSort(salary);

        System.out.println("Salary demands in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(salary[i] + " ");
        }

        sc.close();
    }
}