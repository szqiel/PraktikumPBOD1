/* Nama File: MySQLPersonDAO.java
 * Deskripsi: Implementasi PersonDAO untuk MySQL
 * Pembuat: Syair Adharian
 * NIM: 24060124140172
 * Tanggal: 12 Mei 2026*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "");
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}