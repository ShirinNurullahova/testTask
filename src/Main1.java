import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ci Reqemi daxil et: ");
        int number1 = scanner.nextInt();
        System.out.print("Üstü daxil et: ");
        int number2 = scanner.nextInt();
        powerMethod(number1, number2);
    }
    public static void powerMethod(int a, int b) {
        int power = 1;
           for(int i =0; i<b;i++){
               power*=a;
           }
        System.out.println(power);

    }

}
