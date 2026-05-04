/* Nama File: Datum.java
 * Deskripsi: Class generik Datum untuk menyimpan satu elemen
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Datum<G> {
   private G isi;
   
   public Datum(G isi) {
       this.isi = isi;
   }

   public void setIsi(G isi){
       this.isi = isi;
   }
   
   public G getIsi(){
       return this.isi;
   }
}