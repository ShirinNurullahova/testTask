import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
       String[] arr= {"Shirin", "Hello"};
       checkChar(arr);
    }
     public static void checkChar(String[] arr){
            Scanner scanner= new Scanner(System.in);
            System.out.print("Char daxil et: ");
            String charEnter = scanner.nextLine();
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length(); j++){
                    if (arr[i].charAt(j) == charEnter.charAt(0)) {
                        System.out.println(arr[i]+ " dəyərində "+ j + " indexde tapildi");
                        break;
                    }
                }

            }

        }


}
