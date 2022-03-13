/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Define.User;
import Service.UserService;
import javax.swing.JOptionPane;

/**
 *
 * @author Komatkhau
 */
public class SignIn extends javax.swing.JFrame {

    UserService userService;
    
    public SignIn() {
        initComponents();
        userService= new UserService();
    }
    
    public SignIn(User user) {
        initComponents();
        userService= new UserService();
        texttentk.setText(user.getTenTK());
        mkfield.setText(user.getMatKhau());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texttentk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mkfield = new javax.swing.JPasswordField();
        submicbutton = new javax.swing.JButton();
        turnonoff = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        signupbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản");

        texttentk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttentkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");

        mkfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkfieldActionPerformed(evt);
            }
        });

        submicbutton.setBackground(new java.awt.Color(102, 255, 51));
        submicbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submicbutton.setForeground(new java.awt.Color(255, 255, 255));
        submicbutton.setText("Đăng nhập");
        submicbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submicbuttonActionPerformed(evt);
            }
        });

        turnonoff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        turnonoff.setText("H");
        turnonoff.setToolTipText("Hiện/ẩn mật khẩu");
        turnonoff.setAlignmentY(0.0F);
        turnonoff.setAutoscrolls(true);
        turnonoff.setIconTextGap(0);
        turnonoff.setMargin(new java.awt.Insets(0, 0, 0, 0));
        turnonoff.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                turnonoffStateChanged(evt);
            }
        });
        turnonoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnonoffActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("OR");

        signupbutton.setBackground(new java.awt.Color(255, 102, 102));
        signupbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupbutton.setForeground(new java.awt.Color(255, 255, 255));
        signupbutton.setText("Đăng kí");
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texttentk)
                            .addComponent(mkfield, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turnonoff, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submicbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(texttentk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mkfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnonoff, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(submicbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void texttentkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttentkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttentkActionPerformed

    private void turnonoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnonoffActionPerformed

    }//GEN-LAST:event_turnonoffActionPerformed

    private void turnonoffStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_turnonoffStateChanged
        if (turnonoff.isSelected()) 
        {
            turnonoff.setText("S");
            mkfield.setEchoChar((char)0);
        }
        else 
        {
           turnonoff.setText("H");
           mkfield.setEchoChar('*');
        }
    }//GEN-LAST:event_turnonoffStateChanged

    private void submicbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submicbuttonActionPerformed
        User user= new User();
        user.setTenTK(texttentk.getText());
        user.setMatKhau(String.valueOf(mkfield.getPassword()));
        
        if(userService.checkTKVaMK(user)!=null)
        {
            new ProductForm(userService.checkTKVaMK(user)).setVisible(true);
            this.dispose();
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu", "Sai", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submicbuttonActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupbuttonActionPerformed

    private void mkfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkfieldActionPerformed
        submicbuttonActionPerformed(evt);
    }//GEN-LAST:event_mkfieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField mkfield;
    private javax.swing.JButton signupbutton;
    private javax.swing.JButton submicbutton;
    private javax.swing.JTextField texttentk;
    private javax.swing.JToggleButton turnonoff;
    // End of variables declaration//GEN-END:variables
}
