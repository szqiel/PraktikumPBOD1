/* Nama File: Kucing.java
 * Deskripsi: Class turunan Anabul untuk objek Kucing
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 11 Mei 2026*/

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        setNama(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return this.bobot;
    }
}