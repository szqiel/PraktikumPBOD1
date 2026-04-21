/* Nama File: MSeminar.java
 * Deskripsi: Program simulasi Seminar dengan Polimorfisme Inclusion
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 21 April 2026*/

abstract class CivitasAkademika {
    protected String nama;
    public CivitasAkademika(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    public abstract String getNomor();
}

class Dosen extends CivitasAkademika {
    private String nip;
    public Dosen(String nama, String nip) { super(nama); this.nip = nip; }
    @Override
    public String getNomor() { return nip; }
}

class MahasiswaPeserta extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;
    public MahasiswaPeserta(String nama, String nim) { super(nama); this.nim = nim; }
    @Override
    public String getNomor() { return nim; }
    public void setWali(Dosen d) { this.dosenWali = d; }
    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Belum diset";
        System.out.println(nim + " | " + nama + " | Wali: " + namaWali);
    }
}

class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        }
    }

    public int countPeserta() { return banyakPeserta; }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaPeserta) {
                count++;
            }
        }
        return count;
    }
}

public class MSeminar {
    public static void main(String[] args) {
        Seminar sem = new Seminar();

        Dosen d1 = new Dosen("Pak Budi", "19800101");
        Dosen d2 = new Dosen("Bu Ani", "19850202");

        MahasiswaPeserta m1 = new MahasiswaPeserta("Andi", "240601");
        MahasiswaPeserta m2 = new MahasiswaPeserta("Siti", "240602");
        MahasiswaPeserta m3 = new MahasiswaPeserta("Joko", "240603");
        MahasiswaPeserta m4 = new MahasiswaPeserta("Rina", "240604");
        MahasiswaPeserta m5 = new MahasiswaPeserta("Bagus", "240605");

        m1.setWali(d1);
        m2.setWali(d2);

        sem.registrasi(d1); sem.registrasi(d2);
        sem.registrasi(m1); sem.registrasi(m2); sem.registrasi(m3);
        sem.registrasi(m4); sem.registrasi(m5);

        sem.tampilPeserta();

        System.out.println(sem.countPeserta());
        System.out.println(sem.countMahasiswa());

        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}