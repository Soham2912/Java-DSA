// The given function has a string (str) and two characters, ch1 and ch2.
// Execute the function in such a way that str returns to its original string, 
// and all the events in ch1 are replaced by ch2, and vice versa.

public class CharacterSwapper {

    public static String swapCharacters(String str, char ch1, char ch2) {
        // Convert the string to a character array to modify it
        char[] charArray = str.toCharArray();

        // Traverse through the character array
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch1) {
                charArray[i] = ch2;
            } else if (charArray[i] == ch2) {
                charArray[i] = ch1;
            }
        }

        // Convert the character array back to string and return
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "apple";
        char ch1 = 'a';
        char ch2 = 'p';

        String swappedStr = swapCharacters(str, ch1, ch2);
        System.out.println("Original String: " + str);
        System.out.println("Swapped String: " + swappedStr);
    }
}
