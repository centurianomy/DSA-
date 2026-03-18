import java.util.*;
class LengthofLastword {
    public int lengthOfLastWord(String s) {
         
        Stack<Character> stack = new Stack<>();
        int count = 0;

        // Step 1: start from the end, skip trailing spaces
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: push each character of last word into stack
        while (i >= 0 && s.charAt(i) != ' ') {
            stack.push(s.charAt(i));
            count++;
            i--;
        }

        // Step 3: pop and print the word (in correct order)
        System.out.print("Last word is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println("\nLength of last word: " + count);

         return count;}

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    LengthofLastword obj = new LengthofLastword();
    int result = obj.lengthOfLastWord(input);

    // (Optional) just printing result again
    System.out.println("Returned Length: " + result);

    sc.close();
}
}