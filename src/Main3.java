import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        int balans = 100;
        toProcess(balans);
    }
    public static void menu() {
        System.out.print("Secim et");
        System.out.print("1. Depozit elave edin");
        System.out.print("2. Pul cekin");
        System.out.print("3. Balansa baxin");
    }
    public static int getChoise() {
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        return choise;
    }
    public static String getCurrency() {
      String currency = new Scanner(System.in).nextLine();
      return currency;
    }
    public static int getAmount() {
        int amount = new Scanner(System.in).nextInt();
        return amount;
    }

   public static void toProcess(int balans){
       int amount;
       String currency;
       menu();
       switch (getChoise()) {
           case 1:
               amount = getAmount();
               currency = getCurrency();
               if (currency.equals("usd")) {
                   balans += amount * 1.7;
               } else {
                   balans += amount;
               }
               System.out.println("Mebleg hesabiniza elave olundu");
               toProcess(balans);
           case 2:
               amount = getAmount();
               currency = getCurrency();
               if (currency.equals("usd")) {
                   balans -= amount * 1.7;
               } else {
                   balans -= amount;
               }
               System.out.println("Xeyirliye xercleyin");
               toProcess(balans);
           case 3:
               System.out.println(balans);
               toProcess(balans);
       }
   }
}
