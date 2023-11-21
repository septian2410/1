package Menu_Laporan;

import Menu_Administrasi.Pembayaran_lain;
import Menu_Administrasi.Pembayaran_spp;
import Menu_Inventory.Data_Inventory_Barang;
import Menu_Inventory.Data_Permohonan_Barang;
import Menu_Master.Data_Guru;
import Menu_Master.Data_Jadwal;
import Menu_Master.Data_Kelas;
import Menu_Master.Data_Siswa;
import beranda.menu_utama;
import beranda.menu_utama1;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import server.koneksi;

public class Laporan_data_guru1 extends javax.swing.JFrame {

    /**
     * Creates new form Laporan_data_guru
     */
    public Laporan_data_guru1() {
        initComponents();
        setLocationRelativeTo(this);
        showdata();
    }

    private void showdata(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIP");
        model.addColumn("Nama");
        model.addColumn("Mata Pelajaran");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Asal");
        model.addColumn("Agama");
        model.addColumn("No Telpon");
        model.addColumn("Alamat");
        try {
            int no = 1;
            String sql = "SELECT * FROM tb_data_guru order by nip";
            java.sql.Connection conn = (Connection)koneksi.getConnection();
            java.sql.Statement stat = conn.createStatement();
            java.sql.ResultSet res = stat.executeQuery(sql);
           while( res.next() ){
                model.addRow(new Object[]{
                    res.getString(1), 
                    res.getString(2), 
                    res.getString(3), 
                    res.getString(4), 
                    res.getString(5), 
                    res.getString(6),
                    res.getString(7),
                    res.getString(8),
                    res.getString(9)
                });
            }
            table_guru.setModel(model);
        } catch (SQLException e) {
            System.out.println("There is an error : " + e.getMessage());
        }
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_guru = new javax.swing.JTable();
        btnPRINT = new javax.swing.JButton();
        btnUPDATE1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        HOME = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        GURU = new javax.swing.JMenuItem();
        SISWA = new javax.swing.JMenuItem();
        JADWAL = new javax.swing.JMenuItem();
        KELAS = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        LAP_GURU = new javax.swing.JMenuItem();
        LAP_SISWA = new javax.swing.JMenuItem();
        LAP_JADWAL = new javax.swing.JMenuItem();
        LAP_KELAS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 141, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(1478, 47));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(18, 93, 152));

        table_guru.setModel(new javax.swing.table.DefaultTableModel(
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
        table_guru.setMaximumSize(new java.awt.Dimension(2147483647, 496));
        table_guru.setMinimumSize(new java.awt.Dimension(135, 496));
        table_guru.setPreferredSize(new java.awt.Dimension(675, 496));
        jScrollPane1.setViewportView(table_guru);

        btnPRINT.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnPRINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Favorites/icons8-print-100.png"))); // NOI18N
        btnPRINT.setText("Print");
        btnPRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRINTActionPerformed(evt);
            }
        });

        btnUPDATE1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnUPDATE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Favorites/icons8-edit-file-100.png"))); // NOI18N
        btnUPDATE1.setText("Edit");
        btnUPDATE1.setMaximumSize(new java.awt.Dimension(281, 137));
        btnUPDATE1.setMinimumSize(new java.awt.Dimension(281, 137));
        btnUPDATE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATE1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(807, 807, 807)
                .addComponent(btnUPDATE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPRINT)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPRINT)
                    .addComponent(btnUPDATE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jMenu1.setText("File");

        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/konfigurasi_univ.png"))); // NOI18N
        HOME.setText("Menu utama");
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });
        jMenu1.add(HOME);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Form");

        GURU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/file-edit-16x16.png"))); // NOI18N
        GURU.setText("Data Guru");
        GURU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GURUActionPerformed(evt);
            }
        });
        jMenu2.add(GURU);

        SISWA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/file-edit-16x16.png"))); // NOI18N
        SISWA.setText("Data Siswa");
        SISWA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SISWAActionPerformed(evt);
            }
        });
        jMenu2.add(SISWA);

        JADWAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/file-edit-16x16.png"))); // NOI18N
        JADWAL.setText("Data Jadwal");
        JADWAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JADWALActionPerformed(evt);
            }
        });
        jMenu2.add(JADWAL);

        KELAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/file-edit-16x16.png"))); // NOI18N
        KELAS.setText("Data Kelas");
        KELAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KELASActionPerformed(evt);
            }
        });
        jMenu2.add(KELAS);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Report");

        LAP_GURU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/report.png"))); // NOI18N
        LAP_GURU.setText("Guru");
        LAP_GURU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAP_GURUActionPerformed(evt);
            }
        });
        jMenu3.add(LAP_GURU);

        LAP_SISWA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/report.png"))); // NOI18N
        LAP_SISWA.setText("Siswa");
        LAP_SISWA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAP_SISWAActionPerformed(evt);
            }
        });
        jMenu3.add(LAP_SISWA);

        LAP_JADWAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/report.png"))); // NOI18N
        LAP_JADWAL.setText("Jadwal");
        LAP_JADWAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAP_JADWALActionPerformed(evt);
            }
        });
        jMenu3.add(LAP_JADWAL);

        LAP_KELAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconnan/report.png"))); // NOI18N
        LAP_KELAS.setText("Kelas");
        LAP_KELAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAP_KELASActionPerformed(evt);
            }
        });
        jMenu3.add(LAP_KELAS);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GURUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GURUActionPerformed
        new Data_Guru().show();
        this.dispose();
    }//GEN-LAST:event_GURUActionPerformed

    private void SISWAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SISWAActionPerformed
        new Data_Siswa().show();
        this.dispose();
    }//GEN-LAST:event_SISWAActionPerformed

    private void JADWALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JADWALActionPerformed
        new Data_Jadwal().show();
        this.dispose();
    }//GEN-LAST:event_JADWALActionPerformed

    private void KELASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KELASActionPerformed
        new Data_Kelas().show();
        this.dispose();
    }//GEN-LAST:event_KELASActionPerformed

    private void LAP_GURUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAP_GURUActionPerformed
        new Laporan_data_guru1().show();
        this.dispose();
    }//GEN-LAST:event_LAP_GURUActionPerformed

    private void LAP_SISWAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAP_SISWAActionPerformed
        new Laporan_data_siswa1().show();
        this.dispose();
    }//GEN-LAST:event_LAP_SISWAActionPerformed

    private void LAP_JADWALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAP_JADWALActionPerformed
        new Laporan_data_jadwal1().show();
        this.dispose();
    }//GEN-LAST:event_LAP_JADWALActionPerformed

    private void LAP_KELASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAP_KELASActionPerformed
        new Laporan_data_kelas1().show();
        this.dispose();
    }//GEN-LAST:event_LAP_KELASActionPerformed

    private void btnPRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRINTActionPerformed
    try{
        InputStream file = getClass().getResourceAsStream("/Menu_Master/lapguru.jrxml");
        JasperDesign jasperDesign = JRXmlLoader.load(file);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,koneksi.getConnection());
        JasperViewer.viewReport(jasperPrint,false);
    }catch(Exception ex)
    {
        System.out.println(ex);
        }       
    }//GEN-LAST:event_btnPRINTActionPerformed

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
        menu_utama1 dsb = new menu_utama1();
        dsb.dashKesiswaan();
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_HOMEActionPerformed

    private void btnUPDATE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATE1ActionPerformed
        Data_Guru user = new  Data_Guru();
        user.setVisible(true);
        dispose();       
    }//GEN-LAST:event_btnUPDATE1ActionPerformed

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
            java.util.logging.Logger.getLogger(Laporan_data_guru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan_data_guru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan_data_guru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan_data_guru1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan_data_guru1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GURU;
    private javax.swing.JMenuItem HOME;
    private javax.swing.JMenuItem JADWAL;
    private javax.swing.JMenuItem KELAS;
    private javax.swing.JMenuItem LAP_GURU;
    private javax.swing.JMenuItem LAP_JADWAL;
    private javax.swing.JMenuItem LAP_KELAS;
    private javax.swing.JMenuItem LAP_SISWA;
    private javax.swing.JMenuItem SISWA;
    private javax.swing.JButton btnPRINT;
    private javax.swing.JButton btnUPDATE1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_guru;
    // End of variables declaration//GEN-END:variables
}
