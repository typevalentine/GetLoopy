import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int die1, die2, die3 = 0;
        int dieRoll = 0;
        int dieSum = 0;
        String playAgain = "";
        boolean done = true;

        System.out.println("Roll #\tDie1\tDie2\tDie3\tSum");
        System.out.println("------------------------------------");
        do {
            do {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieRoll++;
                dieSum = die1 + die2 + die3;

                System.out.printf("%6d\t%4d\t%4d\t%4d\t%4d\n", dieRoll, die1, die2, die3, dieSum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Do you want to play again?: [YN]");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
            } else {
                done = true;
            }
        } while (!done);
    }
}

