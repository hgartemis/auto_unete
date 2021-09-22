package com.belcorp.auto.database;

import java.sql.*;

public class JavaConnection {

    public static void main(String[] args) throws SQLException {
        String connectionURL = "jdbc:sqlserver://;servername=AWNTS74;databaseName=BelcorpPeru";
        String user = "usr_sb2";
        String password = "Belcorp2016";
        try {
            Connection connection = DriverManager.getConnection(connectionURL, user, password);
            Statement stmt = connection.createStatement();
            String SQL = "select * from [Unete].[CodigoVerificacionSolicitudPostulante] where numerodocumento = '72209877'";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString("NumeroDocumento"));
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión.");
            e.printStackTrace();
        }

    }

    public static Connection createConnection(String connectionURL, String userDatabase, String passwordDatabase) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(connectionURL, userDatabase, passwordDatabase);
            return connection;
        } catch (SQLException e) {
            System.out.println("Error de conexión.");
            e.printStackTrace();
            return null;
        }

    }
}
