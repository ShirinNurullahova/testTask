import java.awt.*;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("SurName");
        String surname = sc.nextLine();
        System.out.println("City");
        String city = sc.nextLine();
        System.out.println("Age");
        byte age = sc.nextByte();
        Human human = new Human(name,surname,age,city);
        System.out.println(human.isStudent());

        Human human1 = new Human("Shirin", "Nurullahova", (byte)25, "Baku");
        System.out.println(human1.isStudent());
        Human human2 = new Human("Shirin", "Nurullahova", (byte)26, "Baku");
        System.out.println(human2.isStudent());
        Human human3 = new Human("Shirin", "Nurullahova", (byte)21, "Qax");
        System.out.println(human3.isStudent());
        Human human4 = new Human("Shirin", "Nurullahova", (byte)28, "Baku");
        System.out.println(human4.isStudent());

        Human human5 = new Human("Shirin", "Nurullahova", (byte)29, "Baku");
        Human human6 = new Human("Shirin", "Nurullahova", (byte)30, "Baku");
        Human human7 = new Human("Shirin", "Nurullahova", (byte)31, "Baku");
        Human human8 = new Human("Shirin", "Nurullahova", (byte)32, "Baku");
        Human human9 = new Human("Shirin", "Nurullahova", (byte)33, "Baku");

        Human[] humans = new Human[]{human,human1,human2,human3,human4,human5, human6,human7,human8,human9};
        searchForIsStudentCity(humans);


    }

    public static void searchForIsStudentCity(Human[] humans){
        System.out.println("Sheher daxil et");
             Scanner scanner= new Scanner(System.in);
             String city = scanner.nextLine();

            for(Human human: humans){
               if(human.isStudent() && human.city.contains(city)){
                   System.out.println(human.city);
               }
            }
    }


}
