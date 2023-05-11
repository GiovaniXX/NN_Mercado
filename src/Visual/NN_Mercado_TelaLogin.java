package Visual;

import java.sql.*;
import DAO.ConectaBanco;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class NN_Mercado_TelaLogin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pstCargo = null;
    ResultSet rs = null; //ResultSet é uma interface utilizada pra guardar dados vindos de um banco de dados.
    ResultSet rsCargo = null;
    static String senha;

    //Construtor
    public NN_Mercado_TelaLogin() throws ClassNotFoundException, SQLException, InterruptedException {
        initComponents();
        //getContentPane().setBackground(new Color(8, 13, 32));
        status();
        //setIcon();       
        con = ConectaBanco.conectabanco(lbl_StatusConnexao);
    }

    private void status() {
        try {
            Timer timer = new Timer(2000, (ActionEvent e) -> {
                try {
                    con = ConectaBanco.conectabanco(lbl_StatusConnexao);
                    if (con != null) {
                        SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Connected.png")));
                    } else {
                        SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Disconected.png")));
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NN_Mercado_TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        if (con != null) {
                            con.close();
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }
            });
            timer.setRepeats(false);
            timer.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Logar() throws ClassNotFoundException, InterruptedException {
        NN_Mercado_TelaInicial enviaTexto = null;
        NN_Mercado_TelaGerente enviaText = null;

        String sql = "select *from usuario where usuario = ? and senha = ?"; //Buscar dado banco
        String sqlCargo = "select cargo, nome from usuario as u join funcionario as f on iduser = f.idfuncionario where usuario = ? and senha = ?";

        try {
            pst = con.prepareStatement(sql); //Inicializa a conexão
            pstCargo = con.prepareStatement(sqlCargo);
            pstCargo.setString(1, txtUsuario.getText());
            pstCargo.setString(2, (Arrays.toString(jpfSenha.getPassword())));
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, (Arrays.toString(jpfSenha.getPassword())));

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
                            senha = Arrays.toString(jpfSenha.getPassword());
                            enviaTexto = new NN_Mercado_TelaInicial();
                            enviaTexto.setVisible(true);
                            enviaTexto.recebeDados(nome_bd);
                        }
                        dispose();
                    } else if (gerente_forma1.equals(cargo_bd) || gerente_forma2.equals(cargo_bd) || gerente_forma3.equals(cargo_bd)) {
                        if (enviaTexto == null) {
                            senha = Arrays.toString(jpfSenha.getPassword());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        SGBD = new javax.swing.JLabel();
        lbl_StatusConnexao = new javax.swing.JLabel();
        txtUsuario = new up_class_custom.TextField();
        jpfSenha = new up_class_custom.PasswordField();
        jpfChave = new up_class_custom.PasswordField();
        jLabel3 = new javax.swing.JLabel();
        buttonEntrar = new up_class_custom.Button();
        button_Cancelar = new up_class_custom.Button();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:NN_Mercado™ tela Login");
        setBackground(new java.awt.Color(70, 73, 75));
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Login de Acesso");

        LabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelUsuario.setText("Usuário");

        LabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelSenha.setText("Senha");

        SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Disconected.png"))); // NOI18N

        lbl_StatusConnexao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Chave");

        buttonEntrar.setBackground(new java.awt.Color(70, 73, 75));
        buttonEntrar.setText("Entrar");
        buttonEntrar.setColor(new java.awt.Color(70, 73, 75));
        buttonEntrar.setRadius(25);
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });

        button_Cancelar.setBackground(new java.awt.Color(70, 73, 75));
        button_Cancelar.setText("Cancelar");
        button_Cancelar.setColor(new java.awt.Color(70, 73, 75));
        button_Cancelar.setRadius(25);
        button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(187, 187, 187));
        jSeparator1.setForeground(new java.awt.Color(187, 187, 187));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpfChave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(LabelSenha))
                            .addComponent(LabelUsuario))
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SGBD)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_StatusConnexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(SGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lbl_StatusConnexao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        try {
            Logar();
        } catch (ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(NN_Mercado_TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_CancelarActionPerformed

    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaLogin.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NN_Mercado_TelaLogin().setVisible(true);
            } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
                Logger.getLogger(NN_Mercado_TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel SGBD;
    private up_class_custom.Button buttonEntrar;
    private up_class_custom.Button button_Cancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private up_class_custom.PasswordField jpfChave;
    private up_class_custom.PasswordField jpfSenha;
    private javax.swing.JLabel lbl_StatusConnexao;
    private up_class_custom.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables

//    private void setIcon() {
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/Icons/Icon.jpg")));
//    }
}
