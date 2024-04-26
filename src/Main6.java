import java.util.Random;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        guessNumber(randomNumber);
    }
    public static void guessNumber(int randomNumber) {
        boolean check = true;
        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir reqem texmin et: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Dogru tapdiniz");
                check = false;
            } else if (guess < randomNumber) {
                System.out.println("Biraz daha boyuk bir reqem daxil edin");
            } else {
                System.out.println("Biraz daha kicik bir reqem daxil edin");
            }
        }
    }
}
