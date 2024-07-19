import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
       String userName,password,resetChoice;

       Scanner inp=new Scanner(System.in);
       System.out.print("Kullanıcı adı giriniz: ");
       userName=inp.nextLine();

       String correctPassword = "java123"; // Doğru şifre
       System.out.print("Şifrenizi giriniz: ");
       password=inp.nextLine();

       if(userName.equals("patika") && password.equals(correctPassword)){
           System.out.println("Giriş Yaptınız!");
       }else {
           System.out.println("Bilgileriniz Yanlış!");
           System.out.println("Şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
           resetChoice=inp.nextLine();

           if (resetChoice.equals("evet")){
               boolean isPasswordSet = false;
               while (!isPasswordSet) {
                   System.out.print("Yeni şifrenizi giriniz: ");
                   String newPassword = inp.nextLine();

                   if (newPassword.equals("java123")) {
                       System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                   } else {
                      correctPassword=newPassword;
                       System.out.println("Şifre oluşturuldu.");
                       isPasswordSet = true;
                   }
               }
           } else {
               System.out.println("Şifre sıfırlanmadı.");
           }
       }

    }
       }
