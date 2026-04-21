/* Nama File : Editor.java
 * Deskripsi : Subclass dari Pekerja khusus untuk Editor
 */

public class Editor extends Pekerja {
    private String softwareAndalan;
    private double feeTambahan;

    // Konstruktor
    public Editor(String idKru, String nama, double gajiPokok, double feeTambahan) {
        super(idKru, nama, gajiPokok);
        setSoftwareAndalan("DaVinci Resolve"); 
        setFeeTambahan(feeTambahan);
    }

    // Overriding
    @Override
    public double hitungGajiTotal() {
        return getGajiPokok() + feeTambahan;
    }

    // Selektor
    public String getSoftwareAndalan() { return softwareAndalan; }
    public double getFeeTambahan() { return feeTambahan; }

    // Mutator
    public void setSoftwareAndalan(String softwareAndalan) { this.softwareAndalan = softwareAndalan; }
    public void setFeeTambahan(double feeTambahan) { this.feeTambahan = feeTambahan; }
}