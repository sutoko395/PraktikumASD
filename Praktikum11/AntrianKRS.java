public class AntrianKRS {
    private MahasiswaPolinema[] data;
    private int front;
    private int rear;
    private int size;
    private final int max;
    private int totalDitangani;
    private final int MAX_DITANGANI = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaPolinema[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDitangani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void tambahAntrian(MahasiswaPolinema mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Maksimal 10 mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian");
    }

    public MahasiswaPolinema[] prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk diproses");
            return null;
        }
        
        MahasiswaPolinema[] hasil = new MahasiswaPolinema[2];
        hasil[0] = data[front];
        front = (front + 1) % max;
        size--;
        
        hasil[1] = data[front];
        front = (front + 1) % max;
        size--;
        
        totalDitangani += 2;
        return hasil;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa dalam antrian");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        System.out.print("1. ");
        data[front].tampilkanData();
        int next = (front + 1) % max;
        System.out.print("2. ");
        data[next].tampilkanData();
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Mahasiswa terakhir dalam antrian:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDitangani() {
        return totalDitangani;
    }

    public int getBelumDiproses() {
        return MAX_DITANGANI - totalDitangani;
    }
}