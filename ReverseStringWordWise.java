import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here

        String[] arr = input.split(" ");
        int left =0;
        int right=arr.length-1;
        while(left<right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
        String rev = "";
        for(int i=0;i<arr.length;i++){
            rev+=arr[i];
            rev+=" ";
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
