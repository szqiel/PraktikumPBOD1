public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi) {
        super(4, "Tidak ada", "Tidak ada");
        this.sisi = sisi;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    @Override
    public double getLuas() { return sisi * sisi; }

    @Override
    public double getKeliling() { return 4 * sisi; }

    @Override
    public void zoomIn() { sisi = sisi * 1.1; }

    @Override
    public void zoomOut() { sisi = sisi * 0.9; }

    @Override
    public void zoom(int percent) { sisi = sisi * (percent / 100.0); }
}