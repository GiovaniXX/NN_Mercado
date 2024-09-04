package Forms;

import DAO.ConectaBanco;
import com.formdev.flatlaf.IntelliJTheme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NN_Mercado_VerificacaoSaida extends javax.swing.JFrame {

    JLabel lbl_StatusConnexao;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null; //ResultSet é uma interface utilizada pra guardar dados vindos de um banco de dados.
    private NN_Mercado_TelaInicial inicial;

    public NN_Mercado_VerificacaoSaida(NN_Mercado_TelaInicial tela_ini) throws ClassNotFoundException, SQLException, InterruptedException {
        this.inicial = tela_ini;
        initComponents();
        con = ConectaBanco.conectabanco(lbl_StatusConnexao);
    }

    public NN_Mercado_VerificacaoSaida() throws ClassNotFoundException {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        ButtonConfirmar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        LabelCredenciais = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(12, 45, 60));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        txtSenha.setBackground(new java.awt.Color(12, 45, 60));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));

        ButtonConfirmar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonConfirmar.setText("Confirmar");
        ButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmarActionPerformed(evt);
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

        LabelCredenciais.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        LabelCredenciais.setForeground(new java.awt.Color(255, 255, 255));
        LabelCredenciais.setText("Entre com a Chave Mestre");

        jPanel2.setBackground(new java.awt.Color(27, 25, 32));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelCredenciais)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancelar)))
                .addGap(33, 33, 33))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonCancelar, ButtonConfirmar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(LabelCredenciais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonConfirmar)
                    .addComponent(ButtonCancelar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmarActionPerformed
        try {
            ConfirmacaoSenha();
        } catch (SQLException ex) {
            Logger.getLogger(NN_Mercado_VerificacaoSaida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonConfirmarActionPerformed
    public void UpdateContador() {
        String sql = "update contagem set id_contagem = ? where id_c = 1";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, NN_Mercado_TelaInicial.id_compra);
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }
    }

    public void ConfirmacaoSenha() throws SQLException {
        String senha_digitada = NN_Mercado_TelaLogin.senha;
        if (txtSenha.getText().equals(senha_digitada)) {
            UpdateContador();
            this.dispose();
            inicial.dispose();
        } else {
            txtSenha.setText("");
            JOptionPane.showMessageDialog(null, "Senha inválida!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_VerificacaoSaida.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NN_Mercado_VerificacaoSaida().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NN_Mercado_VerificacaoSaida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonConfirmar;
    private javax.swing.JLabel LabelCredenciais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
