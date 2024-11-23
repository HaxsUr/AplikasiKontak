import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/kontakdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Daftar driver secara eksplisit (opsional untuk Java 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Membuka koneksi ke database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal: " + e.getMessage());
        }
        return connection;
    
    }

}
