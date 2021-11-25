package data_base_conection;

import lombok.Setter;

import java.sql.*;

public class ConexaoBancoDados {
    private Connection conexao;

    @Setter
    private Statement statment;

    public Connection abrirConexaoComBanco() {
        final String url = "jdbc:postgresql://localhost:5432/srag_bd";
        final String usuario = "postgres";
        final String senha = "postgres";

        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        try {
            setStatment(conexao.createStatement());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexao;
    }

    public void desconectarBanco(){
        try {
            conexao.close();
        } catch (SQLException exception) {
           exception.printStackTrace();
        }
    }

    public ResultSet findByQuery(String query){
        try {
            return this.statment.executeQuery(query);
        }catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
