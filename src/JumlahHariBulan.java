import java.util.Scanner;

/**
 * Menentukan jumlah hari dalam suatu bulan berdasarkan nomor bulan.
 * Februari dianggap memiliki 28 hari karena program tidak meminta input tahun.
 */
public class JumlahHariBulan {
    public static void main(String[] args) {
        // try-with-resources menutup Scanner secara otomatis setelah digunakan.
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nomor bulan (1-12): ");
            int bulan = input.nextInt();
            int jumlahHari;

            /*
             * Beberapa label case digabungkan karena bulan-bulan tersebut
             * mempunyai jumlah hari yang sama.
             */
            switch (bulan) {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    jumlahHari = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    jumlahHari = 30;
                    break;
                case 2:
                    jumlahHari = 28;
                    break;
                default:
                    // Nilai di luar 1-12 bukan nomor bulan yang sah.
                    System.out.println("Bulan tidak valid. Masukkan angka 1-12.");
                    return;
            }

            System.out.printf("Jumlah hari pada bulan %d: %d hari%n",
                    bulan, jumlahHari);
        }
    }
}
