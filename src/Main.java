import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad daxil edin: ");
        String name = scanner.nextLine();
        System.out.print("Pul daxil edin: ");
        int money = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ikicinin adini daxil edin: ");
        String name1 = scanner1.nextLine();
        System.out.print("Ikincinin balansini daxil edin: ");
        int money1 = scanner1.nextInt();
        while (true) {
            System.out.println("Emeliyyat seçin: ");
            System.out.println("1) " + name + " -> " + name1+ "ya" + " pul göndər");
            System.out.println("2) " + name1 + " -> " + name +"e"+ " pul göndər");
            System.out.println("3) Prosesi bitir");
            System.out.print("Emeliyyat daxil edin: ");
            int shert = scanner.nextInt();
            switch (shert) {
                case 1:
                    System.out.print("Gonderilecek pulu sec ");
                    int miqdar = scanner.nextInt();
                    if (money >= miqdar) {
                        money -= miqdar;
                        money1 += miqdar;
                        System.out.println(miqdar + " pul " + name1 + " gonderildi");
                        System.out.println("Pulu bu qederdir " + money1);
                    } else {
                        System.out.println("Balansda pul yoxdu");
                    }
                    break;
                case 2:
                    System.out.print("Gonderilecek pulu sec: ");
                    int miqdar1 = scanner.nextInt();
                    if (money1 >= miqdar1) {
                        money1 -= miqdar1;
                        money += miqdar1;
                        System.out.println(miqdar1 + " pul " + name + " gonderildi");
                        System.out.println("Pulu bu qederdir " + money);
                    } else {
                        System.out.println("Balansda pul yoxdu");
                    }
                    break;
                case 3:
                    System.out.println("Proses bitdi");
                    System.exit(0);
            }
        }
    }
}
