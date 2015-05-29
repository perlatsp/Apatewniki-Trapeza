
import java.awt.Color;
import java.sql.Statement;
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
        R_FieldsPanel = new javax.swing.JPanel();
        NameLBL = new javax.swing.JLabel();
        SurnameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        R_usernameTXT = new javax.swing.JTextField();
        R_NameTXT = new javax.swing.JTextField();
        R_SurnameTXT = new javax.swing.JTextField();
        R_EmailTXT = new javax.swing.JTextField();
        R_PasswordTXT = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        registerBTN = new javax.swing.JButton();
        passLBL = new javax.swing.JLabel();
        RegisterIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        NameLBL.setText("Name");

        SurnameLBL.setText("Surname");

        emailLBL.setText("Email");

        jLabel4.setText("Username");

        registerBTN.setText("Register");
        registerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBTNActionPerformed(evt);
            }
        });

        passLBL.setText("Password");

        javax.swing.GroupLayout R_FieldsPanelLayout = new javax.swing.GroupLayout(R_FieldsPanel);
        R_FieldsPanel.setLayout(R_FieldsPanelLayout);
        R_FieldsPanelLayout.setHorizontalGroup(
            R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(R_FieldsPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(registerBTN))
                    .addGroup(R_FieldsPanelLayout.createSequentialGroup()
                        .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameLBL)
                            .addComponent(passLBL)
                            .addComponent(jLabel4)
                            .addComponent(SurnameLBL)
                            .addComponent(emailLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(R_SurnameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(R_usernameTXT)
                            .addComponent(R_NameTXT)
                            .addComponent(R_PasswordTXT)
                            .addComponent(R_EmailTXT))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        R_FieldsPanelLayout.setVerticalGroup(
            R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(R_usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLBL)
                    .addComponent(R_PasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLBL)
                    .addComponent(R_NameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameLBL)
                    .addComponent(R_SurnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(R_FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL)
                    .addComponent(R_EmailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(registerBTN)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        RegisterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Icons/signup.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Παρακαλούμε εισάγετε τα στοιχεία σας  ");
        jLabel5.setAutoscrolls(true);
        jLabel5.setMaximumSize(new java.awt.Dimension(49, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(9, 16));
        jLabel5.setName(""); // NOI18N
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("για να ολοκληρώσετε την εγγραφή !");
        jLabel6.setAutoscrolls(true);
        jLabel6.setMaximumSize(new java.awt.Dimension(49, 16));
        jLabel6.setMinimumSize(new java.awt.Dimension(9, 16));
        jLabel6.setName(""); // NOI18N
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout REGISTER_PANELLayout = new javax.swing.GroupLayout(REGISTER_PANEL);
        REGISTER_PANEL.setLayout(REGISTER_PANELLayout);
        REGISTER_PANELLayout.setHorizontalGroup(
            REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(R_FieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterIcon)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        REGISTER_PANELLayout.setVerticalGroup(
            REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(REGISTER_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(REGISTER_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(RegisterIcon))
                    .addComponent(R_FieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void registerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBTNActionPerformed
       
        //metavlhtes gia to register
        String username = R_usernameTXT.getText();
        String password = R_PasswordTXT.getText();
        String name = R_NameTXT.getText();
        String surname = R_SurnameTXT.getText();
        String email = R_EmailTXT.getText();
        
         
        try
        {
          // create a mysql database connection
        
          Connection conn = ConnectDB();
          
          // create a sql date object so we can use it in our INSERT statement
          Calendar calendar = Calendar.getInstance();
          java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

          // the mysql insert statement
          String query = " insert into useraccounts (username, password, name, surname, email)"
            + " values (?, ?, ?, ?, ?)";

        
            if (!username.equals("") && !password.equals("") && !name.equals("") && !surname.equals("") && !email.equals("")) {
                // create the mysql insert preparedstatement
                PreparedStatement register = conn.prepareStatement(query);
                register.setString(1, username);
                register.setString(2, password);
                register.setString(3, name);
                register.setString(4, surname);
                register.setString(5, email);

                // execute the preparedstatement
                register.execute();
                conn.close(); //close connection
                JOptionPane.showMessageDialog(rootPane, "You have succesfully registered! \n"
                        + "You can now login with your details!");
                
                R_usernameTXT.setText("");
                R_PasswordTXT.setText("");
                R_NameTXT.setText("");
                R_SurnameTXT.setText("");
                R_EmailTXT.setText("");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"All fields are required! \n Please fill all the informations!");
            }
          
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog(rootPane, "Could not register, please contact Admin for more details!");
          System.err.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_registerBTNActionPerformed

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
    private javax.swing.JLabel NameLBL;
    private javax.swing.JPanel REGISTER_PANEL;
    private javax.swing.JTextField R_EmailTXT;
    private javax.swing.JPanel R_FieldsPanel;
    private javax.swing.JTextField R_NameTXT;
    private javax.swing.JPasswordField R_PasswordTXT;
    private javax.swing.JTextField R_SurnameTXT;
    private javax.swing.JTextField R_usernameTXT;
    private javax.swing.JLabel RegisterIcon;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel SurnameLBL;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel passLBL;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JButton registerBTN;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
