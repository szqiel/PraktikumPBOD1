/* Nama File : Main.java
 * Deskripsi : Main Driver untuk Testing Seluruh Method Sistem Production House
 * Pembuat   : Syair Adharian (24060124140172)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      TESTING SISTEM PRODUCTION HOUSE DIMULAI     ");
        System.out.println("==================================================\n");

        try {
            // ---------------------------------------------------------
            // 1. TESTING KLIEN & OVERLOADING
            // ---------------------------------------------------------
            System.out.println(">>> 1. TESTING KLIEN (OVERLOADING & GETTER/SETTER)");
            Klien klien1 = new Klien("KLN01", "PT. Jaya Abadi", "08123456789"); // Konstruktor 1
            Klien klien2 = new Klien("KLN02", "CV. Makmur"); // Konstruktor 2 (Overloading)
            
            // Testing Mutator (Setter)
            klien1.setNamaKlien("PT. Jaya Abadi Sentosa");
            
            // Testing Selektor (Getter)
            System.out.println("Klien 1: " + klien1.getIdKlien() + " | " + klien1.getNamaKlien() + " | " + klien1.getKontak());
            System.out.println("Klien 2: " + klien2.getIdKlien() + " | " + klien2.getNamaKlien() + " | " + klien2.getKontak());
            System.out.println();

            // ---------------------------------------------------------
            // 2. TESTING PERALATAN & INTERFACE
            // ---------------------------------------------------------
            System.out.println(">>> 2. TESTING KAMERA (INTERFACE & GETTER/SETTER)");
            Kamera kamera1 = new Kamera("CAM01", "ARRI Alexa", 3000000, true);
            
            // Testing Mutator
            kamera1.setMerk("RED Komodo");
            kamera1.setHargaSewa(3500000);
            kamera1.setBagus(true);
            
            // Testing Selektor & Overriding Interface
            System.out.println("Alat: " + kamera1.getIdKamera() + " - " + kamera1.getMerk());
            System.out.println("Kondisi Bagus? " + kamera1.cekKondisi());
            System.out.println("Harga Sewa: Rp " + kamera1.getHargaSewa());
            System.out.println();

            // ---------------------------------------------------------
            // 3. TESTING PEKERJA & OVERRIDING
            // ---------------------------------------------------------
            System.out.println(">>> 3. TESTING KRU (INHERITANCE, OVERRIDING & GETTER/SETTER)");
            Sutradara sutradara = new Sutradara("KRU01", "Bong Joon-ho", 10000000, 5000000);
            Editor editor = new Editor("KRU02", "Syair", 7000000, 2000000);
            
            // Testing Mutator
            sutradara.setBonusProyek(6000000);
            editor.setSoftwareAndalan("Adobe Premiere & DaVinci Resolve");
            editor.setFeeTambahan(2500000);
            
            // Testing Selektor & Overriding
            System.out.println("Sutradara : " + sutradara.getNama() + " | Gaji Pokok: " + sutradara.getGajiPokok() + " | Bonus: " + sutradara.getBonusProyek());
            System.out.println("Total Gaji Sutradara: Rp " + sutradara.hitungGajiTotal()); // Overriding
            
            System.out.println("Editor    : " + editor.getNama() + " | Software: " + editor.getSoftwareAndalan() + " | Fee: " + editor.getFeeTambahan());
            System.out.println("Total Gaji Editor   : Rp " + editor.hitungGajiTotal()); // Overriding
            System.out.println();

            // ---------------------------------------------------------
            // 4. TESTING PROYEK FILM & AGREGASI/ASOSIASI
            // ---------------------------------------------------------
            System.out.println(">>> 4. TESTING PROYEK FILM (AGREGASI & GETTER/SETTER)");
            ProyekFilm proyek1 = new ProyekFilm("PRJ01", "Iklan Sirup", 5, klien1, kamera1);
            
            // Testing Mutator
            proyek1.setJudul("Iklan Sirup Marjan 2026");
            
            // Testing tambahKru (Agregasi)
            proyek1.tambahKru(sutradara);
            proyek1.tambahKru(editor);
            
            // Testing Selektor
            System.out.println("ID Proyek : " + proyek1.getIdProyek());
            System.out.println("Judul     : " + proyek1.getJudul());
            System.out.println("Durasi    : " + proyek1.getDurasiMenit() + " Menit");
            System.out.println("Klien Pemesan: " + proyek1.getKlien().getNamaKlien());
            System.out.println("Kamera yg Dipakai: " + ((Kamera) proyek1.getAlat()).getMerk());
            System.out.println("Jumlah Kru Terlibat: " + proyek1.getDaftarKru().size() + " Orang");
            System.out.println();

            // ---------------------------------------------------------
            // 5. TESTING INVOICE & ASSERTION
            // ---------------------------------------------------------
            System.out.println(">>> 5. TESTING INVOICE (KOMPOSISI & ASSERTION)");
            Invoice inv1 = new Invoice("INV/2026/001", proyek1);
            inv1.cetakTagihan(); // Menguji cetak dan perhitungan total
            System.out.println();

            // ---------------------------------------------------------
            // 6. TESTING EXCEPTION HANDLING 1 (GAJI NEGATIF)
            // ---------------------------------------------------------
            System.out.println(">>> 6. TESTING EXCEPTION 1 (Gaji Pokok Negatif)");
            try {
                System.out.println("Mencoba set gaji pokok Sutradara menjadi -500000...");
                sutradara.setGajiPokok(-500000);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR TERTANGKAP: " + e.getMessage());
            }
            System.out.println();

            // ---------------------------------------------------------
            // 7. TESTING EXCEPTION HANDLING 2 (DURASI NEGATIF/NOL)
            // ---------------------------------------------------------
            System.out.println(">>> 7. TESTING EXCEPTION 2 (Durasi Proyek Nol/Negatif)");
            try {
                System.out.println("Mencoba set durasi proyek menjadi 0 menit...");
                proyek1.setDurasiMenit(0);
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR TERTANGKAP: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Terjadi Error Sistem: " + e.getMessage());
        }
        
        System.out.println("\n==================================================");
        System.out.println("                 TESTING SELESAI                  ");
        System.out.println("==================================================");
    }
}