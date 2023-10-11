import java.util.Scanner;

public class PajakPenghasilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah penghasilan dalam juta Rupiah
        System.out.print("Masukkan jumlah penghasilan (dalam juta Rupiah): ");
        double penghasilan = input.nextDouble();

        double besarPajak = 0;

        // Menghitung besaran pajak berdasarkan tabel yang diberikan
        if (penghasilan <= 50) {
            besarPajak = penghasilan * 0.05;
        } else if (penghasilan <= 250) {
            besarPajak = 50 * 0.05 + (penghasilan - 50) * 0.15;
        } else if (penghasilan <= 500) {
            besarPajak = 50 * 0.05 + 200 * 0.15 + (penghasilan - 250) * 0.25;
        } else {
            besarPajak = 50 * 0.05 + 200 * 0.15 + 250 * 0.25 + (penghasilan - 500) * 0.30;
        }

        double penghasilanBersih = penghasilan * 1e6 - besarPajak; // Konversi ke satuan Rupiah

        // Menampilkan hasil perhitungan
        System.out.println("Penghasilan kotor = " + penghasilan + " juta Rupiah");
        System.out.println("Pajak " + getBesaranPajak(penghasilan) + "% = Rp. " + (int) besarPajak);
        System.out.println("Penghasilan bersih = Rp. " + (int) penghasilanBersih);

        input.close();
    }

    // Fungsi untuk mendapatkan besaran pajak dalam persen
    private static int getBesaranPajak(double penghasilan) {
        if (penghasilan <= 50) {
            return 5;
        } else if (penghasilan <= 250) {
            return 15;
        } else if (penghasilan <= 500) {
            return 25;
        } else {
            return 30;
        }
    }
}
