import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Menghitung total pembayaran kaos berdasarkan ukuran dan jumlah pembelian.
 */
public class PembelianKaos {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan ukuran kaos (S/M/L/XL/XXL): ");

            /*
             * trim menghapus spasi yang tidak disengaja, sedangkan toUpperCase
             * membuat masukan huruf kecil seperti "xl" tetap dapat diproses.
             */
            String ukuran = input.nextLine().trim().toUpperCase(Locale.ROOT);

            System.out.print("Masukkan jumlah kaos: ");
            int jumlah = input.nextInt();

            if (jumlah <= 0) {
                System.out.println("Jumlah kaos harus lebih dari nol.");
                return;
            }

            // switch-case menentukan harga satuan berdasarkan ukuran kaos.
            long hargaSatuan;
            switch (ukuran) {
                case "S":   hargaSatuan = 30_000; break;
                case "M":   hargaSatuan = 38_000; break;
                case "L":   hargaSatuan = 45_000; break;
                case "XL":  hargaSatuan = 50_000; break;
                case "XXL": hargaSatuan = 60_000; break;
                default:
                    System.out.println("Ukuran tidak valid.");
                    return;
            }

            // Tipe long digunakan agar perhitungan nominal lebih aman dari overflow.
            long total = hargaSatuan * jumlah;
            NumberFormat rupiah = NumberFormat.getIntegerInstance(
                    Locale.forLanguageTag("id-ID"));

            System.out.println("Ukuran        : " + ukuran);
            System.out.println("Harga satuan  : Rp" + rupiah.format(hargaSatuan));
            System.out.println("Jumlah        : " + jumlah);
            System.out.println("Total bayar   : Rp" + rupiah.format(total));
        }
    }
}
