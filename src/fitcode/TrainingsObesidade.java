/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitcode;

/**
 *
 * @author Gustavo
 */
public class TrainingsObesidade extends javax.swing.JFrame {
            User user;
    /**
     * Creates new form TrainingsObesidade
     */
    public TrainingsObesidade(User user) {
        initComponents();
        this.user=user;
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
        BackToTrainingsBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        T5OBCB = new javax.swing.JCheckBox();
        T1OBCB = new javax.swing.JCheckBox();
        T4OBCB = new javax.swing.JCheckBox();
        T6OBCB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        T2OBCB = new javax.swing.JCheckBox();
        T3OBCB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Treino para obesidade");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(48, 165, 88));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fit");

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel2.setText("Code");

        BackToTrainingsBTN.setBackground(new java.awt.Color(226, 249, 206));
        BackToTrainingsBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackToTrainingsBTN.setText("< Voltar");
        BackToTrainingsBTN.setFocusPainted(false);
        BackToTrainingsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTrainingsBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackToTrainingsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(BackToTrainingsBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(226, 249, 206));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Em caso de alteração na prática e tipo de treino consulte um médico ou especialista.");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 590, 520, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("ATENÇÃO: Utilize os treinos que condizem com seus status de saúde.");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 570, 430, 20);

        T5OBCB.setBackground(new java.awt.Color(226, 249, 206));
        T5OBCB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        T5OBCB.setText("Treino...");
        T5OBCB.setFocusPainted(false);
        jPanel3.add(T5OBCB);
        T5OBCB.setBounds(500, 260, 170, 70);

        T1OBCB.setBackground(new java.awt.Color(226, 249, 206));
        T1OBCB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        T1OBCB.setText("Treino...");
        T1OBCB.setFocusPainted(false);
        jPanel3.add(T1OBCB);
        T1OBCB.setBounds(120, 110, 170, 70);

        T4OBCB.setBackground(new java.awt.Color(226, 249, 206));
        T4OBCB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        T4OBCB.setText("Treino...");
        T4OBCB.setFocusPainted(false);
        jPanel3.add(T4OBCB);
        T4OBCB.setBounds(500, 110, 170, 70);

        T6OBCB.setBackground(new java.awt.Color(226, 249, 206));
        T6OBCB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        T6OBCB.setText("Treino...");
        T6OBCB.setFocusPainted(false);
        jPanel3.add(T6OBCB);
        T6OBCB.setBounds(500, 400, 170, 70);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel7.setText("Treinos para obesidade");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 20, 620, 55);

        T2OBCB.setBackground(new java.awt.Color(226, 249, 206));
        T2OBCB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        T2OBCB.setText("Treino...");
        T2OBCB.setFocusPainted(false);
        jPanel3.add(T2OBCB);
        T2OBCB.setBounds(120, 260, 170, 70);

        T3OBCB.setBackground(new java.awt.Color(226, 249, 206));
        T3OBCB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        T3OBCB.setText("Treino...");
        T3OBCB.setFocusPainted(false);
        jPanel3.add(T3OBCB);
        T3OBCB.setBounds(120, 400, 170, 70);

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

    private void BackToTrainingsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTrainingsBTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BackToTrainingsBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TrainingsObesidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainingsObesidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainingsObesidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainingsObesidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainingsObesidade(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToTrainingsBTN;
    private javax.swing.JCheckBox T1OBCB;
    private javax.swing.JCheckBox T2OBCB;
    private javax.swing.JCheckBox T3OBCB;
    private javax.swing.JCheckBox T4OBCB;
    private javax.swing.JCheckBox T5OBCB;
    private javax.swing.JCheckBox T6OBCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
