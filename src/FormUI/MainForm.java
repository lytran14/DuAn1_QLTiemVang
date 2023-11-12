package FormUI;

import Class_Utils.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MainForm extends javax.swing.JFrame {

    private FormThongKe tkKe;
    private FormSanPham sp;
    private FormSanPhamBanRa br;
    private FormSanPhamMuaVao mv;
    private FormCamDo cd;
    private FormLoaiSanPham lsp;
    private FormGiaVangHomNay gv;
    private FormKhachHang kh;
    private FormNhanVien nv;

    public MainForm(java.awt.Frame parent, boolean modal) {
        initComponents();
        init();
        openThongKe();
    }

    private void init() {
        this.setLocationRelativeTo(null);
        new FormCuaSoChao(this, true).setVisible(true);
        new FormDangNhap(this, true).setVisible(true);

        new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                //lblDongHo.setText(text);
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbGiaVang = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbTke = new javax.swing.JLabel();
        lbKhachHang = new javax.swing.JLabel();
        lbBanRa = new javax.swing.JLabel();
        lbMuavao = new javax.swing.JLabel();
        lbCamDo = new javax.swing.JLabel();
        lbLoaiSP = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        lbSanPham = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        lbNhanVien = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lbThoat = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbDoiMk = new javax.swing.JLabel();
        lbDangXuat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ TIỆM VÀNG");
        setPreferredSize(new java.awt.Dimension(1536, 864));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/fpt_1.png"))); // NOI18N
        jLabel1.setText("ShopLDAD");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Khách Hàng");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        lbGiaVang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGiaVang.setForeground(new java.awt.Color(255, 255, 255));
        lbGiaVang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Bar chart.png"))); // NOI18N
        lbGiaVang.setText("Giá Vàng Hôm Nay");
        lbGiaVang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGiaVangMouseClicked(evt);
            }
        });
        jPanel1.add(lbGiaVang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 10));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 10));

        lbTke.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTke.setForeground(new java.awt.Color(255, 255, 255));
        lbTke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Statistics.png"))); // NOI18N
        lbTke.setText("Thống Kê");
        lbTke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTkeMouseClicked(evt);
            }
        });
        jPanel1.add(lbTke, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        lbKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        lbKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Users.png"))); // NOI18N
        lbKhachHang.setText("Khách Hàng");
        lbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbKhachHangMouseClicked(evt);
            }
        });
        jPanel1.add(lbKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 20));

        lbBanRa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbBanRa.setForeground(new java.awt.Color(255, 255, 255));
        lbBanRa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Price list.png"))); // NOI18N
        lbBanRa.setText("Bán Ra");
        lbBanRa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBanRaMouseClicked(evt);
            }
        });
        jPanel1.add(lbBanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        lbMuavao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMuavao.setForeground(new java.awt.Color(255, 255, 255));
        lbMuavao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Add to basket.png"))); // NOI18N
        lbMuavao.setText("Mua Vào");
        lbMuavao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMuavaoMouseClicked(evt);
            }
        });
        jPanel1.add(lbMuavao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        lbCamDo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCamDo.setForeground(new java.awt.Color(255, 255, 255));
        lbCamDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Refresh.png"))); // NOI18N
        lbCamDo.setText("Cầm Đồ");
        lbCamDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCamDoMouseClicked(evt);
            }
        });
        jPanel1.add(lbCamDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        lbLoaiSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLoaiSP.setForeground(new java.awt.Color(255, 255, 255));
        lbLoaiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Notes.png"))); // NOI18N
        lbLoaiSP.setText("Loại Sản Phẩm");
        lbLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoaiSPMouseClicked(evt);
            }
        });
        jPanel1.add(lbLoaiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sản Phẩm");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lbSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/List.png"))); // NOI18N
        lbSanPham.setText("Sản Phẩm");
        lbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSanPhamMouseClicked(evt);
            }
        });
        jPanel1.add(lbSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nhân Viên");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        lbNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/User.png"))); // NOI18N
        lbNhanVien.setText("Nhân Viên");
        lbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNhanVienMouseClicked(evt);
            }
        });
        jPanel1.add(lbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 20));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 170, 10));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 170, 10));

        lbThoat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbThoat.setForeground(new java.awt.Color(255, 255, 255));
        lbThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Open door.png"))); // NOI18N
        lbThoat.setText("Thoát");
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatMouseClicked(evt);
            }
        });
        jPanel1.add(lbThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tài Khoản");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        lbDoiMk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDoiMk.setForeground(new java.awt.Color(255, 255, 255));
        lbDoiMk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Open lock.png"))); // NOI18N
        lbDoiMk.setText("Đổi Mật Khẩu");
        lbDoiMk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDoiMkMouseClicked(evt);
            }
        });
        jPanel1.add(lbDoiMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, 20));

        lbDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lbDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/icon/Log out.png"))); // NOI18N
        lbDangXuat.setText("Đăng Xuất");
        lbDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDangXuatMouseClicked(evt);
            }
        });
        jPanel1.add(lbDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shop/img/1781515-17-10-54-58.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 200, 820));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1331, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbTkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTkeMouseClicked
        openThongKe();
    }//GEN-LAST:event_lbTkeMouseClicked

    private void lbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSanPhamMouseClicked
        openSP();
    }//GEN-LAST:event_lbSanPhamMouseClicked

    private void lbBanRaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBanRaMouseClicked
        openSPBanRa();
    }//GEN-LAST:event_lbBanRaMouseClicked

    private void lbMuavaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMuavaoMouseClicked
        openSPMuaVao();
    }//GEN-LAST:event_lbMuavaoMouseClicked

    private void lbCamDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCamDoMouseClicked
        openCamDo();
    }//GEN-LAST:event_lbCamDoMouseClicked

    private void lbLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoaiSPMouseClicked
        openLoaiSP();
    }//GEN-LAST:event_lbLoaiSPMouseClicked

    private void lbGiaVangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGiaVangMouseClicked
        openGiaVang();
    }//GEN-LAST:event_lbGiaVangMouseClicked

    private void lbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbKhachHangMouseClicked
        openKhachHang();
    }//GEN-LAST:event_lbKhachHangMouseClicked

    private void lbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNhanVienMouseClicked
        openNhanVien();
    }//GEN-LAST:event_lbNhanVienMouseClicked

    private void lbDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDangXuatMouseClicked
        new FormDangNhap(this, true).setVisible(true);
