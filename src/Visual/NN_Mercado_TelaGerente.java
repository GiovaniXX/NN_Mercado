package Visual;

import DAO.ConectaBanco;
import com.formdev.flatlaf.IntelliJTheme;
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
        Panel_PdvSistemaVendasNNmercado = new javax.swing.JPanel();
        lbl_PdvSistemavendasNNmercado = new javax.swing.JLabel();
        Panel_Botoes_1 = new javax.swing.JPanel();
        ButtonAbrirVenda = new javax.swing.JButton();
        lbl_Menu_2 = new javax.swing.JLabel();
        ButtonCadProd = new javax.swing.JButton();
        ButtonCadFunc = new javax.swing.JButton();
        ButtonPesquisarProd = new javax.swing.JButton();
        ButtonPesquisarFunc = new javax.swing.JButton();
        ButtonEmitirRel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeGerente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel_Botoes_2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lbl_Menu_1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lbl_Logo = new javax.swing.JLabel();
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
        setTitle("NN Mercado");
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jScrollPane1.setBackground(new java.awt.Color(12, 45, 60));

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));

        lbl_PdvSistemavendasNNmercado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_PdvSistemavendasNNmercado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PdvSistemavendasNNmercado.setText("PDV - SISTEMA DE VENDA NN MERCADO");

        javax.swing.GroupLayout Panel_PdvSistemaVendasNNmercadoLayout = new javax.swing.GroupLayout(Panel_PdvSistemaVendasNNmercado);
        Panel_PdvSistemaVendasNNmercado.setLayout(Panel_PdvSistemaVendasNNmercadoLayout);
        Panel_PdvSistemaVendasNNmercadoLayout.setHorizontalGroup(
            Panel_PdvSistemaVendasNNmercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PdvSistemaVendasNNmercadoLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lbl_PdvSistemavendasNNmercado, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_PdvSistemaVendasNNmercadoLayout.setVerticalGroup(
            Panel_PdvSistemaVendasNNmercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PdvSistemaVendasNNmercadoLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lbl_PdvSistemavendasNNmercado))
        );

        Panel_Botoes_1.setMaximumSize(new java.awt.Dimension(236, 600));
        Panel_Botoes_1.setMinimumSize(new java.awt.Dimension(236, 600));
        Panel_Botoes_1.setPreferredSize(new java.awt.Dimension(236, 600));

        ButtonAbrirVenda.setBackground(new java.awt.Color(60, 63, 65));
        ButtonAbrirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLAbrirVenda.png"))); // NOI18N
        ButtonAbrirVenda.setText("F1 - Abrir Venda                 ");
        ButtonAbrirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonAbrirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirVendaActionPerformed(evt);
            }
        });

        lbl_Menu_2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Menu_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Menu_2.setText("Menu");

        ButtonCadProd.setBackground(new java.awt.Color(60, 63, 65));
        ButtonCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLProdutoNovo.png"))); // NOI18N
        ButtonCadProd.setText("F2 - Cadastrar Produto     ");
        ButtonCadProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadProdActionPerformed(evt);
            }
        });

        ButtonCadFunc.setBackground(new java.awt.Color(60, 63, 65));
        ButtonCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLAdicionaFunc.png"))); // NOI18N
        ButtonCadFunc.setText("F3 - Cadastrar Funcionário");
        ButtonCadFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadFuncActionPerformed(evt);
            }
        });

        ButtonPesquisarProd.setBackground(new java.awt.Color(60, 63, 65));
        ButtonPesquisarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLPesquisarProd.png"))); // NOI18N
        ButtonPesquisarProd.setText("F4 - Pesquisar Produto     ");
        ButtonPesquisarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonPesquisarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarProdActionPerformed(evt);
            }
        });

        ButtonPesquisarFunc.setBackground(new java.awt.Color(60, 63, 65));
        ButtonPesquisarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLPesquisarFunc.png"))); // NOI18N
        ButtonPesquisarFunc.setText("F5 - Pesquisar Funcionário ");
        ButtonPesquisarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonPesquisarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarFuncActionPerformed(evt);
            }
        });

        ButtonEmitirRel.setBackground(new java.awt.Color(60, 63, 65));
        ButtonEmitirRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLProduto.png"))); // NOI18N
        ButtonEmitirRel.setText("          Emitir Relatório         ");
        ButtonEmitirRel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonEmitirRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmitirRelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Botoes_1Layout = new javax.swing.GroupLayout(Panel_Botoes_1);
        Panel_Botoes_1.setLayout(Panel_Botoes_1Layout);
        Panel_Botoes_1Layout.setHorizontalGroup(
            Panel_Botoes_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Botoes_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Botoes_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Menu_2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAbrirVenda)
                    .addGroup(Panel_Botoes_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButtonCadFunc)
                        .addComponent(ButtonCadProd))
                    .addComponent(ButtonPesquisarProd)
                    .addComponent(ButtonPesquisarFunc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Botoes_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonEmitirRel)
                .addContainerGap())
        );

        Panel_Botoes_1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonAbrirVenda, ButtonCadFunc, ButtonCadProd, ButtonEmitirRel, ButtonPesquisarFunc, ButtonPesquisarProd});

        Panel_Botoes_1Layout.setVerticalGroup(
            Panel_Botoes_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Botoes_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Menu_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAbrirVenda)
                .addGap(18, 18, 18)
                .addComponent(ButtonCadProd)
                .addGap(18, 18, 18)
                .addComponent(ButtonCadFunc)
                .addGap(18, 18, 18)
                .addComponent(ButtonPesquisarProd)
                .addGap(18, 18, 18)
                .addComponent(ButtonPesquisarFunc)
                .addGap(18, 18, 18)
                .addComponent(ButtonEmitirRel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Botoes_1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButtonAbrirVenda, ButtonCadFunc, ButtonCadProd, ButtonEmitirRel, ButtonPesquisarFunc, ButtonPesquisarProd});

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olá");

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
        jLabel3.setText("Copyright © 2023 GvC - Todos os direitos reservados");

        Panel_Botoes_2.setMaximumSize(new java.awt.Dimension(236, 600));
        Panel_Botoes_2.setMinimumSize(new java.awt.Dimension(236, 600));
        Panel_Botoes_2.setPreferredSize(new java.awt.Dimension(236, 600));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLAbrirVenda.png"))); // NOI18N
        jButton1.setText("NF - NNmercado");
        jButton1.setEnabled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(218, 55));
        jButton1.setMinimumSize(new java.awt.Dimension(218, 55));
        jButton1.setPreferredSize(new java.awt.Dimension(218, 55));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLProdutoNovo.png"))); // NOI18N
        jButton2.setText("NF - NNmercado");
        jButton2.setEnabled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(216, 55));
        jButton2.setMinimumSize(new java.awt.Dimension(216, 55));
        jButton2.setPreferredSize(new java.awt.Dimension(216, 55));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLPesquisarProd.png"))); // NOI18N
        jButton4.setText("NF - NNmercado");
        jButton4.setEnabled(false);
        jButton4.setMaximumSize(new java.awt.Dimension(221, 55));
        jButton4.setMinimumSize(new java.awt.Dimension(221, 55));
        jButton4.setPreferredSize(new java.awt.Dimension(221, 55));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLPesquisarFunc.png"))); // NOI18N
        jButton5.setText("NF - NNmercado");
        jButton5.setEnabled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(224, 55));
        jButton5.setMinimumSize(new java.awt.Dimension(224, 55));
        jButton5.setPreferredSize(new java.awt.Dimension(224, 55));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLAdicionaFunc.png"))); // NOI18N
        jButton6.setText("NF - NNmercado");
        jButton6.setEnabled(false);
        jButton6.setMaximumSize(new java.awt.Dimension(220, 55));
        jButton6.setMinimumSize(new java.awt.Dimension(220, 55));
        jButton6.setPreferredSize(new java.awt.Dimension(220, 55));

        lbl_Menu_1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Menu_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Menu_1.setText("Menu");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/MercadosNLProduto.png"))); // NOI18N
        jButton3.setText("NF - NNmercado");
        jButton3.setEnabled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(221, 55));
        jButton3.setMinimumSize(new java.awt.Dimension(221, 55));
        jButton3.setPreferredSize(new java.awt.Dimension(221, 55));

        javax.swing.GroupLayout Panel_Botoes_2Layout = new javax.swing.GroupLayout(Panel_Botoes_2);
        Panel_Botoes_2.setLayout(Panel_Botoes_2Layout);
        Panel_Botoes_2Layout.setHorizontalGroup(
            Panel_Botoes_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Botoes_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Botoes_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Menu_1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Panel_Botoes_2Layout.setVerticalGroup(
            Panel_Botoes_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Botoes_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Menu_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_05.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_PdvSistemaVendasNNmercado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Botoes_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel_Botoes_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_PdvSistemaVendasNNmercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel_Botoes_2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel_Botoes_1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
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
        SubMenuFunc.setText("Funcionário");
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
        SubMenuExibirFunc.setText("Funcionário");
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addContainerGap())
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
            //caminho do relatório
            InputStream caminho_relatorio = this.getClass().getClassLoader().getResourceAsStream("Relatorio/TemplateRelatorioVendasNL.jasper");

            JasperPrint jasper_print = JasperFillManager.fillReport(caminho_relatorio, new HashMap(), jrRs);

            JasperExportManager.exportReportToPdfFile(jasper_print, "C:/RelVendas/VendasSupermercadosNL.pdf");

            //abrir o pdf automaticamente
            File file = new File("C:/RelVendas/VendasSupermercadosNL.pdf");
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
        try {
            IntelliJTheme.setup(NN_Mercado_TelaGerente.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

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
    private javax.swing.JPanel Panel_Botoes_1;
    private javax.swing.JPanel Panel_Botoes_2;
    private javax.swing.JPanel Panel_PdvSistemaVendasNNmercado;
    private javax.swing.JMenuItem SubMenuExibiProd;
    private javax.swing.JMenuItem SubMenuExibirFunc;
    private javax.swing.JMenuItem SubMenuFunc;
    private javax.swing.JMenuItem SubMenuProd;
    private javax.swing.JMenuItem SubMenuSair;
    private javax.swing.JMenuItem SubMenuVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Menu_1;
    private javax.swing.JLabel lbl_Menu_2;
    private javax.swing.JLabel lbl_PdvSistemavendasNNmercado;
    private javax.swing.JLabel txtNomeGerente;
    // End of variables declaration//GEN-END:variables
}
