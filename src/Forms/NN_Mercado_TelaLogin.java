package Forms;

import java.sql.*;
import DAO.ConectaBanco;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import com.formdev.flatlaf.IntelliJTheme;

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
        getContentPane().setBackground(new Color(8, 13, 32));
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

        jLabel1 = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        LabelChave = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jpfChave = new javax.swing.JPasswordField();
        jButton1_Entrar = new javax.swing.JButton();
        jButton2_Cancelar = new javax.swing.JButton();
        SGBD = new javax.swing.JLabel();
        lbl_StatusConnexao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(768, 511));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Login de Acesso");

        LabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelUsuario.setText("Usuário");

        LabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelSenha.setText("Senha");

        LabelChave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelChave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelChave.setText("Chave");

        jButton1_Entrar.setText("Entrar");
        jButton1_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EntrarActionPerformed(evt);
            }
        });

        jButton2_Cancelar.setText("Cancelar");
        jButton2_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_CancelarActionPerformed(evt);
            }
        });

        SGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Disconected.png"))); // NOI18N

        lbl_StatusConnexao.setText("Conectado no banco de dados.!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelChave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_Entrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                                .addComponent(jButton2_Cancelar))
                            .addComponent(txtUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpfChave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SGBD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(lbl_StatusConnexao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSenha)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelChave)
                    .addComponent(jpfChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_Entrar)
                            .addComponent(jButton2_Cancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_StatusConnexao)
                        .addGap(136, 136, 136))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EntrarActionPerformed
        try {
            Logar();
        } catch (ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(NN_Mercado_TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton1_EntrarActionPerformed

    private void jButton2_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_CancelarActionPerformed
        System.exit(0);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton2_CancelarActionPerformed

    /**
     * jLabel3ram args the command line arguments
     *
     * @param args
     */
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
    private javax.swing.JLabel LabelChave;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JLabel SGBD;
    private javax.swing.JButton jButton1_Entrar;
    private javax.swing.JButton jButton2_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jpfChave;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JLabel lbl_StatusConnexao;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

//    private void setIcon() {
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/Icons/Icon.jpg")));
//    }
}
