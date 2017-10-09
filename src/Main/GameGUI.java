/***************************************************************
* file: GameFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/3/17
*
* purpose: This class creates the frame where the hangman game is played, as
* well as all calculations that relate to the game.
****************************************************************/ 

package Main;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;
public class GameGUI extends javax.swing.JFrame {
    
    GameEngine game = new GameEngine();
    
    public GameGUI() {
        initComponents();
        showDateAndTime();
    }
    
    //Method: goback
    //purpose: this method brings the user back the main menu.
    public void goback(){
       dispose();
       new MainMenuFrame().setVisible(true);
    }
    
    //Method: drawLetterLines
    //purpose: this method draws the lines that will appear when the game starts, indicating to the player how many
    //letters are in the answer
    private void drawLetterLines(Graphics g){  
        super.paint(g);
        int numberOfLetters = game.getWordLength();
        int x1 = 70;
        int x2 = 110;
        int y = 270;
        for(int i = 0; i< numberOfLetters; i++){
            x1 = x2+5;
            x2 += 50;
            int test = (x1+x2)/2;
            g.drawLine(x1+5,y,x2,y);
        }
    }
    
    //Method: drawAnswers
    //purpose: this method sets up jlabels above drawnlines for replacing text with after a correct answer is guessed.
    private void drawAnswers(){
        final int y = 40;
        JLabel lb1 = new JLabel();
        JLabel lb2 = new JLabel();
        JLabel lb3 = new JLabel();
        JLabel lb4 = new JLabel();
        JLabel lb5 = new JLabel();
        JLabel lb6 = new JLabel();
        JLabel lb7 = new JLabel();
        JLabel lb8 = new JLabel();
        
        textPanel.add(lb1);
            lb1.setSize(10,10);
            lb1.setText("A");
        textPanel.add(lb2);
            lb2.setSize(10,10);
            lb2.setText("B");
        textPanel.add(lb3);
            lb3.setSize(10,10);
            lb3.setText("C");
        textPanel.add(lb4);
            lb4.setSize(10,10);
        textPanel.add(lb5);
            lb5.setSize(10,10);
        textPanel.add(lb6);
            lb6.setSize(10,10);
        textPanel.add(lb7);
            lb7.setSize(10,10);
        textPanel.add(lb8);
            lb8.setSize(10,10);
        
        lb1.setLocation(120,y);
        lb2.setLocation(170,y);
        lb3.setLocation(220,y);
        lb4.setLocation(270,y);
        lb5.setLocation(320,y);
        lb6.setLocation(370,y);
        lb7.setLocation(420,y);
        lb8.setLocation(470,y);     
    }
    @Override
    public void paint(Graphics g) {
        drawLetterLines(g);
        drawAnswers();
    
   
}
    //Method: showDateAndTime
    //purpose: this method starts the date and time components for the jlabel
    private void showDateAndTime(){
        timeComponent();
        dateComponent();
    }
    
