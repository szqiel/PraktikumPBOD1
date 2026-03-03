    /* Nama File: MMahasiswa.java
     * Deskripsi: Main class untuk menguji class Mahasiswa
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 3 Maret 2026*/

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah Jarkom = new MataKuliah("Jarkom", "Jaringan Komputer", 3);
        MataKuliah GTI = new MataKuliah("GTI", "Grafika dan Teknik Interaktif", 3);
        MataKuliah ASA = new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3);
        MataKuliah AI = new MataKuliah("AI", "Artificial Intelligence", 3);

        Mahasiswa M1 = new Mahasiswa("156", "Syair", "Informatika");
        Dosen D1 = new Dosen("651", "Acin", "Informatika");
        Kendaraan K1 = new Kendaraan("B1001IR", "Mobil");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.addMatkul(Jarkom);
        M1.addMatkul(GTI);
        M1.addMatkul(ASA);
        M1.addMatkul(AI);
        
        M1.printDetailMhs();
        
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}