/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class MainFrame extends javax.swing.JFrame {
    private enum OperatorType
    {
        NONE,ADD,SUBSTRACT,MULTIPLY,DIVIDE
    };
    private double accumulator, operand;
    private OperatorType operator=null;
    private char decimalSeparator;
    private boolean erase=true, firstOp=true, equal=false;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonMul = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonRes = new javax.swing.JButton();
        jButtonBac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 192, 203));
        setResizable(false);

        jTextField.setEditable(false);
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 192, 203));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 192, 203));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 192, 203));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(255, 192, 203));
        jButtonAdd.setText("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 192, 203));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 192, 203));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 192, 203));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonSub.setBackground(new java.awt.Color(255, 192, 203));
        jButtonSub.setText("-");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });

        jButtonDiv.setBackground(new java.awt.Color(255, 192, 203));
        jButtonDiv.setText("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 192, 203));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 192, 203));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 192, 203));
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonMul.setBackground(new java.awt.Color(255, 192, 203));
        jButtonMul.setText("*");
        jButtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMulActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(255, 192, 203));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonDot.setBackground(new java.awt.Color(255, 192, 203));
        jButtonDot.setText(".");
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        jButtonDel.setBackground(new java.awt.Color(255, 192, 203));
        jButtonDel.setText("C");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonRes.setBackground(new java.awt.Color(255, 192, 203));
        jButtonRes.setText("=");
        jButtonRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResActionPerformed(evt);
            }
        });

        jButtonBac.setBackground(new java.awt.Color(255, 192, 203));
        jButtonBac.setText("<--------");
        jButtonBac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRes, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBac, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMul, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jButtonDiv, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jButtonSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButtonAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButtonSub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButtonMul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(jButtonDot)
                    .addComponent(jButtonDel)
                    .addComponent(jButtonDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRes)
                    .addComponent(jButtonBac))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        
    }//GEN-LAST:event_jTextFieldActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"1");
        }
        else
        {
            jTextField.setText("1");
            erase=false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"2");
        }
        else
        {
            jTextField.setText("2");
            erase=false;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"3");
        }
        else
        {
            jTextField.setText("3");
            erase=false;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"4");
        }
        else
        {
            jTextField.setText("4");
            erase=false;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"5");
        }
        else
        {
            jTextField.setText("5");
            erase=false;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"6");
        }
        else
        {
            jTextField.setText("6");
            erase=false;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"7");
        }
        else
        {
            jTextField.setText("7");
            erase=false;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"8");
        }
        else
        {
            jTextField.setText("8");
            erase=false;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            jTextField.setText(field+"9");
        }
        else
        {
            jTextField.setText("9");
            erase=false;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if(!erase)
        {
            String field = jTextField.getText();
            if(field.length()!=0)
            {
                jTextField.setText(field+"0");
            }
        }
        else
        {
            jTextField.setText("0");
            erase=false;
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotActionPerformed
        boolean isDot=false;
        if(!erase)
        {
            String field = jTextField.getText();
            for(int i=0; i< field.length();i++)
            {
                if(field.charAt(i)=='.')
                {
                    isDot=true;
                }
            }
            if(field.length()==0)
            {
                jTextField.setText(field+"0.");
            }
            else if(!isDot)
            {
                jTextField.setText(field+".");
            }
        }
        else
        {
            jTextField.setText("0.");
            erase=false;
        }
    }//GEN-LAST:event_jButtonDotActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        jTextField.setText("");
        operand=0;
        operator=null;
        accumulator=0;
        firstOp=true;
        erase=true;
        equal=false;
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonBacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBacActionPerformed
        String field = jTextField.getText();
        if(field.length()!=0)
        {
            jTextField.setText(field.substring(0, field.length()-1));
        }
    }//GEN-LAST:event_jButtonBacActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(!erase || equal)
        {
            if(jTextField.getText().equals(""))
            {}
            else
            {
                if(firstOp)
                {
                    operand=Double.parseDouble(jTextField.getText());
                    operator=OperatorType.ADD;
                    accumulator=operand;
                    firstOp=false;
                }
                else
                {
                    operand=Double.parseDouble(jTextField.getText());
                    jTextField.setText(""+operation());
                    checkDot();
                    operator=OperatorType.ADD;
                }
                erase=true;
                equal=false;
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        if(!erase || equal)
        {
            if(jTextField.getText().equals(""))
            {}
            else
            {
                if(firstOp)
                {
                    operator=OperatorType.SUBSTRACT;
                    operand=Double.parseDouble(jTextField.getText());
                    accumulator=operand;
                    firstOp=false;
                }
                else
                {
                    operand=Double.parseDouble(jTextField.getText());
                    jTextField.setText(""+operation());
                    checkDot();
                    operator=OperatorType.SUBSTRACT;
                }
                erase=true;
                equal=false;
            }
        }
    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMulActionPerformed
        if(!erase || equal)
        {
            if(jTextField.getText().equals(""))
            {}
            else
            {
                if(firstOp)
                {
                    operator=OperatorType.MULTIPLY;
                    operand=Double.parseDouble(jTextField.getText());
                    accumulator=operand;
                    firstOp=false;
                }
                else
                {
                    operand=Double.parseDouble(jTextField.getText());
                    jTextField.setText(""+operation());
                    checkDot();
                    operator=OperatorType.MULTIPLY;
                }          
                erase=true;
                equal=false;
            }
        }
    }//GEN-LAST:event_jButtonMulActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        if(!erase || equal)
        {
            if(jTextField.getText().equals(""))
            {}
            else
            {
                if(firstOp)
                {
                    operator=OperatorType.DIVIDE;
                    operand=Double.parseDouble(jTextField.getText());
                    accumulator=operand;
                    firstOp=false;
                }
                else
                {
                    operand=Double.parseDouble(jTextField.getText());
                    jTextField.setText(""+operation());
                    checkDot();
                    operator=OperatorType.DIVIDE;
                }
                erase=true;
                equal=false;
            }
        }
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResActionPerformed
        if (equal)
            {
                jTextField.setText(""+operation());
                checkDot();
            }
        else if(!erase)
        {
            if(jTextField.getText().equals("") || operator == null)
            {}
            else
            {
            operand=Double.parseDouble(jTextField.getText());
            jTextField.setText(""+operation());
            checkDot();
            erase=true;
            equal=true;
            firstOp=true;
            }
        }
    }//GEN-LAST:event_jButtonResActionPerformed
    public void checkDot()
    {
        String field = jTextField.getText();
                    if(field.charAt(field.length() - 1)=='0' && field.charAt(field.length()-2)=='.')
                    {
                        char[] newField = field.toCharArray();
                        newField[newField.length-1]='\u0000';
                        newField[newField.length-2]='\u0000';
                        field=String.valueOf(newField);
                        jTextField.setText(field);
                    }
    }
    public double operation()
    {
        switch(operator)
        {
            case ADD:
                    accumulator=accumulator+operand;
                    return accumulator;
            case SUBSTRACT:
                    accumulator=accumulator-operand;
                    return accumulator;
            case MULTIPLY:
                    accumulator=accumulator*operand;
                    return accumulator;
            case DIVIDE:
                    accumulator=accumulator/operand;
                    return accumulator;
            default:
                return 0;
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBac;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonMul;
    private javax.swing.JButton jButtonRes;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
    
}
