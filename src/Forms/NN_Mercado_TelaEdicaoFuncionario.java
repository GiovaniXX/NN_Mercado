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

public class NN_Mercado_TelaEdicaoFuncionario extends javax.swing.JFrame {

    JLabel lbl_StatusConnexao;
    Connection con;
    PreparedStatement pst;
    PreparedStatement pstNome;
    ResultSet rs;
    String id;

    public NN_Mercado_TelaEdicaoFuncionario() throws ClassNotFoundException, SQLException, InterruptedException {
        initComponents();
        con = ConectaBanco.conectabanco(lbl_StatusConnexao);
    }

    public void recebeDados(String nome, String cpf, String cargo, String id_codigo) {
        txtNome.setText(nome);
        txtCPF.setText(cpf);
        txtCargo.setText(cargo);
        this.id = id_codigo;
    }

    public void editarFuncionarios() throws ClassNotFoundException, InterruptedException {
        NN_Mercado_TelaInicial enviaTexto = null;
        NN_Mercado_TelaGerente enviaText = null;
        String nome_bd;
        String sql = "update funcionario set nome = ?, cargo = ?, cpf = ? where id_funcionario = ?";
        String sql1 = "select nome from funcionario where id_funcionario = ?";
        try {
            if (txtNome.getText().isEmpty() || txtCargo.getText().isEmpty() || txtCPF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", null, JOptionPane.WARNING_MESSAGE);
            } else {
                NN_Mercado_TelaPesquisarFuncionario lista = null;
                pst = con.prepareStatement(sql);
                pstNome = con.prepareStatement(sql1);

                pst.setString(1, txtNome.getText());
                pst.setString(2, txtCargo.getText());
                pst.setFloat(3, Integer.parseInt(txtCPF.getText()));
                pst.setInt(4, Integer.parseInt(id));
                pstNome.setInt(1, Integer.parseInt(id));

                lista = new NN_Mercado_TelaPesquisarFuncionario();

                pst.executeUpdate();
                rs = pstNome.executeQuery();

                if (rs.next()) {
                    nome_bd = rs.getString("nome");
                    if (enviaTexto == null) {
                        enviaText = new NN_Mercado_TelaGerente();
                        enviaText.setVisible(true);
                        enviaText.recebeDados(nome_bd);
                    }
                }

                lista.setVisible(true);
                lista.listarFuncionarios();
                JOptionPane.showMessageDialog(null, "Cadastro Atualizado com sucesso!");
            }
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }
    }

    public void limparCampos() {
        txtNome.setText("");
        txtCargo.setText("");
        txtCPF.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Funcionário");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cargo");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CPF");

        jButton1.setBackground(new java.awt.Color(12, 45, 60));
        jButton1.setText("Opções Avançadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(12, 45, 60));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(12, 45, 60));
        jButton3.setText("Limpar Campos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(12, 45, 60));
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(12, 45, 60));

        txtCargo.setBackground(new java.awt.Color(12, 45, 60));

        txtCPF.setBackground(new java.awt.Color(12, 45, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addComponent(jButton1)
                    .addComponent(txtCPF)
                    .addComponent(txtCargo)
                    .addComponent(txtNome))
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //  this.dispose();
        String sql = "select usuario,senha from usuario as u join funcionario as f on id_usuario = ?";
        String usuario = null;
        String senha = null;
        try {

            pst = con.prepareStatement(sql);

            pst.setInt(1, Integer.parseInt(id));

            rs = pst.executeQuery();

            while (rs.next()) {
                usuario = rs.getString("usuario");
                senha = rs.getString("senha");
            }
            NN_Mercado_TelaOpcoesAvancadas enviaTexto;
            enviaTexto = null;
            enviaTexto = new NN_Mercado_TelaOpcoesAvancadas();
            enviaTexto.setVisible(true);
            enviaTexto.recebeDados(id, usuario, senha);

        } catch (SQLException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(NN_Mercado_TelaEdicaoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            editarFuncionarios();
        } catch (ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(NN_Mercado_TelaEdicaoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaEdicaoFuncionario.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NN_Mercado_TelaEdicaoFuncionario().setVisible(true);
            } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
                Logger.getLogger(NN_Mercado_TelaEdicaoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
