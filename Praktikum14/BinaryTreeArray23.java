package Praktikum14;

public class BinaryTreeArray23 {
    Mahasiswa23[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray23() {
        this.dataMahasiswa = new Mahasiswa23[10]; // default kapasitas
        this.idxLast = -1;
    }

    void populateData(Mahasiswa23[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa23 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak dapat menambahkan data.");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
