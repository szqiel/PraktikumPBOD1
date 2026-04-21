/* Nama File : Klien.java
 * Deskripsi : Class untuk menyimpan data klien pemesan video
 */

public class Klien {
    private String idKlien;
    private String namaKlien;
    private String kontak;

    // Konstruktor Overloading 1
    public Klien(String idKlien, String namaKlien, String kontak) {
        setIdKlien(idKlien);
        setNamaKlien(namaKlien);
        setKontak(kontak);
    }

    // Konstruktor Overloading 2
    public Klien(String idKlien, String namaKlien) {
        this(idKlien, namaKlien, "Belum ada kontak");
    }

    // Selektor
    public String getIdKlien() { return idKlien; }
    public String getNamaKlien() { return namaKlien; }
    public String getKontak() { return kontak; }

    // Mutator
    public void setIdKlien(String idKlien) { this.idKlien = idKlien; }
    public void setNamaKlien(String namaKlien) { this.namaKlien = namaKlien; }
    public void setKontak(String kontak) { this.kontak = kontak; }
}