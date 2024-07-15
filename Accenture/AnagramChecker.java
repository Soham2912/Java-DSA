// Write a function to validate if the provided two strings are anagrams or not. 
// If the two strings are anagrams, then return ‘yes’. Otherwise, return ‘no’.



import java.util.Arrays;

public class AnagramChecker {

    public static String areAnagrams(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return "no";
        }

      
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are the strings anagrams? " + areAnagrams(str1, str2));
    }
}
