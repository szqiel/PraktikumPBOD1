/* Nama File: Anjing.java
 * Deskripsi: Class turunan Anabul untuk objek Anjing
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Anjing extends Anabul {
    public Anjing(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " (Anjing) bergerak : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " (Anjing) bersuara : Guk-guk!");
    }
}