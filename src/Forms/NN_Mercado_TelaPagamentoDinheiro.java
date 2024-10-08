package Forms;

import Cálculos.TrocoDinheiro;
import com.formdev.flatlaf.IntelliJTheme;
import javax.swing.JOptionPane;

public class NN_Mercado_TelaPagamentoDinheiro extends javax.swing.JFrame {

    private NN_Mercado_TelaFormaDePagamento principal;
    static int tecla_escD = 0;
    float troco;

    //private NN_Mercado_TelaFormaDePagamento principal = new NN_Mercado_TelaFormaDePagamento();
    public void MostrarTela(NN_Mercado_TelaFormaDePagamento tela_principal, boolean mostra) {
        this.principal = tela_principal;
        setVisible(mostra);
    }

    public void ExecutaMetodo(String recebe) {
        principal.recebeValorTroco(recebe);
    }

    public NN_Mercado_TelaPagamentoDinheiro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 45, 60));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagamento em Dinheiro");

        txtValorPago.setBackground(new java.awt.Color(12, 45, 60));
        txtValorPago.setForeground(new java.awt.Color(255, 255, 255));
        txtValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informe o valor dado pelo Cliente");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Troco");

        txtTroco.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        txtTroco.setForeground(new java.awt.Color(255, 255, 255));
        txtTroco.setText("0.00");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(233, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTroco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtValorPago)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel2))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTroco)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addContainerGap())
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
            .addComponent(jScrollPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagoActionPerformed
        String valor_passado;
        float valor_total;
        float valor_passadoF;
        //float troco;

        valor_passado = txtValorPago.getText();
        if (NN_Mercado_TelaFormaDePagamento.passaValorRestante() == 0) {
            valor_total = NN_Mercado_TelaInicial.TotalCompra();
        } else {
            valor_total = NN_Mercado_TelaFormaDePagamento.passaValorRestante();
        }
        valor_passadoF = Float.parseFloat(valor_passado);
        troco = TrocoDinheiro.Troco(valor_total, valor_passadoF);
        if (troco < 0.00) {

            Object[] options = {"Confirmar"};
            switch (JOptionPane.showOptionDialog(null, "Está faltando dinheiro", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0])) {
                case 0:
                    ExecutaMetodo(String.valueOf(troco));
                    this.dispose();
                    break;
            }

        } else {
            String value = String.format("%1$.02f", troco);
            txtTroco.setText(value);
            /* try {
           // TimeUnit.SECONDS.sleep(10);
           // this.dispose();
            new MercadosNLTelaInicial().setVisible(true); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MercadosNLTelaPagamentoDinhei.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        }


    }//GEN-LAST:event_txtValorPagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtValorPago.getText().equals("") || troco < 0) {
            JOptionPane.showMessageDialog(null, "Está faltando dinheiro");
        } else {
            this.dispose();
            principal.dispose();
            NN_Mercado_TelaInicial.AtualizaCaixa();
            // tecla_escD = 1;
            // System.out.println("tecla esc dinh " + tecla_escD);
        }

        /* Fecha todas as janelas
        System.gc();  
        for (Window window : Window.getWindows()) {  
                window.dispose();  
    
            }
       try {
           new MercadosNLTelaInicial().setVisible(true);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(MercadosNLTelaPagamentoDinhei.class.getName()).log(Level.SEVERE, null, ex);
       }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(NN_Mercado_TelaPagamentoDinheiro.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NN_Mercado_TelaPagamentoDinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtTroco;
    private javax.swing.JTextField txtValorPago;
    // End of variables declaration//GEN-END:variables

    void Mostrar(NN_Mercado_TelaInicial aThis) {

    }
}
