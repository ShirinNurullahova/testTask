import java.sql.SQLOutput;
import java.util.Scanner;

public class Course {
    public static Scanner scanner = new Scanner(System.in);
    public String name;
    Student[] students = new Student[5];
    public void addStudent(){
        boolean addedStudent= true;
        while (addedStudent) {
            Student student = new Student();
            System.out.println("Ad daxil et");
            String ad = scanner.nextLine();
            System.out.println("Soyad daxil et");
            String soyad = scanner.nextLine();
            student.name = ad;
            student.Surname = soyad;
            System.out.println("0-Proqramlashrima, 1- Design, 2- SMM");
            int fieldInput = scanner.nextInt();
            Field[] array = Field.values();
            for (var field : array) {
                if (field.ordinal() == fieldInput) {
                   student.setField(field);
                }
            }
            if(student.field==null){
                System.out.println("Bele bir sahe yoxdur");
                break;
            }
            System.out.println(student);
            boolean hasEmpty = true;
            for(int i=0; i<students.length; i++){
                if(students[i]==null){
                    students[i]=student;
                    hasEmpty=false;
                    break;
                }
            }
            if(hasEmpty){
                Student[] newStudent = new Student[students.length + 5];
                for(int i=0; i< students.length; i++){
                    newStudent[i]= students[i];
                }
                int setToIndex= students.length;
                students= newStudent;
                students[setToIndex]=student;
            }

            System.out.println("Yeniden davam etmek isteyirsiniz ? 1 or 2");
            int choise = scanner.nextInt();
            if(choise == 1){
                addedStudent=false;
            }else if(choise ==2){
                System.exit(0);
            }
        }
    };
}
