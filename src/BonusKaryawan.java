import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Menghitung bonus karyawan berdasarkan golongan dan masa kerja.
 * switch-case digunakan untuk nilai golongan, sedangkan if-else digunakan
 * untuk masa kerja karena kriterianya berbentuk rentang.
 */
public class BonusKaryawan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan gaji pokok (Rp): ");
            long gajiPokok = input.nextLong();

            /*
             * nextLong hanya membaca angka. Sisa karakter baris baru dibuang
             * agar nextLine berikutnya dapat membaca golongan dengan benar.
             */
            input.nextLine();

            System.out.print("Masukkan golongan (I/II/III/IV): ");
            String golongan = input.nextLine().trim().toUpperCase(Locale.ROOT);
            System.out.print("Masukkan masa kerja (tahun): ");
            int masaKerja = input.nextInt();

            if (gajiPokok < 0) {
                System.out.println("Gaji pokok tidak boleh negatif.");
                return;
            }

            // Persentase dasar ditentukan oleh golongan karyawan.
            int persentaseDasar;
            switch (golongan) {
                case "I":   persentaseDasar = 50; break;
                case "II":  persentaseDasar = 60; break;
                case "III": persentaseDasar = 70; break;
                case "IV":  persentaseDasar = 80; break;
                default:
                    System.out.println("Golongan tidak valid.");
                    return;
            }

            // Tambahan bonus ditentukan dari rentang masa kerja pada tabel modul.
            int tambahanPersen;
            if (masaKerja >= 0 && masaKerja <= 10) {
                tambahanPersen = 0;
            } else if (masaKerja >= 11 && masaKerja <= 20) {
                tambahanPersen = 10;
            } else if (masaKerja >= 21 && masaKerja <= 30) {
                tambahanPersen = 20;
            } else {
                System.out.println("Masa kerja di luar tabel (0-30 tahun).");
                return;
            }

            int persentaseBonus = persentaseDasar + tambahanPersen;
            long bonus = gajiPokok * persentaseBonus / 100;
            long totalPendapatan = gajiPokok + bonus;
            NumberFormat rupiah = NumberFormat.getIntegerInstance(
                    Locale.forLanguageTag("id-ID"));

            System.out.println("Golongan         : " + golongan);
            System.out.println("Masa kerja       : " + masaKerja + " tahun");
            System.out.println("Persentase bonus : " + persentaseBonus + "%");
            System.out.println("Bonus            : Rp" + rupiah.format(bonus));
            System.out.println("Gaji + bonus     : Rp" + rupiah.format(totalPendapatan));
        }
    }
}
