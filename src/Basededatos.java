import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Basededatos {

    public class DatabaseManager {

        private static final String DB_URL = "jdbc:mysql://localhost:3306/tu_basededatos";
        private static final String DB_USER = "tu_usuario";
        private static final String DB_PASSWORD = "tu_contraseña";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }

        public static ResultSet executeQuery(String query) throws SQLException {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            return statement.executeQuery();
        }


    }

}
