

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        } else {
            return "Indeks tidak valid!";
        }
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
            System.out.println("Nama pada indeks " + indeks + " berhasil diubah menjadi " + nama);
        } else {
            System.out.println("Gagal setNama: Indeks tidak valid!");
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
            System.out.println(nama + " berhasil dihapus dari daftar.");
        } else {
            System.out.println(nama + " tidak ditemukan dalam daftar.");
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namabaru);
            System.out.println("Nama " + nama + " berhasil diganti menjadi " + namabaru);
        } else {
            System.out.println("Gagal gantiNama: Nama " + nama + " tidak ditemukan.");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("=== Daftar Nama Teman ===");
        if (nbelm == 0) {
            System.out.println("Daftar teman kosong.");
        } else {
            for (int i = 0; i < nbelm; i++) {
                System.out.println((i + 1) + ". " + Lnama.get(i));
            }
        }
        System.out.println("Total elemen (nbelm): " + nbelm);
        System.out.println("=========================\n");
    }
}