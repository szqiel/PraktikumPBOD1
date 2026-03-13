    /* Nama File: Pegawai.java
     * Deskripsi: berisi atribut dan method dalam superclass Pegawai
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 10 Maret 2026*/


public class Pegawai {
    protected String nip;
    protected String nama;
    protected Tanggal tglLahir;
    protected Tanggal tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, Tanggal tglLahir, Tanggal tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String formatUang(double uang) {
        long nominal = (long) uang;
        String strUang = String.valueOf(nominal);
        String hasil = "";
        int hitung = 0;

        for (int i = strUang.length() - 1; i >= 0; i--) {
            hasil = strUang.charAt(i) + hasil;
            hitung++;
            if (hitung % 3 == 0 && i != 0) {
                hasil = "." + hasil;
            }
        }
        return "Rp " + hasil + ",00";
    }

    public int[] hitungMasaKerja(Tanggal skrg) {
        int tahun = skrg.getTahun() - tmt.getTahun();
        int bulan = skrg.getBulan() - tmt.getBulan();

        if (bulan < 0) {
            tahun--;
            bulan += 12;
        }

        if (skrg.getHari() < tmt.getHari()) {
            bulan--;
            if (bulan < 0) {
                tahun--;
                bulan += 12;
            }
        }
        return new int[] {
            tahun, bulan
        };
    }

    public void printInfo(Tanggal skrg) {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.getFormatTanggal());
        System.out.println("TMT             : " + tmt.getFormatTanggal());
        System.out.println("Gaji Pokok      : " + formatUang(gajiPokok));
    }
}

