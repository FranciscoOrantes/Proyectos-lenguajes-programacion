/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraoosistd;

/**
 *
 * @author Francisco
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroIngresado = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        convBinario = new javax.swing.JButton();
        convHexa = new javax.swing.JButton();
        convOctal = new javax.swing.JButton();
        convBinarioOctal = new javax.swing.JButton();
        convHexaBinario = new javax.swing.JButton();
        convOctalBinario = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa un numero");

        jLabel2.setText("Resultado");

        resultado.setEditable(false);
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        convBinario.setText("Binario");
        convBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convBinarioActionPerformed(evt);
            }
        });

        convHexa.setText("Hexadecimal");
        convHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convHexaActionPerformed(evt);
            }
        });

        convOctal.setText("Octal");
        convOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convOctalActionPerformed(evt);
            }
        });

        convBinarioOctal.setText("Binario a Octal");
        convBinarioOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convBinarioOctalActionPerformed(evt);
            }
        });

        convHexaBinario.setText("Hexa a Binario");
        convHexaBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convHexaBinarioActionPerformed(evt);
            }
        });

        convOctalBinario.setText("Octal a Binario");
        convOctalBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convOctalBinarioActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar Pantalla");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(numeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(75, 75, 75)
                                .addComponent(resultado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(convBinarioOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(convBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(convHexaBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(convHexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(convOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(convOctalBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(limpiar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convBinario)
                    .addComponent(convHexa)
                    .addComponent(convOctal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convBinarioOctal)
                    .addComponent(convHexaBinario)
                    .addComponent(convOctalBinario))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void convBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convBinarioActionPerformed
        Binario binario = new Binario();
       binario.numero = Integer.parseInt(numeroIngresado.getText());
        System.out.println("Su numero ingresado fue: " + binario.numero);
       binario.convertirBinario(binario.numero);
        resultado.setText(binario.binarioCompleto);
    }//GEN-LAST:event_convBinarioActionPerformed

    private void convHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convHexaActionPerformed
      Hexadecimal hexadecimal = new Hexadecimal();
       hexadecimal.numero = Integer.parseInt(numeroIngresado.getText());
        System.out.println("Su numero ingresado fue: " + hexadecimal.numero);
        hexadecimal.convertirHexa(hexadecimal.numero);
        resultado.setText(hexadecimal.hexadecimalCompleto);
    }//GEN-LAST:event_convHexaActionPerformed

    private void convOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convOctalActionPerformed
        // TODO add your handling code here:
        Octal octal = new Octal();
        octal.numero = Integer.parseInt(numeroIngresado.getText());
        System.out.println("Su numero ingresado fue: " + octal.numero);
        octal.convertirOctogonal(octal.numero);
        resultado.setText(octal.octogonalCompleto);
    }//GEN-LAST:event_convOctalActionPerformed

    private void convBinarioOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convBinarioOctalActionPerformed
        // TODO add your handling code here:
        Binario binario = new Binario();
        binario.binarioCompleto= numeroIngresado.getText();
        System.out.println(binario.binarioCompleto);
      binario.binarioToOctal(binario.binarioCompleto);
      resultado.setText(binario.octogonalCompleto);
    }//GEN-LAST:event_convBinarioOctalActionPerformed

    private void convHexaBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convHexaBinarioActionPerformed
        Hexadecimal hexadecimal = new Hexadecimal();
        hexadecimal.digitosBinario = numeroIngresado.getText();
        hexadecimal.convertirHexaBin(hexadecimal.digitosBinario);
     // hexadecimal.hexaBinario(hexadecimal.digitosBinario);
     resultado.setText(hexadecimal.numeroFinal);
       // hexadecimal.convertirBinario(Integer.parseInt(resultado.getText()));
    }//GEN-LAST:event_convHexaBinarioActionPerformed

    private void convOctalBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convOctalBinarioActionPerformed
        Octal octal = new Octal();
        octal.digitosBinario=numeroIngresado.getText();
        octal.octalBinario(octal.digitosBinario);
        resultado.setText(octal.binarioCompleto);
        
    }//GEN-LAST:event_convOctalBinarioActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        
       Octal octal = new Octal();
        Binario binario = new Binario();
        binario.numeroBinario.removeAll(binario.numeroBinario);
        binario.numeroOctogonal.removeAll(binario.numeroOctogonal);
        binario.binarioCompleto = "";
        octal.octogonalCompleto = "";
        Hexadecimal hexa = new Hexadecimal();
        hexa.hexadecimalCompleto = "";
        
        resultado.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convBinario;
    private javax.swing.JButton convBinarioOctal;
    private javax.swing.JButton convHexa;
    private javax.swing.JButton convHexaBinario;
    private javax.swing.JButton convOctal;
    private javax.swing.JButton convOctalBinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField numeroIngresado;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
