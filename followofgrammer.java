public class followofgrammer {
    public static void main(String[] args) {
        String grammer = "aAb";

        if (grammer.length() > 1) {  // check if second char exists
            char second = grammer.charAt(1);

            if (second >= 'a' && second <= 'z') {
                System.out.println("FOLLOW = " + second);
            } else {
                System.out.println("no follow");
            }
        }
    }
}