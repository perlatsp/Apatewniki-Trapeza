
public class Profile extends javax.swing.JFrame {
 
    private boolean showdetails = false;
    public Profile() 
    {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterPanel = new javax.swing.JPanel();
        NameLBL = new javax.swing.JLabel();
        SurnameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        profileUsernameTXT = new javax.swing.JTextField();
        profileNameTXT = new javax.swing.JTextField();
        profileSurnameTXT = new javax.swing.JTextField();
        profileEmailTXT = new javax.swing.JTextField();
        profilePasswordTXT = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        detailsBTN = new javax.swing.JButton();
        passLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NameLBL.setText("Name");

        SurnameLBL.setText("Surname");

        emailLBL.setText("Email");

        profileUsernameTXT.setEditable(false);

        profileNameTXT.setEditable(false);

        profileSurnameTXT.setEditable(false);

        profileEmailTXT.setEditable(false);

        profilePasswordTXT.setEditable(false);

        jLabel4.setText("Username");

        detailsBTN.setText("View Details");
        detailsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBTNActionPerformed(evt);
            }
        });

        passLBL.setText("Password");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Icons/profile.png"))); // NOI18N

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameLBL)
                    .addComponent(passLBL)
                    .addComponent(jLabel4)
                    .addComponent(SurnameLBL)
                    .addComponent(emailLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addComponent(detailsBTN)
                        .addGap(31, 31, 31)
                        .addComponent(backBTN)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profileSurnameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(profileUsernameTXT)
                            .addComponent(profileNameTXT)
                            .addComponent(profilePasswordTXT)
                            .addComponent(profileEmailTXT))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(profileUsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passLBL)
                            .addComponent(profilePasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLBL)
                            .addComponent(profileNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SurnameLBL)
                            .addComponent(profileSurnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL)
                    .addComponent(profileEmailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsBTN)
                    .addComponent(backBTN))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBTNActionPerformed
        Pelaths cl = new Pelaths("perlatsp","1234123","Perlat","Kotsiai","ksad@gmail.com");
        
        if (!showdetails) {
            profileUsernameTXT.setText(cl.getUsername().toString());
            profilePasswordTXT.setText(cl.getPassword().toString());
            profileNameTXT.setText(cl.getName().toString());
            profileSurnameTXT.setText(cl.getSurname().toString());
            profileEmailTXT.setText(cl.getEmail().toString());
            showdetails = !showdetails;
            detailsBTN.setText("Hide Details");
        } else {
            profileUsernameTXT.setText("**********");
            profilePasswordTXT.setText("**********");
            profileNameTXT.setText("**********");
            profileSurnameTXT.setText("**********");
            profileEmailTXT.setText("**********");
            showdetails = !showdetails;
            detailsBTN.setText("Show Details");

        }
    }//GEN-LAST:event_detailsBTNActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        profileUsernameTXT.setText("**********");
        profilePasswordTXT.setText("**********");
        profileNameTXT.setText("**********");
        profileSurnameTXT.setText("**********");
        profileEmailTXT.setText("**********");
    }//GEN-LAST:event_formWindowOpened

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
       dispose(); 
    }//GEN-LAST:event_backBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLBL;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel SurnameLBL;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton detailsBTN;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel passLBL;
    private javax.swing.JTextField profileEmailTXT;
    private javax.swing.JTextField profileNameTXT;
    private javax.swing.JPasswordField profilePasswordTXT;
    private javax.swing.JTextField profileSurnameTXT;
    private javax.swing.JTextField profileUsernameTXT;
    // End of variables declaration//GEN-END:variables
}
