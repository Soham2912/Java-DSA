// The function accepts an integer array ‘arr’ of size ‘n’ as its argument. 
// The function needs to return the index of an equilibrium point in the array,
// where the sum of elements on the left of the index is equal to the sum of elements on the right of the index. 
// If no equilibrium point exists, the function should return -1.

public class EquilibriumPoint {

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Iterate through the array and check for the equilibrium point
        for (int i = 0; i < arr.length; i++) {
            // totalSum now represents the right sum for index i
            totalSum -= arr[i];

            // If left sum is equal to the right sum, we found the equilibrium point
            if (leftSum == totalSum) {
                return i;
            }

            // Update left sum for the next iteration
            leftSum += arr[i];
        }

        // No equilibrium point found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int index = findEquilibriumIndex(arr);
        if (index != -1) {
            System.out.println("Equilibrium index: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
