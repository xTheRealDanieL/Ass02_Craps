import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        boolean game_on = false;
        String again = "";

        while(true)
        {
            while (!game_on)
            {
                int dice1 = 0;
                int dice2 = 0;
                int total = 0;
                int sum = 0;

                dice1 = rnd.nextInt(6) + 1;
                dice2 = rnd.nextInt(6) + 1;
                sum = dice1 + dice2;

                System.out.println("The first dice is " + dice1 + " and the second dice is " + dice2 + "; the sum equals " + sum);
                if (sum == 2 || sum == 3 || sum == 12) {
                    System.out.println("It's a CRAPS. You lost !");
                    break;
                } else if (sum == 7 || sum == 11) {
                    System.out.println("It's NATURAL. You win !");
                    break;
                } else {
                    System.out.println("The first point is " + sum);
                    total += sum;

                    dice1 = rnd.nextInt(6) + 1;
                    dice2 = rnd.nextInt(6) + 1;
                    sum = dice1 + dice2;

                    System.out.println("The first dice is " + dice1 + " and the second dice is " + dice2 + "; the sum equals " + sum);
                    if (sum == 7) {
                        System.out.println("The sum is " + sum + ". You lost !");
                        System.out.println("The total point is " + total);
                        break;
                    } else {
                        total += sum;
                        System.out.println("The total point is " + total);
                        break;
                    }
                }
            }
            System.out.print("Do you want to play again [Y/N] : ");
            if (in.hasNextLine())
            {
                again = in.nextLine();
                if (again.equalsIgnoreCase("n"))
                {
                    break;
                }
            }
        }
    }
}
