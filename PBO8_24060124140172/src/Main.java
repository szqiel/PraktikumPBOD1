/* Nama File: Main.java
 * Deskripsi: Class utama untuk menjalankan semua file dan fungsi generik
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Main {
    public static void main(String[] args) {
        System.out.println("=== I. ILUSTRASI GENERIK PADA CLASS (Datum) ===");
        Datum<Anabul> anabulDatum = new Datum<>(new Anjing("Hachiko"));
        System.out.print("Isi Datum saat ini: ");
        anabulDatum.getIsi().bersuara();

        anabulDatum.setIsi(new Kucing("Momo", 4.5));
        System.out.print("Isi Datum diubah jadi: ");
        anabulDatum.getIsi().bersuara();


        System.out.println("\n=== II. GENERIK PADA OPERATOR (Tukar & Bobot2) ===");
        OperatorGenerik op = new OperatorGenerik();

        Datum<Integer> aInt = new Datum<>(3);
        Datum<Integer> bInt = new Datum<>(6);
        System.out.println("Sebelum Tukar -> a: " + aInt.getIsi() + ", b: " + bInt.getIsi());
        op.Tukar(aInt, bInt);
        System.out.println("Setelah Tukar -> a: " + aInt.getIsi() + ", b: " + bInt.getIsi());

        Datum<String> aStr = new Datum<>("Kopi");
        Datum<String> bStr = new Datum<>("Susu");
        op.Tukar(aStr, bStr);
        System.out.println("Tukar String  -> a: " + aStr.getIsi() + ", b: " + bStr.getIsi());

        Datum<Anabul> aAnabul = new Datum<>(new Anjing("Doge"));
        Datum<Anabul> bAnabul = new Datum<>(new Anggora("Fluffy", 5.0));
        System.out.println("Sebelum Tukar Anabul -> a: " + aAnabul.getIsi().getNama() + " | b: " + bAnabul.getIsi().getNama());
        op.Tukar(aAnabul, bAnabul);
        System.out.println("Setelah Tukar Anabul -> a: " + aAnabul.getIsi().getNama() + " | b: " + bAnabul.getIsi().getNama());

        Anggora kucing1 = new Anggora("Ciko", 4.2);
        Kembangtelon kucing2 = new Kembangtelon("Oren", 5.5);
        System.out.println("Total Bobot Kucing : " + op.Bobot2(kucing1, kucing2) + " kg");


        System.out.println("\n=== III. LARIK GENERIK (Kelas Data) ===");
        Data<Anabul> kandang = new Data<>();
        
        kandang.setIsi(1, new Anjing("Spike"));
        kandang.setIsi(5, new Kucing("Tom", 3.8));
        kandang.setIsi(100, new Burung("Tweety"));

        System.out.println("Isi kandang no 1   :");
        kandang.getIsi(1).bersuara();
        
        System.out.println("Isi kandang no 5   :");
        kandang.getIsi(5).gerak();
        
        System.out.println("Isi kandang no 100 :");
        kandang.getIsi(100).bersuara();

        System.out.println("Total Anabul di dalam kandang (Size efektif): " + kandang.getSize());
    }
}