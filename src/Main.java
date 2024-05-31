import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Course course = new Course();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSecim et");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    course.addStudent();
                    break;
            }
        }
    }


}