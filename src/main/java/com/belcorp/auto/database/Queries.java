package com.belcorp.auto.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

    public static String getCodeValidation(Connection con, String document) throws SQLException {
        String codigo = "";
        Statement stmt = con.createStatement();
        String SQL = "select top 1 codigo from [Unete].[CodigoVerificacionSolicitudPostulante] where numerodocumento = '" + document + "'";
        ResultSet rs = stmt.executeQuery(SQL);

        while (rs.next()) {
            //System.out.println(rs.getString("codigo") );
            codigo = rs.getString("codigo");
        }

        return codigo;

    }

    public static String getCodeValidationByPhone(Connection con, String phone) throws SQLException {
        String codigo = "";
        Statement stmt = con.createStatement();
        String SQL = "select top 1 codigo from [Unete].[CodigoVerificacionSolicitudPostulante] where numerocelular = '" + phone + "'";
        ResultSet rs = stmt.executeQuery(SQL);

        while (rs.next()) {
            //System.out.println(rs.getString("codigo") );
            codigo = rs.getString("codigo");
        }
        return codigo;
    }
}
