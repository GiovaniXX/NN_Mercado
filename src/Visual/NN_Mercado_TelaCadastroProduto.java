package Visual;

import DAO.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NN_Mercado_TelaCadastroProduto extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public NN_Mercado_TelaCadastroProduto() throws ClassNotFoundException {
        initComponents();
        con = ConectaBanco.conectabanco();
    }

    public void cadastrarProdutos() throws ParseException {
        String sql = "insert into produto(nome,cod_barras,preco,marca) values(?,?,?,?)";
        try {
            if (txtNomeProduto.getText().isEmpty() || txtCodigoBarras.getText().isEmpty() || txtMarcaProduto.getText().isEmpty() || txtPrecoProduto.getText().isEmpty() || txtPrecoProduto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", null, JOptionPane.WARNING_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);

                pst.setString(1, txtNomeProduto.getText());
                pst.setString(2, txtCodigoBarras.getText());
                pst.setFloat(3, Float.parseFloat(txtPrecoProduto.getText()));
                pst.setString(4, txtMarcaProduto.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Cadastrado com sucesso", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }

    }

    public void limparCampos() {
        txtNomeProduto.setText("");
        txtPrecoProduto.setText("");
        txtMarcaProduto.setText("");
        txtCodigoBarras.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ButtonCadastrasr = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        txtMarcaProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        txtCodigoBarras = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JTextField();
        LabelNomeP = new javax.swing.JLabel();
        LabelCodigoDeBarras = new javax.swing.JLabel();
        LabelMarca = new javax.swing.JLabel();
        LabelPreco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ButtonCadastrasr.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCadastrasr.setText("Cadastrar");
        ButtonCadastrasr.setMaximumSize(new java.awt.Dimension(105, 23));
        ButtonCadastrasr.setMinimumSize(new java.awt.Dimension(105, 23));
        ButtonCadastrasr.setPreferredSize(new java.awt.Dimension(105, 23));
        ButtonCadastrasr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrasrActionPerformed(evt);
            }
        });

        ButtonLimpar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonLimpar.setText("Limpar Campos");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonCancelar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setMaximumSize(new java.awt.Dimension(105, 23));
        ButtonCancelar.setMinimumSize(new java.awt.Dimension(105, 23));
        ButtonCancelar.setPreferredSize(new java.awt.Dimension(105, 23));
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        txtMarcaProduto.setBackground(new java.awt.Color(12, 45, 60));

        txtNomeProduto.setBackground(new java.awt.Color(12, 45, 60));

        txtCodigoBarras.setBackground(new java.awt.Color(12, 45, 60));
        txtCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarrasActionPerformed(evt);
            }
        });

        txtPrecoProduto.setBackground(new java.awt.Color(12, 45, 60));

        LabelNomeP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelNomeP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelNomeP.setText("Nome");

        LabelCodigoDeBarras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelCodigoDeBarras.setText("Código de Barras");

        LabelMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelMarca.setText("Marca");

        LabelPreco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPreco.setText("Preço");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelCodigoDeBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelNomeP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecoProduto)
                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(48, 48, 48))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 138, Short.MAX_VALUE)
                .addComponent(ButtonCadastrasr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNomeP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCodigoDeBarras)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrasr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarrasActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonCadastrasrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrasrActionPerformed
        try {
            cadastrarProdutos();
        } catch (ParseException ex) {
            Logger.getLogger(NN_Mercado_TelaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonCadastrasrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NN_Mercado_TelaCadastroProduto().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NN_Mercado_TelaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrasr;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JLabel LabelCodigoDeBarras;
    private javax.swing.JLabel LabelMarca;
    private javax.swing.JLabel LabelNomeP;
    private javax.swing.JLabel LabelPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
