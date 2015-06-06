
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.BindingProvider;

  
public class MainApp extends javax.swing.JFrame {
   
   Logariasmos log = new Logariasmos(1500);
   boolean showHistory = false;
        
    public MainApp() {
        initComponents();
        setSize(585, 510);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public MainApp(String username) {
        initComponents();
        setSize(585, 510);
        setResizable(false);
        setLocationRelativeTo(null);
        wUser.setText(username);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        wUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ActionBTN = new javax.swing.JButton();
        DepositAmount = new javax.swing.JTextField();
        userMoney = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        options = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        TransactionHistoryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionHistoryTBL = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ShowTransactionHistory = new javax.swing.JCheckBoxMenuItem();
        ViewProfile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jLabel2.setText(" Απατεωνική Τραπεζα ΑΕ");

        welcome.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        welcome.setText("Welcome ");

        wUser.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        wUser.setForeground(new java.awt.Color(0, 102, 153));
        wUser.setText("$user$");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wUser, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcome)
                    .addComponent(wUser)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bank Account"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setLabelFor(userMoney);
        jLabel1.setText("Your current money:");

        ActionBTN.setText("Action");
        ActionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionBTNActionPerformed(evt);
            }
        });

        userMoney.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userMoney.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        userMoney.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Please choose what you want to do");

        options.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------$----------", "Withdraw money", "Deposit money" }));
        options.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionsMouseClicked(evt);
            }
        });
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enter the amount");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(userMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(ActionBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userMoney))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActionBTN)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        TransactionHistoryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Transactions History"));

        transactionHistoryTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction", "Amount", "New Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transactionHistoryTBL);

        javax.swing.GroupLayout TransactionHistoryPanelLayout = new javax.swing.GroupLayout(TransactionHistoryPanel);
        TransactionHistoryPanel.setLayout(TransactionHistoryPanelLayout);
        TransactionHistoryPanelLayout.setHorizontalGroup(
            TransactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TransactionHistoryPanelLayout.setVerticalGroup(
            TransactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TransactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TransactionHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Options");

        ShowTransactionHistory.setText("Show Transaction History");
        ShowTransactionHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTransactionHistoryActionPerformed(evt);
            }
        });
        jMenu2.add(ShowTransactionHistory);

        ViewProfile.setText("View Profile");
        ViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProfileActionPerformed(evt);
            }
        });
        jMenu2.add(ViewProfile);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void ActionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionBTNActionPerformed
 
        try
        {
            Connection Conn = ConnectDB();  //sundesh me thn bash dedomenon
            Calendar calendar = Calendar.getInstance();
            Date startDate = new Date(calendar.getTime().getTime());
            String insertTransactionHistory = " insert into t_history(user_id,TransactionType, Amount,NewTotal,Date) values (1,?, ?, ?, ?)";
            String GetTransactionHistory = "select TransactionType , Amount,NewTotal from t_history ";
            String insertmoney = " insert into useraccounts (money) values (?)";
            double CurrentMoney = Double.parseDouble(userMoney.getText());
            double poso = Double.parseDouble(DepositAmount.getText());
            DefaultTableModel historyLog = (DefaultTableModel) transactionHistoryTBL.getModel();
            //If withdraw is selected
            if (options.getSelectedIndex() == 1) {
                //if have money
                if (CurrentMoney > 0) {
                    //and if the withdraw amount is < than currentmoney
                    if (poso <= CurrentMoney) {
                        //Logariasmos log = new Logariasmos(CurrentMoney);
                        log.withdraw(poso);
                        String neoipolipo = String.valueOf(log.getYpoloipo());
                        userMoney.setText(neoipolipo);    //set the new money

                        // create the mysql insert preparedstatement
                        PreparedStatement withdraw = Conn.prepareStatement(insertTransactionHistory);
                        withdraw.setString(1, "Withdraw");
                        withdraw.setDouble(2, poso);
                        withdraw.setString(3, neoipolipo);
                        withdraw.setDate(4, startDate);

                        // execute the preparedstatement
                        withdraw.execute();

                        historyLog.addRow(new Object[]{"Withdraw", poso, log.getYpoloipo()}); //add to historyLog
                    } else {
                        JOptionPane.showMessageDialog(null, "You are trying to withdraw " + poso + ""
                                + "\n but your money are " + CurrentMoney + "");
                    }
                }
            }

            //if Deposit is selected
            if (options.getSelectedIndex() == 2) {
                log.deposit(poso);  //deposit money
                String neoipolipo = String.valueOf(log.getYpoloipo());  //get neoipoloipo

                userMoney.setText(neoipolipo);

                historyLog.addRow(new Object[]{"Deposit", poso, log.getYpoloipo()}); //add to historyLog

                // create the mysql insert preparedstatement
                PreparedStatement deposit = Conn.prepareStatement(insertTransactionHistory);
                deposit.setString(1, "Deposit");
                deposit.setDouble(2, poso);
                deposit.setDate(3, startDate);
                deposit.setString(4, neoipolipo);
                // execute the preparedstatement
                deposit.executeQuery();
            }
            
            
             // create the mysql insert preparedstatement
                PreparedStatement setmoney = Conn.prepareStatement(insertTransactionHistory);
                setmoney.setDouble(1, log.getYpoloipo()); 
                setmoney.executeQuery();
        }
        
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please give a correct money amount");
        }
    }//GEN-LAST:event_ActionBTNActionPerformed

    //------------------------------------------------------------------------------------------------------------------
    public  Connection ConnectDB() 
         {
             
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost/apatewniki", "root", "");
                
                return Conn;
            }
            catch (Exception e) 
            {  
                 
                JOptionPane.showMessageDialog(null, "Make sure you have a database", "Could not Connect to database", JOptionPane.ERROR_MESSAGE);

                return null;

            }
        }
    
    
    
    
    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
    
         
    }//GEN-LAST:event_optionsActionPerformed

    private void ShowTransactionHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTransactionHistoryActionPerformed
        
        if(!showHistory)
        {
             setSize(910,510);
             showHistory = true;
           GetTransactionHistory();
        }
        else
        {
            setSize(585,510);
            showHistory=false;
        }
        
            }//GEN-LAST:event_ShowTransactionHistoryActionPerformed

    private void optionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsMouseClicked
        
    }//GEN-LAST:event_optionsMouseClicked

    
    public void GetMoneyFromDatabase()
    {
         try
        {
            Connection conn = ConnectDB();

            //get money
            String getMoney = "select * from useraccounts where username = '" + wUser.getText() + "'";
            PreparedStatement de = conn.prepareStatement(getMoney);
            ResultSet raes = de.executeQuery();
            if (raes.next()) 
            {
                String themoney = raes.getString("money");
                userMoney.setText(themoney);
            }
           
        }
        catch(Exception e)
        {

        }
    }
    
    
    public void GetTransactionHistory()
    {
        DefaultTableModel historyLog = (DefaultTableModel) transactionHistoryTBL.getModel();
        
        
         try
        {
            Connection conn = ConnectDB();
                       
            //getHistory
            String getHistory = "select * from t_history where user_id =1";
            
            PreparedStatement ghstry = conn.prepareStatement(getHistory);
            ResultSet rhstry = ghstry.executeQuery();
            if (rhstry.next()) 
            {
                 historyLog.addRow(new Object[]{rhstry.getString("TransactionType"), rhstry.getDouble("Amount"),rhstry.getDouble("NewTotal")}); //add to historyLog
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something went wron with transaction history");
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       GetMoneyFromDatabase();
       
      
    }//GEN-LAST:event_formWindowOpened

    private void ViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProfileActionPerformed
                Profile Main = new Profile();
                Main.setVisible(true);
                Main.setLocationRelativeTo(null);
    }//GEN-LAST:event_ViewProfileActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActionBTN;
    private javax.swing.JTextField DepositAmount;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JCheckBoxMenuItem ShowTransactionHistory;
    private javax.swing.JPanel TransactionHistoryPanel;
    private javax.swing.JMenuItem ViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox options;
    private javax.swing.JTable transactionHistoryTBL;
    private javax.swing.JLabel userMoney;
    public javax.swing.JLabel wUser;
    public javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
