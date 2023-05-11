package DAO;

import java.sql.*;
import javax.swing.JLabel;
import javax.swing.Timer;

public class ConectaBanco {

    public static Connection conectabanco(JLabel lbl_StatusConnexao) throws ClassNotFoundException, SQLException, InterruptedException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nnmercado", "root", "PerfectWorld2023@$");
            String message = "<html><font color='green'><b>Conectado ao Banco de Dados...</b></font></html>";
            //Thread.sleep(2000);
            Timer timer = new Timer(2000, e -> lbl_StatusConnexao.setText(message)); // esperar 2000ms (2 segundos) e depois atualizar a mensagem
            timer.setRepeats(false); // atualizar a mensagem apenas uma vez
            timer.start(); // iniciar o temporizador
            lbl_StatusConnexao.setText(message);
            return con;
        } catch (ClassNotFoundException e) {
            String message = "<html><font color='red'><b>Erro ao carregar o driver do banco de dados: " + e.getMessage() + "</b></font></html>";
            lbl_StatusConnexao.setText(message);
            throw e;
        } catch (SQLException e) {
            String message = "<html><font color='red'><b>Erro ao conectar ao banco de dados: " + e.getMessage() + "</b></font></html>";
            lbl_StatusConnexao.setText(message);
            throw e;
        }
    }
}
