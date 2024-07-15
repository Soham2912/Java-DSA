// Perform the function: Int operationchoices(int c, int n, int a, int b). 
// This function considers three positive inputs of a, b and c.


public class Switch {
    

    public static int operation(int c , int a , int b){

        switch (c) {
            case 1:
                return a + b;

            case 2 :
                return a-b;

            case 3:
                return a*b;

            case 4:
                return a/b;
            default:
                break;
        }
        return 0;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 1;

        int result = operation(c, a, b);
        System.out.println("Result: " + result);
    }
}
