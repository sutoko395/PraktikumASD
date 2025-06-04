package Praktikum14;

public class BinaryTreeMain23 {
    public static void main(String[] args) {
        BinaryTree23 bst = new BinaryTree23();

        // Menambahkan data mahasiswa dengan method add biasa
        bst.add(new Mahasiswa23("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa23("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa23("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa23("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua Mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        // Menambahkan data baru dengan add biasa
        bst.add(new Mahasiswa23("244160231", "Devi", "A", 3.72));
        bst.add(new Mahasiswa23("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa23("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        // Coba menampilkan mahasiswa dengan IPK di atas 3.5
        System.out.println("\nMahasiswa dengan IPK di atas 3.5:");
        bst.tampilMahasiswaIPKdiAtas(3.5);

        // Menampilkan IPK minimum dan maksimum
        System.out.println("\nMahasiswa dengan IPK paling kecil:");
        bst.cariMinIPK();
        System.out.println("\nMahasiswa dengan IPK paling besar:");
        bst.cariMaxIPK();

        // Menghapus data
        System.out.println("\nPenghapusan data mahasiswa dengan IPK 3.57:");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan (in order traversal):");
        bst.traverseInOrder(bst.root);

        // Tambahkan data baru dengan cara rekursif
        System.out.println("\nMenambahkan mahasiswa baru secara rekursif:");
        bst.addRekursif(new Mahasiswa23("244160199", "Gilang", "D", 3.68));
        bst.traverseInOrder(bst.root);
    }
}
