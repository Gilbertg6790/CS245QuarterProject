/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Owner
 */
public class TeamInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form TeamInfoFrame
     */
    public TeamInfoFrame() {
        f1Listener();
        initComponents();
    }

   public final void f1Listener() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        name1 = new javax.swing.JLabel();
        creditText = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Albert Gil : 011786905 ");
        name1.setAlignmentY(0.0F);
        name1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name1.setIconTextGap(0);
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 190, 238, -1));

        creditText.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        creditText.setText("Swing Project, Fall 2017");
        creditText.setToolTipText("TeamInfo Title");
        creditText.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(creditText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 75, -1, -1));

        name2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Ynebin Yin : 1010101010");
        name2.setAlignmentY(0.0F);
        name2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name2.setIconTextGap(0);
        getContentPane().add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 256, 238, -1));

        name3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Matt Musquiz : 010101010");
        name3.setAlignmentY(0.0F);
        name3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name3.setIconTextGap(0);
        getContentPane().add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 234, 238, -1));

        name4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("Cody Nguyen : 011887291");
        name4.setAlignmentY(0.0F);
        name4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name4.setIconTextGap(0);
        getContentPane().add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 212, 238, -1));

        name5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("Team Diamond Dogs");
        name5.setAlignmentY(0.0F);
        name5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name5.setIconTextGap(0);
        getContentPane().add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 126, 238, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    // End of variables declaration//GEN-END:variables
}
