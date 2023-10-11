import java.util.Scanner;

public class Ternary {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Masukkan jumlah penghasilan (dalam juta Rupiah): ");
  double penghasilan = input.nextDouble() * 1e6; // Konversi ke satuan Rupiah

  int besarPajak = (penghasilan <= 50e6) ? (int) (penghasilan * 0.05)
    : (penghasilan <= 250e6) ? (int) (50e6 * 0.05 + (penghasilan - 50e6) * 0.15)
      : (penghasilan <= 500e6) ? (int) (50e6 * 0.05 + 200e6 * 0.15 + (penghasilan - 250e6) * 0.25)
        : (int) (50e6 * 0.05 + 200e6 * 0.15 + 250e6 * 0.25 + (penghasilan - 500e6) * 0.30);

  int besaranPajak = (penghasilan <= 50e6) ? 5 : (penghasilan <= 250e6) ? 15 : (penghasilan <= 500e6) ? 25 : 30;

  int penghasilanBersih = (int) (penghasilan - besarPajak);

  System.out.println("Penghasilan kotor = " + (penghasilan / 1e6) + " juta Rupiah");
  System.out.println("Pajak " + besaranPajak + "% = Rp. " + besarPajak);
  System.out.println("Penghasilan bersih = Rp. " + penghasilanBersih);

  input.close();
 }
}
