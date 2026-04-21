    /* Nama File: Asersi1.java
     * Deskripsi: Program untuk menunjukan Asersi
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 21 April 2026*/
    
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}