
import java.awt.Color;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 //1
public class Login extends javax.swing.JFrame {
public String theusername = null;
   Connection Conn=null;
   PreparedStatement login=null; 
   PreparedStatement reg=null;
   ResultSet rs =null;
   String Sql ="Select * from useraccounts where username=? and password=?";
   String userLogedIn = null;
    public Login() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        LOGIN_PANEL = new javax.swing.JPanel();
        L_FieldsPanel = new javax.swing.JPanel();
        LoginBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        passwordTXT = new javax.swing.JPasswordField();
        LoginIcon = new javax.swing.JLabel();
        ConectionStatus = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginStatus = new javax.swing.JLabel();
        REGISTER_PANEL = new javax.swing.JPanel();
        RegisterIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LoginBTN.setText("Login");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel23.setText("Password");

        javax.swing.GroupLayout L_FieldsPanelLayout = new javax.swing.GroupLayout(L_FieldsPanel);
        L_FieldsPanel.setLayout(L_FieldsPanelLayout);
        L_FieldsPanelLayout.setHorizontalGroup(
            L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addGroup(L_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTXT)))
                    .addGroup(L_FieldsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
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

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Icons/login.png"))); // NOI18N

        ConectionStatus.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        ConectionStatus.setText("Connection Status :");

        Status.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel3.setText("Παρακαλούμε εισάγετε τα στοιχεία εισόδου για να συνδεθείτε");

        LoginStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout LOGIN_PANELLayout = new javax.swing.GroupLayout(LOGIN_PANEL);
        LOGIN_PANEL.setLayout(LOGIN_PANELLayout);
        LOGIN_PANELLayout.setHorizontalGroup(
            LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginIcon)
                .addGap(40, 40, 40)
                .addComponent(L_FieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                        .addComponent(ConectionStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(LoginStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LOGIN_PANELLayout.setVerticalGroup(
            LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(LOGIN_PANELLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L_FieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ConectionStatus)
                        .addComponent(Status))
                    .addComponent(LoginStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", LOGIN_PANEL);

        RegisterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Icons/signup.png"))); // NOI18N
        RegisterIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterIconMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Κάνε κλίκ στην εικόνα για να εμφανίσεις την φόρμα εγγραφής");
        jLabel5.setAutoscrolls(true);
        jLabel5.setMaximumSize(new java.awt.Dimension(49, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(9, 16));
        jLabel5.setName(""); // NOI18N
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout REGISTER_PANELLayout = new javax.swing.GroupLayout(REGISTER_PANEL);
        REGISTER_PANEL.setLayout(REGISTER_PANELLayout);
        REGISTER_PANELLayout.setHorizontalGroup(
            REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                .addGroup(REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(RegisterIcon)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        REGISTER_PANELLayout.setVerticalGroup(
            REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(RegisterIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register", REGISTER_PANEL);

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jLabel2.setText(" Απατεωνική Τραπεζα ΑΕ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Icons/Smiley-dollar-icon.png"))); // NOI18N
        jLabel8.setMinimumSize(new java.awt.Dimension(23, 23));
        jLabel8.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Icons/Smiley-dollar-icon.png"))); // NOI18N
        jLabel7.setMinimumSize(new java.awt.Dimension(23, 23));
        jLabel7.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
                 
        try
        {
            
            login=Conn.prepareStatement(Sql);
            login.setString(1,usernameTXT.getText());
            login.setString(2,passwordTXT.getText());
            rs = login.executeQuery();
            
            if (rs.next()) {
                MainApp Main = new MainApp();
                Main.setVisible(true);
                Main.setLocationRelativeTo(null);
                 
                LoginStatus.setForeground(Color.green);
                LoginStatus.setText("Login Succesfull!");

                userLogedIn = rs.getString("username");
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
    }//GEN-LAST:event_LoginBTNActionPerformed

     
    
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

    private void RegisterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterIconMouseClicked
        Register reg = new Register();
        reg.setVisible(true);
    }//GEN-LAST:event_RegisterIconMouseClicked

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
    private javax.swing.JPanel LOGIN_PANEL;
    private javax.swing.JPanel L_FieldsPanel;
    private javax.swing.JButton LoginBTN;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JLabel LoginStatus;
    private javax.swing.JPanel REGISTER_PANEL;
    private javax.swing.JLabel RegisterIcon;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
