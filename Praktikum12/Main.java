import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU LAYANAN KEMAHASISWAAN =====");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    queue.enqueue(new Mahasiswa(nama, nim, keperluan));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println(queue.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 4:
                    System.out.println(queue.isFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;
                case 5:
                    queue.tampilDepan();
                    break;
                case 6:
                    queue.tampilBelakang();
                    break;
                case 7:
                    queue.tampilJumlah();
                    break;
                case 8:
                    queue.kosongkan();
                    break;
                case 9:
                    queue.tampilkanSemua();
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
