
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class TebakArtis extends javax.swing.JFrame {
    
    WordModel modelWord;
    List<WordModel> bankSoal;
    int nyawa = 5;
    int index;

    /**
     * Creates new form TebakArtis
     */
    public TebakArtis() {
        try {
            bankSoal = WordQuestionGenerator.createQuestionInCollection();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TebakArtis.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        clueTextField.setEnabled(false);
        yakinButton.setEnabled(false);
        cheatButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mulaiButton = new javax.swing.JButton();
        clueTextField = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        yakinButton = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        cheatButton = new javax.swing.JButton();
        cheat = new javax.swing.JLabel();
        cekLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nyawaTextField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mulaiButton.setText("Mulai");
        mulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiButtonActionPerformed(evt);
            }
        });

        clueTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clueTextField.setText(" Klik Tombol Mulai ");

        yakinButton.setBackground(new java.awt.Color(0, 153, 204));
        yakinButton.setText("Yakin ???");
        yakinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakinButtonActionPerformed(evt);
            }
        });

        cheatButton.setBackground(new java.awt.Color(255, 51, 51));
        cheatButton.setText("Hint");
        cheatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheatButtonActionPerformed(evt);
            }
        });

        cheat.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        cheat.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cheat.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TEBAK NAMA ORANG");

        nyawaTextField.setBackground(new java.awt.Color(255, 0, 51));
        nyawaTextField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nyawaTextField.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nyawaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nyawaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cheat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yakinButton)
                                .addGap(29, 29, 29)
                                .addComponent(cekLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cheatButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mulaiButton)
                                    .addComponent(clueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 29, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(mulaiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yakinButton)
                            .addComponent(cekLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cheatButton)))
                .addGap(29, 29, 29)
                .addComponent(cheat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//        String namaSoal;

    private void mulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiButtonActionPerformed
        int soalIndex = (int) Math.floor(Math.random() * bankSoal.size());
        System.out.println("Index: " + soalIndex);
        modelWord = bankSoal.get(soalIndex); //bankSoal[soalIndex];
        System.out.println(modelWord.getBasicWord());
        
        clueTextField.setText(modelWord.acakHuruf());
        cheat.setText("");
        
        nyawaTextField.setText("5");
////        String lol =generateNama();
////        clueTextField.setText("Clue :   "+ lol);
        clueTextField.setEnabled(true);
        yakinButton.setEnabled(true);
        mulaiButton.setEnabled(false);
        inputTextField.setEnabled(true);
        cheatButton.setEnabled(true);
////        label2.setText("");
    }//GEN-LAST:event_mulaiButtonActionPerformed

    private void yakinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakinButtonActionPerformed
        String jawaban = inputTextField.getText().trim();
        modelWord.setJawaban(jawaban);
        if (modelWord.cekJawaban()) {
            cekLabel.setText("Jenius!");
            yakinButton.setEnabled(false);
            inputTextField.setEnabled(false);
            mulaiButton.setEnabled(true);
            cheatButton.setEnabled(false);
            cheat.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "WELL PLAYED !! ");
        } else {
            cekLabel.setText("Coba lagi");
            nyawa--;
            nyawaTextField.setText(Integer.toString(nyawa));
            if (nyawa == 1) {
                cheatButton.setEnabled(false);
                
            } else if (nyawa == 0) {
                nyawa = 5;
                clueTextField.setEnabled(false);
                yakinButton.setEnabled(false);
                cheatButton.setEnabled(false);
                mulaiButton.setEnabled(true);
                JOptionPane.showMessageDialog(rootPane, "GAME OVER");
                clueTextField.setText("KLIK TOMBOL MULAI");
                cheat.setText("");
                cekLabel.setText("");
            }
            
        }

//        String namaInput = inputTextField.getText();
//        
//        if (namaInput.equalsIgnoreCase(namaSoal)){
//        label2.setText("BENARRRRRRR !!!");
//        yakinButton.setEnabled(false);
//        inputTextField.setEnabled(false);
//        mulaiButton.setEnabled(true);
//        cheatButton.setEnabled(false);
//        cheat.setEnabled(false);
//        cheat.setText("");
//        clueTextField.setText("Clue :   ");
//        inputTextField.setText("");
//        }
//        
//        else if (namaInput!=namaSoal){
//        label2.setText("Coba nama lain");
//        }
    }//GEN-LAST:event_yakinButtonActionPerformed

    private void cheatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheatButtonActionPerformed
        cheat.setText(modelWord.getHint());
        nyawa--;
        if (nyawa == 0) {
            nyawa = 5;
            
        }
        
        nyawaTextField.setText(Integer.toString(nyawa));
        cheatButton.setEnabled(false);

//        cheat.setText(namaSoal);
//        cheat.setEnabled(true);
    }//GEN-LAST:event_cheatButtonActionPerformed

//    public String generateNama(){
//        String[] namaArtisString = null;
//        String namaArtisSoal = null;
//        String[] namaNama = {"Angelina","Demi More","Dewi Sandra"
//                               ,"Chelsea Islan","Raisa","Sheina","Titik Puspa","Syaila","Siva","Fatimah","Syaila_Siva_Fatimah"};
//        int index = 0;
//        double generateNumber = Math.random() * 10 ;
//        double nilaiIndex = Math.floor(generateNumber);
//        index = (int)nilaiIndex;
//        namaNama[index] = namaNama[index].toUpperCase();
//        namaArtisSoal = namaNama[index];
//        namaSoal = namaArtisSoal;
//        String random = namaSoal.replaceAll("A|I|U|E|O", "_ " );
//        
//        //namaSoal = namaArtisSoal
//        //char[] c =namaSoal.toCharArray();
//        //Arrays.sort(c);
//        //String random = new String (c).replaceAll("\\s", "_" );
//       // String random = Arrays.toString(c).("\\[|\\]|,|\\s", "_" );
//        
//        return random;
//    }
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
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakArtis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cekLabel;
    private javax.swing.JLabel cheat;
    private javax.swing.JButton cheatButton;
    private javax.swing.JLabel clueTextField;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton mulaiButton;
    private javax.swing.JLabel nyawaTextField;
    private javax.swing.JButton yakinButton;
    // End of variables declaration//GEN-END:variables
}