    /* Nama File: Titik.java
     * Deskripsi: berisi atribut dan method dalam class Titik
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 24 Februari 2026*/

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat, 2));
    }

    public void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    public void refleksiY() {
        this.absis = this.absis * -1;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, this.ordinat * -1);
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }

    public static int getCounterTitik() {
        return counterTitik;
    }
}
