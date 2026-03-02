    /* Nama File: MGaris.java
     * Deskripsi: Main class untuk menguji class Garis
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 24 Februari 2026*/

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        
        Garis g1 = new Garis(t1, t2);
        
        g1.tampilkanTitik();
        System.out.println("Panjang Garis : " + g1.getPanjang());
        System.out.println("Gradien Garis : " + g1.getGradien());
        
        Titik tTengah = g1.getTitikTengah();
        System.out.println("Titik Tengah  : (" + tTengah.getAbsis() + ", " + tTengah.getOrdinat() + ")");
        
        g1.printPersamaanGaris();

        Garis g2 = new Garis(new Titik(0, 0), new Titik(2, 4));
        
        System.out.println("Apakah g1 sejajar g2? " + g1.isSejajar(g2));
        System.out.println("Apakah g1 tegak lurus g2? " + g1.isTegakLurus(g2));

        System.out.println("\nJumlah Garis yang dibuat: " + Garis.getCounterGaris());
    }
}