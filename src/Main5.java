import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Reqem daxil et: ");
        int number = scanner.nextInt();
        System.out.println(getPalendrome(number));
    }

    public static boolean getPalendrome(int number) {

               int result =number;
               int reversenum=0;
               while(result>0){
                   int lastnum= result%10;
                   reversenum=reversenum*10+ lastnum;
                   result/=10;

               }
              return result==number;

    }



}
