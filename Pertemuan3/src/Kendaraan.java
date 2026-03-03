    /* Nama File: Kendaraan.java
     * Deskripsi: berisi atribut dan method dalam class Kendaraan
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 3 Maret 2026*/

public class Kendaraan {
    
    private String noPlat;
    private String Jenis;

    public Kendaraan() {
        this.noPlat = "";
        this.Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
}
