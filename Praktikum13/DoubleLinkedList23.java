package Praktikum13;

public class DoubleLinkedList23 {
    Node23 head;
    Node23 tail;
    private int size;

    public DoubleLinkedList23() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa23 data) {
        Node23 newNode = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa23 data) {
        Node23 newNode = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa23 data) {
        Node23 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node23 newNode = new Node23(data);

        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus");
            return;
        }
        Mahasiswa23 deletedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus");
            return;
        }
        
        Mahasiswa23 deletedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus. Data yang terhapus adalah:");
        deletedData.tampil();
    }

    public Node23 search(String nim) {
        Node23 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Warning: Linked list masih kosong!");
            return;
        }
    
    Node23 current = head;
        System.out.println("Daftar Mahasiswa:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
            }
    }


    // 1. Method add() untuk menambahkan node pada indeks tertentu
    public void add(Mahasiswa23 data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node23 newNode = new Node23(data);
            Node23 current = head;
            
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }    
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    // 2. Method removeAfter() untuk menghapus node setelah data key
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
            return;
        }
        Node23 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }
        Node23 toRemove = current.next;
        if (toRemove == tail) {
            removeLast();
        } else {
            current.next = toRemove.next;
            toRemove.next.prev = current;
            size--;
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
            toRemove.data.tampil();
        }
    }

    // 3. Method remove() untuk menghapus node pada indeks tertentu
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node23 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }  
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada indeks " + index + " berhasil dihapus:");
            current.data.tampil();
        }
    }

    // 4. Method getFirst(), getLast(), dan getIndex()
    public Mahasiswa23 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
            return null;
        }
        return head.data;
    }
    public Mahasiswa23 getLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
            return null;
        }
        return tail.data;
    }
    public Mahasiswa23 getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return null;
        }
        Node23 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // 5. Method untuk mendapatkan size
    public int size() {
        return size;
    }
}    
