/* Nama File: Program.java
 * Deskripsi: Main class untuk mensimulasikan dan menguji seluruh layanan CRUD
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 19 Mei 2026*/

package jdbc.program;

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MySQLMahasiswaService;

public class Program {
    private static MySQLMahasiswaService service = new MySQLMahasiswaService();

    public static void main(String[] args) {
        System.out.println("");

        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate);
            service.update(mhsUpdate);
            displayAll();
        }

        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
              
    }

    private static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}