/* Nama File : Invoice.java
 * Deskripsi : Class untuk mencetak tagihan proyek (Komposisi dengan ProyekFilm)
 */

public class Invoice {
    private String noInvoice;
    private ProyekFilm proyek;
    private double totalTagihan;

    // Konstruktor
    public Invoice(String noInvoice, ProyekFilm proyek) {
        this.noInvoice = noInvoice;
        this.proyek = proyek;
        hitungTotal();
    }

    // Method hitung tagihan pake Assertion
    public void hitungTotal() {
        double total = 0;
        
        // Tambah biaya sewa alat
        total += proyek.getAlat().getHargaSewa();
        
        // Tambah gaji semua kru
        for (Pekerja kru : proyek.getDaftarKru()) {
            total += kru.hitungGajiTotal();
        }
        
        // Assertion: Total tagihan harus lebih dari 0
        assert total > 0 : "Fatal Error: Total tagihan tidak boleh nol atau minus!";
        
        this.totalTagihan = total;
    }

    // Method cetak struk
    public void cetakTagihan() {
        System.out.println("=========================================");
        System.out.println("          INVOICE PRODUCTION HOUSE       ");
        System.out.println("=========================================");
        System.out.println("No Invoice : " + noInvoice);
        System.out.println("Klien      : " + proyek.getKlien().getNamaKlien());
        System.out.println("Judul Film : " + proyek.getJudul() + " (" + proyek.getDurasiMenit() + " Menit)");
        System.out.println("-----------------------------------------");
        System.out.println("Total Tagihan : Rp " + totalTagihan);
        System.out.println("=========================================");
    }
}