//      dispose();
    }//GEN-LAST:event_lbDangXuatMouseClicked

    private void lbDoiMkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDoiMkMouseClicked
        new FormDoiMatKhau().setVisible(true);
//      dispose();
    }//GEN-LAST:event_lbDoiMkMouseClicked

    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThoatMouseClicked
        if (MsgBox.confirm(this, "Bạn có chắc chắn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_lbThoatMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        openThongKe();
    }//GEN-LAST:event_jLabel1MouseClicked

    void openKhachHang() {
        kh = new FormKhachHang();
        setForm(kh);
    }

    void openNhanVien() {
        nv = new FormNhanVien();
        setForm(nv);
    }

    void openSP() {
        sp = new FormSanPham();
        setForm(sp);
    }

    void openCamDo() {
        cd = new FormCamDo();
        setForm(cd);
    }

    void openSPBanRa() {
        br = new FormSanPhamBanRa();
        setForm(br);
    }

    void openSPMuaVao() {
        mv = new FormSanPhamMuaVao();
        setForm(mv);
    }

    void openLoaiSP() {
        lsp = new FormLoaiSanPham();
        setForm(lsp);
    }
void openGiaVang() {
        gv = new FormGiaVangHomNay();
        setForm(gv);
    }
    void openThongKe() {
        tkKe = new FormThongKe();
        setForm(tkKe);
    }

    private void setForm(JFrame frame) {
        MainPanel.removeAll();
        MainPanel.add(frame.getContentPane());
        MainPanel.repaint();
        MainPanel.revalidate();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForm dialog = new MainForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbBanRa;
    private javax.swing.JLabel lbCamDo;
    private javax.swing.JLabel lbDangXuat;
    private javax.swing.JLabel lbDoiMk;
    private javax.swing.JLabel lbGiaVang;
    private javax.swing.JLabel lbKhachHang;
    private javax.swing.JLabel lbLoaiSP;
    private javax.swing.JLabel lbMuavao;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JLabel lbSanPham;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JLabel lbTke;
    // End of variables declaration//GEN-END:variables
}
