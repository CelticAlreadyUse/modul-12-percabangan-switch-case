import java.util.Scanner;

/**
 * Eksplorasi mandiri untuk menentukan jumlah hari dengan memperhitungkan
 * tahun kabisat pada kalender Gregorian.
 */
public class HariBulanKabisat {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nomor bulan (1-12): ");
            int bulan = input.nextInt();
            System.out.print("Masukkan tahun: ");
            int tahun = input.nextInt();

            if (tahun <= 0) {
                System.out.println("Tahun harus lebih dari nol.");
                return;
            }

            int jumlahHari;
            switch (bulan) {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    jumlahHari = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    jumlahHari = 30;
                    break;
                case 2:
                    /*
                     * Tahun kabisat habis dibagi 400, atau habis dibagi 4 tetapi
                     * tidak habis dibagi 100. Contoh: 2000 kabisat, 1900 bukan.
                     */
                    boolean kabisat = (tahun % 400 == 0)
                            || (tahun % 4 == 0 && tahun % 100 != 0);
                    jumlahHari = kabisat ? 29 : 28;
                    break;
                default:
                    System.out.println("Bulan tidak valid.");
                    return;
            }

            System.out.printf("Bulan %d tahun %d memiliki %d hari.%n",
                    bulan, tahun, jumlahHari);
        }
    }
}
