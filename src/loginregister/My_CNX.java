package loginregister;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
*
* @author USER
*/
public class My_CNX {
private static Connection konek;

public static Connection getKoneksi(){
//method ini berguna membuat koneksi ke MYSQL
if (konek == null) {
try {
String url = "jdbc:mysql://localhost:3306/test_java";
String username = "root";
String password = "";
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
konek = DriverManager.getConnection(url,username,password);
System.out.println("Koneksi berhasil");
} catch (SQLException e) {
System.out.println("Gagal membuat koneksi");
}
}
return konek;
}
}