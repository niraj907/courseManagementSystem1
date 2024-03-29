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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    
    
    
    public SignUp() {
        
        initComponents();
        signUpCourse.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpPanel = new javax.swing.JPanel();
        signUpTitle = new javax.swing.JLabel();
        signUpFirstName = new javax.swing.JLabel();
        signUpFirstNameUser = new javax.swing.JTextField();
        signUpLastName = new javax.swing.JLabel();
        signUpLastNameUser = new javax.swing.JTextField();
        signUpEmail = new javax.swing.JLabel();
        signUpEmailUser = new javax.swing.JTextField();
        signUpPassword = new javax.swing.JLabel();
        signUpPasswordUser = new javax.swing.JPasswordField();
        signUpConfirmPass = new javax.swing.JLabel();
        signUpMobileNo = new javax.swing.JLabel();
        signUpMobileNoUser = new javax.swing.JTextField();
        signUpBtn = new java.awt.Button();
        signUpMessage = new javax.swing.JLabel();
        signUpCourse = new javax.swing.JComboBox<>();
        signUpSignIn = new javax.swing.JLabel();
        signUpUserName = new javax.swing.JLabel();
        signUpUserNameInput = new javax.swing.JTextField();
        signUpRole = new javax.swing.JComboBox<>();
        signUpConfirmpassUser = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signUpPanel.setBackground(new java.awt.Color(255, 255, 255));

        signUpTitle.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        signUpTitle.setText("Register Form");

        signUpFirstName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpFirstName.setText("First Name");

        signUpFirstNameUser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        signUpLastName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpLastName.setText("Last Name");

        signUpLastNameUser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        signUpEmail.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpEmail.setText("Email");

        signUpEmailUser.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        signUpPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpPassword.setText("Password");

        signUpPasswordUser.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        signUpPasswordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPasswordUserActionPerformed(evt);
            }
        });

        signUpConfirmPass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpConfirmPass.setText("Confirm Password");

        signUpMobileNo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpMobileNo.setText("Mobile no");

        signUpMobileNoUser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        signUpBtn.setBackground(new java.awt.Color(107, 201, 46));
        signUpBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signUpBtn.setLabel("Submit");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        signUpMessage.setBackground(new java.awt.Color(255, 255, 255));
        signUpMessage.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        signUpMessage.setForeground(new java.awt.Color(153, 153, 153));
        signUpMessage.setText("Already have an account?");

        signUpCourse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signUpCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course", "BIT", "BIM" }));
        signUpCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpCourseActionPerformed(evt);
            }
        });

        signUpSignIn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        signUpSignIn.setForeground(new java.awt.Color(107, 201, 48));
        signUpSignIn.setText("Sign here");
        signUpSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpSignInMouseClicked(evt);
            }
        });

        signUpUserName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        signUpUserName.setText("UserName");

        signUpUserNameInput.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        signUpRole.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signUpRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Admin", "Student", "Instructor" }));
        signUpRole.setPreferredSize(new java.awt.Dimension(90, 20));
        signUpRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpRoleActionPerformed(evt);
            }
        });

        signUpConfirmpassUser.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        signUpConfirmpassUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpConfirmpassUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpUserName)
                    .addComponent(signUpPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addComponent(signUpMessage)
                        .addGap(10, 10, 10)
                        .addComponent(signUpSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(signUpFirstName)
                    .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(signUpMobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpConfirmPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpFirstNameUser, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpLastNameUser, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signUpEmailUser, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signUpMobileNoUser, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(signUpUserNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, signUpPanelLayout.createSequentialGroup()
                            .addComponent(signUpRole, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(signUpCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(signUpConfirmpassUser, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        signUpPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {signUpCourse, signUpRole});

        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(signUpTitle)
                .addGap(10, 10, 10)
                .addComponent(signUpFirstName)
                .addGap(10, 10, 10)
                .addComponent(signUpFirstNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(signUpLastName)
                .addGap(10, 10, 10)
                .addComponent(signUpLastNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(signUpEmail)
                .addGap(10, 10, 10)
                .addComponent(signUpEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(signUpPassword)
                .addGap(10, 10, 10)
                .addComponent(signUpPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(signUpConfirmPass)
                .addGap(10, 10, 10)
                .addComponent(signUpConfirmpassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(signUpUserName)
                .addGap(10, 10, 10)
                .addComponent(signUpUserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(signUpMobileNo)
                .addGap(10, 10, 10)
                .addComponent(signUpMobileNoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUpCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpMessage)
                    .addComponent(signUpSignIn))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        signUpPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {signUpCourse, signUpRole});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signUpSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpSignInMouseClicked
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_signUpSignInMouseClicked

    private void signUpPasswordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPasswordUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPasswordUserActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
 

    
    
  try {
  Backend c1 = new Backend(); // Assuming this is a valid database connection

    // Get input values from the form fields
    String firstName1 = signUpFirstNameUser.getText();
    String lastName1 = signUpLastNameUser.getText();
    String email1 = signUpEmailUser.getText();
   
    String password1 = signUpPasswordUser.getText();
    String confirmPassword1 = signUpConfirmPass.getText();
    String username1 = signUpUserNameInput.getText();
    String mobileNo1 = signUpMobileNoUser.getText();
    String course1 = signUpCourse.getSelectedItem().toString();
    String role1 = signUpRole.getSelectedItem().toString().toLowerCase();

    if (firstName1.isEmpty() && lastName1.isEmpty() && email1.isEmpty() && username1.isEmpty() && password1.isEmpty() && confirmPassword1.isEmpty() && mobileNo1.isEmpty() && role1.isEmpty()) 
    {
        JOptionPane.showMessageDialog(null, "No field is filled", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

// Validation for First Name
if (firstName1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Firstname is not fill!", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if validation fails
} else if (firstName1.length() > 10) {
    JOptionPane.showMessageDialog(null, "First name cannot exceed 10 characters!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
} else if (!firstName1.matches("[a-zA-Z]+")) {
    JOptionPane.showMessageDialog(null, "First name must contain only letters!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Validation for Last Name
if (lastName1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Last name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if validation fails
} else if (lastName1.length() > 10) {
    JOptionPane.showMessageDialog(null, "Last name cannot exceed 10 characters!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
} else if (!lastName1.matches("[a-zA-Z]+")) {
    JOptionPane.showMessageDialog(null, "Last name must contain only letters!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Validation for Email
if (email1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Email cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if validation fails
} else if (!email1.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{3,}")) {
    JOptionPane.showMessageDialog(null, "Invalid email address!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}




if (password1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
    return ; // Exit the method if validation fails
}

String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(password1);

if (!matcher.matches()) {
    JOptionPane.showMessageDialog(null, "Password must contain at least one digit, one lowercase letter, one special character, and have a minimum length of 8 characters.", "Error", JOptionPane.ERROR_MESSAGE);
    return ; // Exit the method if validation fails
}


if (confirmPassword1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "ConfirmPassword cannot be empty!",
            "Error", JOptionPane.ERROR_MESSAGE);
    return ; // Exit the method if validation fails
}

if (signUpPasswordUser.getText().equals(signUpConfirmpassUser.getText())) {
    System.out.println("MATCHING");
        
} else {
            JOptionPane.showMessageDialog(null, "Password do not match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
}


// Validation for Username
if (username1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Username cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if validation fails
} else if (!username1.matches("[a-zA-Z0-9_]+")) {
    JOptionPane.showMessageDialog(null, "Username must contain only letters, numbers, or underscores!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}


if (mobileNo1.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Mobile number cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if validation fails
} else if (!mobileNo1.matches("98[0-9]{8}")) {
    JOptionPane.showMessageDialog(null, "Mobile number must start with '98' and be followed by 8 digits!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

if(role1.equals("select role")) {
            JOptionPane.showMessageDialog(null, "Please select the user type role.", "Error", JOptionPane.ERROR_MESSAGE);
        }
//else{
//                     System.out.println("Not found");
//                 }

 
   
   
    
    // Database insertion
    String sql;
    switch (role1) {
        case "admin":
            sql = "INSERT INTO admin (FirstName, LastName, Email, Password, ConfirmPassword, UserName, MobileNumber) VALUES ('"+firstName1+"', '"+lastName1+"', '"+email1+"', '"+password1+"', '"+confirmPassword1+"', '"+username1+"', '"+mobileNo1+"' )";
            break;
        case "student":
            sql = "INSERT INTO student (FirstName, LastName, Email, Password, ConfirmPassword, UserName, MobileNumber, Course) VALUES ('"+firstName1+"', '"+lastName1+"', '"+email1+"', '"+password1+"', '"+confirmPassword1+"', '"+username1+"', '"+mobileNo1+"', '"+course1+"' )";
            break;
        case "instructor":
            sql = "INSERT INTO instructor (FirstName, LastName, Email, Password, ConfirmPassword, UserName, MobileNumber) VALUES ('"+firstName1+"', '"+lastName1+"', '"+email1+"', '"+password1+"', '"+confirmPassword1+"', '"+username1+"', '"+mobileNo1+"')";
            break;
        default:
            throw new IllegalArgumentException("Invalid role: " + role1);
    }
   Backend conn = new Backend();
    conn.statement.executeUpdate(sql); // for selecting the data, 
    // conn.statement.executreQuery(sql);

    JOptionPane.showMessageDialog(null, "User registered successfully!");
} catch (Exception e) {
      System.out.println("ERROR WHILE INSERTING DATA INTO THE DATABASE");
}

    
    
    
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void signUpConfirmpassUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpConfirmpassUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpConfirmpassUserActionPerformed

    private void signUpCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpCourseActionPerformed

    private void signUpRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpRoleActionPerformed
        // TODO add your handling code here:
        
         String selectedRole = (String) signUpRole.getSelectedItem();
         
         // Check if the selected role is "Student"
    if ("Student".equals(selectedRole)) {
        // Show the course ComboBox for selecting courses
       signUpCourse.setVisible(true);
    } else {
        // Hide the course ComboBox for other roles
        signUpCourse.setVisible(false);
    }

    }//GEN-LAST:event_signUpRoleActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button signUpBtn;
    private javax.swing.JLabel signUpConfirmPass;
    private javax.swing.JPasswordField signUpConfirmpassUser;
    private javax.swing.JComboBox<String> signUpCourse;
    private javax.swing.JLabel signUpEmail;
    private javax.swing.JTextField signUpEmailUser;
    private javax.swing.JLabel signUpFirstName;
    private javax.swing.JTextField signUpFirstNameUser;
    private javax.swing.JLabel signUpLastName;
    private javax.swing.JTextField signUpLastNameUser;
    private javax.swing.JLabel signUpMessage;
    private javax.swing.JLabel signUpMobileNo;
    private javax.swing.JTextField signUpMobileNoUser;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JLabel signUpPassword;
    private javax.swing.JPasswordField signUpPasswordUser;
    private javax.swing.JComboBox<String> signUpRole;
    private javax.swing.JLabel signUpSignIn;
    private javax.swing.JLabel signUpTitle;
    private javax.swing.JLabel signUpUserName;
    private javax.swing.JTextField signUpUserNameInput;
    // End of variables declaration//GEN-END:variables
}
