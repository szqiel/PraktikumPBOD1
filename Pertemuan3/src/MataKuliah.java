    /* Nama File: MataKuliah.java
     * Deskripsi: berisi atribut dan method dalam class MataKuliah
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 3 Maret 2026*/

public class MataKuliah {
    
    private String idMatKul;
    private String namaMatkul;
    private int sks;

    public MataKuliah() {
        this.idMatKul = "";
        this.namaMatkul = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String namaMatkul, int sks) {
        this.idMatKul = idMatKul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public String getidMatKul() {
        return idMatKul;
    }

    public void setidMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public String getnamaMatkul() {
        return namaMatkul;
    }

    public void setnamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
