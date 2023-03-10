package Visual;

import DAO.ConectaBanco;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class NN_Mercado_TelaGerente extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form MercadosNLTelaGerente
     *
     * @throws java.lang.ClassNotFoundException
     */
    public NN_Mercado_TelaGerente() throws ClassNotFoundException {
        initComponents();
        con = ConectaBanco.conectabanco();

    }

    String recebeNome;

    public void recebeDados(String recebe) {
        this.recebeNome = recebe;
        txtNomeGerente.setText(recebe);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ButtonAbrirVenda = new javax.swing.JButton();
        ButtonCadProd = new javax.swing.JButton();
        ButtonCadFunc = new javax.swing.JButton();
        ButtonPesquisarProd = new javax.swing.JButton();
        ButtonPesquisarFunc = new javax.swing.JButton();
        ButtonEmitirRel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeGerente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        SubMenuVenda = new javax.swing.JMenuItem();
        SubMenuSair = new javax.swing.JMenuItem();
        MenuCadastrar = new javax.swing.JMenu();
        SubMenuProd = new javax.swing.JMenuItem();
        SubMenuFunc = new javax.swing.JMenuItem();
        MenuExibir = new javax.swing.JMenu();
        SubMenuExibiProd = new javax.swing.JMenuItem();
        SubMenuExibirFunc = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jScrollPane1.setBackground(new java.awt.Color(12, 45, 60));

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        jPanel2.setBackground(new java.awt.Color(12, 45, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(12, 45, 60));

        ButtonAbrirVenda.setBackground(new java.awt.Color(12, 45, 60));
        ButtonAbrirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLAbrirVenda.png"))); // NOI18N
        ButtonAbrirVenda.setText("F1 - Abrir Venda                 ");
        ButtonAbrirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonAbrirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirVendaActionPerformed(evt);
            }
        });

        ButtonCadProd.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLProdutoNovo.png"))); // NOI18N
        ButtonCadProd.setText("F2 - Cadastrar Produto     ");
        ButtonCadProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadProdActionPerformed(evt);
            }
        });

        ButtonCadFunc.setBackground(new java.awt.Color(12, 45, 60));
        ButtonCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLAdicionaFunc.png"))); // NOI18N
        ButtonCadFunc.setText("F3 - Cadastrar Funcion??rio");
        ButtonCadFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadFuncActionPerformed(evt);
            }
        });

        ButtonPesquisarProd.setBackground(new java.awt.Color(12, 45, 60));
        ButtonPesquisarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLPesquisarProd.png"))); // NOI18N
        ButtonPesquisarProd.setText("F4 - Pesquisar Produto     ");
        ButtonPesquisarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonPesquisarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarProdActionPerformed(evt);
            }
        });

        ButtonPesquisarFunc.setBackground(new java.awt.Color(12, 45, 60));
        ButtonPesquisarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLPesquisarFunc.png"))); // NOI18N
        ButtonPesquisarFunc.setText("F5 - Pesquisar Funcion??rio ");
        ButtonPesquisarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonPesquisarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarFuncActionPerformed(evt);
            }
        });

        ButtonEmitirRel.setBackground(new java.awt.Color(12, 45, 60));
        ButtonEmitirRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLProduto.png"))); // NOI18N
        ButtonEmitirRel.setText("          Emitir Relat??rio         ");
        ButtonEmitirRel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonEmitirRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmitirRelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ButtonCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonCadFunc)
                                .addComponent(ButtonAbrirVenda))
                            .addComponent(ButtonPesquisarProd, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonPesquisarFunc)
                            .addComponent(ButtonEmitirRel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonAbrirVenda, ButtonCadFunc, ButtonCadProd, ButtonEmitirRel, ButtonPesquisarFunc, ButtonPesquisarProd});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ButtonAbrirVenda)
                .addGap(18, 18, 18)
                .addComponent(ButtonCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonCadFunc)
                .addGap(18, 18, 18)
                .addComponent(ButtonPesquisarProd)
                .addGap(18, 18, 18)
                .addComponent(ButtonPesquisarFunc)
                .addGap(18, 18, 18)
                .addComponent(ButtonEmitirRel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonAbrirVenda, ButtonCadFunc, ButtonCadProd, ButtonEmitirRel, ButtonPesquisarFunc, ButtonPesquisarProd});

        jPanel4.setBackground(new java.awt.Color(12, 45, 60));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ol??");

        txtNomeGerente.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtNomeGerente.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeGerente.setText("Nome do Admin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeGerente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeGerente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright ?? 2023 GvC - Todos os direitos reservados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenuBar2.setBackground(new java.awt.Color(12, 45, 60));

        MenuArquivo.setBackground(new java.awt.Color(12, 45, 60));
        MenuArquivo.setText("Arquivo");

        SubMenuVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        SubMenuVenda.setBackground(new java.awt.Color(12, 45, 60));
        SubMenuVenda.setText("Abrir Venda");
        SubMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuVendaActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuVenda);

        SubMenuSair.setText("Sair");
        SubMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuSair);

        jMenuBar2.add(MenuArquivo);

        MenuCadastrar.setBackground(new java.awt.Color(12, 45, 60));
        MenuCadastrar.setText("Cadastrar");

        SubMenuProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        SubMenuProd.setBackground(new java.awt.Color(12, 45, 60));
        SubMenuProd.setText("Produto");
        SubMenuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuProdActionPerformed(evt);
            }
        });
        MenuCadastrar.add(SubMenuProd);

        SubMenuFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        SubMenuFunc.setBackground(new java.awt.Color(12, 45, 60));
        SubMenuFunc.setText("Funcion??rio");
        SubMenuFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuFuncActionPerformed(evt);
            }
        });
        MenuCadastrar.add(SubMenuFunc);

        jMenuBar2.add(MenuCadastrar);

        MenuExibir.setBackground(new java.awt.Color(12, 45, 60));
        MenuExibir.setText("Exibir");

        SubMenuExibiProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        SubMenuExibiProd.setBackground(new java.awt.Color(12, 45, 60));
        SubMenuExibiProd.setText("Produtos");
        SubMenuExibiProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuExibiProdActionPerformed(evt);
            }
        });
        MenuExibir.add(SubMenuExibiProd);

        SubMenuExibirFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        SubMenuExibirFunc.setBackground(new java.awt.Color(12, 45, 60));
        SubMenuExibirFunc.setText("Funcion??rio");
        SubMenuExibirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuExibirFuncActionPerformed(evt);
            }
        });
        MenuExibir.add(SubMenuExibirFunc);

        jMenuBar2.add(MenuExibir);

        setJMenuBar(jMenuBar2);

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
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadProdActionPerformed
        try {
            new NN_Mercado_TelaCadastroProduto().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonCadProdActionPerformed

    private void ButtonCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadFuncActionPerformed
        try {
            new NN_Mercado_TelaCadastroFuncionario().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonCadFuncActionPerformed

    private void ButtonAbrirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAbrirVendaActionPerformed
        NN_Mercado_TelaInicial enviaTexto = null;
        if (enviaTexto == null) {
            try {
                enviaTexto = new NN_Mercado_TelaInicial();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
            }
            enviaTexto.setVisible(true);
            enviaTexto.recebeDados(recebeNome);
        }

    }//GEN-LAST:event_ButtonAbrirVendaActionPerformed

    private void ButtonPesquisarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarProdActionPerformed
        try {
            new NN_Mercado_TelaPesquisarProduto().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonPesquisarProdActionPerformed

    private void ButtonPesquisarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarFuncActionPerformed
        try {
            new NN_Mercado_TelaPesquisarFuncionario().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonPesquisarFuncActionPerformed

    private void SubMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuVendaActionPerformed
        try {
            new NN_Mercado_TelaInicial().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubMenuVendaActionPerformed

    private void SubMenuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuFuncActionPerformed
        try {
            new NN_Mercado_TelaCadastroFuncionario().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubMenuFuncActionPerformed

    private void SubMenuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuProdActionPerformed
        try {
            new NN_Mercado_TelaCadastroProduto().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubMenuProdActionPerformed

    private void SubMenuExibiProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuExibiProdActionPerformed
        try {
            new NN_Mercado_TelaPesquisarProduto().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubMenuExibiProdActionPerformed

    private void SubMenuExibirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuExibirFuncActionPerformed
        try {
            new NN_Mercado_TelaPesquisarFuncionario().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubMenuExibirFuncActionPerformed

    private void ButtonEmitirRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmitirRelActionPerformed

        String sql = "select id_compra, nome_produto,codigo_barras,round(preco::numeric,2),quantidade,operador_caixa from cupom_nao_fiscal";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            JRResultSetDataSource jrRs = new JRResultSetDataSource(rs);
            //caminho do relat??rio
            InputStream caminho_relatorio = this.getClass().getClassLoader().getResourceAsStream("Relatorio/TemplateRelatorioVendasNL.jasper");

            JasperPrint jasper_print = JasperFillManager.fillReport(caminho_relatorio, new HashMap(), jrRs);

            JasperExportManager.exportReportToPdfFile(jasper_print, "C:/RelVendas/VendasSupermercadosNL.pdf");

            //abrir o pdf automaticamente
            File file = new File("C:/RelVendas/VendasNN_Mercado.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        } catch (JRException ex) {
            Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonEmitirRelActionPerformed

    private void SubMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SubMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NN_Mercado_TelaGerente().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NN_Mercado_TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAbrirVenda;
    private javax.swing.JButton ButtonCadFunc;
    private javax.swing.JButton ButtonCadProd;
    private javax.swing.JButton ButtonEmitirRel;
    private javax.swing.JButton ButtonPesquisarFunc;
    private javax.swing.JButton ButtonPesquisarProd;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenu MenuCadastrar;
    private javax.swing.JMenu MenuExibir;
    private javax.swing.JMenuItem SubMenuExibiProd;
    private javax.swing.JMenuItem SubMenuExibirFunc;
    private javax.swing.JMenuItem SubMenuFunc;
    private javax.swing.JMenuItem SubMenuProd;
    private javax.swing.JMenuItem SubMenuSair;
    private javax.swing.JMenuItem SubMenuVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtNomeGerente;
    // End of variables declaration//GEN-END:variables
}
