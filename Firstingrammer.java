public class Firstingrammer {
    public static void main(String[] args) {
        String grammer = "aAb";

        char first = grammer.charAt(0);  // get first character

        if (first >= 'a' && first <= 'z') {
            System.out.println("FIRST = " + first);
        } else {
            System.out.println("no first");
        }
    }
}
}