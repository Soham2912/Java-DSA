// This function helps in finding the maximum element in the array.
//  Execute this function to print the maximum element in the array with its index.






public class MaxElementFinder {

    public static void findAndPrintMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        int maxElement = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        // Print the maximum element and its index
        System.out.println(maxElement);
        System.out.println("Index: " + maxIndex);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 2, 5};

        findAndPrintMaxElement(array);
    }
}
