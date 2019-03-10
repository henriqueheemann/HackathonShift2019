package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import model.Main;
import model.veiculosEntity;

public class camSec extends javax.swing.JFrame {

    public camSec() {
        initComponents();
        inicializaPessoas();
        carroAtual = 0;
        lblPlaca.setText("Placa: ");
        lblSituacao.setText("Situação: ");
        atualizaImagem();
    }

    public void atualizaImagem() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\Jussara\\Documents\\NetBeansProjects\\CamSec\\camsec-lib\\veiculos\\carro0" + carroAtual + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        jLabel1.setIcon(imageIcon);
    }

    veiculosEntity veiculo1, veiculo2;

    public void inicializaPessoas() {
        veiculo1 = new veiculosEntity(1, "HEX0049", "Cadastrado.");
        veiculo2 = new veiculosEntity(2, "PJJ9889", "Veículo de serviço.");
    }

    private int carroAtual = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTrocarImagem = new javax.swing.JButton();
        btnIdentificarImagem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblStatusIdentificacao = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTrocarImagem.setBackground(new java.awt.Color(204, 204, 204));
        btnTrocarImagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTrocarImagem.setText("Trocar");
        btnTrocarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarImagemActionPerformed(evt);
            }
        });

        btnIdentificarImagem.setBackground(new java.awt.Color(204, 204, 204));
        btnIdentificarImagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIdentificarImagem.setText("Identificar");
        btnIdentificarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificarImagemActionPerformed(evt);
            }
        });

        lblStatusIdentificacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatusIdentificacao.setText("STATUS");

        lblPlaca.setText("placa");

        lblSituacao.setText("situacao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatusIdentificacao)
                    .addComponent(lblPlaca)
                    .addComponent(lblSituacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatusIdentificacao)
                .addGap(18, 18, 18)
                .addComponent(lblPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSituacao)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnIdentificarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTrocarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTrocarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIdentificarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrocarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarImagemActionPerformed
        if (carroAtual == 0) {
            lblPlaca.setText("");
            lblSituacao.setText("");
        }
        
        if (carroAtual == 2) {
            carroAtual = 0;
        } else {
            carroAtual++;
        }
        atualizaImagem();
        lblPlaca.setText("Placa: ");
        lblSituacao.setText("Situação: ");
    }//GEN-LAST:event_btnTrocarImagemActionPerformed

    private void btnIdentificarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificarImagemActionPerformed
        lblStatusIdentificacao.setText("IDENTIFICANDO...");
        atualizaImagem();
        if (carroAtual == 0) {
            String identificacaoDoTexto = Main.identificaUsandoOCR("C:\\Users\\Jussara\\Documents\\NetBeansProjects\\CamSec\\camsec-lib\\veiculos\\carro00.jpg");
            lblPlaca.setText(identificacaoDoTexto);
            lblSituacao.setText("");
            lblStatusIdentificacao.setText("IDENTIFICADO COM SUCESSO!");

        } else if (carroAtual == 1) {
            lblPlaca.setText("Placa: " + veiculo1.getPlaca());
            lblSituacao.setText("Situação: " + veiculo1.getSituacao());
            lblStatusIdentificacao.setText("IDENTIFICADO COM SUCESSO!");

        } else if (carroAtual == 2) {
            lblPlaca.setText("Placa: " + veiculo2.getPlaca());
            lblSituacao.setText("Situação: " + veiculo2.getSituacao());
            lblStatusIdentificacao.setText("IDENTIFICADO COM SUCESSO!");

        }
    }//GEN-LAST:event_btnIdentificarImagemActionPerformed

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
            java.util.logging.Logger.getLogger(camSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(camSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(camSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(camSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new camSec().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIdentificarImagem;
    private javax.swing.JButton btnTrocarImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblStatusIdentificacao;
    // End of variables declaration//GEN-END:variables
}
