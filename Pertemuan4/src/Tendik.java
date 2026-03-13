    /* Nama File: Tendik.java
     * Deskripsi: berisi atribut dan method dalam subclass Tendik
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 10 Maret 2026*/

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, Tanggal tglLahir, Tanggal tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public Tanggal hitungPensiun() {
        int tahunPensiun = tglLahir.getTahun() + BUP;
        int bulanPensiun = tglLahir.getBulan() + 1;
        
        if (bulanPensiun > 12) {
            bulanPensiun = 1;
            tahunPensiun++;
        }
        return new Tanggal(1, bulanPensiun, tahunPensiun);
    }

    @Override
    public void printInfo(Tanggal skrg) {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.getFormatTanggal());
        System.out.println("TMT             : " + tmt.getFormatTanggal());
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        
        int[] masaKerja = hitungMasaKerja(skrg);
        System.out.println("Masa Kerja      : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        
        Tanggal tglPensiun = hitungPensiun();
        System.out.println("Tanggal Pensiun : " + tglPensiun.getFormatTanggal());
        System.out.println("Gaji Pokok      : " + formatUang(gajiPokok));
        
        double tunjangan = 0.01 * masaKerja[0] * gajiPokok;
        System.out.println("Tunjangan       : 1% x " + masaKerja[0] + " x " + formatUang(gajiPokok) + " = " + formatUang(tunjangan));
    }
}