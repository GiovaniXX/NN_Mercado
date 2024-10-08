package Forms;

import Cálculos.TrocoDinheiro;
import com.formdev.flatlaf.IntelliJTheme;
import static java.awt.Color.red;
import java.awt.Window;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NN_Mercado_TelaPagamentoCartao extends javax.swing.JFrame {
   
    private NN_Mercado_TelaFormaDePagamento principal;
    static float valor_t = 0;
    float troco;
    static float get_valort;
    static int tecla_escC = 0;

    public void TotalPreco() {
        float valor = NN_Mercado_TelaFormaDePagamento.valort;
        String value = String.format("%1$.02f", valor);
        txtValor.setText(value);
    }

    public NN_Mercado_TelaPagamentoCartao() {
        initComponents();
    }

    public void MostrarTela(NN_Mercado_TelaFormaDePagamento tela_principal, boolean mostra) {
        this.principal = tela_principal;
        setVisible(mostra);
        TotalPreco();
    }

    public void ExecutaMetodo(String recebe) {
        principal.recebeValorTroco(recebe);
        get_valort = NN_Mercado_TelaFormaDePagamento.valort;
    }

    public void Operacoes() {
        TotalPreco();
        String valor_passado = null;
        float valor_total;
        float valor_passadoF;
        txtMensagem.setForeground(red);
        txtMensagem.setText("Processando transação....");
        if (!txtPagamento.getText().equals("")) {
            valor_passado = txtPagamento.getText();
        }
        if (NN_Mercado_TelaFormaDePagamento.passaValorRestante() == 0) {
            valor_total = NN_Mercado_TelaInicial.TotalCompra();
        } else {
            valor_total = NN_Mercado_TelaFormaDePagamento.passaValorRestante();
        }
        valor_passadoF = Float.parseFloat(valor_passado);
        troco = TrocoDinheiro.Troco(valor_total, valor_passadoF);
        if (troco < 0.00) {
            Object[] options = {"Confirmar"};
            switch (JOptionPane.showOptionDialog(null, "Está faltando dinheiro!", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
                case 0:
                    ExecutaMetodo(String.valueOf(troco));
                    txtPagamento.setText("");
                    this.dispose();
                    break;
            }
            //7894900530001
        } else {
            txtTexto.setText("Troco em dinheiro: ");
            String value = String.format("%1$.02f", troco);
            txtValor.setText(value);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtPagamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JLabel();
        txtTexto = new javax.swing.JLabel();
        txtValor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        txtPagamento.setBackground(new java.awt.Color(12, 45, 60));
        txtPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagamentoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(12, 45, 60));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagamento no Cartão");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informe o valor a ser pago");

        txtMensagem.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        txtMensagem.setForeground(new java.awt.Color(255, 255, 255));
        txtMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMensagem.setText("Mensagens");

        txtTexto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTexto.setForeground(new java.awt.Color(255, 255, 255));
        txtTexto.setText("Valor");

        txtValor.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setText("0,00");

        jButton1.setBackground(new java.awt.Color(12, 45, 60));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addComponent(txtMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtPagamento)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTexto)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTexto)
                    .addComponent(txtValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtMensagem)
                .addGap(22, 22, 22))
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

    private void txtPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagamentoActionPerformed

        Operacoes();

    }//GEN-LAST:event_txtPagamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtPagamento.getText().equals("") || troco < 0) {
            JOptionPane.showMessageDialog(null, "Está faltando dinheiro!");
        } else {
            this.dispose();
            principal.dispose();
            tecla_escC = 1;
            NN_Mercado_TelaInicial.AtualizaCaixa();
            //  System.out.println("tecla esc dinhheiro " + tecla_esc);
        }

        //Fecha todas as janelas
        System.gc();
        for (Window window : Window.getWindows()) {
            window.dispose();
        }
        try {
            new NN_Mercado_TelaInicial().setVisible(true);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(NN_Mercado_TelaPagamentoDinheiro.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException | InterruptedException ex) {
            Logger.getLogger(NN_Mercado_TelaPagamentoCartao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaPagamentoCartao.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NN_Mercado_TelaPagamentoCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtMensagem;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JLabel txtTexto;
    private javax.swing.JLabel txtValor;
    // End of variables declaration//GEN-END:variables
}
