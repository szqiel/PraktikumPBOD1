    /* Nama File: Mahasiswa.java
     * Deskripsi: berisi atribut dan method dalam class Mahasiswa
     * Pembuat: Syair Adharian
     * NIM: 24060124140172
     * Tanggal: 3 Maret 2026*/

import java.util.ArrayList;

public class Mahasiswa {

    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int totalSks = 0;
        for (MataKuliah mk : listMatkul) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getnamaMatkul());
        }
        System.out.println("Dosen Wali :" + dosenWali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getJenis());
    }


}