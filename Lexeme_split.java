public class Lexeme_split {
    public static void main(String[] args) {
        String str = "int x = 10    + b ;";
        String[] lexemes = str.split("\\s+"); // Split by whitespace can handle multilple spaces by considering multispaces as a single space

        // \\W- splits by words, \\S- splits by non-whitespace \\s- splits by whitespace, \\d- splits by digits, \\D- splits by non-digits,

        // for (String lexeme : lexemes) {
        //     System.out.println(lexeme);
        // }
            for (int i = 0; i < lexemes.length; i++) {
                System.out.println(lexemes[i]);
            }
    }
}