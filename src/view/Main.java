package view;

import control.CourseList;
import control.ArrangementList;
import control.Booking;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Course;
import model.Arrangement;
import model.Database;
import model.User;

public class Main extends javax.swing.JFrame {

    private CourseList cList1;
    private CourseList cList2;
    private ArrangementList aList1;
    private ArrangementList aList2;
    private Database db;
    private User user;

    public Main() {

        try {
            db = new Database("ungdomsskolemini");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                    "Der opstod en fejl med driveren til databasen",
                    "Fejl",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                    "Der opstod en fejl med connection til databasen",
                    "Fejl",
                    JOptionPane.ERROR_MESSAGE);
        }
        initComponents();

        try {
            aList1 = new ArrangementList(db, "Forår");
            aList2 = new ArrangementList(db, "Efterår");
            cList1 = new CourseList(db, "Forår");
            cList2 = new CourseList(db, "Efterår");
            showCourses(cList1);
            showArrangements(aList1);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                    "Der opstod en fejl med oprettelse af lister til kurser og arrangementer",
                    "Fejl",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jBLogin = new javax.swing.JButton();
        jTCPR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBSkip = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jBCourseAdd = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLUser1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jBArrangementAdd = new javax.swing.JButton();
        jLUser2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setLayout(new java.awt.CardLayout());

        jBLogin.setText("Login");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("CPR nr");

        jBSkip.setText("Skip");
        jBSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSkipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSkip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTCPR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLogin)
                    .addComponent(jBSkip))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel6, "card3");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Kurser");

        jBCourseAdd.setText("Tilmeld");
        jBCourseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCourseAddActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forår", "Efterår" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCourseAdd)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jBCourseAdd)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kurser", jPanel1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jList2);

        jLabel3.setText("Arrangementer");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forår", "Efterår" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jBArrangementAdd.setText("Tilmeld");
        jBArrangementAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArrangementAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBArrangementAdd)
                .addGap(128, 128, 128))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addComponent(jBArrangementAdd)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arrangementer", jPanel2);

        jPanel7.add(jTabbedPane1, "card2");

        getContentPane().add(jPanel7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        // TODO add your handling code here:
        jBCourseAdd.setText("Tilmeld");
        jBArrangementAdd.setText("Tilmeld");

        String cpr = jTCPR.getText(); // TextField med Cpr nr som vi bruger til at logge ind med
        if (!cpr.isEmpty() && cpr.length() == 10) { //Tjekker om feltet er ikke er tømt og at det har en længte på 10
            try {
                ResultSet rs = db.selectQuery("SELECT * FROM `user` WHERE cprnr =" + cpr); //Henter fra MySQL Database den bruger med det CPR nr der er tastet ind
                if (rs.next()) { //rs.next tjekker om der noget i den MySQL Query vi køre
                    user = new User(rs.getString("cprnr"), rs.getString("firstName"), rs.getString("lastName")); //Opretter en bruger i "User" klassen med data fra Database
                    CardLayout cl = (CardLayout) jPanel7.getLayout();
                    cl.next(jPanel7);//Gå videre til kursus/arrangemeter del af programmet
                    jTCPR.setText(null);
                    jLabel4.setText(null);
                    showAmountBookingForSeason();
                    //Sætter og tømmer visse tekstfelter.
                } else {
                    jLabel4.setText("CPR nr findes ikke");//Hvis CPR nr ikke findes skriver vi det til brugeren.
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,
                        "Der opstod en fejl med login",
                        "Fejl",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            jLabel4.setText("Ugyldigt CPR nr");//Skrevet et ugyldigt CPR nr.
        }
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jBSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSkipActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) jPanel7.getLayout();
        cl.next(jPanel7);
        jBCourseAdd.setText("Login");
        jBArrangementAdd.setText("Login");
        jTCPR.setText(null);
        jLabel4.setText(null);
    }//GEN-LAST:event_jBSkipActionPerformed

    private void jBCourseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCourseAddActionPerformed
        // TODO add your handling code here:
        if (jBCourseAdd.getText().equals("Login")) {
            CardLayout cl = (CardLayout) jPanel7.getLayout();
            cl.next(jPanel7);
        } else {
            //Add to course
            if (jList1.getSelectedValue() != null) {
                try {
                    Course course = (Course) jList1.getSelectedValue();
                    Booking booking = new Booking(user, course, db);
                    String season = jComboBox1.getSelectedItem().toString();
                    int result = booking.insertBooking(season);
                    System.out.println(result + "");
                    if (result == 0) {
                        showAmountBookingForSeason();
                        JOptionPane.showMessageDialog(null,
                                "Du er nu tilmeldt kurset",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (result == -1) {
                        JOptionPane.showMessageDialog(null,
                                "Du er allerede tilmeldt",
                                "FEJL",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,
                            "Der opstod en fejl med tilmelding",
                            "Fejl",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jBCourseAddActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem() != null) {
            if (jComboBox1.getSelectedItem().toString().equals("Forår")) {
                showCourses(cList1);
            } else {
                showCourses(cList2);
            }
            showAmountBookingForSeason();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (!evt.getValueIsAdjusting() && jList1.getSelectedValue() != null) {
            jTextArea1.setText(null);
            Course course = (Course) jList1.getSelectedValue();
            jTextArea1.append("Navn: " + course.getName() + "\n");
            jTextArea1.append("Ugedag: " + course.getWeekDay());
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jBArrangementAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArrangementAddActionPerformed
        if (jBCourseAdd.getText().equals("Login")) {
            CardLayout cl = (CardLayout) jPanel7.getLayout();
            cl.next(jPanel7);
        } else {
            //Add to Arrangement
            if (jList2.getSelectedValue() != null) {
                try {
                    Arrangement arrangement = (Arrangement) jList2.getSelectedValue();
                    Booking booking = new Booking(user, arrangement, db);
                    String season = jComboBox2.getSelectedItem().toString();
                    int result = booking.insertBooking(season);
                    if (result == 0) {
                        showAmountBookingForSeason();
                        JOptionPane.showMessageDialog(null,
                                "Du er nu tilmeldt Arrangement",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (result == -1) {
                        JOptionPane.showMessageDialog(null,
                                "Du er allerede tilmeldt",
                                "FEJL",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,
                            "Der opstod en fejl med tilmelding",
                            "Fejl",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jBArrangementAddActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedItem() != null) {
            if (jComboBox2.getSelectedItem().toString().equals("Forår")) {
                showArrangements(aList1);
            } else {
                showArrangements(aList2);
            }
            showAmountBookingForSeason();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        if (!evt.getValueIsAdjusting() && jList2.getSelectedValue() != null) {
            jTextArea2.setText(null);
            Arrangement arrangement = (Arrangement) jList2.getSelectedValue();
            jTextArea2.append("Navn: " + arrangement.getName() + "\n");
            jTextArea2.append("Ugedag: " + arrangement.getWeekDay());
        }
    }//GEN-LAST:event_jList2ValueChanged

    private void showCourses(CourseList cList) {
        ArrayList<Course> courses = cList.getCourseList();
        jList1.setListData(courses.toArray());
//        DefaultListModel listModel = new DefaultListModel();
//        for (Course course : courses) {
//            listModel.addElement(course);
//        }
//        jList1.setModel(listModel);
    }

    private void showArrangements(ArrangementList aList) {
        ArrayList<Arrangement> arrangements = aList.getArrangementList();
        jList2.setListData(arrangements.toArray());
//        DefaultListModel listModel2 = new DefaultListModel();
//        for (Arrangement arrangement : arrangements) {
//            listModel2.addElement(arrangement);
//        }
//        jList2.setModel(listModel2);
    }

    private void showAmountBookingForSeason() {
        String lUser = "Logged ind som: " + user.getFirstName() + " " + user.getLastName();
        String season = jComboBox1.getSelectedItem().toString();
        try {
            int result = Booking.getAmountOfBooking(user, 1, db, season);
            jLUser1.setText(lUser + " - Du er tilmeldt " + Integer.toString(result));
            season = jComboBox2.getSelectedItem().toString();
            result = Booking.getAmountOfBooking(user, 2, db, season);
            jLUser2.setText(lUser + " - Du er tilmeldt " + Integer.toString(result));
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBArrangementAdd;
    private javax.swing.JButton jBCourseAdd;
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jBSkip;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLUser1;
    private javax.swing.JLabel jLUser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTCPR;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
