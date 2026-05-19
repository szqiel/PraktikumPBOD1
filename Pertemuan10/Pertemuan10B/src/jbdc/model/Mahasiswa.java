/* Nama File: Mahasiswa.java
 * Deskripsi: Kelas model objek persisten untuk representasi tabel mahasiswa
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 19 Mei 2026*/

package jdbc.model;

public class Mahasiswa {
    private int id;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa(id=" + id + ", nama=" + nama + ")";
    }
}