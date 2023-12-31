/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitcode;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginWindow extends javax.swing.JFrame {

    DB db;
    
    public LoginWindow() {
        initComponents();
        this.db = new DB();
        this.db.connectDB();
        
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

        GOTORegisterBTN = new javax.swing.JButton();
        EmailInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoginBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PasswordInput = new javax.swing.JPasswordField();
        ShowPasswordBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(226, 249, 206));
        setResizable(false);
        setSize(new java.awt.Dimension(537, 380));

        GOTORegisterBTN.setText("Registrar-se");
        GOTORegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTORegisterBTNActionPerformed(evt);
            }
        });

        EmailInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InputKeyReleased(evt);
            }
        });

        jLabel1.setText("Senha");

        jLabel2.setText("Email");

        LoginBTN.setText("Entrar");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Login");

        PasswordInput.setEchoChar('*');
        PasswordInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InputKeyReleased(evt);
            }
        });

        ShowPasswordBox.setText("Mostrar Senha");
        ShowPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Não possui conta?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(LoginBTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ShowPasswordBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GOTORegisterBTN))
                            .addComponent(jLabel1))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPasswordBox))
                .addGap(18, 18, 18)
                .addComponent(LoginBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(GOTORegisterBTN))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GOTORegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTORegisterBTNActionPerformed
        new RegisterWindow().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GOTORegisterBTNActionPerformed

    private void ShowPasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordBoxActionPerformed
        if(ShowPasswordBox.isSelected()){
            PasswordInput.setEchoChar((char)0);
        } else{
            PasswordInput.setEchoChar("*".charAt(0));
        }
    }//GEN-LAST:event_ShowPasswordBoxActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        if (!EmailInput.getText().strip().equals("") && !PasswordInput.getText().strip().equals("")){
            boolean isRealUser=db.checkUser(EmailInput.getText().strip().toLowerCase(), PasswordInput.getText().strip());
            if(isRealUser){
                System.out.println("Login Success!");
                User user = db.getUser(EmailInput.getText().strip().toLowerCase(), PasswordInput.getText().strip());
                db.closeConn();
                new MainMenu(user).setVisible(true);
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(null, "Confira se os dados estão corretos!");
                System.out.println("Wrong Login!");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Por favor, coloque algo no campo Email e Senha");
        }
    }//GEN-LAST:event_LoginBTNActionPerformed

    private void InputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            LoginBTNActionPerformed(null);
        }
    }//GEN-LAST:event_InputKeyReleased

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailInput;
    private javax.swing.JButton GOTORegisterBTN;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JCheckBox ShowPasswordBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
