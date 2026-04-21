    /* Nama File: MPegawai.java
     * Deskripsi: Main class untuk menguji class Pegawai
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 24 Februari 2026*/

public class MPegawai {
    public static void main(String[] args) {
        Tanggal tanggalSekarang = new Tanggal(10, 3, 2025);

        DosenTetap dt = new DosenTetap(
            "9545647548", 
            "78647324", 
            "Santoso", 
            new Tanggal(5, 5, 1990),
            new Tanggal(1, 1, 2015),
            5000000, 
            "Fakultas Sains dan Matematika"
        );
        
        System.out.println("DETAIL DOSEN TETAP");
        dt.printInfo(tanggalSekarang);

        DosenTamu dtamu = new DosenTamu(
            "1234567890", 
            "98765432", 
            "Hamdan", 
            new Tanggal(17, 8, 1985), 
            new Tanggal(1, 1, 2022), 
            4000000, 
            "Fakultas Teknik",
            new Tanggal(31, 12, 2025)
        );
        
        System.out.println("\nDETAIL DOSEN TAMU");
        dtamu.printInfo(tanggalSekarang);

        Tendik tendik = new Tendik(
            "1122334455", 
            "Ken", 
            new Tanggal(20, 10, 1995), 
            new Tanggal(1, 5, 2018), 
            3500000, 
            "Akademik"
        );
        
        System.out.println("\nDETAIL TENDIK");
        tendik.printInfo(tanggalSekarang);
    }
}