import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian Saat Ini");
            System.out.println("7. Jumlah yang Sudah Diproses");
            System.out.println("8. Jumlah yang Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    MahasiswaPolinema mhs = new MahasiswaPolinema(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                    
                case 2:
                MahasiswaPolinema[] diproses = antrian.prosesKRS();
                    if (diproses != null) {
                        System.out.println("Mahasiswa yang diproses:");
                        for (MahasiswaPolinema m : diproses) {
                            m.tampilkanData();
                        }
                    }
                    break;
                    
                case 3:
                    antrian.tampilkanSemua();
                    break;
                    
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
                    
                case 5:
                    antrian.lihatAkhir();
                    break;
                    
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                    
                case 7:
                    System.out.println("Total diproses: " + antrian.getTotalDitangani());
                    break;
                    
                case 8:
                    System.out.println("Belum diproses: " + antrian.getBelumDiproses());
                    break;
                    
                case 9:
                    antrian.clear();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}