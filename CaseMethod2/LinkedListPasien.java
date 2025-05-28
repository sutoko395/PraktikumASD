package CaseMethod2;
public class LinkedListPasien {
    Node head, tail;


    public void tambahPasien(Pasien p) {
        Node newNode = new Node(p);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Pasien layaniPasien() {
        if (head == null) {
            return null;
        }
        Pasien p = head.data;
        head = head.next;
        if (head == null) tail = null;
        return p;
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("-- Antrian Pasien --");
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            System.out.println("-- Antrian Pasien --");
            System.out.println("Antrian Pasien:");
            Node temp = head;
            while (temp != null) {
                Pasien p = temp.data;
                System.out.println("Nama pasien: " + p.nama);
                System.out.println("NIK: " + p.nik);
                System.out.println("Keluhan: " + p.keluhan);
                temp = temp.next;
            }
        }
    }

    public int hitungAntrian() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}