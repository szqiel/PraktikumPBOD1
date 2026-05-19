/* Nama File: DAOManager.java
 * Deskripsi: Pengelola DAO dalam program
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 12 Mei 2026*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}