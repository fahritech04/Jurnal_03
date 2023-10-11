import java.util.Scanner;

public class CekKonsonanVokal {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Masukkan karakter huruf kecil: ");
  String karakter = input.next();

  if (karakter.length() == 1) {
   char huruf = karakter.charAt(0);
   if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
    System.out.println(huruf + " merupakan huruf vokal");
   } else if ((huruf >= 'a' && huruf <= 'z')
     && !(huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u')) {
    System.out.println(huruf + " merupakan huruf konsonan");
   } else {
    System.out.println("Karakter yang dimasukkan bukan huruf kecil");
   }
  } else {
   System.out.println("Masukkan hanya satu karakter huruf kecil.");
  }

  input.close();
 }
}
