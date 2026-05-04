/* Nama File: Anggora.java
 * Deskripsi: Class turunan Kucing untuk objek Anggora
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " (Anggora) bersuara : Meong khas Anggora yang lembut~");
    }
}