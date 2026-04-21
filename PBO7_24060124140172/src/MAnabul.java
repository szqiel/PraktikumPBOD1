/* Nama File: MAnabul.java
 * Deskripsi: Program simulasi Anabul dengan Polimorfisme Inclusion
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 21 April 2026*/

class Anabul {
    protected String nama;
    public Anabul(String nama) { this.nama = nama; }
    public void gerak() { }
    public void bersuara() { }
}

class Kucing extends Anabul {
    public Kucing(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " bergerak melata"); }
    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Meong"); }
}

class Anjing extends Anabul {
    public Anjing(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " bergerak melata"); }
    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Guk-guk"); }
}

class Burung extends Anabul {
    public Burung(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " bergerak terbang"); }
    @Override
    public void bersuara() { System.out.println(nama + " bersuara: Cuit"); }
}

public class MAnabul {
    public static void main(String[] args) {
        Anabul peliharaan1 = new Kucing("Mochi");
        Anabul peliharaan2 = new Anjing("Hachiko");
        Anabul peliharaan3 = new Burung("Rio");

        peliharaan1.gerak(); peliharaan1.bersuara();
        peliharaan2.gerak(); peliharaan2.bersuara();
        peliharaan3.gerak(); peliharaan3.bersuara();
    }
}