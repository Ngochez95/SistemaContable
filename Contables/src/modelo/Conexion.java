package modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Conexion {

    private Connection conexion;
    private Statement stmt;
    private ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    protected final String usuario = "contador";
    protected final String clave = "12345";
    protected final String ip = "127.0.0.1";
    protected final String puerto = "5432";
    protected final String database = "contabilidad";

    public Conexion() {

        try {
            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

    }

    protected final Connection crearConexion() {

        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://"+ ip  +":" + puerto + "/" + database , usuario, clave);

            conexion.setAutoCommit(false);

            System.out.println("Conectado...");

        } catch (SQLException e) {

            e.printStackTrace();

            System.err.println("No conectado...");

        }
            return conexion;
    }

    protected final void cerrarConexion(Connection con) {

        if (con != null) {

            try {
                con.close();

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

    }

    protected ResultSet consultarDatos(Connection con, String sql) {

	try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            } catch (SQLException e) {

		e.printStackTrace();

            }

        return rs;

    }

    protected boolean actualizarDatos(Connection con, String sql) {

	boolean sw = false;

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0)

            sw = true;

        } catch (SQLException e) {

            e.printStackTrace();
            deshacerCambios(con);

        }

        return sw;

    }

    protected final void realizarCambios(Connection con) {

        try {

            con.commit();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    protected final void deshacerCambios(Connection con) {

	try {

            con.rollback();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
