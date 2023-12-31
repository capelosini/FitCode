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
 * @author vzako
 */
public class YourInformation extends javax.swing.JFrame {

    User user;
    
    /**
     * Creates new form YourInformation
     */
    public YourInformation(User user) {
        initComponents();
        this.user=user;
        this.refreshInfo();
        
        Image icon = new ImageIcon(this.getClass().getResource("../images/logo.png")).getImage();
        this.setIconImage(icon);
        EditWindow.setIconImage(icon);
    }
    
   void refreshInfo(){
       NameLabel.setText((String)this.user.get("name")+" "+(String)this.user.get("secondName"));
       HeightLabel.setText(Float.toString((float)this.user.get("height"))+"m");
       WeightLabel.setText(Integer.toString(Math.round((float)this.user.get("weight")))+"Kg");
       float imc = this.IMC((float)this.user.get("height"), (float)this.user.get("weight"));
       IMCNumberLabel.setText(Float.toString(imc));
       IMCStatusLabel.setText(IMCStatus(imc));
       IMCBar.setValue(Math.round(imc));
   }
   
   float IMC(float h, float w){
       return w/(h*h);
   }
   
   String IMCStatus(float imc){
       if (imc < 18.5){ return "Abaixo do Peso"; }
       else if(imc < 25){ return "Normal"; }
       else if(imc < 30){ return "Acima do Peso"; }
       else if(imc < 35){ return "Obesidade I"; }
       else if(imc < 40){ return "Obesidade II"; }
       else if(imc < 50){ return "Obesidade III"; }
       else{ return "Obesidade IV"; }
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditWindow = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        EditBTN = new javax.swing.JButton();
        HeightInput = new javax.swing.JTextField();
        WeightInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackToMenuBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IMCNumberLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        IMCBar = new javax.swing.JProgressBar();
        jLabel19 = new javax.swing.JLabel();
        IMCStatusLabel = new javax.swing.JLabel();
        HeightLabel = new javax.swing.JLabel();
        GOTOEditWindowBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        EditWindow.setTitle("Editar");
        EditWindow.setLocation(new java.awt.Point(500, 250));
        EditWindow.setResizable(false);
        EditWindow.setSize(new java.awt.Dimension(436, 156));

        jPanel4.setBackground(new java.awt.Color(226, 249, 206));

        EditBTN.setBackground(new java.awt.Color(48, 165, 88));
        EditBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditBTN.setText("Editar");
        EditBTN.setFocusPainted(false);
        EditBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBTNActionPerformed(evt);
            }
        });

        jLabel5.setText("Altura (M)");

        jLabel8.setText("Peso (KG)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditBTN)
                .addGap(180, 180, 180))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(EditBTN)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout EditWindowLayout = new javax.swing.GroupLayout(EditWindow.getContentPane());
        EditWindow.getContentPane().setLayout(EditWindowLayout);
        EditWindowLayout.setHorizontalGroup(
            EditWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditWindowLayout.setVerticalGroup(
            EditWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setTitle("Suas informações");
        setLocation(new java.awt.Point(850, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(226, 249, 206));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(33, 76, 60, 55);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel4.setText("Suas informações");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 0, 286, 55);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel6.setText("Peso:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(190, 150, 60, 55);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel7.setText("Altura:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(33, 149, 80, 55);

        WeightLabel.setBackground(new java.awt.Color(255, 255, 255));
        WeightLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        WeightLabel.setText("Name");
        jPanel3.add(WeightLabel);
        WeightLabel.setBounds(249, 149, 80, 55);

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        NameLabel.setText("Name");
        jPanel3.add(NameLabel);
        NameLabel.setBounds(101, 76, 270, 55);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel10.setText("IMC:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(260, 390, 60, 41);

        IMCNumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        IMCNumberLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IMCNumberLabel.setText("Name");
        jPanel3.add(IMCNumberLabel);
        IMCNumberLabel.setBounds(310, 380, 90, 55);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setText("Abaixo do peso");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(60, 460, 106, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 204, 0));
        jLabel13.setText("Normal");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(160, 540, 51, 20);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Acima do peso");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(280, 460, 100, 20);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 102, 0));
        jLabel15.setText("Obesidade I");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(370, 540, 80, 20);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 51, 0));
        jLabel16.setText("Obesidade II");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(470, 460, 84, 20);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Obesidade III");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(560, 540, 88, 20);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("Obesidade IV");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(720, 460, 89, 20);

        IMCBar.setMaximum(50);
        IMCBar.setMinimum(16);
        IMCBar.setToolTipText("");
        IMCBar.setValue(49);
        jPanel3.add(IMCBar);
        IMCBar.setBounds(110, 500, 650, 24);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel19.setText("Status:");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(450, 390, 80, 41);

        IMCStatusLabel.setBackground(new java.awt.Color(255, 255, 255));
        IMCStatusLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        IMCStatusLabel.setText("Name");
        jPanel3.add(IMCStatusLabel);
        IMCStatusLabel.setBounds(520, 380, 240, 55);

        HeightLabel.setBackground(new java.awt.Color(255, 255, 255));
        HeightLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        HeightLabel.setText("Name");
        jPanel3.add(HeightLabel);
        HeightLabel.setBounds(100, 150, 70, 55);

        GOTOEditWindowBTN.setBackground(new java.awt.Color(48, 165, 88));
        GOTOEditWindowBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GOTOEditWindowBTN.setText("Editar");
        GOTOEditWindowBTN.setFocusPainted(false);
        GOTOEditWindowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOTOEditWindowBTNActionPerformed(evt);
            }
        });
        jPanel3.add(GOTOEditWindowBTN);
        GOTOEditWindowBTN.setBounds(340, 160, 80, 27);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileIMGyi.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(540, 20, 240, 240);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBTNActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BackToMenuBTNActionPerformed

    private void GOTOEditWindowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOTOEditWindowBTNActionPerformed
        EditWindow.setVisible(true);
        HeightInput.setText(Float.toString((float)this.user.get("height")));
        WeightInput.setText(Float.toString((float)this.user.get("weight")));
    }//GEN-LAST:event_GOTOEditWindowBTNActionPerformed

    private void EditBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBTNActionPerformed
        if(HeightInput.getText().strip().equals("") || WeightInput.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Os campos são obrigatórios!");
        } else{
            try{
                float height=Float.parseFloat(HeightInput.getText().strip());
                float weight=Float.parseFloat(WeightInput.getText().strip());
                if (height >=100){
                    height=(float)height/100;
                }
                DB db = new DB();
                db.connectDB();
                db.updateIMCUser((String)this.user.get("email"), height, weight);
                this.user.userData[4]=height;
                this.user.userData[5]=weight;
                db.closeConn();
                this.refreshInfo();
                EditWindow.setVisible(false);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_EditBTNActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        new MainMenu(this.user).setVisible(true);
        EditWindow.setVisible(false);
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
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YourInformation(null).setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBTN;
    private javax.swing.JButton EditBTN;
    private javax.swing.JFrame EditWindow;
    private javax.swing.JButton GOTOEditWindowBTN;
    private javax.swing.JTextField HeightInput;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JProgressBar IMCBar;
    private javax.swing.JLabel IMCNumberLabel;
    private javax.swing.JLabel IMCStatusLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField WeightInput;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
