import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        System.out.print("Metin daxil edin");
        Scanner scanner = new Scanner(System.in);
        String metin = scanner.nextLine();
        if(metin.isEmpty()) System.out.println("Bosh deyil");;
        System.out.println(metin.length());
        System.out.println(metin.toLowerCase());
        System.out.println(metin.toUpperCase());
        System.out.println(metin.contains("Merhaba"));
        System.out.println(metin.substring(0,5)+" "+ metin.substring(metin.length()-5));
        String newWord= metin.substring(0,5)+" "+ metin.substring(metin.length()-5);

        System.out.println(newWord.concat("Heyy"));
        String newWord2 = newWord+ newWord;
        System.out.println(newWord2.replace("a", "e"));
        String newWord3 = newWord2.replace("a", "e");
        String newStr ="";
        enteredString(newWord3, newStr);

    }
    public static void enteredString(String newWord3, String newStr){
        for(int i=0; i<newWord3.length();i++){
            newStr+= newWord3.charAt(newWord3.length()-1-i);
        }
        String[] newStr1 = newStr.split(" ");
        for(var a : newStr1){
            System.out.println(a);
        }
        if(newStr1.equals(newWord3)){
            System.out.println("String palendromedir");

        }else {
            System.out.println("Palendrome deyil");
        }

    }
}
