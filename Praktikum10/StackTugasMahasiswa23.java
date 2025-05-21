public class StackTugasMahasiswa23 {
    Mahasiswa23[] stack;
    int top;
    int size;

    public StackTugasMahasiswa23(int size) {
        this.size = size;
        stack = new Mahasiswa23[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa23 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa23 pop() {
        if (!isEmpty()) {
            Mahasiswa23 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        System.out.println("Nama\tNIM\tKelas");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }

    public Mahasiswa23 peekBottom() {
        return isEmpty() ? null : stack[0];
    }

    public int getJumlahTugas() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi23 stack = new StackKonversi23();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        StringBuilder biner = new StringBuilder();
        while (!stack.isEmpty()) {
            biner.append(stack.pop());
        }
        return biner.toString();
    }
} 
