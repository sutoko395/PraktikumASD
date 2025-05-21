public class StackSurat23 {
    int size;
    int top;
    Surat23[] data;

    public StackSurat23(int size) {
        this.size = size;
        data = new Surat23[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat23 surat) {
        if (!isFull()) {
            top++;
            data[top] = surat;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat23 pop() {
        if (!isEmpty()) {
            Surat23 temp = data[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat23 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println("ID: " + data[i].idSurat + 
                             ", Nama: " + data[i].namaMahasiswa + 
                             ", Jenis: " + (data[i].jenisIzin == 'S' ? "Sakit" : "Izin") + 
                             ", Durasi: " + data[i].durasi + " hari");
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}