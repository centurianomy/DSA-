public class ValidVariable {
    public static void main(String[] args) {
        String str = "var_123";   // change input here

        if (str.matches("[a-zA-Z][a-zA-Z0-9_]*")) {
            System.out.println("Valid Variable");
        } else {
            System.out.println("Invalid Variable");
        }
    }
}