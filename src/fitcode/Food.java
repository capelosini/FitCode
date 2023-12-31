/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitcode;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vzako
 */
public class Food extends javax.swing.JFrame {
    
    User user;
    
    /**
     * Creates new form Food
     */
    public Food(User user) {
        initComponents();
        this.user=user;
        
        Image icon = new ImageIcon(this.getClass().getResource("../images/logo.png")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackToMenuBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FDComboBox = new javax.swing.JComboBox<>();
        FDjantarTXT = new javax.swing.JTextField();
        FDcafemanhaTXT = new javax.swing.JTextField();
        FDalmocoTXT = new javax.swing.JTextField();
        FDaddBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FDtabela = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Alimentação");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(48, 165, 88));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fit");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel2.setText("Code");

        BackToMenuBTN.setBackground(new java.awt.Color(226, 249, 206));
        BackToMenuBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackToMenuBTN.setText("< Voltar");
        BackToMenuBTN.setFocusPainted(false);
        BackToMenuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackToMenuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(337, 337, 337))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BackToMenuBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(226, 249, 206));
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("ATENÇÃO: Em caso de alteração na alimentação consulte um médico ou especialista.");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 590, 540, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Jantar");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 290, 260, 55);

        FDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-Feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo" }));
        jPanel3.add(FDComboBox);
        FDComboBox.setBounds(30, 80, 130, 30);
        jPanel3.add(FDjantarTXT);
        FDjantarTXT.setBounds(30, 350, 200, 30);
        jPanel3.add(FDcafemanhaTXT);
        FDcafemanhaTXT.setBounds(30, 160, 200, 30);
        jPanel3.add(FDalmocoTXT);
        FDalmocoTXT.setBounds(30, 250, 200, 30);

        FDaddBTN.setBackground(new java.awt.Color(48, 165, 88));
        FDaddBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FDaddBTN.setText("Adicionar");
        FDaddBTN.setFocusPainted(false);
        FDaddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDaddBTNActionPerformed(evt);
            }
        });
        jPanel3.add(FDaddBTN);
        FDaddBTN.setBounds(80, 400, 100, 27);

        FDtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia da semana", "Café da manhã", "Almoço", "Jantar"
            }
        ));
        jScrollPane1.setViewportView(FDtabela);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(312, 20, 510, 520);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel6.setText("Alimentação");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 10, 260, 55);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Café da manhã");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 110, 260, 55);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Almoço");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 190, 260, 55);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BackToMenuBTNActionPerformed

    private void FDaddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDaddBTNActionPerformed
        if (FDComboBox.getSelectedItem().toString().strip().equals("") || FDcafemanhaTXT.getText().toString().strip().equals("") || FDalmocoTXT.getText().toString().strip().equals("") || FDjantarTXT.getText().toString().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, coloque tudo o que comeu no dia!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) FDtabela.getModel();
        model.addRow(new Object[]{FDComboBox.getSelectedItem().toString().strip(), FDcafemanhaTXT.getText().toString().strip(), FDalmocoTXT.getText().toString().strip(), FDjantarTXT.getText().toString().strip()});
        FDcafemanhaTXT.setText("");
        FDalmocoTXT.setText("");
        FDjantarTXT.setText("");
    }//GEN-LAST:event_FDaddBTNActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        new MainMenu(this.user).setVisible(true);
    }//GEN-LAST:event_formComponentHidden

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
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBTN;
    private javax.swing.JComboBox<String> FDComboBox;
    private javax.swing.JButton FDaddBTN;
    private javax.swing.JTextField FDalmocoTXT;
    private javax.swing.JTextField FDcafemanhaTXT;
    private javax.swing.JTextField FDjantarTXT;
    private javax.swing.JTable FDtabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
