package CaseMethod2;
public class TransaksiLayanan {

    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien ps, Dokter dt, int dl) {
        ps = pasien;
        dt = dokter;
        dl = durasiLayanan;
        biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }

    public void tampilkan() {
        System.out.println(pasien.nama + " (" + durasiLayanan + " jam): Rp " + biaya);
    }
}
