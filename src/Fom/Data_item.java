package Fom;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Data_item extends javax.swing.JFrame(){

    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    Connection conn = Config.koneksi1.KoneksiDB();


    public Data_item(){
        initComponents();
        showdata();
        reset();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        cmb_Kategori = new javax.swing.JComboBox<>();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Reset = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Item = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nama item");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Harga");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Kategori");

        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHargaKeyReleased(evt);
            }
        });

        cmb_Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak ada", "Makanan", "Minuman dingin", "Cofee" }));

        Btn_Hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        Btn_Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Reset.setText("Reset");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });

        Btn_Simpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(Btn_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Hapus)
                    .addComponent(Btn_Reset)
                    .addComponent(Btn_Simpan))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Data item");

        Tbl_Item.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tbl_Item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama item", "Kategori", "Harga"
            }
        ));
        Tbl_Item.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Tbl_ItemAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Tbl_Item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_ItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Item);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private void FormatRupiah() {
         if(!txtHarga.getText().equals("")){
         String Replace=txtHarga.getText().replaceAll("[^\\d]", "");
         double FormatRp=Double.parseDouble(Replace);
         DecimalFormat dcf= new DecimalFormat("#,###,###");
         txtHarga.setText(dcf.format(FormatRp));
         
         }

     }
    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        try {
            if(txtNama.getText().equals("")||txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus","Validasi",JOptionPane.INFORMATION_MESSAGE);
            }else{
                int konfirmasi=JOptionPane.showConfirmDialog(null, "Anda ingin menghapus data, ingin melanjutkan ?", "Hapus Data",JOptionPane.YES_NO_OPTION);
                if(konfirmasi==0){
                    int selecttedrow=Tbl_Item.getSelectedRow();
                    String No=Tbl_Item.getValueAt(selecttedrow, 0).toString();
                    String sql="DELETE FROM tbl_dataitem WHERE No=?";
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, No);
                    ps.executeUpdate();
                    showdata();
                    reset();
                    
                }else{
                   reset();  
                }
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
       if (txtNama.getText().equals("") || txtHarga.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Data Tidak Lengkap!", "Validasi", JOptionPane.WARNING_MESSAGE);
           return;
        }
    
        try {
              st=conn.createStatement();
              if(Btn_Simpan.getText()=="Simpan"){
              String find= "SELECT * FROM tbl_dataitem WHERE nama_item='"+ txtNama.getText() +" ' ";
              rs=st.executeQuery(find);
              if(rs.next()){
               JOptionPane.showMessageDialog(null,"Data sudah ada! Masukan menu lain", "Validasi", JOptionPane.WARNING_MESSAGE);
              }else{
               String nama = txtNama.getText();
               String kategori = cmb_Kategori.getItemAt(cmb_Kategori.getSelectedIndex());
               String harga = txtHarga.getText();
               String replaceHarga= harga.replaceAll("," , "");
               
               String sql= "INSERT INTO tbl_dataitem (nama_item,Kategori,Harga) VALUES (?,?,?)";
               ps=conn.prepareStatement(sql);
               ps.setString(1, nama);
               ps.setString(2, kategori);
               ps.setString(3, replaceHarga);
               
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Data Berhasil di input", "Input Data", JOptionPane.INFORMATION_MESSAGE);
              
               showdata();
                reset();
              }
            }else{
                  
               int selecttedrow=Tbl_Item.getSelectedRow();
               String No=Tbl_Item.getValueAt(selecttedrow, 0).toString();
                  
               String nama = txtNama.getText();
               String kategori = cmb_Kategori.getItemAt(cmb_Kategori.getSelectedIndex());
               String harga = txtHarga.getText();               
               String replaceHarga=harga.replaceAll("," , "");
               
               String sql= "UPDATE tbl_dataitem SET nama_item=?, kategori=?, harga=? WHERE No=?";
               ps=conn.prepareStatement(sql);
               ps.setString(1, nama);
               ps.setString(2, kategori);
               ps.setString(3, replaceHarga);
               ps.setString(4, No);
               
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Data Berhasil di Update", "Input Data", JOptionPane.INFORMATION_MESSAGE);
              
               showdata();
               reset();
                  
                  
              }
        } catch (Exception e) {

            e.printStackTrace();
        }
       
    }//GEN-LAST:event_Btn_SimpanActionPerformed


    
    
    
    
    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        // TODO add your handling code here:
         reset();
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Tbl_ItemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Tbl_ItemAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Tbl_ItemAncestorAdded

    private void Tbl_ItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_ItemMouseClicked
        // TODO add your handling code here:
          DefaultTableModel model= (DefaultTableModel)Tbl_Item.getModel();
        int selecttedrow=Tbl_Item.getSelectedRow();

         txtNama.setText(model.getValueAt(selecttedrow, 1).toString());
        
         
          String colKat=model.getValueAt(selecttedrow, 2).toString();
              for(int i =0;i<cmb_Kategori.getItemCount();i++){ 
                 if(cmb_Kategori.getItemAt(i).toString().equalsIgnoreCase(colKat)){
                    cmb_Kategori.setSelectedIndex(i);
         }
                 
      }
              
               txtHarga.setText(model.getValueAt(selecttedrow, 3).toString());
                Btn_Simpan.setText("Update");
                FormatRupiah();                

    }//GEN-LAST:event_Tbl_ItemMouseClicked

    private void txtHargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyReleased
  
        FormatRupiah();
    }//GEN-LAST:event_txtHargaKeyReleased

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
            java.util.logging.Logger.getLogger(Data_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JTable Tbl_Item;
    private javax.swing.JComboBox<String> cmb_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

       private void showdata() {
        DefaultTableModel model = (DefaultTableModel)Tbl_Item.getModel();
        model.setRowCount(0);
        try {
            String sql = "SELECT * FROM tbl_dataitem";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){  
                int no=rs.getInt("No");
                String nama=rs.getString("nama_item");
                String Kategori=rs.getString("Kategori");
                String harga=rs.getString("harga");
                //int harga=rs.getInt("harga");
        //      NumberFormat kursIndo= NumberFormat.getIntegerInstance(new Locale.("id", "ID"));
                Object[] Rowdata={no,nama,Kategori,harga};
                    //kursIndo.format(harga)};
                model.addRow(Rowdata);
        
            }
        } catch (Exception e) {
        }
      
    }

    private void reset() {
     txtNama.setText("");
     cmb_Kategori.setSelectedIndex(0);
     txtHarga.setText("");
     Btn_Simpan.setText("Simpan");
     }
     
     

