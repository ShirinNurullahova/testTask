import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String element = getString(sc);
        enteredString(element);
    }
    public static void enteredString(String a){
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append(a);
         String newText = "";
        for(int i =0; i<stringBuilder.length();i++){
           newText+= stringBuilder.charAt(stringBuilder.length()-i-1);
        }
        System.out.print( newText);
    }
    public static String getString(Scanner sc){
        System.out.print("Soz daxil et: ");
        String element = sc.nextLine();
        return element;
    }
}
