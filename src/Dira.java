import java.util.Scanner;

public class Dira {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // Membaca input nilai dari D, R, dan I
  int D = input.nextInt();
  int R = input.nextInt();
  int I = input.nextInt();

  // Mencari nilai terendah
  int minValue = Math.min(D, Math.min(R, I));

  // Mencetak nama pemilik dengan nilai terendah
  if (minValue == D) {
   System.out.println("Dira");
  } else if (minValue == R) {
   System.out.println("Radi");
  } else {
   System.out.println("Idar");
  }

  input.close();
 }
}
