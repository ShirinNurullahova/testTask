import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Nece olculu array yaratmaq isteyirsiz: ");
        Scanner scanner = new Scanner(System.in);
        int arrLenght = scanner.nextInt();
        int[] arr = new int[arrLenght];
        for (int i = 0; i < arrLenght; i++) {
            System.out.print("Array elementini daxil edin: ");
            arr[i] = scanner.nextInt();
        }
        checkSingleOrOdd(arr);
    }
    public static void checkSingleOrOdd(int[] array) {
             int maxValue = array[0];
            for(int i =0; i<array.length; i++){
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
        if (maxValue % 2 == 0) {
            int factorial = 1;
            for (int i = 1; i <= maxValue; i++) {
                factorial = factorial*i;
            }
            System.out.println("Ededin faktoriali" + factorial);
        } else {
            System.out.println("Ededin ozu" + maxValue);
        }
    }

}