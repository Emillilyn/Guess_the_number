import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int won = 0, lost = 0, total_attempts = 0;

        for (int round = 1; round <= 3; round++) {
            System.out.println("=== Round " + round + " ===");
            int Secret_number = (int) (Math.random() * 20) + 1;
            int attempts = 0;
            boolean guessed_right = false;

            while (attempts < 5 && !guessed_right) {
                System.out.println("input number: ");
                int num = input.nextInt();
                attempts++;

                if (num < Secret_number) {
                    System.out.println("your number is lower than secret number.");
                } else if (num > Secret_number) {
                    System.out.println("your number is higher than secret number.");
                } else {
                    guessed_right = true;
                    System.out.println("Correct!! number of used attempts: " + attempts);
                }
            }
            if (guessed_right) {
                won++;
            } else {
                lost++;
                System.out.println("You have lost!! Secret number is: " + Secret_number);
            }
            total_attempts += attempts;
        }
        System.out.println("Won rounds: " + won);
        System.out.println("Lost rounds: " + lost);
        System.out.println("Total attempts: " + total_attempts);
    }
}