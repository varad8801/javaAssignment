public class Q39 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 2, 7, 3};

        int smallest = findSmallest(numbers);
        int largest = findLargest(numbers);

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static int findSmallest(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
