    /* Nama File: AngkaSialException.java
     * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 21 April 2026*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}