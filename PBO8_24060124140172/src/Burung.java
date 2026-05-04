/* Nama File: Burung.java
 * Deskripsi: Class turunan Anabul untuk objek Burung
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Burung extends Anabul {
    public Burung(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " (Burung) bergerak : Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " (Burung) bersuara : Cuit cuit!");
    }
}