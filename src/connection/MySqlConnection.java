package connection;

import java.sql.*;

public class MySqlConnection {

    public Connection conn = null;

    public static Connection ConnectDB() {
        String user = "root";
        String pass = "";

        try {
            jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC

//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/posworld?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", user, pass);

            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
