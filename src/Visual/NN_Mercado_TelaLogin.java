package Visual;

import java.sql.*;
import DAO.ConectaBanco;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NN_Mercado_TelaLogin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pstCargo = null;
    ResultSet rs = null; //ResultSet é uma interface utilizada pra guardar dados vindos de um banco de dados.
    ResultSet rsCargo = null;
    static String senha;

    //Construtor
    public NN_Mercado_TelaLogin() throws ClassNotFoundException {
        initComponents();
        //getContentPane().setBackground(new Color(8, 13, 32));
        con = ConectaBanco.conectabanco();

    }

    public void Logar() throws ClassNotFoundException {
        NN_Mercado_TelaInicial enviaTexto = null;
        NN_Mercado_TelaGerente enviaText = null;

        String sql = "select *from usuario where usuario = ? and senha = ?"; //Buscar dado banco
        String sqlCargo = "select cargo, nome from usuario as u join funcionario as f on iduser = f.idfuncionario where usuario = ? and senha = ?";

        try {
            pst = con.prepareStatement(sql); //Inicializa a conexão
            pstCargo = con.prepareStatement(sqlCargo);
            pstCargo.setString(1, txtUsuario.getText());
            pstCargo.setString(2, (jpfSenha.getText()));
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, (jpfSenha.getText()));

            rs = pst.executeQuery();
            rsCargo = pstCargo.executeQuery();

            String caixa_forma1 = "Caixa";
            String caixa_forma2 = "CAIXA";
            String caixa_forma3 = "caixa";

            String gerente_forma1 = "Gerente";
            String gerente_forma2 = "GERENTE";
            String gerente_forma3 = "gerente";

            //Se existe algum registro no banco tal como o digitado, ele chama a tela inicial
            if (rs.next()) {
                if (rsCargo.next()) {
                    String cargo_bd;
                    String nome_bd;
                    cargo_bd = rsCargo.getString("cargo");
                    nome_bd = rsCargo.getString("nome");

                    if (caixa_forma1.equals(cargo_bd) || caixa_forma2.equals(cargo_bd) || caixa_forma3.equals(cargo_bd)) {

                        if (enviaTexto == null) {
                            senha = jpfSenha.getText();
                            enviaTexto = new NN_Mercado_TelaInicial();
                            enviaTexto.setVisible(true);
                            enviaTexto.recebeDados(nome_bd);
                        }
                        dispose();
                    } else if (gerente_forma1.equals(cargo_bd) || gerente_forma2.equals(cargo_bd) || gerente_forma3.equals(cargo_bd)) {
                        if (enviaTexto == null) {
                            senha = jpfSenha.getText();
                            enviaText = new NN_Mercado_TelaGerente();
                            enviaText.setVisible(true);
                            enviaText.recebeDados(nome_bd);
                        }
                        dispose();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }

    /*public void logar() {
        final String SQL_SELECT_USUARIO = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
        final String SQL_SELECT_CARGO_NOME = "SELECT cargo, nome FROM usuario AS u JOIN funcionario AS f ON iduser = f.idfuncionario WHERE usuario = ? AND senha = ?";
        final String CARGO_CAIXA = "Caixa";
        final String CARGO_GERENTE = "Gerente";

        try (PreparedStatement stmtSelectUsuario = con.prepareStatement(SQL_SELECT_USUARIO); PreparedStatement stmtSelectCargoNome = con.prepareStatement(SQL_SELECT_CARGO_NOME)) {

            stmtSelectCargoNome.setString(1, txtUsuario.getText());
            stmtSelectCargoNome.setString(2, jpfSenha.getText());
            stmtSelectUsuario.setString(1, txtUsuario.getText());
            stmtSelectUsuario.setString(2, jpfSenha.getText());

            try (ResultSet rsUsuario = stmtSelectUsuario.executeQuery(); ResultSet rsCargoNome = stmtSelectCargoNome.executeQuery()) {

                if (rsUsuario.next()) {
                    if (rsCargoNome.next()) {
                        String cargo = rsCargoNome.getString("cargo");
                        String nome = rsCargoNome.getString("nome");

                        if (CARGO_CAIXA.equalsIgnoreCase(cargo)) {
                            if (enviaTexto == null) {
                                senha = jpfSenha.getText();
                                enviaTexto = new NN_Mercado_TelaInicial();
                                enviaTexto.setVisible(true);
                                enviaTexto.recebeDados(nome);
                            }
                            dispose();
                        } else if (CARGO_GERENTE.equalsIgnoreCase(cargo)) {
                            if (enviaTexto == null) {
                                senha = jpfSenha.getText();
                                enviaText = new NN_Mercado_TelaGerente();
                                enviaText.setVisible(true);
                                enviaText.recebeDados(nome);
                            }
                            dispose();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta ao Banco de Dados: " + e.getMessage());
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        ButtonCancelar = new javax.swing.JButton();
        ButtonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:NN_Mercado™ tela Login");
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login de Acesso");

        LabelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuário");

        txtUsuario.setBackground(new java.awt.Color(12, 45, 60));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        LabelSenha.setBackground(new java.awt.Color(255, 255, 255));
        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha");

        jpfSenha.setBackground(new java.awt.Color(12, 45, 60));
        jpfSenha.setForeground(new java.awt.Color(255, 255, 255));
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });

        ButtonCancelar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ButtonEntrar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelSenha)
                    .addComponent(LabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(ButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario)
                    .addComponent(jpfSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelar)
                    .addComponent(ButtonEntrar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        try {
            Logar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(NN_Mercado_TelaLogin.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaLogin.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NN_Mercado_TelaLogin().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NN_Mercado_TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
