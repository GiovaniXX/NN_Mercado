package Visual;

import DAO.ConectaBanco;
import com.formdev.flatlaf.IntelliJTheme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NN_Mercado_TelaCadastroFuncionario extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstFuncionario;
    PreparedStatement pstUsuario;
    ResultSet rs;

    public NN_Mercado_TelaCadastroFuncionario() throws ClassNotFoundException {
        initComponents();
        con = ConectaBanco.conectabanco();
    }

    public void cadastrarFuncionario() {
        String sqlFuncionario = "insert into funcionario(nome,cargo,cpf) values(?,?,?)";
        String sqlUsuario = "insert into usuario(usuario,senha) values(?,?)";

        try {
            if (txtNome.getText().isEmpty() || txtCargo.getText().isEmpty() || txtCPF.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", null, JOptionPane.WARNING_MESSAGE);
            } else {
                pstFuncionario = con.prepareStatement(sqlFuncionario);
                pstUsuario = con.prepareStatement(sqlUsuario);
                pstFuncionario.setString(1, txtNome.getText());
                pstFuncionario.setString(2, txtCargo.getText());
                pstFuncionario.setInt(3, Integer.parseInt(txtCPF.getText()));
                pstUsuario.setString(1, txtUsuario.getText());
                pstUsuario.setString(2, String.valueOf(txtSenha.getPassword()));

                pstFuncionario.execute();
                pstUsuario.execute();

                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Cadastrado com sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }
    }

    public void limparCampos() {
        txtNome.setText("");
        txtCargo.setText("");
        txtCPF.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        Nome = new javax.swing.JLabel();
        Cargo = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        CadFunc = new javax.swing.JLabel();
        checkSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        ButtonCadastrar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.setMaximumSize(new java.awt.Dimension(105, 23));
        ButtonCadastrar.setMinimumSize(new java.awt.Dimension(105, 23));
        ButtonCadastrar.setPreferredSize(new java.awt.Dimension(105, 23));
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonLimpar.setBackground(new java.awt.Color(12, 45, 60));
        ButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLimpar.setText("Limpar Campos");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
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

        txtNome.setBackground(new java.awt.Color(12, 45, 60));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));

        txtCargo.setBackground(new java.awt.Color(12, 45, 60));
        txtCargo.setForeground(new java.awt.Color(255, 255, 255));

        txtCPF.setBackground(new java.awt.Color(12, 45, 60));
        txtCPF.setForeground(new java.awt.Color(255, 255, 255));

        txtUsuario.setBackground(new java.awt.Color(12, 45, 60));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        txtSenha.setBackground(new java.awt.Color(12, 45, 60));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));

        Nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nome.setText("Nome");

        Cargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Cargo.setForeground(new java.awt.Color(255, 255, 255));
        Cargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Cargo.setText("Cargo");

        CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CPF.setText("CPF");

        Usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuário");

        Senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Senha.setText("Senha");

        CadFunc.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        CadFunc.setForeground(new java.awt.Color(255, 255, 255));
        CadFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadFunc.setText("Cadastrar Funcionário");

        checkSenha.setBackground(new java.awt.Color(12, 45, 60));
        checkSenha.setForeground(new java.awt.Color(255, 255, 255));
        checkSenha.setText("Visualizar Senha");
        checkSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(ButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkSenha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)
                            .addComponent(txtNome)
                            .addComponent(txtCargo)
                            .addComponent(txtCPF))))
                .addGap(36, 36, 36))
            .addComponent(CadFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CadFunc)
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(checkSenha)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLimpar))
                .addGap(20, 20, 20))
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

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        cadastrarFuncionario();
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void checkSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSenhaActionPerformed
        if (checkSenha.isSelected()) {
            txtSenha.setEchoChar((char) 0);
        } else {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_checkSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaCadastroFuncionario.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NN_Mercado_TelaCadastroFuncionario().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NN_Mercado_TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel CadFunc;
    private javax.swing.JLabel Cargo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JCheckBox checkSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
