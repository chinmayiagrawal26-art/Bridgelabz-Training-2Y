import java.util.Scanner;
public class MergeSort {
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = prices[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        mergeSort(prices, 0, n - 1);
        System.out.println("Book prices in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
        sc.close();
    }
}