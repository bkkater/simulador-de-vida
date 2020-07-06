package simulador.de.vida;

import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class ImageForm extends javax.swing.JFrame {

    private boolean masc;
    private static boolean imagemTrue;
    
    public static String imagemSelected;
    
    public static boolean isImagemTrue() {
        return imagemTrue;
    }

    public static void setImagemTrue(boolean imagemTrue) {
        ImageForm.imagemTrue = imagemTrue;
    }
    
    public ImageForm() {
        initComponents();
        
        this.setTitle("Seleção de Personagem");
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        Label1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        Label2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        Label3 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        Label4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        Label1.setText("jLabel1");
        Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label1MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);

        Label2.setText("jLabel2");
        Label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label2MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);

        Label3.setText("jLabel3");
        Label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label3MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        Label4.setText("jLabel4");
        Label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label2)
                    .addComponent(Label4))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Label2)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(jRadioButton1))))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton3))
                            .addComponent(Label4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void Label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label1MouseClicked
         jRadioButton1.setSelected(true);
    }//GEN-LAST:event_Label1MouseClicked

    private void Label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseClicked
         jRadioButton2.setSelected(true);
    }//GEN-LAST:event_Label2MouseClicked

    private void Label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label3MouseClicked
         jRadioButton3.setSelected(true);
    }//GEN-LAST:event_Label3MouseClicked

    private void Label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label4MouseClicked
         jRadioButton4.setSelected(true);
    }//GEN-LAST:event_Label4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if(jRadioButton1.isSelected()){
          imagemSelected = "Imagem1";
          this.dispose();
          setImagemTrue(true);
          Simulador.ImagemTrue(this, imagemTrue);
      }
      else if(jRadioButton2.isSelected()){
          imagemSelected = "Imagem2";
          setImagemTrue(true);
          this.dispose();
          Simulador.ImagemTrue(this, imagemTrue);
      }
      else if(jRadioButton3.isSelected()){
          imagemSelected = "Imagem3";
          setImagemTrue(true);
          this.dispose();
          Simulador.ImagemTrue(this, imagemTrue);
      }
      else if(jRadioButton4.isSelected()){
          imagemSelected = "Imagem4";
          setImagemTrue(true);
          this.dispose();
          Simulador.ImagemTrue(this, imagemTrue);
      }
      else{
          JOptionPane.showMessageDialog(null, "Selecione um personagem antes de continuar", "Mensagem", JOptionPane.ERROR_MESSAGE);
      }
      
      MascFrame.enviaImagem(this, imagemSelected);
      FemFrame.enviaImagem(this, imagemSelected);
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
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
   void enviaSexo(Simulador aThis, String sexo) {
         if("Masculino".equals(sexo)){
             setMasc(true);
             Label1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Homem1.png"));
             Label1.setText("");
             
             Label2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Homem2.png"));
             Label2.setText("");
             
             Label3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Homem3.png"));
             Label3.setText("");
             
             Label4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Homem4.png"));
             Label4.setText("");
         }
         else if("Feminino".equals(sexo)){
             setMasc(false);
             Label1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher1.png"));
             Label1.setText("");
             
             Label2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher2.png"));
             Label2.setText("");
             
             Label3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher3.png"));
             Label3.setText("");
             
             Label4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\simulador-de-vida\\simulador-de-vida\\simulador-de-vida\\src\\Icons\\Mulher4.png"));
             Label4.setText("");
         }
    }

    public boolean isMasc() {
        return masc;
    }

    public void setMasc(boolean masc) {
        this.masc = masc;
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("playstation.png")));
    }
}
