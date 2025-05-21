public class Mahasiswa {
    String nama;
    String nim;
    String keperluan;

    public Mahasiswa(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }

    public void tampilkan() {
        System.out.println(nama + " - " + nim + " - " + keperluan);
    }
}
