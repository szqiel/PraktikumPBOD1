/* Nama File: Mahasiswa.java
 * Deskripsi: Kelas Mahasiswa dengan Polimorfisme Ad Hoc Overloading
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 21 April 2026*/

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String ps) {
        this.programStudi = ps;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void tampilData() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); 
        Mahasiswa m2 = new Mahasiswa(123, "Udin", "Informatika"); 
        Mahasiswa m3 = new Mahasiswa(m2); 
        
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        m1.setProgramStudi(); 
        m1.tampilData();

        m1.setProgramStudi("Sistem Informasi"); 
        m1.tampilData();

        m1.setProgramStudi(m2); 
        m1.tampilData();
    }
}