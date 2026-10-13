# Praktikum Modul 12 — Switch-Case

Repository ini berisi program Java untuk laporan Praktikum Algoritma dan
Pemrograman Dasar Modul 12: *Pengambilan Keputusan (Percabangan) Bertingkat dan
Perintah Switch-Case*.

## Identitas

- Nama: Kanisius Wahyu Santoso
- NIM: 265314033
- Program Studi: Informatika, Universitas Sanata Dharma
- Tahun: 2026

## Daftar program

| Berkas | Keterangan |
| --- | --- |
| `SwitchDemo.java` | Menentukan nama bulan dengan `switch-case`. |
| `JumlahHariBulan.java` | Menentukan jumlah hari berdasarkan nomor bulan. |
| `PembelianKaos.java` | Menghitung total pembelian kaos berdasarkan ukuran. |
| `BonusKaryawan.java` | Menghitung bonus berdasarkan golongan dan masa kerja. |
| `HariBulanKabisat.java` | Eksplorasi jumlah hari dengan aturan tahun kabisat. |

## Persyaratan

- JDK 21 atau versi yang kompatibel
- Terminal atau IDE Java, misalnya IntelliJ IDEA

## Menjalankan program

Kompilasi seluruh program dari direktori utama repository:

```bash
javac -d out \
  src/SwitchDemo.java \
  src/JumlahHariBulan.java \
  src/PembelianKaos.java \
  src/BonusKaryawan.java \
  src/HariBulanKabisat.java
```

Jalankan salah satu program, misalnya:

```bash
java -cp out SwitchDemo
java -cp out JumlahHariBulan
java -cp out PembelianKaos
java -cp out BonusKaryawan
java -cp out HariBulanKabisat
```

Program yang membutuhkan data akan meminta masukan melalui papan ketik.

## Catatan

`JumlahHariBulan` selalu menetapkan Februari sebanyak 28 hari karena tidak
menerima masukan tahun. Perhitungan Februari yang mempertimbangkan tahun kabisat
tersedia pada `HariBulanKabisat` sebagai eksplorasi mandiri.
# modul-12-percabangan-switch-case
