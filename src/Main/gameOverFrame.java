/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author Owner
 */
public class gameOverFrame extends javax.swing.JFrame {

    /** Creates new form gameOverFrame */
    public gameOverFrame(int x) {
        initComponents();
        String num = Integer.toString(x);
        scoreNum.setText(num);
    }
    
    private void restartGame(){
        dispose();
        new MainMenuFrame().setVisible(true);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();
        scoreNum = new javax.swing.JLabel();
        endButton = new javax.swing.JButton();
        backGroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        scoreLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        scoreLabel.setText("Score:");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(420, 190, 44, 21);

        scoreNum.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        scoreNum.setForeground(new java.awt.Color(255, 0, 0));
        scoreNum.setText("num");
        getContentPane().add(scoreNum);
        scoreNum.setBounds(470, 190, 70, 20);

        endButton.setText("End");
        endButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });
        getContentPane().add(endButton);
        endButton.setBounds(463, 300, 110, 21);

        backGroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/gameOver.png"))); // NOI18N
        backGroundImg.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(backGroundImg);
        backGroundImg.setBounds(0, -40, 1296, 443);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
       restartGame();
    }//GEN-LAST:event_endButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundImg;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreNum;
    // End of variables declaration//GEN-END:variables

}
