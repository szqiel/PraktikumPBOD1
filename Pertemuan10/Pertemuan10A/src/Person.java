/* Nama File: Person.java
 * Deskripsi: Person database model dan serializable object
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 12 Mei 2026*/

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}