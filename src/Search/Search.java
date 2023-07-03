/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import BangDiem.BangDiem;
import BangDiem.IBangDiemDAO;
import BangDiem.frmBangDiem;
import SinhVien.ISinhVienDAO;
import SinhVien.SinhVien;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anonymous
 */
public class Search extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultTableModel dtmMark;
    ArrayList<BangDiem> listbdiem = null;

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        dtm = new DefaultTableModel();
        dtmMark = new DefaultTableModel();

        //TIm kiem sinh vien theo ma lop
        dtm.addColumn("ID");
        dtm.addColumn("Họ Tên");
        dtm.addColumn("ID Lớp");
        dtm.addColumn("Hệ ĐT");
        dtm.addColumn("Ngày Sinh");
        dtm.addColumn("Địa Chỉ");
        dtm.addColumn("Giới Tính");
        dtm.addColumn("Số ĐT");
        jtbTTSV.setModel(dtm);

        //TIm Kiem diem theo ma sv
        dtmMark.addColumn("Mã Sinh Viên");
        dtmMark.addColumn("Mã Môn Học");
        dtmMark.addColumn("Lần Thi");
        dtmMark.addColumn("Hệ Số");
        dtmMark.addColumn("Điểm");
        dtmMark.addColumn("Trạng Thái");
        jtbbangdiem.setModel(dtmMark);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTTSV = new javax.swing.JTable();
        jtfmalop = new javax.swing.JTextField();
        jbtSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jtfmasv = new javax.swing.JTextField();
        jbtnsearchmasv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbbangdiem = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jtbTTSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ Tên", "Lớp", "Hệ Đào Tạo", "Ngày Sinh", "Địa Chỉ", "Giới Tính", "Số Điện Thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTTSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtbTTSVMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtbTTSV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtfmalop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfmalopKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfmalopKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfmalopKeyTyped(evt);
            }
        });

        jbtSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtSearch.setText("Tìm kiếm");
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Nhập Mã Lớp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfmalop, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtSearch)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfmalop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tìm Sinh Viên Theo Mã Lớp", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtfmasv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfmasvKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfmasvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfmasvKeyTyped(evt);
            }
        });

        jbtnsearchmasv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnsearchmasv.setText("Tìm kiếm");
        jbtnsearchmasv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchmasvActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Nhập Mã Sinh Viên");

        jtbbangdiem.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbbangdiem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtbbangdiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtbbangdiemMouseReleased(evt);
            }
        });
        jtbbangdiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbbangdiemKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jtbbangdiem);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtfmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnsearchmasv)
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnsearchmasv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addGap(105, 105, 105)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Tìm Điểm Theo Mã Sinh Viên", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents
    private static Object[] toObjectData(SinhVien sv) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(sv.getNgaysinh());

        boolean flag = sv.isGioitinh();
        String gioitinh = "Nam";
        if (!flag) {
            gioitinh = "Nữ";
        }
        Object[] objectData = {sv.getMasv(), sv.getTensv(), sv.getMalop(),
            sv.getHedaotao(), date, sv.getDiachi(), gioitinh, sv.getSodt()};
        return objectData;
    }

    public void timkiem() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        String malop = jtfmalop.getText();
        try {
            try {
                ISinhVienDAO sinhVienDAO = (ISinhVienDAO) Class.forName("SinhVien.SinhVienDAO").newInstance();
                ArrayList<SinhVien> list = sinhVienDAO.findByIDLop(malop);
                for (SinhVien sv : list) {
                    dtm.addRow(toObjectData(sv));
                }
            } catch (InstantiationException ex) {
                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void timKiemDiem() {
        while (dtmMark.getRowCount() > 0) {
            dtmMark.removeRow(0);
        }
        try {

            String masv = jtfmasv.getText();
            IBangDiemDAO bangDiemDAO = (IBangDiemDAO) Class.forName("BangDiem.BangDiemDAO").newInstance();
            ArrayList<BangDiem> listbd = bangDiemDAO.findByIDSinhVien(masv);
            for (BangDiem bd : listbd) {
                dtmMark.addRow(toOjectBd(bd));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Object[] toOjectBd(BangDiem bd) {
        Object[] objects = {bd.getMasv(), bd.getMamh(), bd.getLanthi(), bd.getHeso(), bd.getDiem(), bd.isTrangthai()};
        return objects;
    }
private void jtfmalopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfmalopActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jtfmalopActionPerformed

private void jtfmasvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfmasvActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jtfmasvActionPerformed

    private void jtbbangdiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbbangdiemKeyReleased

    }//GEN-LAST:event_jtbbangdiemKeyReleased

    private void jtbbangdiemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbbangdiemMouseReleased

    }//GEN-LAST:event_jtbbangdiemMouseReleased

    private void jbtnsearchmasvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchmasvActionPerformed
        timKiemDiem();
    }//GEN-LAST:event_jbtnsearchmasvActionPerformed

    private void jtfmasvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmasvKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfmasvKeyTyped

    private void jtfmasvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmasvKeyReleased
        timKiemDiem();
    }//GEN-LAST:event_jtfmasvKeyReleased

    private void jtfmasvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmasvKeyPressed
        timKiemDiem();
    }//GEN-LAST:event_jtfmasvKeyPressed

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        timkiem();
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jtfmalopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmalopKeyTyped

    }//GEN-LAST:event_jtfmalopKeyTyped

    private void jtfmalopKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmalopKeyReleased
        timkiem();
    }//GEN-LAST:event_jtfmalopKeyReleased

    private void jtfmalopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmalopKeyPressed
        timkiem();
    }//GEN-LAST:event_jtfmalopKeyPressed

    private void jtbTTSVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTTSVMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbTTSVMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JButton jbtnsearchmasv;
    private javax.swing.JTable jtbTTSV;
    private javax.swing.JTable jtbbangdiem;
    private javax.swing.JTextField jtfmalop;
    private javax.swing.JTextField jtfmasv;
    // End of variables declaration//GEN-END:variables
}