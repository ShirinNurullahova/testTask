public class Human {


    public String name;
    public String surname;
    public byte age;
    public String city;
    public Human(String name, String surname, byte age, String city){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.city=city;
    }

    public  boolean isStudent() {
        return (age>18 && age<25);
    }
}
