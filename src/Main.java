import java.util.Scanner;
public class Main {
    static Book[] books= new Book[2];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       while(true){
           System.out.println("Secim et");
           System.out.println("1- butun kitablara bax");
           System.out.println("2- kitab elave et");
           System.out.println("3- Ada gore axtarish et");
           System.out.println("4- Qiymete gore axtarish et");
           int input = scanner.nextInt();
           scanner.nextLine();
           switch (input){
               case 1: getAllBooks();
                   break;
               case 2: addBooks();
               break;
               case 3: searchName();
               break;
               case 4: searchPrice();
           }
       }

    }

    public static void getAllBooks() {
                for(Book book: books){
                    if(book != null)
                    System.out.println("Kitabin adi "+ book.name+ "Qiymeti "+ book.price+ "Sayi "+ book.count);
                }
    }


    public static void addBooks() {
        boolean addedBook= true;

        while (addedBook){
            String bookName = scanner.nextLine();
            int price = scanner.nextInt();
            int count = scanner.nextInt();

            Book book = new Book(bookName, price,count);
            boolean hasEmpty = true;
            for(int i=0; i<books.length; i++){
                if(books[i]==null){
                    books[i]=book;
                    hasEmpty=false;
                }
            }
            if(hasEmpty){
                Book[] newBook = new Book[books.length * 2];
                for(int i=0; i< books.length; i++){
                    newBook[i]= books[i];
                }
                int setToIndex= books.length;
                books= newBook;
                books[setToIndex]=book;

            }

            System.out.println("Yeniden davam etmek isteyirsiniz ? 1 or 2");
            int choise = scanner.nextInt();
            if(choise == 1){
                addedBook=false;
            }else if(choise ==2){
                System.exit(0);
            }
        }


    }

    public static void searchName() {
        String name = scanner.nextLine();
        for (Book book : books) {
            if (book != null && name.equals(book.name)) {
                System.out.println("Tapilan kitab: " + book.name + " qiymeti: " + book.price + " sayi: " + book.count);
                return;
            }
        }
    }
    public static void searchPrice() {
        System.out.println("Max price daxil et");
        System.out.println("Min price daxil et");
         int max1 = scanner.nextInt();
         int min1 = scanner.nextInt();
        for (Book book : books) {
            if (book != null && book.price >= min1 && book.price <= max1) {
                System.out.println("Tapilan kitab: " + book.name + " qiymeti: " + book.price + " sayi: " + book.count);
                return;
            }
        }
    }

}