    //Method: timeComponent
    //purpose: this method starts recording system time and places replaces a jlabel with it.
    private void timeComponent() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            timePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
            timePlaceHolder.setText(s.format(d));
            int x =1;
        }).start();
    }
    
    //Method: dateComponent
    //purpose: this method starts recording system time and places replaces a jlabel with it.
    private void dateComponent() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("  MMMM dd yyyy");
        datePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
        datePlaceHolder.setText(s.format(d));
    }
    
    //Method: helpButton
    //purpose: this method diposes the current frame and opens the Help menu, used for game instructions.
    private void helpButton(){
        dispose();
        new HelpFrame().setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        namePlaceHolder = new javax.swing.JLabel();
        datePlaceHolder = new javax.swing.JLabel();
        timePlaceHolder = new javax.swing.JLabel();
        hangPanel = new javax.swing.JPanel();
        textPanel = new javax.swing.JPanel();
        letterPanel = new javax.swing.JPanel();
        AButton = new javax.swing.JButton();
        BButton = new javax.swing.JButton();
        CButton = new javax.swing.JButton();
        DButton = new javax.swing.JButton();
        EButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        GButton = new javax.swing.JButton();
        HButton = new javax.swing.JButton();
        IButton = new javax.swing.JButton();
        JButton = new javax.swing.JButton();
        KButton = new javax.swing.JButton();
        LButton = new javax.swing.JButton();
        MButton = new javax.swing.JButton();
        NButton = new javax.swing.JButton();
        OButton = new javax.swing.JButton();
        PButton = new javax.swing.JButton();
        QButton = new javax.swing.JButton();
        RButton = new javax.swing.JButton();
        SButton = new javax.swing.JButton();
        TButton = new javax.swing.JButton();
        UButton = new javax.swing.JButton();
        VButton = new javax.swing.JButton();
        WButton = new javax.swing.JButton();
        YButton = new javax.swing.JButton();
        XButton = new javax.swing.JButton();
        ZButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        gamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.setPreferredSize(new java.awt.Dimension(600, 200));
        gamePanel.setLayout(null);

        namePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        namePlaceHolder.setText("HANGMAN");
        gamePanel.add(namePlaceHolder);
        namePlaceHolder.setBounds(2, 2, 55, 14);

        datePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datePlaceHolder.setText("DATEPLACEHOLDER");
        gamePanel.add(datePlaceHolder);

        datePlaceHolder.setBounds(400, 0, 100, 26);

        datePlaceHolder.setBounds(400, 0, 100, 14);


        timePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timePlaceHolder.setText("TIMEPLACEHOLDER");
        gamePanel.add(timePlaceHolder);

        timePlaceHolder.setBounds(510, 0, 70, 26);

        timePlaceHolder.setBounds(510, 0, 70, 14);


        hangPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gamePanel.add(hangPanel);
        hangPanel.setBounds(10, 20, 580, 170);

        textPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textPanel.setLayout(null);
        gamePanel.add(textPanel);
        textPanel.setBounds(10, 190, 580, 60);

        getContentPane().add(gamePanel);
        gamePanel.setBounds(0, 0, 600, 260);

        letterPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        letterPanel.setLayout(new java.awt.GridLayout(2, 0, -1, 1));

        AButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        AButton.setText("a");
        AButton.setToolTipText("A button");
        AButton.setAlignmentY(0.0F);
        AButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AButtonActionPerformed(evt);
            }
        });
        letterPanel.add(AButton);

        BButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BButton.setText("b");
        BButton.setAlignmentY(0.0F);
        BButton.setMaximumSize(new java.awt.Dimension(40, 24));
        BButton.setMinimumSize(new java.awt.Dimension(40, 24));
        BButton.setPreferredSize(new java.awt.Dimension(10, 10));
        BButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BButtonActionPerformed(evt);
            }
        });
        letterPanel.add(BButton);

        CButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        CButton.setText("c");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });
        letterPanel.add(CButton);

        DButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        DButton.setText("d");
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });
        letterPanel.add(DButton);

        EButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        EButton.setText("e");
        EButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EButtonActionPerformed(evt);
            }
        });
        letterPanel.add(EButton);

        FButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        FButton.setText("f");
        FButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FButtonActionPerformed(evt);
            }
        });
        letterPanel.add(FButton);

        GButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        GButton.setText("g");
        GButton.setMaximumSize(new java.awt.Dimension(5, 5));
        GButton.setMinimumSize(new java.awt.Dimension(5, 5));
        GButton.setPreferredSize(new java.awt.Dimension(5, 5));
        GButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GButtonActionPerformed(evt);
            }
        });
        letterPanel.add(GButton);

        HButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        HButton.setText("h");
        HButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HButtonActionPerformed(evt);
            }
        });
        letterPanel.add(HButton);

        IButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        IButton.setText("i");
        IButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IButtonActionPerformed(evt);
            }
        });
        letterPanel.add(IButton);

        JButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        JButton.setText("j");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });
        letterPanel.add(JButton);

        KButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        KButton.setText("k");
        KButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KButtonActionPerformed(evt);
            }
        });
        letterPanel.add(KButton);

        LButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        LButton.setText("L");
        LButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButtonActionPerformed(evt);
            }
        });
        letterPanel.add(LButton);

        MButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14));
        MButton.setText("m");
        MButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MButtonActionPerformed(evt);
            }
        });
        letterPanel.add(MButton);

        NButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        NButton.setText("n");
        NButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NButtonActionPerformed(evt);
            }
        });
        letterPanel.add(NButton);

        OButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        OButton.setText("o");
        OButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OButtonActionPerformed(evt);
            }
        });
        letterPanel.add(OButton);

        PButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PButton.setText("p");
        PButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PButtonActionPerformed(evt);
            }
        });
        letterPanel.add(PButton);

        QButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        QButton.setText("q");
        QButton.setFocusPainted(false);
        QButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QButtonActionPerformed(evt);
            }
        });
        letterPanel.add(QButton);

        RButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        RButton.setText("r");
        RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RButtonActionPerformed(evt);
            }
        });
        letterPanel.add(RButton);

        SButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        SButton.setText("s");
        SButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SButtonActionPerformed(evt);
            }
        });
        letterPanel.add(SButton);

        TButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        TButton.setText("t");
        TButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButtonActionPerformed(evt);
            }
        });
        letterPanel.add(TButton);

        UButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        UButton.setText("u");
        UButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UButtonActionPerformed(evt);
            }
        });
        letterPanel.add(UButton);

        VButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        VButton.setText("v");
        VButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VButtonActionPerformed(evt);
            }
        });
        letterPanel.add(VButton);

        WButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        WButton.setText("w");
        WButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WButtonActionPerformed(evt);
            }
        });
        letterPanel.add(WButton);

        YButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        YButton.setText("y");
        YButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YButtonActionPerformed(evt);
            }
        });
        letterPanel.add(YButton);

        XButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        XButton.setText("x");
        XButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButtonActionPerformed(evt);
            }
        });
        letterPanel.add(XButton);

        ZButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        ZButton.setText("z");
        ZButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZButtonActionPerformed(evt);
            }
        });
        letterPanel.add(ZButton);

        helpButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        helpButton.setText("?");
        helpButton.setPreferredSize(new java.awt.Dimension(20, 20));
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        letterPanel.add(helpButton);

        getContentPane().add(letterPanel);
        letterPanel.setBounds(0, 260, 600, 110);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
           helpButton();        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void WButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WButtonActionPerformed

    private void YButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CButtonActionPerformed

    private void LButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LButtonActionPerformed

    private void AButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AButtonActionPerformed

       if (game.guessLetter('a')){
           boolean[] indexToPrint = game.getIndexes('a');
           
       }

       game.guessLetter('a');

       AButton.setEnabled(false);
    }//GEN-LAST:event_AButtonActionPerformed

    private void ZButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZButtonActionPerformed
        // TODO add your handling code here:
         ZButton.setEnabled(false);
    }//GEN-LAST:event_ZButtonActionPerformed

    private void XButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButtonActionPerformed
        // TODO add your handling code here:
         XButton.setEnabled(false);
    }//GEN-LAST:event_XButtonActionPerformed

    private void BButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BButtonActionPerformed
        // TODO add your handling code here:
         BButton.setEnabled(false);
    }//GEN-LAST:event_BButtonActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DButtonActionPerformed

    private void EButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EButtonActionPerformed

    private void FButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FButtonActionPerformed

    private void GButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GButtonActionPerformed

    private void HButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HButtonActionPerformed

    private void IButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IButtonActionPerformed

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonActionPerformed

    private void KButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KButtonActionPerformed

    private void MButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MButtonActionPerformed

    private void NButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NButtonActionPerformed

    private void OButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OButtonActionPerformed

    private void PButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PButtonActionPerformed

    private void QButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QButtonActionPerformed

    private void RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RButtonActionPerformed

    private void SButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SButtonActionPerformed

    private void TButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TButtonActionPerformed

    private void UButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UButtonActionPerformed

    private void VButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AButton;
    private javax.swing.JButton BButton;
    private javax.swing.JButton CButton;
    private javax.swing.JButton DButton;
    private javax.swing.JButton EButton;
    private javax.swing.JButton FButton;
    private javax.swing.JButton GButton;
    private javax.swing.JButton HButton;
    private javax.swing.JButton IButton;
    private javax.swing.JButton JButton;
    private javax.swing.JButton KButton;
    private javax.swing.JButton LButton;
    private javax.swing.JButton MButton;
    private javax.swing.JButton NButton;
    private javax.swing.JButton OButton;
    private javax.swing.JButton PButton;
    private javax.swing.JButton QButton;
    private javax.swing.JButton RButton;
    private javax.swing.JButton SButton;
    private javax.swing.JButton TButton;
    private javax.swing.JButton UButton;
    private javax.swing.JButton VButton;
    private javax.swing.JButton WButton;
    private javax.swing.JButton XButton;
    private javax.swing.JButton YButton;
    private javax.swing.JButton ZButton;
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel hangPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel letterPanel;
    private javax.swing.JLabel namePlaceHolder;
    private javax.swing.JPanel textPanel;
    private javax.swing.JLabel timePlaceHolder;
    // End of variables declaration//GEN-END:variables

    
}
