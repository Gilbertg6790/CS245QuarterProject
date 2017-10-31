/** *************************************************************
 * file: MainMenuFrame.java
 * author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
 * class: CS 245 - Programming Graphical User Interfaces
 *
 * assignment: Hangman V1.2
 * date last modified: 10/22/17
 *
 * purpose: This class is to contain the word that needs to be guess,
 * the letters that have been revealed, and the remaining guesses. This
 * class does not deal with user input and calls other classes to handle
 * user input.
 *
 *************************************************************** */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class SudokuGUI extends javax.swing.JFrame {

    SudokuEngine se = new SudokuEngine();
    private int[][] tempArray = new int[9][9];
    private int score;
    private final HighScoreEngine hiScoreRecords = new HighScoreEngine("0", 0);
    
    
    public SudokuGUI() {
        score = 0;
        hiScoreRecords.loadScoreFromFile();
        f1Listener();
        //escapeListener();
        initComponents();
        
    }
    
    public SudokuGUI(int prevScore) {
        score = prevScore;
        hiScoreRecords.loadScoreFromFile();
        f1Listener();
        //escapeListener();
        initComponents();
        
    }
    public final void f1Listener() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                new TeamInfoFrame().setVisible(true);
            }
        });
    }
    
    public final void escapeListener() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        r9_1 = new javax.swing.JTextField();
        r7_1 = new javax.swing.JTextField();
        r8_2 = new javax.swing.JTextField();
        r7_3 = new javax.swing.JTextField();
        r9_3 = new javax.swing.JTextField();
        r7_2 = new javax.swing.JTextField();
        r8_3 = new javax.swing.JTextField();
        r8_1 = new javax.swing.JTextField();
        r9_2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        r5_8 = new javax.swing.JTextField();
        r6_8 = new javax.swing.JTextField();
        r4_8 = new javax.swing.JTextField();
        r5_9 = new javax.swing.JTextField();
        r5_7 = new javax.swing.JTextField();
        r6_9 = new javax.swing.JTextField();
        r4_7 = new javax.swing.JTextField();
        r6_7 = new javax.swing.JTextField();
        r4_9 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        r7_9 = new javax.swing.JTextField();
        r7_8 = new javax.swing.JTextField();
        r9_9 = new javax.swing.JTextField();
        r9_8 = new javax.swing.JTextField();
        r8_7 = new javax.swing.JTextField();
        r8_9 = new javax.swing.JTextField();
        r9_7 = new javax.swing.JTextField();
        r7_7 = new javax.swing.JTextField();
        r8_8 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        r6_3 = new javax.swing.JTextField();
        r4_1 = new javax.swing.JTextField();
        r4_2 = new javax.swing.JTextField();
        r4_3 = new javax.swing.JTextField();
        r5_1 = new javax.swing.JTextField();
        r5_2 = new javax.swing.JTextField();
        r5_3 = new javax.swing.JTextField();
        r6_1 = new javax.swing.JTextField();
        r6_2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        r3_6 = new javax.swing.JTextField();
        r2_4 = new javax.swing.JTextField();
        r1_5 = new javax.swing.JTextField();
        r3_4 = new javax.swing.JTextField();
        r2_6 = new javax.swing.JTextField();
        r2_5 = new javax.swing.JTextField();
        r1_4 = new javax.swing.JTextField();
        r3_5 = new javax.swing.JTextField();
        r1_6 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        r7_5 = new javax.swing.JTextField();
        r8_5 = new javax.swing.JTextField();
        r8_4 = new javax.swing.JTextField();
        r7_4 = new javax.swing.JTextField();
        r7_6 = new javax.swing.JTextField();
        r9_4 = new javax.swing.JTextField();
        r9_5 = new javax.swing.JTextField();
        r9_6 = new javax.swing.JTextField();
        r8_6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        r3_1 = new javax.swing.JTextField();
        r1_2 = new javax.swing.JTextField();
        r2_1 = new javax.swing.JTextField();
        r1_1 = new javax.swing.JTextField();
        r2_2 = new javax.swing.JTextField();
        r3_2 = new javax.swing.JTextField();
        r3_3 = new javax.swing.JTextField();
        r2_3 = new javax.swing.JTextField();
        r1_3 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        r4_5 = new javax.swing.JTextField();
        r5_5 = new javax.swing.JTextField();
        r5_4 = new javax.swing.JTextField();
        r4_6 = new javax.swing.JTextField();
        r5_6 = new javax.swing.JTextField();
        r6_4 = new javax.swing.JTextField();
        r6_6 = new javax.swing.JTextField();
        r4_4 = new javax.swing.JTextField();
        r6_5 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        r2_8 = new javax.swing.JTextField();
        r1_8 = new javax.swing.JTextField();
        r1_9 = new javax.swing.JTextField();
        r3_8 = new javax.swing.JTextField();
        r2_9 = new javax.swing.JTextField();
        r1_7 = new javax.swing.JTextField();
        r3_7 = new javax.swing.JTextField();
        r3_9 = new javax.swing.JTextField();
        r2_7 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 120));

        r9_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_1.setText("3");
        r9_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_1KeyTyped(evt);
            }
        });

        r7_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_1KeyTyped(evt);
            }
        });

        r8_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_2KeyTyped(evt);
            }
        });

        r7_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_3.setText("2");
        r7_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_3KeyTyped(evt);
            }
        });

        r9_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_3KeyTyped(evt);
            }
        });

        r7_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_2.setText("5");
        r7_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_2KeyTyped(evt);
            }
        });

        r8_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_3.setText("1");
        r8_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_3KeyTyped(evt);
            }
        });

        r8_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_1KeyTyped(evt);
            }
        });

        r9_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r9_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(r9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(r9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 120));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 120));

        r5_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_8KeyTyped(evt);
            }
        });

        r6_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_8KeyTyped(evt);
            }
        });

        r4_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_8.setText("8");
        r4_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_8KeyTyped(evt);
            }
        });

        r5_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_9KeyTyped(evt);
            }
        });

        r5_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_7KeyTyped(evt);
            }
        });

        r6_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_9.setText("3");
        r6_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_9KeyTyped(evt);
            }
        });

        r4_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_7.setText("7");
        r4_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_7KeyTyped(evt);
            }
        });

        r6_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_7.setText("1");
        r6_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_7KeyTyped(evt);
            }
        });

        r4_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 120));

        r7_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_9KeyTyped(evt);
            }
        });

        r7_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_8.setText("9");
        r7_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_8KeyTyped(evt);
            }
        });

        r9_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_9.setText("5");
        r9_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_9KeyTyped(evt);
            }
        });

        r9_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_8KeyTyped(evt);
            }
        });

        r8_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_7KeyTyped(evt);
            }
        });

        r8_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_9KeyTyped(evt);
            }
        });

        r9_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_7KeyTyped(evt);
            }
        });

        r7_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_7KeyTyped(evt);
            }
        });

        r8_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 120, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 120));

        r6_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_3.setText("8");
        r6_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_3KeyTyped(evt);
            }
        });

        r4_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_1.setText("5");
        r4_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_1KeyTyped(evt);
            }
        });

        r4_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_2KeyTyped(evt);
            }
        });

        r4_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_3.setText("9");
        r4_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_3KeyTyped(evt);
            }
        });

        r5_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_1KeyTyped(evt);
            }
        });

        r5_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_2KeyTyped(evt);
            }
        });

        r5_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_3KeyTyped(evt);
            }
        });

        r6_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_1KeyTyped(evt);
            }
        });

        r6_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_2.setText("4");
        r6_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 120));

        r3_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_6KeyTyped(evt);
            }
        });

        r2_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_4KeyTyped(evt);
            }
        });

        r1_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_5KeyTyped(evt);
            }
        });

        r3_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_4KeyTyped(evt);
            }
        });

        r2_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_6KeyTyped(evt);
            }
        });

        r2_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_5KeyTyped(evt);
            }
        });

        r1_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_4.setText("4");
        r1_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_4KeyTyped(evt);
            }
        });

        r3_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_5KeyTyped(evt);
            }
        });

        r1_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_6.setText("6");
        r1_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(r3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(120, 120));

        r7_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_5KeyTyped(evt);
            }
        });

        r8_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_5KeyTyped(evt);
            }
        });

        r8_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_4KeyTyped(evt);
            }
        });

        r7_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_4KeyTyped(evt);
            }
        });

        r7_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r7_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r7_6KeyTyped(evt);
            }
        });

        r9_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_4.setText("9");
        r9_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_4KeyTyped(evt);
            }
        });

        r9_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_5KeyTyped(evt);
            }
        });

        r9_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r9_6.setText("2");
        r9_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r9_6KeyTyped(evt);
            }
        });

        r8_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r8_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r8_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(r7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(r9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 120));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(120, 120));

        r3_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_1KeyTyped(evt);
            }
        });

        r1_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_2KeyTyped(evt);
            }
        });

        r2_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_1KeyTyped(evt);
            }
        });

        r1_1.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_1.setText("8");
        r1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_1KeyTyped(evt);
            }
        });

        r2_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_2KeyTyped(evt);
            }
        });

        r3_2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_2.setText("1");
        r3_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_2KeyTyped(evt);
            }
        });

        r3_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_3KeyTyped(evt);
            }
        });

        r2_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_3KeyTyped(evt);
            }
        });

        r1_3.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(120, 120));

        r4_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_5.setText("3");
        r4_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_5KeyTyped(evt);
            }
        });

        r5_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_5.setText("7");
        r5_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_5KeyTyped(evt);
            }
        });

        r5_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_4KeyTyped(evt);
            }
        });

        r4_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_6KeyTyped(evt);
            }
        });

        r5_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r5_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r5_6KeyTyped(evt);
            }
        });

        r6_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_4KeyTyped(evt);
            }
        });

        r6_6.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_6KeyTyped(evt);
            }
        });

        r4_4.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r4_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r4_4KeyTyped(evt);
            }
        });

        r6_5.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r6_5.setText("2");
        r6_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r6_5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setPreferredSize(new java.awt.Dimension(120, 120));

        r2_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_8KeyTyped(evt);
            }
        });

        r1_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_8KeyTyped(evt);
            }
        });

        r1_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_9.setText("7");
        r1_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_9KeyTyped(evt);
            }
        });

        r3_8.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_8.setText("5");
        r3_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_8KeyTyped(evt);
            }
        });

        r2_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_9KeyTyped(evt);
            }
        });

        r1_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r1_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r1_7KeyTyped(evt);
            }
        });

        r3_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_7.setText("6");
        r3_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_7KeyTyped(evt);
            }
        });

        r3_9.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r3_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r3_9KeyTyped(evt);
            }
        });

        r2_7.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        r2_7.setText("4");
        r2_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                r2_7KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(r3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jToggleButton1.setText("Quit");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jToggleButton2.setText("Submit");
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 16)); // NOI18N
        jLabel1.setText("Sudoku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    private void parseInput()
    {
        
        
        //row 1
        try{
        tempArray[0][0] = Integer.parseInt(r1_1.getText());
        }
        catch(Exception e)
        {
            tempArray[0][0] = 0;
        }
        try{
        tempArray[0][1] = Integer.parseInt(r1_2.getText());
        }
        catch(Exception e)
        {
            tempArray[0][1] = 0;
        }try{
        tempArray[0][2] = Integer.parseInt(r1_3.getText());
        }
        catch(Exception e)
        {
            tempArray[0][2] = 0;
        }try{
        tempArray[0][3] = Integer.parseInt(r1_4.getText());
        }
        catch(Exception e)
        {
            tempArray[0][3] = 0;
        }try{
        tempArray[0][4] = Integer.parseInt(r1_5.getText());
        }
        catch(Exception e)
        {
            tempArray[0][4] = 0;
        }try{
        tempArray[0][5] = Integer.parseInt(r1_6.getText());
        }
        catch(Exception e)
        {
            tempArray[0][5] = 0;
        }try{
        tempArray[0][6] = Integer.parseInt(r1_7.getText());
        }
        catch(Exception e)
        {
            tempArray[0][6] = 0;
        }try{
        tempArray[0][7] = Integer.parseInt(r1_8.getText());
        }
        catch(Exception e)
        {
            tempArray[0][7] = 0;
        }try{
        tempArray[0][8] = Integer.parseInt(r1_9.getText());
        }
        catch(Exception e)
        {
            tempArray[0][8] = 0;
        }
        
        //row 2
        try{
        tempArray[1][0] = Integer.parseInt(r2_1.getText());
        }
        catch(Exception e)
        {
            tempArray[1][0] = 0;
        }
        try{
        tempArray[1][1] = Integer.parseInt(r2_2.getText());
        }
        catch(Exception e)
        {
            tempArray[1][1] = 0;
        }try{
        tempArray[1][2] = Integer.parseInt(r2_3.getText());
        }
        catch(Exception e)
        {
            tempArray[1][2] = 0;
        }try{
        tempArray[1][3] = Integer.parseInt(r2_4.getText());
        }
        catch(Exception e)
        {
            tempArray[1][3] = 0;
        }try{
        tempArray[1][4] = Integer.parseInt(r2_5.getText());
        }
        catch(Exception e)
        {
            tempArray[1][4] = 0;
        }try{
        tempArray[1][5] = Integer.parseInt(r2_6.getText());
        }
        catch(Exception e)
        {
            tempArray[1][5] = 0;
        }try{
        tempArray[1][6] = Integer.parseInt(r2_7.getText());
        }
        catch(Exception e)
        {
            tempArray[1][6] = 0;
        }try{
        tempArray[1][7] = Integer.parseInt(r2_8.getText());
        }
        catch(Exception e)
        {
            tempArray[1][7] = 0;
        }try{
        tempArray[1][8] = Integer.parseInt(r2_9.getText());
        }
        catch(Exception e)
        {
            tempArray[1][8] = 0;
        }
        
        //row 3
        try{
        tempArray[2][0] = Integer.parseInt(r3_1.getText());
        }
        catch(Exception e)
        {
            tempArray[2][0] = 0;
        }
        try{
        tempArray[2][1] = Integer.parseInt(r3_2.getText());
        }
        catch(Exception e)
        {
            tempArray[2][1] = 0;
        }try{
        tempArray[2][2] = Integer.parseInt(r3_3.getText());
        }
        catch(Exception e)
        {
            tempArray[2][2] = 0;
        }try{
        tempArray[2][3] = Integer.parseInt(r3_4.getText());
        }
        catch(Exception e)
        {
            tempArray[2][3] = 0;
        }try{
        tempArray[2][4] = Integer.parseInt(r3_5.getText());
        }
        catch(Exception e)
        {
            tempArray[2][4] = 0;
        }try{
        tempArray[2][5] = Integer.parseInt(r3_6.getText());
        }
        catch(Exception e)
        {
            tempArray[2][5] = 0;
        }try{
        tempArray[2][6] = Integer.parseInt(r3_7.getText());
        }
        catch(Exception e)
        {
            tempArray[2][6] = 0;
        }try{
        tempArray[2][7] = Integer.parseInt(r3_8.getText());
        }
        catch(Exception e)
        {
            tempArray[2][7] = 0;
        }try{
        tempArray[2][8] = Integer.parseInt(r3_9.getText());
        }
        catch(Exception e)
        {
            tempArray[2][8] = 0;
        }
        
        //row 4
        try{
        tempArray[3][0] = Integer.parseInt(r4_1.getText());
        }
        catch(Exception e)
        {
            tempArray[3][0] = 0;
        }
        try{
        tempArray[3][1] = Integer.parseInt(r4_2.getText());
        }
        catch(Exception e)
        {
            tempArray[3][1] = 0;
        }try{
        tempArray[3][2] = Integer.parseInt(r4_3.getText());
        }
        catch(Exception e)
        {
            tempArray[3][2] = 0;
        }try{
        tempArray[3][3] = Integer.parseInt(r4_4.getText());
        }
        catch(Exception e)
        {
            tempArray[3][3] = 0;
        }try{
        tempArray[3][4] = Integer.parseInt(r4_5.getText());
        }
        catch(Exception e)
        {
            tempArray[3][4] = 0;
        }try{
        tempArray[3][5] = Integer.parseInt(r4_6.getText());
        }
        catch(Exception e)
        {
            tempArray[3][5] = 0;
        }try{
        tempArray[3][6] = Integer.parseInt(r4_7.getText());
        }
        catch(Exception e)
        {
            tempArray[3][6] = 0;
        }try{
        tempArray[3][7] = Integer.parseInt(r4_8.getText());
        }
        catch(Exception e)
        {
            tempArray[3][7] = 0;
        }try{
        tempArray[3][8] = Integer.parseInt(r4_9.getText());
        }
        catch(Exception e)
        {
            tempArray[3][8] = 0;
        }
        
        //row 5
        try{
        tempArray[4][0] = Integer.parseInt(r5_1.getText());
        }
        catch(Exception e)
        {
            tempArray[4][0] = 0;
        }
        try{
        tempArray[4][1] = Integer.parseInt(r5_2.getText());
        }
        catch(Exception e)
        {
            tempArray[4][1] = 0;
        }try{
        tempArray[4][2] = Integer.parseInt(r5_3.getText());
        }
        catch(Exception e)
        {
            tempArray[4][2] = 0;
        }try{
        tempArray[4][3] = Integer.parseInt(r5_4.getText());
        }
        catch(Exception e)
        {
            tempArray[4][3] = 0;
        }try{
        tempArray[4][4] = Integer.parseInt(r5_5.getText());
        }
        catch(Exception e)
        {
            tempArray[4][4] = 0;
        }try{
        tempArray[4][5] = Integer.parseInt(r5_6.getText());
        }
        catch(Exception e)
        {
            tempArray[4][5] = 0;
        }try{
        tempArray[4][6] = Integer.parseInt(r5_7.getText());
        }
        catch(Exception e)
        {
            tempArray[4][6] = 0;
        }try{
        tempArray[4][7] = Integer.parseInt(r5_8.getText());
        }
        catch(Exception e)
        {
            tempArray[4][7] = 0;
        }try{
        tempArray[4][8] = Integer.parseInt(r5_9.getText());
        }
        catch(Exception e)
        {
            tempArray[4][8] = 0;
        }
        
        //row 6
        try{
        tempArray[5][0] = Integer.parseInt(r6_1.getText());
        }
        catch(Exception e)
        {
            tempArray[5][0] = 0;
        }
        try{
        tempArray[5][1] = Integer.parseInt(r6_2.getText());
        }
        catch(Exception e)
        {
            tempArray[5][1] = 0;
        }try{
        tempArray[5][2] = Integer.parseInt(r6_3.getText());
        }
        catch(Exception e)
        {
            tempArray[5][2] = 0;
        }try{
        tempArray[5][3] = Integer.parseInt(r6_4.getText());
        }
        catch(Exception e)
        {
            tempArray[5][3] = 0;
        }try{
        tempArray[5][4] = Integer.parseInt(r6_5.getText());
        }
        catch(Exception e)
        {
            tempArray[5][4] = 0;
        }try{
        tempArray[5][5] = Integer.parseInt(r6_6.getText());
        }
        catch(Exception e)
        {
            tempArray[5][5] = 0;
        }try{
        tempArray[5][6] = Integer.parseInt(r6_7.getText());
        }
        catch(Exception e)
        {
            tempArray[5][6] = 0;
        }try{
        tempArray[5][7] = Integer.parseInt(r6_8.getText());
        }
        catch(Exception e)
        {
            tempArray[5][7] = 0;
        }try{
        tempArray[5][8] = Integer.parseInt(r6_9.getText());
        }
        catch(Exception e)
        {
            tempArray[5][8] = 0;
        }
        
        //row 7
        try{
        tempArray[6][0] = Integer.parseInt(r7_1.getText());
        }
        catch(Exception e)
        {
            tempArray[6][0] = 0;
        }
        try{
        tempArray[6][1] = Integer.parseInt(r7_2.getText());
        }
        catch(Exception e)
        {
            tempArray[6][1] = 0;
        }try{
        tempArray[6][2] = Integer.parseInt(r7_3.getText());
        }
        catch(Exception e)
        {
            tempArray[6][2] = 0;
        }try{
        tempArray[6][3] = Integer.parseInt(r7_4.getText());
        }
        catch(Exception e)
        {
            tempArray[6][3] = 0;
        }try{
        tempArray[6][4] = Integer.parseInt(r7_5.getText());
        }
        catch(Exception e)
        {
            tempArray[6][4] = 0;
        }try{
        tempArray[6][5] = Integer.parseInt(r7_6.getText());
        }
        catch(Exception e)
        {
            tempArray[6][5] = 0;
        }try{
        tempArray[6][6] = Integer.parseInt(r7_7.getText());
        }
        catch(Exception e)
        {
            tempArray[6][6] = 0;
        }try{
        tempArray[6][7] = Integer.parseInt(r7_8.getText());
        }
        catch(Exception e)
        {
            tempArray[6][7] = 0;
        }try{
        tempArray[6][8] = Integer.parseInt(r7_9.getText());
        }
        catch(Exception e)
        {
            tempArray[6][8] = 0;
        }
        
        //row 8
        try{
        tempArray[7][0] = Integer.parseInt(r8_1.getText());
        }
        catch(Exception e)
        {
            tempArray[7][0] = 0;
        }
        try{
        tempArray[7][1] = Integer.parseInt(r8_2.getText());
        }
        catch(Exception e)
        {
            tempArray[7][1] = 0;
        }try{
        tempArray[7][2] = Integer.parseInt(r8_3.getText());
        }
        catch(Exception e)
        {
            tempArray[7][2] = 0;
        }try{
        tempArray[7][3] = Integer.parseInt(r8_4.getText());
        }
        catch(Exception e)
        {
            tempArray[7][3] = 0;
        }try{
        tempArray[7][4] = Integer.parseInt(r8_5.getText());
        }
        catch(Exception e)
        {
            tempArray[7][4] = 0;
        }try{
        tempArray[7][5] = Integer.parseInt(r8_6.getText());
        }
        catch(Exception e)
        {
            tempArray[7][5] = 0;
        }try{
        tempArray[7][6] = Integer.parseInt(r8_7.getText());
        }
        catch(Exception e)
        {
            tempArray[7][6] = 0;
        }try{
        tempArray[7][7] = Integer.parseInt(r8_8.getText());
        }
        catch(Exception e)
        {
            tempArray[7][7] = 0;
        }try{
        tempArray[7][8] = Integer.parseInt(r8_9.getText());
        }
        catch(Exception e)
        {
            tempArray[7][8] = 0;
        }
        
        //row 9
        try{
        tempArray[8][0] = Integer.parseInt(r9_1.getText());
        }
        catch(Exception e)
        {
            tempArray[8][0] = 0;
        }
        try{
        tempArray[8][1] = Integer.parseInt(r9_2.getText());
        }
        catch(Exception e)
        {
            tempArray[8][1] = 0;
        }try{
        tempArray[8][2] = Integer.parseInt(r9_3.getText());
        }
        catch(Exception e)
        {
            tempArray[8][2] = 0;
        }try{
        tempArray[8][3] = Integer.parseInt(r9_4.getText());
        }
        catch(Exception e)
        {
            tempArray[8][3] = 0;
        }try{
        tempArray[8][4] = Integer.parseInt(r9_5.getText());
        }
        catch(Exception e)
        {
            tempArray[8][4] = 0;
        }try{
        tempArray[8][5] = Integer.parseInt(r9_6.getText());
        }
        catch(Exception e)
        {
            tempArray[8][5] = 0;
        }try{
        tempArray[8][6] = Integer.parseInt(r9_7.getText());
        }
        catch(Exception e)
        {
            tempArray[8][6] = 0;
        }try{
        tempArray[8][7] = Integer.parseInt(r9_8.getText());
        }
        catch(Exception e)
        {
            tempArray[8][7] = 0;
        }try{
        tempArray[8][8] = Integer.parseInt(r9_9.getText());
        }
        catch(Exception e)
        {
            tempArray[8][8] = 0;
        }
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    { 
        parseInput();
        
        for (int a = 0; a < 9; a++)
        {
            for (int b = 0; b < 9; b++)
            {
              se.checkAnswer(tempArray[a][b],a,b);
       
            }
        }
        
        dispose();
        if (hiScoreRecords.isHighScore(se.getScore() + score) == true) { // If score is greater than a score in score.txt
                new ScoreInput(se.getScore()+score).setVisible(true);
            } 
            else {
                new WinnerFrame(se.getScore()+score).setVisible(true); // If not then just move to the game overscreen
            }
    }
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) 
    {           
        parseInput();
        boolean correct = true;
        for (int a = 0; a < 9; a++)
        {
            for (int b = 0; b < 9; b++)
            {
                if (!se.checkAnswer(tempArray[a][b],a,b))
                {
                    correct = false;
                }
                
            }
        }
        if (!correct)
        {
            JOptionPane.showMessageDialog(null, "Sudoku is Incorrect, Try Again");
        }
        else
        {
            dispose();
            new WinnerFrame(se.getScore()+ score).setVisible(true);
        }
    }                                    

    private void r1_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r1_2.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r1_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r1_3.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r1_5KeyTyped(java.awt.event.KeyEvent evt) {                              
         if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r1_5.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r1_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r1_7.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r1_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r1_8.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_1.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_2.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_3.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_5.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_6.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_8.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r2_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");
        }
        if (r2_9.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r3_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r3_1.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r3_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        r3_2.setText("1");              
        r3_2.setEditable(false);
    }                             

    private void r3_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r3_3.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r3_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r3_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r3_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r3_5.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r3_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r3_6.getText().length() == 1) {
            evt.consume();
        }    }                             

    private void r3_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r3_9.getText().length() == 1) {
            evt.consume();
        }    }                             

    private void r4_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r4_2.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r4_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r4_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r4_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r4_6.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r4_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r4_9.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_1.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_2.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_3.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_6.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_7.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_8.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r5_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r5_9.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r6_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r6_1.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r6_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r6_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r6_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r6_6.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r6_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r6_8.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r7_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r7_1.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r7_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r7_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r7_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r7_5.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r7_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r7_6.getText().length() == 1) {
            evt.consume();
        }    }                             

    private void r7_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r7_7.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r7_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r7_9.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_1.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_2.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_4.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_5.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_6.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_7.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_8.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r8_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r8_9.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r9_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r9_2.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r9_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r9_3.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r9_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r9_5.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r9_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r9_7.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r9_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Not a number. Please enter a number");

        }
        if (r9_8.getText().length() == 1) {
            evt.consume();
        }
    }                             

    private void r1_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        r1_1.setText("8");              
        r1_1.setEditable(false);
    }                             

    private void r1_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        r1_4.setText("4");              
        r1_4.setEditable(false);
    }                             

    private void r1_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        r1_6.setText("6");              
        r1_6.setEditable(false);
    }                             

    private void r1_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        r1_9.setText("7");              
        r1_9.setEditable(false);
    }                             

    private void r2_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        r2_7.setText("4");              
        r2_7.setEditable(false);
    }                             

    private void r3_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        r3_7.setText("6");              
        r3_7.setEditable(false);
    }                             

    private void r3_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        r3_8.setText("5");              
        r3_8.setEditable(false);
    }                             

    private void r4_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        r4_1.setText("5");              
        r4_1.setEditable(false);
    }                             

    private void r4_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        r4_3.setText("9");              
        r4_3.setEditable(false);
    }                             

    private void r4_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        r4_5.setText("3");              
        r4_5.setEditable(false);
    }                             

    private void r4_7KeyTyped(java.awt.event.KeyEvent evt) {                              
        r4_7.setText("7");              
        r4_7.setEditable(false);
    }                             

    private void r4_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        r4_8.setText("8");              
        r4_8.setEditable(false);
    }                             

    private void r5_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        r5_5.setText("7");              
        r5_5.setEditable(false);
    }                             

    private void r6_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        r6_2.setText("4");              
        r6_2.setEditable(false);
    }                             

    private void r6_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        r6_3.setText("8");              
        r6_3.setEditable(false);
    }                             

    private void r6_5KeyTyped(java.awt.event.KeyEvent evt) {                              
        r6_5.setText("2");              
        r6_5.setEditable(false);
    }                             

    private void r6_7KeyTyped(java.awt.event.KeyEvent evt) {                              

        r6_7.setText("1");              
        r6_7.setEditable(false);
    }                             

    private void r6_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        r6_9.setText("3");              
        r6_9.setEditable(false);
    }                             

    private void r7_2KeyTyped(java.awt.event.KeyEvent evt) {                              
        r7_2.setText("5");              
        r7_2.setEditable(false);
    }                             

    private void r7_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        r7_3.setText("2");              
        r7_3.setEditable(false);
    }                             

    private void r7_8KeyTyped(java.awt.event.KeyEvent evt) {                              
        r7_8.setText("9");              
        r7_8.setEditable(false);
    }                             

    private void r8_3KeyTyped(java.awt.event.KeyEvent evt) {                              
        r8_3.setText("1");              
        r8_3.setEditable(false);
    }                             

    private void r9_1KeyTyped(java.awt.event.KeyEvent evt) {                              
        r9_1.setText("3");              
        r9_1.setEditable(false);
    }                             

    private void r9_4KeyTyped(java.awt.event.KeyEvent evt) {                              
        r9_4.setText("9");              
        r9_4.setEditable(false);
    }                             

    private void r9_6KeyTyped(java.awt.event.KeyEvent evt) {                              
        r9_6.setText("2");              
        r9_6.setEditable(false);
    }                             

    private void r9_9KeyTyped(java.awt.event.KeyEvent evt) {                              
        r9_9.setText("5");              
        r9_9.setEditable(false);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField r1_1;
    private javax.swing.JTextField r1_2;
    private javax.swing.JTextField r1_3;
    private javax.swing.JTextField r1_4;
    private javax.swing.JTextField r1_5;
    private javax.swing.JTextField r1_6;
    private javax.swing.JTextField r1_7;
    private javax.swing.JTextField r1_8;
    private javax.swing.JTextField r1_9;
    private javax.swing.JTextField r2_1;
    private javax.swing.JTextField r2_2;
    private javax.swing.JTextField r2_3;
    private javax.swing.JTextField r2_4;
    private javax.swing.JTextField r2_5;
    private javax.swing.JTextField r2_6;
    private javax.swing.JTextField r2_7;
    private javax.swing.JTextField r2_8;
    private javax.swing.JTextField r2_9;
    private javax.swing.JTextField r3_1;
    private javax.swing.JTextField r3_2;
    private javax.swing.JTextField r3_3;
    private javax.swing.JTextField r3_4;
    private javax.swing.JTextField r3_5;
    private javax.swing.JTextField r3_6;
    private javax.swing.JTextField r3_7;
    private javax.swing.JTextField r3_8;
    private javax.swing.JTextField r3_9;
    private javax.swing.JTextField r4_1;
    private javax.swing.JTextField r4_2;
    private javax.swing.JTextField r4_3;
    private javax.swing.JTextField r4_4;
    private javax.swing.JTextField r4_5;
    private javax.swing.JTextField r4_6;
    private javax.swing.JTextField r4_7;
    private javax.swing.JTextField r4_8;
    private javax.swing.JTextField r4_9;
    private javax.swing.JTextField r5_1;
    private javax.swing.JTextField r5_2;
    private javax.swing.JTextField r5_3;
    private javax.swing.JTextField r5_4;
    private javax.swing.JTextField r5_5;
    private javax.swing.JTextField r5_6;
    private javax.swing.JTextField r5_7;
    private javax.swing.JTextField r5_8;
    private javax.swing.JTextField r5_9;
    private javax.swing.JTextField r6_1;
    private javax.swing.JTextField r6_2;
    private javax.swing.JTextField r6_3;
    private javax.swing.JTextField r6_4;
    private javax.swing.JTextField r6_5;
    private javax.swing.JTextField r6_6;
    private javax.swing.JTextField r6_7;
    private javax.swing.JTextField r6_8;
    private javax.swing.JTextField r6_9;
    private javax.swing.JTextField r7_1;
    private javax.swing.JTextField r7_2;
    private javax.swing.JTextField r7_3;
    private javax.swing.JTextField r7_4;
    private javax.swing.JTextField r7_5;
    private javax.swing.JTextField r7_6;
    private javax.swing.JTextField r7_7;
    private javax.swing.JTextField r7_8;
    private javax.swing.JTextField r7_9;
    private javax.swing.JTextField r8_1;
    private javax.swing.JTextField r8_2;
    private javax.swing.JTextField r8_3;
    private javax.swing.JTextField r8_4;
    private javax.swing.JTextField r8_5;
    private javax.swing.JTextField r8_6;
    private javax.swing.JTextField r8_7;
    private javax.swing.JTextField r8_8;
    private javax.swing.JTextField r8_9;
    private javax.swing.JTextField r9_1;
    private javax.swing.JTextField r9_2;
    private javax.swing.JTextField r9_3;
    private javax.swing.JTextField r9_4;
    private javax.swing.JTextField r9_5;
    private javax.swing.JTextField r9_6;
    private javax.swing.JTextField r9_7;
    private javax.swing.JTextField r9_8;
    private javax.swing.JTextField r9_9;
    // End of variables declaration                   
}
