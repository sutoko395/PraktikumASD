package CaseMethod2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPasien antrian = new LinkedListPasien();
        QueueTransaksi riwayat = new QueueTransaksi(100);

        int pilihan;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK: ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = sc.nextLine();
                    antrian.tambahPasien(new Pasien(nama, nik, keluhan));
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    Pasien pasienDilayani = antrian.layaniPasien();
                    if (pasienDilayani == null) {
                        System.out.println("Tidak ada pasien yang bisa dilayani.");
                    } else {
                        System.out.println("Pasien " + pasienDilayani.nama + " dipanggil");
                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = sc.nextLine();
                        Dokter dokter = new Dokter(idDokter, namaDokter);
                        System.out.print("Masukkan Durasi Layanan (jam): ");
                        int jam = sc.nextInt();
                        sc.nextLine();
                        riwayat.enqueue(new TransaksiLayanan(pasienDilayani, dokter, jam));
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                    }
                    break;

                case 4:
                    int sisa = antrian.hitungAntrian();
                    System.out.println(">> Sisa pasien dalam antrian: " + sisa);
                    break;

                case 5:
                    riwayat.tampilkanRiwayat();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
        sc.close();
    }
}
