package Visual;

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
import net.proteanit.sql.DbUtils;

public final class NN_Mercado_TelaPesquisarFuncionario extends javax.swing.JFrame {

    JLabel lbl_StatusConnexao;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public NN_Mercado_TelaPesquisarFuncionario() throws ClassNotFoundException, SQLException, InterruptedException {
        initComponents();
        con = ConectaBanco.conectabanco(lbl_StatusConnexao);
        listarFuncionarios();
    }

    public void listarFuncionarios() throws ClassNotFoundException {

        String sql = "select * from funcionario order by id_funcionario Asc";

        try {

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tabelaFuncionarios.setModel(DbUtils.resultSetToTableModel(rs));

            tabelaFuncionarios.getColumnModel().getColumn(0).setHeaderValue("Código");
            tabelaFuncionarios.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tabelaFuncionarios.getColumnModel().getColumn(2).setHeaderValue("Cargo");
            tabelaFuncionarios.getColumnModel().getColumn(3).setHeaderValue("CPF");
            tabelaFuncionarios.getTableHeader().resizeAndRepaint();

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }
    }

    public void pesquisarFuncionarios() {
        String sql = "select * from funcionario where nome like ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtPesquisar.getText() + "%");
            rs = pst.executeQuery();
            tabelaFuncionarios.setModel(DbUtils.resultSetToTableModel(rs));

            tabelaFuncionarios.getColumnModel().getColumn(0).setHeaderValue("Código");
            tabelaFuncionarios.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tabelaFuncionarios.getColumnModel().getColumn(2).setHeaderValue("Cargo");
            tabelaFuncionarios.getColumnModel().getColumn(3).setHeaderValue("CPF");
            tabelaFuncionarios.getTableHeader().resizeAndRepaint();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }

    }

    public void deletar() throws ClassNotFoundException {

        String sql = "delete from funcionario where id_funcionario = ?";
        int row = tabelaFuncionarios.getSelectedRow();
        String valor = tabelaFuncionarios.getValueAt(row, 0).toString();

        Object[] options = {"Confirmar", "Cancelar"};
        switch (JOptionPane.showOptionDialog(null, "Deseja mesmo excluir?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
            case 0:
                try {
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(valor));
                pst.execute();

                listarFuncionarios();
            } catch (SQLException error) {

                JOptionPane.showMessageDialog(null, error);
            }
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        ButtonEditar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(12, 45, 60));

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        jScrollPane2.setBackground(new java.awt.Color(12, 45, 60));

        tabelaFuncionarios.setBackground(new java.awt.Color(12, 45, 60));
        tabelaFuncionarios.setBorder(new javax.swing.border.MatteBorder(null));
        tabelaFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaFuncionarios.setGridColor(new java.awt.Color(12, 45, 60));
        tabelaFuncionarios.setSelectionBackground(new java.awt.Color(12, 45, 60));
        jScrollPane2.setViewportView(tabelaFuncionarios);

        txtPesquisar.setBackground(new java.awt.Color(12, 45, 60));
        txtPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        ButtonEditar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEditar.setText("Editar");
        ButtonEditar.setMaximumSize(new java.awt.Dimension(105, 23));
        ButtonEditar.setMinimumSize(new java.awt.Dimension(105, 23));
        ButtonEditar.setPreferredSize(new java.awt.Dimension(105, 23));
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonExcluir.setBackground(new java.awt.Color(12, 45, 60));
        ButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setMaximumSize(new java.awt.Dimension(105, 23));
        ButtonExcluir.setMinimumSize(new java.awt.Dimension(105, 23));
        ButtonExcluir.setPreferredSize(new java.awt.Dimension(105, 23));
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ButtonCancelar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setMaximumSize(new java.awt.Dimension(105, 23));
        ButtonCancelar.setMinimumSize(new java.awt.Dimension(105, 23));
        ButtonCancelar.setName(""); // NOI18N
        ButtonCancelar.setPreferredSize(new java.awt.Dimension(105, 23));
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/magnifier.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        this.dispose();
        int seleciona = tabelaFuncionarios.getSelectedRow();
        String nome = tabelaFuncionarios.getModel().getValueAt(seleciona, 1).toString();
        String cpf = tabelaFuncionarios.getModel().getValueAt(seleciona, 3).toString();
        String cargo = tabelaFuncionarios.getModel().getValueAt(seleciona, 2).toString();
        String codigo = tabelaFuncionarios.getModel().getValueAt(seleciona, 0).toString();

        NN_Mercado_TelaEdicaoFuncionario enviaTexto;
        enviaTexto = null;
        try {
            enviaTexto = new NN_Mercado_TelaEdicaoFuncionario();
        } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
            Logger.getLogger(NN_Mercado_TelaPesquisarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        enviaTexto.setVisible(true);
        enviaTexto.recebeDados(nome, cpf, cargo, codigo);
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        pesquisarFuncionarios();
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        try {
            deletar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaPesquisarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaPesquisarFuncionario.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NN_Mercado_TelaPesquisarFuncionario().setVisible(true);
            } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
                Logger.getLogger(NN_Mercado_TelaPesquisarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaFuncionarios;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

}
