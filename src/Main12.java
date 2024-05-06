import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        System.out.print("Nece olculu array yaratmaq isteyirsiz: ");
        Scanner scanner = new Scanner(System.in);
        int arrLenght = scanner.nextInt();
        System.out.println("Full name elave et");
        scanner.nextLine();
        String name = scanner.nextLine();
        String[] newName = new String[arrLenght];
        addedName(name, newName);
        System.out.print("Axtarish edin : ");
        String searchByText = scanner.nextLine();
        searchByText(searchByText,newName);
    }

    public static String[] addedName(String name, String[] newName) {
            for(int i=0; i<newName.length;i++){
                    newName[i]=name;
            }
           return newName;
    }
    public static void searchByText(String  searchByText, String[] newName) {
        String newName1="";
             for(int i=0; i< newName.length;i++){
                    if(newName[i].contains(searchByText)){
                        newName1=newName[i];
                        System.out.println(newName[i]);
                    }
             }
        System.out.println(newName1);
    }
}
