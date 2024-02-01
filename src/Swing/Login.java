
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
//
//    Connection conn;
//    PreparedStatement pst;
//    ResultSet rs;
    
    
   public Login() {


        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        loginPanel1 = new javax.swing.JPanel();
        loginUsername1 = new javax.swing.JLabel();
        loginUserInput1 = new javax.swing.JTextField();
        loginPassword1 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        loginUserPassword1 = new javax.swing.JPasswordField();
        loginBtn1 = new java.awt.Button();
        loginTitle = new javax.swing.JLabel();
        loginPasswordIcon = new javax.swing.JLabel();
        loginUserIcon = new javax.swing.JLabel();
        loginRole = new javax.swing.JComboBox<>();
        loginMessage1 = new javax.swing.JLabel();
        LoginSignUp = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Managment System");
        setBackground(new java.awt.Color(255, 255, 255));

        loginPanel1.setBackground(new java.awt.Color(255, 255, 255));

        loginUsername1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loginUsername1.setText("Username");

        loginUserInput1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginUserInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserInput1ActionPerformed(evt);
            }
        });

        loginPassword1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loginPassword1.setText("Password");

        Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        loginUserPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginUserPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserPassword1ActionPerformed(evt);
            }
        });

        loginBtn1.setBackground(new java.awt.Color(107, 201, 46));
        loginBtn1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        loginBtn1.setLabel("Submit");
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });

        loginTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("Welcome Back!");

        loginPasswordIcon.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        loginPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/icons8-password-26.png"))); // NOI18N
        loginPasswordIcon.setPreferredSize(new java.awt.Dimension(55, 35));

        loginUserIcon.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        loginUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/icons8-username-30.png"))); // NOI18N
        loginUserIcon.setPreferredSize(new java.awt.Dimension(55, 35));

        loginRole.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Admin", "Student", "Instructor" }));
        loginRole.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                loginRoleComponentHidden(evt);
            }
        });

        loginMessage1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        loginMessage1.setForeground(new java.awt.Color(153, 153, 153));
        loginMessage1.setText("Don't have an account? ");
        loginMessage1.setToolTipText("");

        LoginSignUp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LoginSignUp.setForeground(new java.awt.Color(107, 201, 46));
        LoginSignUp.setText("Sign up");
        LoginSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginSignUpMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout loginPanel1Layout = new javax.swing.GroupLayout(loginPanel1);
        loginPanel1.setLayout(loginPanel1Layout);
        loginPanel1Layout.setHorizontalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPanel1Layout.createSequentialGroup()
                                .addComponent(loginMessage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoginSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(loginUserInput1)
                            .addComponent(loginUserPassword1)
                            .addComponent(loginBtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(loginRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanel1Layout.createSequentialGroup()
                                .addComponent(loginPasswordIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(loginUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel1Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        loginPanel1Layout.setVerticalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginUserIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(loginUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(loginUserInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginPasswordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(loginUserPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginMessage1)
                    .addComponent(LoginSignUp))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        loginPasswordIcon.getAccessibleContext().setAccessibleName("");
        loginUserIcon.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserInput1ActionPerformed

    private void loginUserPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserPassword1ActionPerformed

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed
      // TODO add your handling code here:
//      loginBtn1.setBorderPainted(false);

                 

 Backend c1 = new Backend();
   
    String username = loginUserInput1.getText();
    String password = loginUserPassword1.getText();
    String role = loginRole.getSelectedItem().toString().toLowerCase();


if (username.isEmpty()) {
    if (password.isEmpty()) {
        if (role.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in the username, password, and select a role.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in the username and password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        if (role.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in the username and select a role.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in the username.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    return;
} else {
    if (password.isEmpty()) {
        if (role.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in the password and select a role.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in the password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return;
    } else {
        if (role.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a role.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}

if ( loginRole.getSelectedItem().equals("Select Role") ) {
      JOptionPane.showMessageDialog(null, "Please select the role first.", "Error", JOptionPane.ERROR_MESSAGE);
      return;
}

String q = "SELECT * FROM "+role+" WHERE username = '"+username+"' and password = '"+password+"';" ;
try {
    System.out.println("Hello");   
    ResultSet result = c1.statement.executeQuery(q);
    if (result.next()){
        System.out.println("DATA AVAILABLE");   

        if (role.equals("student")){
            dispose();
            new StudentPanel().setVisible(true);
    
            
        } else if (role.equals("admin")) {
            dispose();
            new AdminPanel().setVisible(true);
            
        } else if (role.equals("instructor")) {
            dispose();
            new TeacherPanel().setVisible(true);
            
        } else if(role.equals("select role")) {
            JOptionPane.showMessageDialog(null, "Please select the user type first.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
                     System.out.println("Not found");
                 }
    } else {
        JOptionPane.showMessageDialog(null, "Account not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException ex) {
    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
}

        // TODO add your handling code here:

    }//GEN-LAST:event_loginBtn1ActionPerformed

    private void LoginSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginSignUpMouseClicked
        // TODO add your handling code here:
        dispose();
        new SignUp().setVisible(true);
    }//GEN-LAST:event_LoginSignUpMouseClicked

    private void LoginSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginSignUpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginSignUpMouseEntered

    private void loginRoleComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_loginRoleComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_loginRoleComponentHidden

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel LoginSignUp;
    private java.awt.Button loginBtn1;
    private javax.swing.JLabel loginMessage1;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JLabel loginPassword1;
    private javax.swing.JLabel loginPasswordIcon;
    private javax.swing.JComboBox<String> loginRole;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel loginUserIcon;
    private javax.swing.JTextField loginUserInput1;
    private javax.swing.JPasswordField loginUserPassword1;
    private javax.swing.JLabel loginUsername1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
