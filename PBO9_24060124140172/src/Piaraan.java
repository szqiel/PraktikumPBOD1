/* Nama File: Piaraan.java
 * Deskripsi: Kelas Piaraan untuk antrean objek Anabul di klinik
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 11 Mei 2026*/

import java.util.ArrayList;
import java.util.List;

public class Piaraan {
    private int nbelm;
    private List<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        if (nbelm > 0) {
            return Lanabul.get(0);
        }
        return null;
    }

    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            nbelm--;
            return Lanabul.remove(0);
        }
        return null;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " - " + a.getClass().getSimpleName());
        }
    }
}