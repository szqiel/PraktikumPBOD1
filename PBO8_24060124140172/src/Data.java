/* Nama File: Data.java
 * Deskripsi: Class generik Data dengan array statik 100 elemen
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 4 Mei 2026*/

public class Data<T> {
    private Object[] ruang;
    private int banyak;

    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                banyak++;
            }
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi tidak valid! Harus antara 1 - 100.");
        }
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return (T) ruang[posisi - 1];
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}