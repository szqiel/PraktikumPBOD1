/* Nama File: Kucing.java
 * Deskripsi: Class turunan Anabul untuk objek Kucing dengan atribut bobot
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot){
        setNama(nama);
        this.bobot = bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public double getBobot() {
        return this.bobot;
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " (Kucing) bergerak : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " (Kucing) bersuara : Meong!");
    }
}