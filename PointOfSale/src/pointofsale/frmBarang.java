/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author edi
 */
public class frmBarang extends javax.swing.JFrame {

    /**
     * Creates new form frmBarang
     */
    public frmBarang() {
        initComponents();
    }
    Connection Conn = null;
    ResultSet rs = null;
    Statement stmt = null;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKodeBrg = new javax.swing.JTextField();
        txtNamaBrg = new javax.swing.JTextField();
        txtHrgJual = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtHrgBeli = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang :");

        jLabel2.setText("Nama Barang :");

        jLabel3.setText("Hrg Beli :");

        jLabel4.setText("Hrg Jual :");

        jLabel5.setText("Qty :");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Keluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNamaBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                                .addComponent(txtKodeBrg)
                                .addComponent(txtHrgBeli)
                                .addComponent(txtHrgJual)
                                .addComponent(txtQty)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKodeBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(Hapus)
                    .addComponent(btnCari)
                    .addComponent(Keluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        // TODO add your handling code here:

        Conn = clsKoneksi.Koneksi();

        super.setLocationRelativeTo(null);

        Tampil_Data();

        }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String sql = ("INSERT INTO barang VALUES")+ txtKodeBrg.getText() + txtNamaBrg.getText()+ txtHrgBeli.getText()  + txtHrgJual.getText()  + txtQty.getText();
        try{
        rs = stmt.executeQuery(sql);
        JOptionPane.showMessageDialog(null, "Data Sudah Disimpan!");
        Tampil_Data();
        }catch(Exception e){
            e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String sql = ("UPDATE barang SET NamaBrg")+ txtNamaBrg.getText() + txtHrgBeli.getText()  + txtHrgJual.getText()  + txtQty.getText()+ txtKodeBrg.getText();

        try{

        rs = stmt.executeQuery(sql);

        JOptionPane.showMessageDialog(null,"Data Sudah Disimpan!");

        Tampil_Data();

        }catch(Exception e){
            e.printStackTrace();

        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String cari =("SELECT FROM barang WHERE koedebrg") + txtKodeBrg.getText();

        try{

        rs = stmt.executeQuery(cari);

        if (rs.next()){

        txtKodeBrg.setText(rs.getString("kodebrg"));

        txtNamaBrg.setText(rs.getString("namabrg"));

        txtHrgBeli.setText(rs.getString("hrgbeli"));

        txtHrgJual.setText(rs.getString("hrgjual"));

        txtQty.setText(rs.getString("qty"));

        }else{

        JOptionPane.showMessageDialog(null, "Data yang dicari tidak ada");

        }

        }catch(Exception e){
            e.printStackTrace();

        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        String sql = ("DELETE FROM barang WHERE kodebrg")+ txtKodeBrg.getText();

        try{

        int replay = JOptionPane.showConfirmDialog(this,"Yakin akan menghapus data dengan Kode Barang = " + txtKodeBrg.getText() + "Konfirmasi", "", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (replay== JOptionPane.YES_OPTION){

        rs = stmt.executeQuery(sql);

        JOptionPane.showMessageDialog(null, "Data dengan Kode Barang ="+ txtKodeBrg.getText() + "Berhasil Dikapus!","Perhatian", JOptionPane.INFORMATION_MESSAGE);

        Tampil_Data();

        Bersih();

        }



        }catch(Exception e){
            e.printStackTrace();

        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(frmBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBarang().setVisible(true);
            }
        });
    }

    private void Tampil_Data(){

    String sql = ("SELECT * FROM barang");

    try{

    rs = stmt.executeQuery(sql);
    

    }catch(Exception e){
        e.printStackTrace();

    JOptionPane.showMessageDialog(null, e);

    }

    }



    private void Bersih(){

    txtKodeBrg.setText("");

    txtNamaBrg.setText("");

    txtHrgBeli.setText("");

    txtHrgJual.setText("");

    txtQty.setText("");

    txtKodeBrg.requestFocus();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtHrgBeli;
    private javax.swing.JTextField txtHrgJual;
    private javax.swing.JTextField txtKodeBrg;
    private javax.swing.JTextField txtNamaBrg;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}