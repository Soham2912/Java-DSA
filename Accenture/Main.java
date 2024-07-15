// // The function takes an integral arr which is of the size or length of its arguments.
//  Return the sum of the second smallest element at odd position ‘arr’ and the second largest element at the even position.





public class Main {

    public static int findSum(int[] arr) {
        if (arr.length <=3) {
            return 0;
        }

        int smallestOdd = Integer.MAX_VALUE, secondSmallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE, secondLargestEven = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { 

                if (arr[i] < smallestOdd) {
                    secondSmallestOdd = smallestOdd;
                    smallestOdd = arr[i];
                } else if (arr[i] < secondSmallestOdd) {
                    secondSmallestOdd = arr[i];
                }
            } else { 
                if (arr[i] > largestEven) {
                    secondLargestEven = largestEven;
                    largestEven = arr[i];
                } else if (arr[i] > secondLargestEven) {
                    secondLargestEven = arr[i];
                }
            }
        }

        // if (secondSmallestOdd == Integer.MAX_VALUE || secondLargestEven == Integer.MIN_VALUE) {
        //   return 0;
        // }

        return secondSmallestOdd + secondLargestEven;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 3, 7, 7, 9, 1};    
    int result = findSum(arr);
 System.out.println("The result is: " + result);
      
    }
}
