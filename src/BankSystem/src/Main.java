package BankSystem.src;

import java.util.Scanner;


public class Main {
    public static Bank bank = new Bank();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.println("\nSecim et");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    bank.getAllUser();
                    break;
                case 2:
                    System.out.println(" Id daxil et");
                    int id = scanner.nextInt();
                    bank.getUserById(id);
                    break;
                case 3:
                    bank.addUser();
                    break;
                case 4:
                    bank.removeUserById();
                    break;
                case 5:
                    System.out.println("Update Id daxil et");
                    int updateId = scanner.nextInt();
                    bank.updateUserById(updateId, updateItem());
                    break;
            }
        }

    }

    public static User updateItem() {
        System.out.println("Id daxil et");
        int userId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ad daxil et");
        String name = scanner.nextLine();
        System.out.println("Soyad daxil et");
        String surname = scanner.nextLine();
        System.out.println("Email daxil et");
        String email = scanner.nextLine();
        System.out.println("Password daxil et");
        String pass = scanner.nextLine();
        User user = new User(userId, name, surname, email, pass);
        return user;
    }


    public static void menu() {
        System.out.println("Bankdaki ishcileri gor");
        System.out.println("Bankdaki spesifik ishcini gor");
        System.out.println("Banka user elave et");
        System.out.println("User update et");
        System.out.println("Useri sil");
    }
}