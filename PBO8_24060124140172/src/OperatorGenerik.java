/* Nama File: OperatorGenerik.java
 * Deskripsi: Class berisi method generik Tukar dan Bobot2
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class OperatorGenerik {
    
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}