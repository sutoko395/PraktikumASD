public class SLLMain23 {
    public static void main(String[] args) {
      SingleLinkedList23 sll = new SingleLinkedList23();

      Mahasiswa23 mhs1 = new Mahasiswa23("21212203", "Dirga", "4D", 3.6);
      Mahasiswa23 mhs2 = new Mahasiswa23("22212202", "Cintia", "3C", 3.5);
      Mahasiswa23 mhs3 = new Mahasiswa23("23212201", "Bimon", "2B", 3.8);
      Mahasiswa23 mhs4 = new Mahasiswa23("24212200", "Alvaro", "1A", 4.0);

      sll.addFirst(mhs1);

      sll.addLast(mhs4);

      sll.insertAfter("Dirga", mhs3);
      sll.insertAt(1, mhs2);

      System.out.println("data index 1 : ");
      sll.getData(1);

      System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
      System.out.println();

      sll.removeFirst();
      sll.removeLast();
      sll.print();

      sll.removeAt(0);
      sll.print();
    }
  }