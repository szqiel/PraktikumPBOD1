    /* Nama File: Dosen.java
     * Deskripsi: berisi atribut dan method dalam subclass Dosen
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 10 Maret 2026*/


public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, Tanggal tglLahir, Tanggal tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
    
    @Override
    public void printInfo(Tanggal skrg) {
        super.printInfo(skrg);
        System.out.println("Fakultas        : " + fakultas);
    }
}
