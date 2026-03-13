    /* Nama File: Tanggal.java
     * Deskripsi: berisi atribut dan method dalam class Tanggal
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 10 Maret 2026*/

public class Tanggal {
    private int hari;
    private int bulan;
    private int tahun;

    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getHari() { return hari; }
    public int getBulan() { return bulan; }
    public int getTahun() { return tahun; }

    public String getFormatTanggal() {
        String[] namaBulan = {
            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return hari + " " + namaBulan[bulan] + " " + tahun;
    }
}