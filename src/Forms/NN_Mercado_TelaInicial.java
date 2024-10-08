package Forms;

import DAO.ConectaBanco;
import Cálculos.PrecoTotalCompra;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class NN_Mercado_TelaInicial extends javax.swing.JFrame {

    NN_Mercado_TelaFormaDePagamento enviaPreco = null;
    NN_Mercado_TelaPagamentoDinheiro pag_dinheiro;

    JLabel lbl_StatusConnexao;
    Connection con;
    PreparedStatement pst;
    PreparedStatement pstCupom;
    ResultSet rs;

    static int i;
    static float soma;
    static int linha_preco;
    static int linha_quantidade;
    static int linha_descricao;
    static int linha_codbarras;
    static float pt;
    static int atualizou = 0;
    static int tamanho = 0;
    static int apertouformadepagamento = 0;
    public static javax.swing.JTextField teste; // novo
    static boolean vender = true;
    static DefaultTableModel tabelaModelo;
    static String operador;
    int atualiza_cont;
    static int id_compra;

    public NN_Mercado_TelaInicial() throws ClassNotFoundException, SQLException, InterruptedException {
        initComponents();
        txtCodigoBarras.grabFocus();      
        con = ConectaBanco.conectabanco(lbl_StatusConnexao);
        AtualizaContador();

    }

    public void AtualizaContador() {
        String sql = "select id_contagem from contagem where id_c = 1";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                atualiza_cont = rs.getInt("id_contagem");
                id_compra = atualiza_cont;
                id_compra += 1;
            }

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }
    }

    public void UpdateContador() {
        String sql = "update contagem set id_contagem = ? where id_c = 1";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, NN_Mercado_TelaInicial.id_compra);
            pst.executeUpdate();
        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
        }
    }

    public void recebeDados(String recebe) {
        txtNome.setText(recebe);
        operador = recebe;
    }

    public static float TotalCompra() {
        return pt;
    }

    static void AtualizaCaixa() {

        txtNomeProduto.setText("Nome do Produto");
        txtPreco.setText("0.00");
        txtPrecoTotal.setText("0.00");
        tamanho = tabelaModelo.getRowCount();
        id_compra += 1;
        int j;
        atualizou = 1;
        for (j = tamanho - 1; j >= 0; j--) {
            tabelaModelo.removeRow(j);
        }
        tabelaModelo.setRowCount(1);
        tabelaModelo = (DefaultTableModel) TabelaNotinha.getModel();
        i = 0;
        linha_preco = 0;
        linha_quantidade = 0;
        linha_descricao = 0;
        linha_codbarras = 0;
        soma = 0;
        vender = true;
        apertouformadepagamento = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtCodigoBarras = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtPreco = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaNotinha = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecoTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label8 = new java.awt.Label();
        txtFecharCaixa = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NN_Tela Inicial");
        setBackground(new java.awt.Color(12, 45, 60));
        setExtendedState(6);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(12, 45, 60));
        jPanel3.setRequestFocusEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Lista de Produtos");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Atendente:");

        txtNome.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Atendente:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome)
                .addGap(302, 302, 302))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(txtNome)))
        );

        jPanel9.setBackground(new java.awt.Color(12, 45, 60));

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Código do Produto - F1 para pesquisar");

        txtCodigoBarras.setBackground(new java.awt.Color(12, 45, 60));
        txtCodigoBarras.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarrasActionPerformed(evt);
            }
        });
        txtCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoBarras)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 449, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(12, 45, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_001.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(12, 45, 60));

        txtPreco.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(255, 255, 255));
        txtPreco.setText("R$ 0,00");

        txtNomeProduto.setFont(new java.awt.Font("Arial Black", 0, 26)); // NOI18N
        txtNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setText("Nome do Produto");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome do Produto:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor Unitário:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(txtNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtPreco))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtNomeProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TabelaNotinha.setBackground(new java.awt.Color(12, 45, 60));
        TabelaNotinha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabelaNotinha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TabelaNotinha.setForeground(new java.awt.Color(255, 255, 255));
        TabelaNotinha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor Total"
            }
        ));
        TabelaNotinha.setGridColor(new java.awt.Color(12, 45, 60));
        TabelaNotinha.setSelectionBackground(new java.awt.Color(12, 45, 60));
        jScrollPane1.setViewportView(TabelaNotinha);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(12, 45, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor Total(R$):");

        txtPrecoTotal.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        txtPrecoTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecoTotal.setText("0,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPrecoTotal)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("F2 - Encerrar Venda");

        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("F1 - Pesquisa");

        txtFecharCaixa.setForeground(new java.awt.Color(255, 255, 255));
        txtFecharCaixa.setText("F3 - Fechar Caixa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(txtFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1036, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(12, 45, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 677, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 677, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened


    private void txtCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarrasActionPerformed
        Variáveis:
        pag_dinheiro.Mostrar(this);
        vender = true;
        int quantidade = 0;
        String cb_quatro_caracteres = null;
        String[] valores = null;
        String codigo_barras = null;
        String sql = null;

        tabelaModelo = (DefaultTableModel) TabelaNotinha.getModel();
        tabelaModelo.setNumRows(200);

        while (vender == true) {
            if (atualizou == 1) {
                UpdateContador();
                atualizou = 0;
            }
            codigo_barras = txtCodigoBarras.getText();
            if (codigo_barras.contains("x")) {
                valores = codigo_barras.split("x");
                cb_quatro_caracteres = codigo_barras.substring(0, 4);
                sql = "select * from produto where cod_barras like '"
                        + valores[1] + "'";
                String sql_cupom = "insert into cupom_nao_fiscal(id_compra,nome_produto,codigo_barras,preco,quantidade,operador_caixa) values(?,?,?,?,?,?)";

                try {
                    pst = con.prepareStatement(sql);
                    pstCupom = con.prepareStatement(sql_cupom);
                } catch (SQLException ex) {
                    Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs = pst.executeQuery();

                    if (rs.next()) {

                        txtNomeProduto.setText(rs.getString("nome"));
                        String descricao = txtNomeProduto.getText();
                        String preco = rs.getString("preco");
                        Float preco_prod = Float.valueOf(preco);
                        quantidade = Integer.parseInt(valores[0]);
                        pt = PrecoTotalCompra.TotalCompra(quantidade, preco_prod, soma);
                        String value = String.format("%1$.02f", pt);
                        soma = soma + preco_prod;
                        float valor_total = quantidade * preco_prod;

                        String value_unitario = String.format("%1$.02f", preco_prod);
                        String value_preco = String.format("%1$.02f", valor_total);
                        txtPrecoTotal.setText(value);

                        txtPreco.setText(value_unitario);

                        txtCodigoBarras.setText("");
                        tabelaModelo.setValueAt(value_preco, linha_preco, 3);
                        tabelaModelo.setValueAt(quantidade, linha_quantidade, 2);
                        tabelaModelo.setValueAt(descricao, linha_descricao, 1);
                        tabelaModelo.setValueAt(valores[1], linha_codbarras, 0);

                        pstCupom.setInt(1, id_compra);
                        pstCupom.setString(2, descricao);
                        pstCupom.setString(3, valores[1]);
                        pstCupom.setFloat(4, valor_total);
                        pstCupom.setInt(5, quantidade);
                        pstCupom.setString(6, operador);
                        pstCupom.execute();

                        linha_preco += 1;
                        linha_quantidade += 1;
                        linha_descricao += 1;
                        linha_codbarras += 1;
                        tabelaModelo.addRow(new Object[]{null, null});
                    } else {
                        JOptionPane.showMessageDialog(null, "Este produto não está cadastrado");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
                vender = false;
            } else if (!codigo_barras.contains("x") || codigo_barras.equals("")) {
                sql = "select * from produto where cod_barras like '"
                        + txtCodigoBarras.getText() + "'";
                String sql_cupom = "insert into cupom_nao_fiscal(id_compra,nome_produto,codigo_barras,preco,quantidade,operador_caixa) values(?,?,?,?,?,?)";

                try {
                    pst = con.prepareStatement(sql);
                    pstCupom = con.prepareStatement(sql_cupom);
                } catch (SQLException ex) {
                    Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs = pst.executeQuery();
                    if (rs.next()) {

                        txtNomeProduto.setText(rs.getString("nome"));
                        String descricao = txtNomeProduto.getText();
                        String preco = rs.getString("preco");
                        Float preco_prod = Float.valueOf(preco);
                        soma = soma + preco_prod;
                        pt = PrecoTotalCompra.TotalCompra(quantidade, preco_prod, soma);
                        String value = String.format("%1$.02f", pt);
                        String value_preco = String.format("%1$.02f", preco_prod);
                        String codigoB = txtCodigoBarras.getText();
                        String value_unitario = String.format("%1$.02f", preco_prod);
                        txtPrecoTotal.setText(value);
                        txtPreco.setText(value_unitario);

                        txtCodigoBarras.setText("");
                        tabelaModelo.setValueAt(value_preco, linha_preco, 3);
                        tabelaModelo.setValueAt(1, linha_quantidade, 2);
                        tabelaModelo.setValueAt(descricao, linha_descricao, 1);
                        tabelaModelo.setValueAt(codigoB, linha_codbarras, 0);

                        pstCupom.setInt(1, id_compra);
                        pstCupom.setString(2, descricao);
                        pstCupom.setString(3, codigo_barras);
                        pstCupom.setFloat(4, preco_prod);
                        pstCupom.setInt(5, 1);
                        pstCupom.setString(6, operador);
                        pstCupom.execute();

                        linha_preco += 1;
                        linha_quantidade += 1;
                        linha_descricao += 1;
                        linha_codbarras += 1;
                        tabelaModelo.addRow(new Object[]{null, null});
                    } else {
                        JOptionPane.showMessageDialog(null, "Este produto não está cadastrado");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
                vender = false;
            } else {
                JOptionPane.showMessageDialog(null, "Este produto não está cadastrado");
            }
        }
    }//GEN-LAST:event_txtCodigoBarrasActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void txtCodigoBarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyPressed

        int key = evt.getKeyCode();
        if (KeyEvent.VK_F2 == key) {
            apertouformadepagamento = 1;
            enviaPreco = new NN_Mercado_TelaFormaDePagamento();
            enviaPreco.setVisible(true);

            enviaPreco.recebeDados(String.valueOf(pt));
        } else if (KeyEvent.VK_F1 == key) {
            try {
                new NN_Mercado_TelaPesquisa().setVisible(true);
            } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
                Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (KeyEvent.VK_F3 == key) {
            NN_Mercado_VerificacaoSaida verifica_saida;
            try {
                verifica_saida = new NN_Mercado_VerificacaoSaida(this);
                verifica_saida.setVisible(true);
            } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
                Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (KeyEvent.VK_ESCAPE == key && apertouformadepagamento == 1) {

            txtNomeProduto.setText("Nome do Produto");
            txtPreco.setText("0.00");
            txtPrecoTotal.setText("0.00");
            int j;
            int tamanho = tabelaModelo.getRowCount();
            System.out.println(tabelaModelo.getRowCount());
            for (j = tamanho - 1; j >= 0; j--) {
                tabelaModelo.removeRow(j);
            }
            tabelaModelo.setRowCount(1);
            tabelaModelo = (DefaultTableModel) TabelaNotinha.getModel();
            i = 0;
            linha_preco = 0;
            linha_quantidade = 0;
            linha_descricao = 0;
            linha_codbarras = 0;
            soma = 0;
            vender = true;
            apertouformadepagamento = 0;
        } else if (NN_Mercado_TelaPagamentoDinheiro.tecla_escD == 1 || NN_Mercado_TelaPagamentoCartao.tecla_escC == 1) {
            System.out.println("veio aquiiiiinnnn");
            txtNomeProduto.setText("Nome do Produto");
            txtPreco.setText("0.00");
            txtPrecoTotal.setText("0.00");
            int j;
            int tamanho = tabelaModelo.getRowCount();
            System.out.println(tabelaModelo.getRowCount());
            for (j = tamanho - 1; j >= 0; j--) {
                tabelaModelo.removeRow(j);
            }
            tabelaModelo.setRowCount(1);
            tabelaModelo = (DefaultTableModel) TabelaNotinha.getModel();
            i = 0;
            linha_preco = 0;
            linha_quantidade = 0;
            linha_descricao = 0;
            linha_codbarras = 0;
            soma = 0;
            vender = true;
            apertouformadepagamento = 0;
            NN_Mercado_TelaPagamentoDinheiro.tecla_escD = 0;
            NN_Mercado_TelaPagamentoCartao.tecla_escC = 0;
        }
    }//GEN-LAST:event_txtCodigoBarrasKeyPressed

    /**
     *
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String args[]) throws ClassNotFoundException {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaInicial.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NN_Mercado_TelaInicial().setVisible(true);
                
            } catch (ClassNotFoundException | SQLException | InterruptedException ex) {
                Logger.getLogger(NN_Mercado_TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable TabelaNotinha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label8;
    private javax.swing.JTextField txtCodigoBarras;
    private java.awt.Label txtFecharCaixa;
    private javax.swing.JLabel txtNome;
    private static javax.swing.JLabel txtNomeProduto;
    private static javax.swing.JLabel txtPreco;
    private static javax.swing.JLabel txtPrecoTotal;
    // End of variables declaration//GEN-END:variables

}
