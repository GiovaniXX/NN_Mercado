package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public static Connection conectabanco() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nnmercado", "gvc", "123");
            JOptionPane.showMessageDialog(null, "Conectado ao SGBD NN_Mercado com sucesso!");
            return con;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
}
