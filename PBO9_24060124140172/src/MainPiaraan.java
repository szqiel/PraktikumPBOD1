/* Nama File: MainPiaraan.java
 * Deskripsi: Aplikasi utama untuk menguji kelas Piaraan
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 11 Mei 2026*/

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();
        
        Kucing k1 = new Kucing("Mochi", 4.5);
        Anjing a1 = new Anjing("Hachiko");
        Kucing k2 = new Kucing("Boba", 5.2);
        Burung b1 = new Burung("Rio");

        klinik.enqueueAnabul(k1);
        klinik.enqueueAnabul(a1);
        klinik.enqueueAnabul(k2);
        klinik.enqueueAnabul(b1);

        System.out.println("Total antrean: " + klinik.getNbelm());
        
        System.out.println("\nDaftar Panggilan:");
        klinik.showAnabul();

        System.out.println("\nCek member Hachiko: " + klinik.isMember(a1));

        System.out.println("\nTotal keluarga kucing: " + klinik.countKucing());
        System.out.println("Total bobot kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\nDaftar Panggilan dan Jenis:");
        klinik.showJenisAnabul();

        Anabul diproses = klinik.dequeueAnabul();
        System.out.println("\nAnabul yang selesai diproses: " + diproses.getNama());
        
        System.out.println("Anabul antrean terdepan sekarang: " + klinik.getAnabul().getNama());
        
        System.out.println("\nSisa antrean:");
        klinik.showJenisAnabul();
    }
}