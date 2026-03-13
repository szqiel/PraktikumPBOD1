    /* Nama File: MBangunDatar.java
     * Deskripsi: Main class untuk menguji class Persegi dan Lingkaran
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 24 Februari 2026*/

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("\n Persegi");
        Persegi kotak = new Persegi(4, "Merah", "Solid");
        
        kotak.printInfo();
        System.out.println("Luas Persegi      : " + kotak.getLuas());
        System.out.println("Keliling Persegi  : " + kotak.getKeliling());
        System.out.println("Diagonal Persegi  : " + kotak.getDiagonal());


        System.out.println("\n Lingkaran");
        Lingkaran bundar = new Lingkaran(14, "Biru", "Solid");
        
        bundar.printInfo();
        System.out.println("Jari-jari Lingkaran : " + bundar.getJari());
        System.out.println("Luas Lingkaran      : " + bundar.getLuas());
        System.out.println("Keliling Lingkaran  : " + bundar.getKeliling());
        
        System.out.println("\n Setter");
        kotak.setSisi(10);
        kotak.setWarna("Kuning");
        System.out.println("Sisi persegi sekarang: " + kotak.getSisi());
        System.out.println("Warna persegi sekarang: " + kotak.getWarna());
        System.out.println("Luas persegi yang baru: " + kotak.getLuas());
    }
}