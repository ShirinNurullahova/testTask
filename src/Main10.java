
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldStr = getWord(scanner);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(oldStr);
        String newStr = "";
        changeStr(newStr, oldStr);

    }
    public static void changeStr(String newStr,String oldStr) {
        for(int i=0; i<oldStr.length();i++){
            newStr+= oldStr.charAt(oldStr.length()-1-i);
        }
        isPalendrome(newStr, oldStr);
    }
    public static boolean isPalendrome(String newStr, String oldStr) {
        if(newStr.equals(oldStr)){
            System.out.println("String palendromedir");
            return true;
        }else {
            System.out.println("Palendrome deyil");
            return false;
        }
    }
    public static String getWord(Scanner sc){
        System.out.print("Soz daxil et: ");
        String oldStr = sc.nextLine();
        return oldStr;
    }
}