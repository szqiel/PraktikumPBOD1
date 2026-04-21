/* Nama File : ProyekFilm.java
 * Deskripsi : Class utama untuk manajemen proyek film
 */

import java.util.ArrayList;

public class ProyekFilm {
    private String idProyek;
    private String judul;
    private int durasiMenit;
    private Klien klien;
    private Peralatan alat;
    private ArrayList<Pekerja> daftarKru;

    // Konstruktor
    public ProyekFilm(String idProyek, String judul, int durasiMenit, Klien klien, Peralatan alat) {
        setIdProyek(idProyek);
        setJudul(judul);
        setDurasiMenit(durasiMenit); // Di sini Exception bisa kepanggil
        setKlien(klien);
        setAlat(alat);
        this.daftarKru = new ArrayList<>();
    }

    // Method untuk Agregasi Kru
    public void tambahKru(Pekerja kru) {
        if (kru != null) {
            daftarKru.add(kru);
        }
    }

    // Selektor
    public String getIdProyek() { return idProyek; }
    public String getJudul() { return judul; }
    public int getDurasiMenit() { return durasiMenit; }
    public Klien getKlien() { return klien; }
    public Peralatan getAlat() { return alat; }
    public ArrayList<Pekerja> getDaftarKru() { return daftarKru; }

    // Mutator
    public void setIdProyek(String idProyek) { this.idProyek = idProyek; }
    public void setJudul(String judul) { this.judul = judul; }
    public void setKlien(Klien klien) { this.klien = klien; }
    public void setAlat(Peralatan alat) { this.alat = alat; }

    // Exception Handling di Mutator
    public void setDurasiMenit(int durasiMenit) {
        if (durasiMenit <= 0) {
            throw new IllegalArgumentException("Durasi film tidak boleh nol atau negatif!");
        }
        this.durasiMenit = durasiMenit;
    }
}