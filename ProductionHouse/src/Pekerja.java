/* Nama File : Pekerja.java
 * Deskripsi : Abstract Class untuk data kru / pekerja film
 */

public abstract class Pekerja {
    protected String idKru;
    protected String nama;
    protected double gajiPokok;

    // Konstruktor
    public Pekerja(String idKru, String nama, double gajiPokok) {
        setIdKru(idKru);
        setNama(nama);
        setGajiPokok(gajiPokok);
    }

    // Abstract Method
    public abstract double hitungGajiTotal();

    // Selektor
    public String getNama() { return nama; }
    public String getIdKru() { return idKru; }
    public double getGajiPokok() { return gajiPokok; }

    // Mutator
    public void setIdKru(String idKru) { this.idKru = idKru; }
    public void setNama(String nama) { this.nama = nama; }
    
    // Exception Handling
    public void setGajiPokok(double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji pokok tidak boleh negatif!");
        }
        this.gajiPokok = gaji;
    }
}