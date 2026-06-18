import java.util.*;

class GuessRandom{
    public static void main(String args[]){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);

        int target = rand.nextInt(100)+1;  //(0-99)--> [0+1, 1+1, 2+1 ..... 99+1] --> [1, 2, 3, 4 ..... 5]
        int count = 0;

        while(count==0){
            System.out.println("Guess the number ?");
            int guess=sc.nextInt();

            if(guess==target){
                System.out.println("Bullseye!");
                count=1;
            }
            else{
                System.out.println("Better luck next time");
                count=1;
            }
        }
    }

}