/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class pizzatype extends javax.swing.JFrame {

    /**
     * Creates new form pizzatype
     */
    public pizzatype() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlept = new javax.swing.JLabel();
        webpt = new javax.swing.JLabel();
        choosepizza = new javax.swing.JLabel();
        nextpt = new javax.swing.JButton();
        backpt = new javax.swing.JButton();
        STUFFED = new javax.swing.JRadioButton();
        pan = new javax.swing.JRadioButton();
        regular = new javax.swing.JRadioButton();
        quantity = new javax.swing.JLabel();
        quantitypt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlept.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        titlept.setText("Pizza Hunt");

        webpt.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        webpt.setText("www.pizzahunt.com");

        choosepizza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choosepizza.setText("Choose Pizza Type:");

        nextpt.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nextpt.setText("Next");
        nextpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextptActionPerformed(evt);
            }
        });

        backpt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backpt.setText("Update ");
        backpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backptActionPerformed(evt);
            }
        });

        STUFFED.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        STUFFED.setText("Stuffed Crust                                        RS.300");

        pan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pan.setText("Pan Pizza                                                RS.200");
        pan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panActionPerformed(evt);
            }
        });

        regular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regular.setText("Regular                                                   RS.150");

        quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quantity.setText("Quantity");

        quantitypt.setText("0");

        jLabel1.setText("click to update customer details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(choosepizza, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity)
                        .addGap(18, 18, 18)
                        .addComponent(quantitypt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(webpt, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(titlept, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(STUFFED, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regular, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backpt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addComponent(nextpt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titlept, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choosepizza, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity)
                    .addComponent(quantitypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(STUFFED, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextpt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backpt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(webpt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backptActionPerformed
        // TODO add your handling code here:
        cusdet cus=new cusdet();
        cus.setVisible(true);
        dispose();
    }//GEN-LAST:event_backptActionPerformed

    private void nextptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextptActionPerformed
      
        cusdet cus=new cusdet();
        String cusname=cus.namec.getText();
                
       int qty = Integer.parseInt(quantitypt.getText()); 
double rate = 0; 
   String s ="null";
String type =" null" ;
if (STUFFED.isSelected()) { 
    rate = 300; 
    type="pizza:STUFFED CRUST";
    pan.setEnabled(false);
    regular.setEnabled(false);
} 
else if (pan.isSelected()) { 
    rate = 200;
     type="pizza:PAN PIZZA";
     STUFFED.setEnabled(false);
    regular.setEnabled(false);
} 
else if (regular.isSelected()) { 
    rate = 150;
     type="pizza:REGULAR PIZZA";
     pan.setEnabled(false);
   STUFFED.setEnabled(false);
} 
if(type.equals("STUFFED CRUST")||type.equals("REGULAR PIZZA"))
{
     s="              ";
}
else
{
     s="                  ";
}
   rate=rate*qty;
 Bill b=new Bill();
       
 b.billarea.setText("_______________________________________"+"\n"
                    +"____________Pizza Hunt________________ "+"\n"
                    +"_____________Welcome__________________ "+"\n"
                    +"Heloo "+cusname+"..................... "+"\n"
                    +"You Ordered___________________________"+"\n"
                    +"Pizza Type                                Quantity"+"\n"
                    +type+s+qty+"        "+"\n"
                    +"______________________________________"+"\n"     
                    +"Amount                         RS."+rate+"\n"
                    +"GST:                             RS.0   "+"\n"
                    +"______________________________________"+"\n"
                    +"visit:                                "+"\n"
                    +"       www.pizzahunt.com              "+"\n"
                    +"______________________________________");
 b.setVisible(true);
 dispose();
       
    }//GEN-LAST:event_nextptActionPerformed

    private void panActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panActionPerformed

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
            java.util.logging.Logger.getLogger(pizzatype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzatype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzatype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzatype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizzatype().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton STUFFED;
    private javax.swing.JButton backpt;
    private javax.swing.JLabel choosepizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextpt;
    private javax.swing.JRadioButton pan;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantitypt;
    private javax.swing.JRadioButton regular;
    private javax.swing.JLabel titlept;
    private javax.swing.JLabel webpt;
    // End of variables declaration//GEN-END:variables
}
