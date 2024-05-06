import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        String text = "a::b::c::d::e";
        enteredString(text);
    }
    public static void enteredString(String text){
        String[] newArr = text.split("::");

        for (String a : newArr)
            System.out.print(a);
    }
}
