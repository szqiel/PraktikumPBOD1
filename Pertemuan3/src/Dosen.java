    /* Nama File: Dosen.java
     * Deskripsi: berisi atribut dan method dalam class Dosen
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 3 Maret 2026*/

public class Dosen {
    
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
