
import com.sun.javafx.embed.AbstractEvents;
import java.awt.Color; 
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.*;
import javax.swing.*;

 //1
public class Login extends javax.swing.JFrame {
public String theusername = null;
   Connection Conn=null;
   PreparedStatement login=null; 
   PreparedStatement reg=null;
   ResultSet rs =null;
   String Sql ="Select * from useraccounts where username=? and password=? ";
   String userLogedIn = null;
    public Login() 
    {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LOGIN_PANEL = new javax.swing.JPanel();
        L_FieldsPanel = new javax.swing.JPanel();
        LoginBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        passwordTXT = new javax.swing.JPasswordField();
        ConectionStatus = new javax.swing.JLabel();
        intro = new javax.swing.JLabel();
        LoginStatus = new javax.swing.JLabel();
        IconPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jLabel2.setText(" Απατεωνική Τραπεζα ΑΕ");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        LoginBTN.setText("Login");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        usernameTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTXTKeyPressed(evt);
            }
        });

        jLabel23.setText("Password");

        passwordTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTXTKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout L_FieldsPanelLayout = new javax.swing.GroupLayout(L_FieldsPanel);
        L_FieldsPanel.setLayout(L_FieldsPanelLayout);
        L_FieldsPanelLayout.setHorizontalGroup(
            L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTXT))
                    .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addGroup(L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTXT)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L_FieldsPanelLayout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))))
        );
        L_FieldsPanelLayout.setVerticalGroup(
            L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LoginBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConectionStatus.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        ConectionStatus.setText("Connection Status :");

        intro.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        intro.setText("Παρακαλούμε εισάγετε τα στοιχεία εισόδου για να συνδεθείτε");

        LoginStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        IconPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N

        javax.swing.GroupLayout IconPanelLayout = new javax.swing.GroupLayout(IconPanel);
        IconPanel.setLayout(IconPanelLayout);
        IconPanelLayout.setHorizontalGroup(
            IconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IconPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        IconPanelLayout.setVerticalGroup(
            IconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IconPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Status.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N

        javax.swing.GroupLayout LOGIN_PANELLayout = new javax.swing.GroupLayout(LOGIN_PANEL);
        LOGIN_PANEL.setLayout(LOGIN_PANELLayout);
        LOGIN_PANELLayout.setHorizontalGroup(
            LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LOGIN_PANELLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(ConectionStatus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LoginStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LOGIN_PANELLayout.createSequentialGroup()
                            .addComponent(IconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(L_FieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(intro, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LOGIN_PANELLayout.setVerticalGroup(
            LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                .addComponent(intro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_FieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConectionStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LOGIN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOGIN_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    
    //Synarthsh gia na ginei to connection me thn bash dedomenwn
         public  Connection ConnectDB() 
         {
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost/apatewniki", "root", "");
                Status.setText(" You are Connected!");
                return Conn;
            }
            catch (Exception e) 
            {  
                Status.setText(" You are NOT Connected!");
                JOptionPane.showMessageDialog(null, "Make sure you have a database", "Could not Connect to database", JOptionPane.ERROR_MESSAGE);

                return null;

            }
        }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Conn = ConnectDB();
    }//GEN-LAST:event_formWindowOpened
  
    
    public void LoginToSystem()
  {
      try
        {
            login=Conn.prepareStatement(Sql);
            login.setString(1,usernameTXT.getText());
            login.setString(2,passwordTXT.getText());
            rs = login.executeQuery();

            if (rs.next()) 
            {
                userLogedIn = rs.getString("username");
                
                if(userLogedIn.equals("admin"))
                {
                   Administrator Admin= new Administrator(userLogedIn);
                   Admin.setVisible(true);
                }
                else
                {
                   new MainApp(userLogedIn).setVisible(true);
                }
                LoginStatus.setForeground(Color.green);
                LoginStatus.setText("Login Succesfull!");
                
               
            }
            else
            {
                LoginStatus.setForeground(Color.red);
                LoginStatus.setText("Login Failed!!");
                JOptionPane.showMessageDialog(null,"Please enter correct username and password","Acces Denied",JOptionPane.ERROR_MESSAGE);
            }
        }

        catch (Exception e)
        {
            int ConnectionFailed = JOptionPane.showConfirmDialog(null ,"Cannot Login Because you are not connected to the database!\n Do you want to connect ot the database?","Cannot Login",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (ConnectionFailed==JOptionPane.OK_OPTION)
            {
                Conn = ConnectDB();
                Status.setText("You are Connected!");
            }
            else
            {
                Status.setText("You are Not Connected!");
            }
        }
  }
    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
         
        
        LoginToSystem();
    }//GEN-LAST:event_LoginBTNActionPerformed

    private void passwordTXTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTXTKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             LoginToSystem();
         }
    }//GEN-LAST:event_passwordTXTKeyPressed

    private void usernameTXTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTXTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
            LoginToSystem();
        }
    }//GEN-LAST:event_usernameTXTKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConectionStatus;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel IconPanel;
    private javax.swing.JPanel LOGIN_PANEL;
    private javax.swing.JPanel L_FieldsPanel;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JLabel LoginStatus;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
