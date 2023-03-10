package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public static Connection conectabanco() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nnmercado", "root", "PerfectWorld2023@$");
            String message = "<html><font color='green'><b>Conectado ao Banco de Dados NN_Mercado.!</b></font></html>";
            JOptionPane.showMessageDialog(null, message, "Conexão bem sucedida", JOptionPane.INFORMATION_MESSAGE);
            return con;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver do banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar-se ao banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
