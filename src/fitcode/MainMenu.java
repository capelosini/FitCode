/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitcode;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.oandrade1
 */
public class MainMenu extends javax.swing.JFrame {
    
    User user;
    
    public MainMenu(User user) {
        initComponents();
        this.user=user;
        userNameLabel.setText("Ola, "+(String)this.user.get("name"));
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ExitBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        GOTOYourInformation = new javax.swing.JButton();
        GOTOTrainingBTN = new javax.swing.JButton();
        GOTOFoodBTN = new javax.swing.JButton();
        GOTOHealthRoutines = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GOTOAboutUsBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 165, 88));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fit");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel2.setText("Code");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Hello USER");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileIMG.png"))); // NOI18N

        ExitBTN.setBackground(new java.awt.Color(226, 249, 206));
        ExitBTN.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ExitBTN.setText("Sair");
        ExitBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitBTN.setFocusPainted(false);
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(userNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(userNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(226, 249, 206));

        GOTOYourInformation.setBackground(new java.awt.Color(48, 165, 88));
        GOTOYourInformation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOTOYourInformation.setText("Suas informações");
        GOTOYourInformation.setFocusPainted(false);
        GOTOYourInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOYourInformationActionPerformed(evt);
            }
        });

        GOTOTrainingBTN.setBackground(new java.awt.Color(48, 165, 88));
        GOTOTrainingBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOTOTrainingBTN.setText("Seus treinos");
        GOTOTrainingBTN.setFocusPainted(false);
        GOTOTrainingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOTrainingBTNActionPerformed(evt);
            }
        });

        GOTOFoodBTN.setBackground(new java.awt.Color(48, 165, 88));
        GOTOFoodBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOTOFoodBTN.setText("Alimentação");
        GOTOFoodBTN.setFocusPainted(false);
        GOTOFoodBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOFoodBTNActionPerformed(evt);
            }
        });

        GOTOHealthRoutines.setBackground(new java.awt.Color(48, 165, 88));
        GOTOHealthRoutines.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOTOHealthRoutines.setText("Controle de líquido");
        GOTOHealthRoutines.setFocusPainted(false);
        GOTOHealthRoutines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOHealthRoutinesActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("ATENÇÃO: Em caso de alteração em treinos ou alimentação,");

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("consulte um médico ou especialista.");

        GOTOAboutUsBTN.setBackground(new java.awt.Color(48, 165, 88));
        GOTOAboutUsBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOTOAboutUsBTN.setText("Sobre nós");
        GOTOAboutUsBTN.setFocusPainted(false);
        GOTOAboutUsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOAboutUsBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(GOTOYourInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 536, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GOTOAboutUsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GOTOFoodBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GOTOHealthRoutines, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GOTOTrainingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(GOTOYourInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GOTOTrainingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GOTOFoodBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GOTOHealthRoutines, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GOTOAboutUsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GOTOTrainingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOTrainingBTNActionPerformed
        new Trainings(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GOTOTrainingBTNActionPerformed

    private void GOTOAboutUsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOAboutUsBTNActionPerformed
        new AboutUs(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GOTOAboutUsBTNActionPerformed

    private void GOTOYourInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOYourInformationActionPerformed
        // TODO add your handling code here:
        new YourInformation(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GOTOYourInformationActionPerformed

    private void GOTOFoodBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOFoodBTNActionPerformed
        new Food(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GOTOFoodBTNActionPerformed

    private void GOTOHealthRoutinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOHealthRoutinesActionPerformed
        new HealthRoutines(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GOTOHealthRoutinesActionPerformed

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair da sua conta?");
        if (resp == JOptionPane.YES_OPTION){
            new LoginWindow().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ExitBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBTN;
    private javax.swing.JButton GOTOAboutUsBTN;
    private javax.swing.JButton GOTOFoodBTN;
    private javax.swing.JButton GOTOHealthRoutines;
    private javax.swing.JButton GOTOTrainingBTN;
    private javax.swing.JButton GOTOYourInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
