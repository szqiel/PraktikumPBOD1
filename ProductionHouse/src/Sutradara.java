/* Nama File : Sutradara.java
 * Deskripsi : Subclass dari Pekerja khusus untuk Sutradara
 */

public class Sutradara extends Pekerja {
    private double bonusProyek;

    // Konstruktor
    public Sutradara(String idKru, String nama, double gajiPokok, double bonusProyek) {
        super(idKru, nama, gajiPokok);
        setBonusProyek(bonusProyek);
    }

    // Overriding
    @Override
    public double hitungGajiTotal() {
        return getGajiPokok() + bonusProyek;
    }

    // Selektor
    public double getBonusProyek() { return bonusProyek; }

    // Mutator
    public void setBonusProyek(double bonusProyek) { this.bonusProyek = bonusProyek; }
}