import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // Membaca input nilai dari D, R, dan I
  int D = input.nextInt();
  int R = input.nextInt();
  int I = input.nextInt();

  // Membuat array untuk menyimpan nama pemilik dan nilai mereka
  String[] names = { "Dira", "Radi", "Idar" };
  int[] values = { D, R, I };

  // Mengurutkan nama dan nilai dalam urutan ascending
  for (int i = 0; i < 2; i++) {
   for (int j = 0; j < 2 - i; j++) {
    if (values[j] > values[j + 1]) {
     // Menukar nama
     String tempName = names[j];
     names[j] = names[j + 1];
     names[j + 1] = tempName;
     // Menukar nilai
     int tempValue = values[j];
     values[j] = values[j + 1];
     values[j + 1] = tempValue;
    }
   }
  }

  // Mencetak nama pemilik dengan nilai terendah hingga tertinggi
  for (int i = 0; i < 3; i++) {
   System.out.print(names[i]);
   if (i < 2) {
    System.out.print(", ");
   }
  }

  input.close();
 }
}
