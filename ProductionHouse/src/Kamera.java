/* Nama File : Kamera.java
 * Deskripsi : Class konkrit untuk alat Kamera
 */

public class Kamera implements Peralatan {
    private String idKamera;
    private String merk;
    private double hargaSewa;
    private boolean isBagus;

    // Konstruktor
    public Kamera(String idKamera, String merk, double hargaSewa, boolean isBagus) {
        setIdKamera(idKamera);
        setMerk(merk);
        setHargaSewa(hargaSewa);
        setBagus(isBagus);
    }

    // Overriding dari Interface
    @Override
    public boolean cekKondisi() {
        return isBagus;
    }

    @Override
    public double getHargaSewa() {
        return hargaSewa;
    }

    // Selektor
    public String getIdKamera() { return idKamera; }
    public String getMerk() { return merk; }
    public boolean isBagus() { return isBagus; }

    // Mutator
    public void setIdKamera(String idKamera) { this.idKamera = idKamera; }
    public void setMerk(String merk) { this.merk = merk; }
    public void setHargaSewa(double hargaSewa) { this.hargaSewa = hargaSewa; }
    public void setBagus(boolean isBagus) { this.isBagus = isBagus; }
}