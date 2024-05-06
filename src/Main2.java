import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        boolean isContunio = true;
        while(isContunio){
            System.out.print("Methodlar: 1. Add, 2. Subtract, 3. Multiply, 4. Divide ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("1 ci Methodu daxil et: ");
            int method1 = scanner.nextInt();
            System.out.print("1 ci Reqemi daxil et: ");
            int number1 = scanner.nextInt();
            System.out.print("2 ci Reqemi daxil et: ");
            int number2 = scanner.nextInt();
            int result = 0;
            switch (method1) {
                case 1:
                    result = add(number1, number2);
                    break;
                case 2:
                    result = subtract(number1 ,number2);
                    break;
                case 3:
                    result = multiply(number1,number2);
                    break;
                case 4:
                    result = divide(number1, number2);
                    break;
                default:
                    System.out.println("Dogru method daxil edin");
                    return;
            }
            System.out.print(result);
            do {
                System.out.print("  Davam etmek isteyirsiniz: 1 or 2  ");
                int chose = scanner.nextInt();
                if(chose==1){
                    isContunio= true;
                    break;
                }else if(chose==2){
                    isContunio=false;
                    break;
                }else{
                    System.out.println("Duzgun reqem daxil edin");
                }
            }while (true);

        }
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
            return a / b;
    }
}
