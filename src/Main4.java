import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        System.out.println(getFactorial(3));
    }

    public static int getFactorial(int number) {
        if(number==1 || number ==0){
            return 1;
        }
            return  number * getFactorial(number-1);

    }

}
