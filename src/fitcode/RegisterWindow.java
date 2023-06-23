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
 * @author clovis.apelosini
 */
public class RegisterWindow extends javax.swing.JFrame {

    DB db;
    
    /**
     * Creates new form RegisterWindow
     */
    public RegisterWindow() {
        initComponents();
        DB db = new DB();
        db.connectDB();
        this.db=db;
        
        Image icon = new ImageIcon(this.getClass().getResource("../images/logo.png")).getImage();
        this.setIconImage(icon);
        RegisterIMCWindow.setIconImage(icon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterIMCWindow = new javax.swing.JFrame();
        BackBTN = new javax.swing.JButton();
        HeightInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        WeightInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RegisterBTN = new javax.swing.JButton();
        GOTOLoginBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FirstNameInput = new javax.swing.JTextField();
        EmailInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PasswordInput = new javax.swing.JPasswordField();
        ShowPasswordBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SecondNameInput = new javax.swing.JTextField();
        NextBTN = new javax.swing.JButton();

        RegisterIMCWindow.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        RegisterIMCWindow.setTitle("Registrar");
        RegisterIMCWindow.setLocation(new java.awt.Point(500, 250));
        RegisterIMCWindow.setResizable(false);
        RegisterIMCWindow.setSize(new java.awt.Dimension(374, 300));

        BackBTN.setText("Voltar");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });

        jLabel6.setText("Altura (M)");

        jLabel7.setText("Peso (KG)");

        RegisterBTN.setText("Registrar");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterIMCWindowLayout = new javax.swing.GroupLayout(RegisterIMCWindow.getContentPane());
        RegisterIMCWindow.getContentPane().setLayout(RegisterIMCWindowLayout);
        RegisterIMCWindowLayout.setHorizontalGroup(
            RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterIMCWindowLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterIMCWindowLayout.createSequentialGroup()
                        .addComponent(BackBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(RegisterBTN))
                    .addGroup(RegisterIMCWindowLayout.createSequentialGroup()
                        .addGroup(RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(HeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );
        RegisterIMCWindowLayout.setVerticalGroup(
            RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterIMCWindowLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(RegisterIMCWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBTN)
                    .addComponent(RegisterBTN))
                .addGap(35, 35, 35))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar");
        setBackground(new java.awt.Color(226, 249, 206));
        setResizable(false);

        GOTOLoginBTN.setText("Voltar");
        GOTOLoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOLoginBTNActionPerformed(evt);
            }
        });

        jLabel3.setText("Nos informe seu contato");

        jLabel1.setText("Nome");

        jLabel2.setText("Email");

        PasswordInput.setEchoChar('*');

        ShowPasswordBox.setText("Mostrar Senha");
        ShowPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        jLabel5.setText("Sobrenome");

        NextBTN.setText("Próximo >");
        NextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(GOTOLoginBTN)
                .addGap(28, 28, 28)
                .addComponent(NextBTN)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(SecondNameInput))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(EmailInput))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowPasswordBox)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SecondNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPasswordBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextBTN)
                    .addComponent(GOTOLoginBTN))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GOTOLoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOLoginBTNActionPerformed
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GOTOLoginBTNActionPerformed

    private void ShowPasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordBoxActionPerformed
        if(ShowPasswordBox.isSelected()){
            PasswordInput.setEchoChar((char)0);
        } else{
            PasswordInput.setEchoChar("*".charAt(0));
        }
    }//GEN-LAST:event_ShowPasswordBoxActionPerformed

    private void NextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBTNActionPerformed
        RegisterIMCWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NextBTNActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        this.setVisible(true);
        RegisterIMCWindow.setVisible(false);
    }//GEN-LAST:event_BackBTNActionPerformed

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
        if(EmailInput.getText().strip().equals("") || PasswordInput.getText().strip().equals("") || FirstNameInput.getText().strip().equals("") || SecondNameInput.getText().strip().equals("") || HeightInput.getText().strip().equals("") || WeightInput.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Confira suas respostas!");
        } else if(this.db.emailExists(EmailInput.getText().strip())){
            JOptionPane.showMessageDialog(null, "Este email já possui uma conta!");
        }else{
            try{
                float height=Float.parseFloat(HeightInput.getText().strip());
                float weight=Float.parseFloat(WeightInput.getText().strip());
                if (height >=100){
                    height=(float)height/100;
                }
                this.db.addUser(FirstNameInput.getText().strip(), SecondNameInput.getText().strip(), EmailInput.getText().strip().toLowerCase(), height, weight, PasswordInput.getText().strip());
                this.db.closeConn();
                new LoginWindow().setVisible(true);
                this.dispose();
                RegisterIMCWindow.dispose();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Confira suas respostas!");
            }
        }
    }//GEN-LAST:event_RegisterBTNActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JTextField FirstNameInput;
    private javax.swing.JButton GOTOLoginBTN;
    private javax.swing.JTextField HeightInput;
    private javax.swing.JButton NextBTN;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JButton RegisterBTN;
    private javax.swing.JFrame RegisterIMCWindow;
    private javax.swing.JTextField SecondNameInput;
    private javax.swing.JCheckBox ShowPasswordBox;
    private javax.swing.JTextField WeightInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
