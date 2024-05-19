package BankSystem.src;

import java.util.Scanner;
public class Bank {
     public static Scanner scanner = new Scanner(System.in);

     User[] users = new User[5];

     public void addUser(){
          boolean addedUser= true;
          while (addedUser) {
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
          User user = new User(userId,name,surname,email,pass);
          boolean hasEmpty = true;
          for(int i=0; i<users.length; i++){
               if(users[i]==null){
                    users[i]=user;
                    hasEmpty=false;
                    break;
               }
          }
          if(hasEmpty){
               User[] newUser = new User[users.length + 5];
               for(int i=0; i< users.length; i++){
                    newUser[i]= users[i];
               }
               int setToIndex= users.length;
               users= newUser;
               users[setToIndex]=user;
          }

          System.out.println("Yeniden davam etmek isteyirsiniz ? 1 or 2");
          int choise = scanner.nextInt();
          if(choise == 1){
               addedUser=false;
          }else if(choise ==2){
               System.exit(0);
          }
          }
     };


     public void updateUserById(int id, User newUser){
          for(int i=0; i< users.length;i++){
                if(users[i] != null && id == users[i].id){
                      users[i] = newUser;
                }
          }
     };

     public void removeUserById(){
          System.out.print("Unique id daxil edin: ");
          int uniqueId = scanner.nextInt();

          int indexForRemove = -1;
          for (int i = 0; i < users.length; i++) {
               if (users[i].id == uniqueId) {
                    indexForRemove = i;
                    break;
               }
          }
          if (indexForRemove != -1) {
               User[] newUsers = new User[users.length - 1];
               int j = 0;
               for (int i = 0; i < users.length; i++) {
                    if (i != indexForRemove) {
                         newUsers[j++] =users[i];
                    }
               }
               users = newUsers;
          }
     };


     public void getAllUser(){
          boolean isEmpty= true;
          for(User item: users){
              if(item !=null){
                   isEmpty=false;
              }
          }
          if(!isEmpty){
               System.out.println("Butun ishciler: ");
               for(User item: users){
                    if(item!=null){
                         System.out.println(item + "\n");
                    }
               }
          }else{
               System.out.println("Istifadeci yoxdur, zehmet olmazsa daxil et \n");
          }
     };

     public void getUserById(int id){
           for(User user: users){
                if(user !=null && id == user.id){
                     System.out.println(id+ " id-li user tapildi: " + user);
                     break;
                }
           }
     };
}
