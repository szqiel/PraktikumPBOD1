    /* Nama File: DosenTetap.java
     * Deskripsi: berisi atribut dan method dalam subclass DosenTetap
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 10 Maret 2026*/

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama, Tanggal tglLahir, Tanggal tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
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
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.getFormatTanggal());
        System.out.println("TMT             : " + tmt.getFormatTanggal());
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        
        int[] masaKerja = hitungMasaKerja(skrg);
        System.out.println("Masa Kerja      : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        
        Tanggal tglPensiun = hitungPensiun();
        System.out.println("Tanggal Pensiun : " + tglPensiun.getFormatTanggal());
        System.out.println("Gaji Pokok      : " + formatUang(gajiPokok));
        
        double tunjangan = 0.02 * masaKerja[0] * gajiPokok;
        System.out.println("Tunjangan       : 2% x " + masaKerja[0] + " x " + formatUang(gajiPokok) + " = " + formatUang(tunjangan));
    }
}