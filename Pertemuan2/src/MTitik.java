    /* Nama File: MTitik.java
     * Deskripsi: Main class untuk menguji class Titik
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 24 Februari 2026*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 5);

        T3.printTitik();
        T4.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        Titik T5 = new Titik(3, 4);
        Titik T6 = new Titik(-3, -4);

        System.out.println("T5 berada pada Kuadran: " + T5.getKuadran());

        System.out.println("Jarak T5 ke pusat: " + T5.getJarakPusat());
        System.out.println("Jarak T5 ke T6: " + T5.getJarak(T6));

        System.out.print("T5 sebelum refleksi Y: ");
        T5.printTitik();
        T5.refleksiY();
        System.out.print("T5 setelah refleksi Y: ");
        T5.printTitik();

        Titik T7 = T6.getRefleksiX();
        System.out.print("T6 asli: ");
        T6.printTitik();
        System.out.print("T7 (hasil getRefleksiX dari T6): ");
        T7.printTitik();
    }
}
