package CaseMethod2;
public class QueueTransaksi {
    TransaksiLayanan[] data;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        data = new TransaksiLayanan[kapasitas];
        front = rear = -1;
        size = kapasitas;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void enqueue(TransaksiLayanan t) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = t;
    }

    public void tampilkanRiwayat() {
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (int i = front; i <= rear; i++) {
                data[i].tampilkan();
            }
        }
    }
}
