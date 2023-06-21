import java.util.Scanner;

public class swapvalue {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the size of the array from the user
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            // Get the array elements from the user
            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Get the indices of the elements to swap from the user
            System.out.print("Enter the index of the first element to swap: ");
            int index1 = scanner.nextInt();
            System.out.print("Enter the index of the second element to swap: ");
            int index2 = scanner.nextInt();

            // Perform the swap
            if (index1 >= 0 && index1 < size && index2 >= 0 && index2 < size) {
                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
                System.out.println("Elements swapped successfully.");
            } else {
                System.out.println("Invalid indices. Swap operation aborted.");
            }

            // Print the updated array
            System.out.println("Updated array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }


}
