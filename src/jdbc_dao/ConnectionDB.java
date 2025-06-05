package jdbc_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private String user = "root";
    private String password = "localhost";
    private Connection conn;
    
    private String url = "jdbc:mysql://localhost:3306/casa_repouso_idosas_Recanto_Sagrado_Coracao?useSSL=false&serverTimezone=UTC";

    public ConnectionDB() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida com o banco: casa_repouso_idosas_Recanto_Sagrado_Coracao");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC do MySQL não encontrado", e);
        } catch (SQLException e) {
            throw new SQLException("Falha ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }

    public Connection getConnection() {
        return conn;
    }
}

