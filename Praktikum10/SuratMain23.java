import java.util.Scanner;

public class SuratMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat23 stack = new StackSurat23(10);
        int pilih;

        do {
            System.out.println("\n=== Sistem Pengajuan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat23 suratBaru = new Surat23(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil diterima!");
                    break;

                case 2:
                    Surat23 suratProses = stack.pop();
                    if (suratProses != null) {
                        System.out.println("Memproses surat:");
                        System.out.println("Nama: " + suratProses.namaMahasiswa);
                        System.out.println("Jenis: " + (suratProses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                    }
                    break;

                case 3:
                    Surat23 suratAktif = stack.peek();
                    if (suratAktif != null) {
                        System.out.println("Surat terakhir:");
                        System.out.println("ID: " + suratAktif.idSurat);
                        System.out.println("Nama: " + suratAktif.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Cari nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cariNama);
                    System.out.println(ditemukan ? "Surat ditemukan!" : "Surat tidak ditemukan");
                    break;
            }
        } while (pilih != 5);
        sc.close();
    }
}