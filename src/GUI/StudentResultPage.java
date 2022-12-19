/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String rollNo) {
        initComponents();
        jTextField1.setText(rollNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        gender_textfield = new javax.swing.JTextField();
        father_textfield = new javax.swing.JTextField();
        course_textfield = new javax.swing.JTextField();
        branch_textfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 540));
        setMinimumSize(new java.awt.Dimension(570, 540));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, 20));

        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        getContentPane().add(name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, -1));
        getContentPane().add(gender_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, -1));
        getContentPane().add(father_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 70, -1));

        course_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(course_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, -1));
        getContentPane().add(branch_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 70, -1));

        jLabel7.setText("Subjects");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel8.setText("Total Marks");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel9.setText("Passing Marks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel10.setText("Marks Obtained");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        jLabel11.setText("Physics");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel12.setText("Maths");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel13.setText("Chemistry");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel14.setText("Electrical");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel15.setText("Biology");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel18.setText("100");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel19.setText("100");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel20.setText("100");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel21.setText("100");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel22.setText("100");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 10));

        jLabel23.setText("100");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 10));

        jLabel24.setText("100");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel16.setText("100");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel25.setText("100");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jLabel26.setText("30");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel27.setText("30");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, 70));

        jLabel28.setText("30");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel29.setText("30");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel30.setText("30");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 262, 70, 20));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 70, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 70, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 70, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 70, -1));

        jLabel31.setText("Total Marks");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 70, -1));

        jLabel32.setText("Verdict");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 70, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-logout-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 60, 60));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic1.jpg"))); // NOI18N
        jLabel33.setText("jLabel33");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void course_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_textfieldActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         String rollNo = jTextField1.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("SELECT * FROM student inner join result WHERE student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered RollNo. doesn't exist");
            }
            else{
               name_textfield.setText(rs.getString(1));
               gender_textfield.setText(rs.getString(3));
               father_textfield.setText(rs.getString(4));
               course_textfield.setText(rs.getString(5));
               branch_textfield.setText(rs.getString(6));
               
               jTextField7.setText(rs.getString(8));
               jTextField8.setText(rs.getString(9));
               jTextField9.setText(rs.getString(10));
               jTextField10.setText(rs.getString(11));
               jTextField11.setText(rs.getString(12));
               jTextField12.setText(rs.getString(13));
               
               
               name_textfield.setEditable(false);
               gender_textfield.setEditable(false);
               father_textfield.setEditable(false);
               course_textfield.setEditable(false);
               branch_textfield.setEditable(false);
               
               
               
               jTextField7.setEditable(false);
               jTextField8.setEditable(false);
               jTextField9.setEditable(false);
               jTextField10.setEditable(false);
               jTextField11.setEditable(false);
               
               int physicsMarks=Integer.parseInt(rs.getString(8));
               int mathsMarks=Integer.parseInt(rs.getString(9));
               int chemMarks=Integer.parseInt(rs.getString(10));
               int elecMarks=Integer.parseInt(rs.getString(11));
               int bioMarks=Integer.parseInt(rs.getString(12));
               
               
               if(physicsMarks>=30 && mathsMarks>=30 && chemMarks>=30 && elecMarks>=30 && bioMarks>=30){
                   jTextField13.setText("Pass");
               }
               else{
                   jTextField13.setText("Fail");
               }
               jTextField13.setEditable(false);
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e.toString()); 
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "You sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        
        if(response == 0){
            setVisible(false);
            Student frame=new Student();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField branch_textfield;
    private javax.swing.JTextField course_textfield;
    private javax.swing.JTextField father_textfield;
    private javax.swing.JTextField gender_textfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField name_textfield;
    // End of variables declaration//GEN-END:variables
}