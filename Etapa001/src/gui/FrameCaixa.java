package gui;

import etapa001.Produto;
import etapa001.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameCaixa extends javax.swing.JFrame {

    public FrameCaixa() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListar = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        bntRemover = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 66, 33));

        jPanel2.setBackground(new java.awt.Color(255, 170, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 35, 20));
        jLabel1.setText("CAIXA");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 35, 20));
        jLabel2.setText("Pesquisar produto (ID)");

        txtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        txtPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(80, 35, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 35, 20));
        jLabel3.setText("Quantidade de Produtos");

        txtQuant.setBackground(new java.awt.Color(255, 255, 255));
        txtQuant.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtQuant.setForeground(new java.awt.Color(80, 35, 20));

        btnAdicionar.setBackground(new java.awt.Color(80, 35, 20));
        btnAdicionar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar ao carrinho");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblListar.setBackground(new java.awt.Color(255, 255, 255));
        tblListar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tblListar.setForeground(new java.awt.Color(80, 35, 20));
        tblListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "id", "Nome", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tblListar);

        btnCancelar.setBackground(new java.awt.Color(80, 35, 20));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar Compra");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        bntRemover.setBackground(new java.awt.Color(80, 35, 20));
        bntRemover.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bntRemover.setForeground(new java.awt.Color(255, 255, 255));
        bntRemover.setText("Remover");
        bntRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRemoverActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(80, 35, 20));
        btnFinalizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(80, 35, 20));
        lblTotal.setText("00.00");

        lblTotal1.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(80, 35, 20));
        lblTotal1.setText("Valor Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(299, 299, 299))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAdicionar))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bntRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(287, 287, 287)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblTotal1)
                            .addGap(18, 18, 18)
                            .addComponent(lblTotal)
                            .addGap(50, 50, 50))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotal1))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(80, 35, 20));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String idProdutoTxt = txtPesquisar.getText().trim();
        String quantidadeStr = txtQuant.getText().trim();

        if (idProdutoTxt.isEmpty() || quantidadeStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha os campos de pesquisa e quantidade!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int quantidade = Integer.parseInt(quantidadeStr);
            int idProduto = Integer.parseInt(idProdutoTxt);

            ProdutoDAO produtoDAO = new ProdutoDAO();
            Produto produto = produtoDAO.buscarPorId(idProduto);

            if (produto == null) {
                JOptionPane.showMessageDialog(this, "Produto não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblListar.getModel();
            double precoTotal = produto.getPreco() * quantidade;
            model.addRow(new Object[]{produto.getId(), produto.getNome(), quantidade, String.format("%.2f", precoTotal)});

            atualizarValorTotal();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida. Insira um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar produto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblListar.getModel();
        model.setRowCount(0);
        atualizarValorTotal();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void bntRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRemoverActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblListar.getModel();

        int selectedRow = tblListar.getSelectedRow();

        if (selectedRow != -1) {
            model.removeRow(selectedRow);

            atualizarValorTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para remover.");
        }
    }//GEN-LAST:event_bntRemoverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblListar.getModel();

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Carrinho vazio. Não há nada para finalizar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            for (int i = 0; i < model.getRowCount(); i++) {

                String idStr = model.getValueAt(i, 0).toString();
                int id = Integer.parseInt(idStr);

                String quantidadeStr = model.getValueAt(i, 2).toString();
                int quantidadeComprada = Integer.parseInt(quantidadeStr);

                ProdutoDAO produtoDAO = new ProdutoDAO();
                produtoDAO.atualizarEstoque(id, quantidadeComprada);
            }

            model.setRowCount(0);
            atualizarValorTotal();
            JOptionPane.showMessageDialog(this, "Compra finalizada com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao processar valores do carrinho. Verifique os dados e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRemover;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JTable tblListar;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables

    private void atualizarValorTotal() {
        double valorTotal = 0.0;
        DefaultTableModel model = (DefaultTableModel) tblListar.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            Object precoObj = model.getValueAt(i, 3);
            if (precoObj != null) {
                try {
                    valorTotal += Double.parseDouble(precoObj.toString().replace(",", "."));
                } catch (NumberFormatException e) {
                    System.err.println("Erro ao converter preço na linha " + i + ": " + precoObj);
                }
            }
        }

        lblTotal.setText(String.format("R$ %.2f", valorTotal));
    }
}
