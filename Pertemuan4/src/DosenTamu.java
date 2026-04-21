    /* Nama File: DosenTamu.java
     * Deskripsi: berisi atribut dan method dalam subclass DosenTamu
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 10 Maret 2026*/

public class DosenTamu extends Dosen {
    private String nidk;
    private Tanggal tglBerakhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, Tanggal tglLahir, Tanggal tmt, double gajiPokok, String fakultas, Tanggal tglBerakhirKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    @Override
    public void printInfo(Tanggal skrg) {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.getFormatTanggal());
        System.out.println("TMT             : " + tmt.getFormatTanggal());
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        
        int[] masaKerja = hitungMasaKerja(skrg);
        System.out.println("Masa Kerja      : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        
        int selisihTahun = tglBerakhirKontrak.getTahun() - skrg.getTahun();
        int selisihBulan = tglBerakhirKontrak.getBulan() - skrg.getBulan();
        int totalSisaBulan = (selisihTahun * 12) + selisihBulan;
        
        System.out.println("Sisa Kontrak    : " + totalSisaBulan + " bulan (Berakhir: " + tglBerakhirKontrak.getFormatTanggal() + ")");
        System.out.println("Gaji Pokok      : " + formatUang(gajiPokok));
        
        double tunjangan = 0.025 * gajiPokok;
        System.out.println("Tunjangan       : 2.5% x " + formatUang(gajiPokok) + " = " + formatUang(tunjangan));
    }
}