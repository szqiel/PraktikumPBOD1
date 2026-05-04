/* Nama File: Kembangtelon.java
 * Deskripsi: Class turunan Kucing untuk objek Kembangtelon
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " (Kembangtelon) bersuara : Meong barbar jalanan!");
    }
}