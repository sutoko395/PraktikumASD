import Praktikum15.Node;

public class QueueLinkedList {
    Node front, rear;
    int size = 0;

    public QueueLinkedList() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(Mahasiswa mhs) {
        Node baru = new Node(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampilkan();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void tampilDepan() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampilkan();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilBelakang() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampilkan();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void kosongkan() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node current = front;
        System.out.println("Isi Antrian:");
        while (current != null) {
            current.data.tampilkan();
            current = current.next;
        }
    }
}
