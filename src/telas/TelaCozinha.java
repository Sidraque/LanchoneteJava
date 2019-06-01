package telas;

import atendente.Atendente;
import atendente.DadosAtendente;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import pedido.DadosPedido;
import pedido.Pedido;

public class TelaCozinha extends javax.swing.JFrame {

    Atendente atendente = new Atendente();
    ArrayList<Atendente> modelAtendente = new ArrayList<>();

    /**
     * Creates new form FormLanchonete4
     */
    public TelaCozinha() {
        initComponents();
        setLocationRelativeTo(null);
        carregarPedidos();
        atualizarAtendentes();

        //Coloca as descrições sob os icones na tela principal.
        jbIncluirChef.setVerticalTextPosition(SwingConstants.BOTTOM);
        jbIncluirChef.setHorizontalTextPosition(SwingConstants.CENTER);

        jbPedidoPronto.setVerticalTextPosition(SwingConstants.BOTTOM);
        jbPedidoPronto.setHorizontalTextPosition(SwingConstants.CENTER);

        jbPedidoEntregue.setVerticalTextPosition(SwingConstants.BOTTOM);
        jbPedidoEntregue.setHorizontalTextPosition(SwingConstants.CENTER);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCancelarPedido = new javax.swing.JButton();
        jbPedidoEntregue = new javax.swing.JButton();
        jbPedidoPronto = new javax.swing.JButton();
        jbIncluirChef = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAtendentes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConzinha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COZINHA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(19, 18, 19));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("CONZINHA"); // NOI18N

        jbCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-cancelar-34.png"))); // NOI18N
        jbCancelarPedido.setText("CANCELAR PEDIDO");
        jbCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarPedidoActionPerformed(evt);
            }
        });

        jbPedidoEntregue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-selecionado-36.png"))); // NOI18N
        jbPedidoEntregue.setText("ENTREGUE");
        jbPedidoEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidoEntregueActionPerformed(evt);
            }
        });

        jbPedidoPronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-selecionado-36.png"))); // NOI18N
        jbPedidoPronto.setText("PEDIDO PRONTO");
        jbPedidoPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidoProntoActionPerformed(evt);
            }
        });

        jbIncluirChef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-voltar-48.png"))); // NOI18N
        jbIncluirChef.setText("INCLUIR");
        jbIncluirChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirChefActionPerformed(evt);
            }
        });

        jtAtendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME CHEF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtAtendentes);
        if (jtAtendentes.getColumnModel().getColumnCount() > 0) {
            jtAtendentes.getColumnModel().getColumn(0).setMinWidth(1000);
            jtAtendentes.getColumnModel().getColumn(0).setPreferredWidth(1000);
            jtAtendentes.getColumnModel().getColumn(0).setMaxWidth(1000);
        }

        jLabel1.setBackground(new java.awt.Color(0, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE PEDIDOS");

        jTableConzinha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cód.", "Quant", "Cliente", "Descrição", "Obs.", "Hora", "Atendente", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTableConzinha);
        if (jTableConzinha.getColumnModel().getColumnCount() > 0) {
            jTableConzinha.getColumnModel().getColumn(0).setResizable(false);
            jTableConzinha.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jbCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jbPedidoPronto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbPedidoEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIncluirChef, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jbIncluirChef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPedidoPronto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPedidoEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPedidoEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidoEntregueActionPerformed
        // Altera para "Entregue" o status do pedido:
        try {

            Pedido pedido = new Pedido();
            DadosPedido dadosPedido = new DadosPedido();

            int linha = jTableConzinha.getSelectedRow();
            pedido.setCod_pedido((int) jTableConzinha.getValueAt(linha, 0));

            pedido.setStatus("Entregue");

            dadosPedido.atualizarStatus(pedido);

            carregarPedidos();

        } catch (Exception ex) {
            //Logger.getLogger(TelaCozinha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbPedidoEntregueActionPerformed

    private void jbCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarPedidoActionPerformed
        // Cancela o pedido selecionado na tela.

        DadosPedido dadosPedido = new DadosPedido();
        Pedido pedido = new Pedido();

        int linha = jTableConzinha.getSelectedRow();
        pedido.setCod_pedido((int) jTableConzinha.getValueAt(linha, 0));

        try {
            dadosPedido.removerPedido(pedido);
            carregarPedidos();

        } catch (Exception ex) {
            //Logger.getLogger(TelaCozinha.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jbCancelarPedidoActionPerformed

    private void jbIncluirChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirChefActionPerformed
        // inclui o funcionário responsável pelo pedido.

        try {
            Pedido pedido = new Pedido();
            Atendente at = new Atendente();
            DadosPedido dadosPedido = new DadosPedido();

            int linhaPedido = jTableConzinha.getSelectedRow();
            int codigoPedido = (int) jTableConzinha.getValueAt(linhaPedido, 0);
            pedido.setCod_pedido(codigoPedido);

            int linhaAtendente = jtAtendentes.getSelectedRow();
            int matriculaAtendente = (int) jtAtendentes.getValueAt(linhaAtendente, 0);
            at.setMatricula(matriculaAtendente);
            pedido.setAtendente(at);

            dadosPedido.atualizarAtendente(pedido);

        } catch (Exception ex) {
            //Logger.getLogger(TelaCozinha.class.getName()).log(Level.SEVERE, null, ex);
        }

        atualizarAtendentes();
        carregarPedidos();


    }//GEN-LAST:event_jbIncluirChefActionPerformed

    private void jbPedidoProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidoProntoActionPerformed
        // Coloca o status de pronto para o pedido.

        try {

            Pedido pedido = new Pedido();
            DadosPedido dadosPedido = new DadosPedido();

            int linha = jTableConzinha.getSelectedRow();
            pedido.setCod_pedido((int) jTableConzinha.getValueAt(linha, 0));

            pedido.setStatus("Pronto");

            dadosPedido.atualizarStatus(pedido);

            carregarPedidos();

        } catch (Exception ex) {
            // Logger.getLogger(TelaCozinha.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jbPedidoProntoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCozinha().setVisible(true);
            }
        });
    }

    /**
     * Método que lista os pedidos.
     */
    private void carregarPedidos() {

        try {

            Pedido filtro = new Pedido();
            Pedido pedidos = new Pedido();
            Atendente atendente = new Atendente();
            DadosPedido dadosPedidos = new DadosPedido();
            ArrayList<Pedido> listaPedidos = dadosPedidos.pesquisarPedidoClientePendentes();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Código", "Quant.", "Cliente", "Descrição", "Obs.", "Hora", "Atendente", "Status"});
            for (Pedido pedido : listaPedidos) {
                modelo.addRow(new Object[]{pedido.getCod_pedido(), pedido.getQuantidade(), pedido.getCliente().getNome(), pedido.getProduto().getNome(), pedido.getObservacao(), pedido.getHora(), pedido.getAtendente().getNome(), pedido.getStatus()});
            }
            jTableConzinha.setModel(modelo);
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * Lista os funcionários que estão trabalhando no turno.
     */
    private void atualizarAtendentes() {

        try {

            Pedido filtro = new Pedido();
            Atendente atendente = new Atendente();
            DadosAtendente dadosAtendente = new DadosAtendente();

            ArrayList<Atendente> listaAtendentes = dadosAtendente.listarAtendentes();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"MATRÍCULA", "NOME CHEF"});
            for (Atendente a : listaAtendentes) {
                if (a.getMatricula() != 1) { //Esse if evita que o usuário "sem atendente" seja mostrado na lista de atendentes.
                    modelo.addRow(new Object[]{a.getMatricula(), a.getNome()});
                }
            }
            jtAtendentes.setModel(modelo);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConzinha;
    private javax.swing.JButton jbCancelarPedido;
    private javax.swing.JButton jbIncluirChef;
    private javax.swing.JButton jbPedidoEntregue;
    private javax.swing.JButton jbPedidoPronto;
    private javax.swing.JTable jtAtendentes;
    // End of variables declaration//GEN-END:variables
}