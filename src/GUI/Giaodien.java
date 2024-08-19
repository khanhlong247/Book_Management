package GUI;

import Entities.docgia;
import Entities.phieumuon;
import Entities.sach;
import Proceed.Giaotiep;
import Proceed.docghifile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class Giaodien extends javax.swing.JFrame {

    DefaultTableModel model;//tạo model cho bảng sách
    DefaultTableModel model1;//tạo model cho bảng đọc giả
    DefaultTableModel model2;//tạo model cho bảng khách mượn
    private ArrayList<Giaotiep> listsach;//tạo ra danh sách sách
    private ArrayList<Giaotiep> listdocgia;//tạo danh sách đọc giả
    private ArrayList<Giaotiep> listphieumuon;
    docghifile ioFile;

    public Giaodien() {
        ioFile = new docghifile();
        listsach = new ArrayList<>();
        listdocgia = new ArrayList<>();
        listphieumuon = new ArrayList<>();
        listsach = ioFile.doc("sach.DAT");
        listdocgia = ioFile.doc("docgia.DAT");
        listphieumuon = ioFile.doc("phieumuon.DAT");
        initComponents();
        model = (DefaultTableModel) banghienthisach.getModel();
        model1 = (DefaultTableModel) banghienthidg.getModel();
        model2 = (DefaultTableModel) banghienthiphieumuon.getModel();
        hienthisach();
        hienthidocgia();
        hienthiphieumuon();
    }

    public void hienthisach() {
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getNxb(), s.getGiathanh(), s.getSoluong(), s.getTinhtrang()
            });
        }
    }

    public void hienthidocgia() {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()
            });
        }
    }

    public void hienthiphieumuon() {
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            model2.addRow(new Object[]{
                pm.getMaphieumuon(), pm.getMadocgia(), pm.getMadausach(), pm.getNgaymuon()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        banghienthisach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhaptensach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhaptheloaisach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nhaptacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nhapsoluongsach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tinhtrangsach = new javax.swing.JComboBox<>();
        themsach = new javax.swing.JButton();
        nutsuasach = new javax.swing.JButton();
        luusach = new javax.swing.JButton();
        nuthuy1 = new javax.swing.JButton();
        nutxoa = new javax.swing.JButton();
        nutThoat1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nhaptukhoasach = new javax.swing.JTextField();
        nuttimsach = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        nhapgiathanh = new javax.swing.JTextField();
        nhapnhaxuatban = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        suadg = new javax.swing.JButton();
        luudg = new javax.swing.JButton();
        themdg = new javax.swing.JButton();
        nuthuy2 = new javax.swing.JButton();
        xoadg = new javax.swing.JButton();
        nutThoat2 = new javax.swing.JButton();
        nhapsdt = new javax.swing.JTextField();
        nhapemail = new javax.swing.JTextField();
        nhapdiachi = new javax.swing.JTextField();
        nhaptendg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        banghienthidg = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nhaptukhoadg = new javax.swing.JTextField();
        nuttimdg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nútuakhachmuon = new javax.swing.JButton();
        nutluukhachmuon = new javax.swing.JButton();
        nutthemkhach = new javax.swing.JButton();
        nuthuy3 = new javax.swing.JButton();
        nutxoakhachmuon = new javax.swing.JButton();
        NutThoat3 = new javax.swing.JButton();
        nhapngay = new javax.swing.JTextField();
        nhapmaspm = new javax.swing.JTextField();
        nhapmadgpm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        banghienthiphieumuon = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        nhaptukhoapm = new javax.swing.JTextField();
        nuttimpm = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tongsosach = new javax.swing.JTextField();
        tongsopm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý ấn phẩm trong thư viện");

        jTabbedPane1.setName("Nhóm 4"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        banghienthisach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Nhà xuất bản", "Giá thành", "Số lượng", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banghienthisach);

        jLabel6.setText("Tên sách");

        nhaptensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptensachActionPerformed(evt);
            }
        });

        jLabel7.setText("Thể loại");

        nhaptheloaisach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptheloaisachActionPerformed(evt);
            }
        });

        jLabel8.setText("Tác giả");

        jLabel9.setText("Số lượng");

        jLabel10.setText("Tình trạng");

        tinhtrangsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        tinhtrangsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtrangsachActionPerformed(evt);
            }
        });

        themsach.setText("Thêm");
        themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themsachActionPerformed(evt);
            }
        });

        nutsuasach.setText("Sửa");
        nutsuasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsuasachActionPerformed(evt);
            }
        });

        luusach.setText("Lưu");
        luusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luusachActionPerformed(evt);
            }
        });

        nuthuy1.setText("Hủy");
        nuthuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy1ActionPerformed(evt);
            }
        });

        nutxoa.setText("Xóa");
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        nutThoat1.setText("Thoát chương trình");
        nutThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Tìm Kiếm");

        jLabel25.setText("Từ Khóa");

        nuttimsach.setText("Tìm");
        nuttimsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimsachActionPerformed(evt);
            }
        });

        jLabel29.setText("Giá thành");

        jLabel30.setText("Nhà xuất bản");

        nhapgiathanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapgiathanhActionPerformed(evt);
            }
        });

        nhapnhaxuatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapnhaxuatbanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nhapsoluongsach, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nhaptensach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(nhaptheloaisach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(nhaptacgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapnhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapgiathanh, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(103, 103, 103))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nuttimsach)
                                        .addGap(122, 122, 122))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(28, 28, 28)
                                        .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(190, 190, 190)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nutThoat1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nutsuasach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(themsach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(luusach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(nuthuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhaptheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(themsach)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nutsuasach)
                                    .addComponent(nuttimsach))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(luusach)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nutxoa))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(nhapgiathanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhapnhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nuthuy1)
                        .addGap(41, 41, 41)
                        .addComponent(nutThoat1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        suadg.setText("Sửa");
        suadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suadgActionPerformed(evt);
            }
        });

        luudg.setText("Lưu");
        luudg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luudgActionPerformed(evt);
            }
        });

        themdg.setText("Thêm");
        themdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themdgActionPerformed(evt);
            }
        });

        nuthuy2.setText("Hủy");
        nuthuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy2ActionPerformed(evt);
            }
        });

        xoadg.setText("Xóa");
        xoadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadgActionPerformed(evt);
            }
        });

        nutThoat2.setText("Thoát chương trình");
        nutThoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat2ActionPerformed(evt);
            }
        });

        nhapdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapdiachiActionPerformed(evt);
            }
        });

        jLabel11.setText("Tên đọc giả");

        jLabel12.setText("Địa chỉ");

        jLabel13.setText("Email");

        jLabel14.setText("Số điện thoại");

        banghienthidg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đọc giả", "Tên đọc giả", "Địa chỉ", "email", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(banghienthidg);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Tìm kiếm");

        jLabel26.setText("Từ Khóa");

        nuttimdg.setText("Tìm");
        nuttimdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimdgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nhapemail, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(nhaptendg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhapdiachi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhapsdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(suadg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xoadg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nutThoat2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(nuttimdg)
                                        .addGap(136, 136, 136)
                                        .addComponent(luudg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(120, 120, 120)
                                        .addComponent(themdg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuthuy2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(themdg)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(suadg)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(nuthuy2))
                            .addComponent(luudg))
                        .addGap(15, 15, 15)
                        .addComponent(xoadg)
                        .addGap(18, 18, 18)
                        .addComponent(nutThoat2)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nhapdiachi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuttimdg)
                            .addComponent(nhapemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quản lý đọc giả mượn sách", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        nútuakhachmuon.setText("Sửa TT mượn");
        nútuakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nútuakhachmuonActionPerformed(evt);
            }
        });

        nutluukhachmuon.setText("Lưu");
        nutluukhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutluukhachmuonActionPerformed(evt);
            }
        });

        nutthemkhach.setText("Thêm TT mượn");
        nutthemkhach.setActionCommand("Thêm TT mượn");
        nutthemkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemkhachActionPerformed(evt);
            }
        });

        nuthuy3.setText("Hủy");
        nuthuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy3ActionPerformed(evt);
            }
        });

        nutxoakhachmuon.setText("Xóa TT đã trả");
        nutxoakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoakhachmuonActionPerformed(evt);
            }
        });

        NutThoat3.setText("Thoát chương trình");
        NutThoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutThoat3ActionPerformed(evt);
            }
        });

        nhapngay.setText(" / / 2024");
        nhapngay.setToolTipText("");
        nhapngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapngayActionPerformed(evt);
            }
        });

        nhapmadgpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapmadgpmActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Mã đọc giả");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Mã sách mượn");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Ngày mượn");

        banghienthiphieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã đọc giả mượn", "Mã sách mượn", "Ngày mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(banghienthiphieumuon);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Search");

        nuttimpm.setText("Tìm");
        nuttimpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimpmActionPerformed(evt);
            }
        });

        jLabel27.setText("Từ khóa");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Từ khóa");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NutThoat3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nuttimpm)
                                        .addGap(166, 166, 166))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(177, 177, 177))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(nutthemkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)
                                                .addComponent(nutxoakhachmuon)))
                                        .addGap(63, 63, 63))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(151, 151, 151)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addGap(239, 239, 239)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuthuy3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nutluukhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nútuakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel31)))
                            .addComponent(jLabel17)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nutxoakhachmuon)
                            .addComponent(nutthemkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nútuakhachmuon)
                                .addGap(18, 18, 18)
                                .addComponent(nutluukhachmuon))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nuttimpm)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(nuthuy3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(NutThoat3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel32)))
                        .addGap(34, 34, 34))))
        );

        jTabbedPane1.addTab("Quản lý mượn sách", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("Thống kê số liệu");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Tổng số sách trong kho");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Số sách đang cho mượn");

        tongsosach.setEditable(false);

        tongsopm.setEditable(false);

        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel22))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Nhóm 2");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("1. Lưu Mai Tuyết                                    22010226");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("2. Trương Long Khánh                          22010198 ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("3. Trần Bá Hiện                                     23012315");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(286, 286, 286)
                            .addComponent(jLabel1))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin nhóm", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhaptheloaisachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptheloaisachActionPerformed

    }//GEN-LAST:event_nhaptheloaisachActionPerformed

    private void nhapdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapdiachiActionPerformed

    }//GEN-LAST:event_nhapdiachiActionPerformed

    private void nutxoakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoakhachmuonActionPerformed
 int hangpm = banghienthiphieumuon.getSelectedRow();
       if (hangpm != -1) {
           model2.removeRow(hangpm);
            listphieumuon.remove(hangpm);
           ioFile.ghi(listphieumuon, "phieumuon.DAT");
        }else{
           JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
       }
    
    }//GEN-LAST:event_nutxoakhachmuonActionPerformed

    public boolean khongtrungmasach(int masach) { 
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            if (s.getMasach() == masach) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmadg(int madg) {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            if (dg.getMadg() == madg) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmapm(int mapm) { 
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            if (pm.getMaphieumuon() == mapm) {
                return false;
            }
        }
        return true;
    }
    private void themsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themsachActionPerformed

        if (nhaptensach.getText().length() != 0) {
            int ma = 11000;
            while (true) {
                if (khongtrungmasach(ma)) {
                    break;
                }
                ma++;
            }
            sach s = new sach();
            s.setMasach(ma);
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            s.setNxb(nhapnhaxuatban.getText());
            
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
            }
            if (nhapgiathanh.getText().length() == 0) {
                s.setGiathanh(0);
            } else {
                s.setGiathanh(Integer.parseInt(nhapgiathanh.getText()));
            }
            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.add(s);
            ioFile.ghi(listsach, "sach.DAT");

            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getNxb(), s.getGiathanh(), s.getSoluong(), s.getTinhtrang()});
    }//GEN-LAST:event_themsachActionPerformed
     else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }
    private void nhaptensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptensachActionPerformed

    }//GEN-LAST:event_nhaptensachActionPerformed

    private void nutThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThoat1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_nutThoat1ActionPerformed

    private void nutThoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThoat2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_nutThoat2ActionPerformed

    private void NutThoat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutThoat3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_NutThoat3ActionPerformed

    private void tinhtrangsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtrangsachActionPerformed

    }//GEN-LAST:event_tinhtrangsachActionPerformed

    private void nutsuasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsuasachActionPerformed

        int hangchon;
        hangchon = banghienthisach.getSelectedRow(); 
        if (hangchon != -1) {
            nhaptensach.setText(model.getValueAt(hangchon, 1).toString());
            nhaptheloaisach.setText(model.getValueAt(hangchon, 2).toString());
            nhaptacgia.setText(model.getValueAt(hangchon, 3).toString());
            nhapnhaxuatban.setText(model.getValueAt(hangchon, 4).toString());
            nhapgiathanh.setText(model.getValueAt(hangchon, 5).toString());
            nhapsoluongsach.setText(model.getValueAt(hangchon, 6).toString());
            tinhtrangsach.setSelectedItem(model.getValueAt(hangchon, 7).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn sửa!");
        }
    }//GEN-LAST:event_nutsuasachActionPerformed

    private void luusachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luusachActionPerformed

        if (nhaptensach.getText().length() != 0) {
            int hang = banghienthisach.getSelectedRow();
            sach s = new sach();
            s.setMasach(Integer.parseInt(model.getValueAt(hang, 0).toString()));
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            s.setNxb(nhapnhaxuatban.getText());
         
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
            }
            if (nhapgiathanh.getText().length() == 0) {
                s.setGiathanh(0);
            } else {
                s.setGiathanh(Integer.parseInt(nhapgiathanh.getText()));
            }
            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.set(hang, s);

            ioFile.ghi(listsach, "sach.DAT");

            model.setValueAt(s.getMasach(), hang, 0);
            model.setValueAt(s.getTensach(), hang, 1);
            model.setValueAt(s.getTheloai(), hang, 2);
            model.setValueAt(s.getTacgia(), hang, 3);
            model.setValueAt(s.getNxb(), hang, 4);
            model.setValueAt(s.getGiathanh(), hang, 5);
            model.setValueAt(s.getSoluong(), hang, 6);
            model.setValueAt(s.getTinhtrang(), hang, 7);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }//GEN-LAST:event_luusachActionPerformed

    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoaActionPerformed

        int hang = banghienthisach.getSelectedRow();
        if (hang != -1) {
            model.removeRow(hang);
            listsach.remove(hang);
            ioFile.ghi(listsach, "sach.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
        }
    }//GEN-LAST:event_nutxoaActionPerformed

    private void nuthuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy1ActionPerformed

        nhaptensach.setText("");
        nhaptukhoasach.setText("");
        nhaptheloaisach.setText("");
        nhaptacgia.setText("");
        nhapsoluongsach.setText("");
        nhapnhaxuatban.setText("");
        nhapgiathanh.setText("");
        tinhtrangsach.setSelectedIndex(0);
    }//GEN-LAST:event_nuthuy1ActionPerformed

    private void nuthuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy2ActionPerformed

        nhaptendg.setText("");
        nhaptukhoadg.setText("");
        nhapdiachi.setText("");
        nhapemail.setText("");
        nhapsdt.setText("");
    }//GEN-LAST:event_nuthuy2ActionPerformed

    private void nuthuy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy3ActionPerformed

        nhapmadgpm.setText("");
        nhapmaspm.setText("");
        nhapngay.setText("");
        nhaptukhoapm.setText("");
    }//GEN-LAST:event_nuthuy3ActionPerformed

    private void themdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themdgActionPerformed

        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {//độ dài chuỗi nhập vào khác 0
            int madg = 1001;
            while (true) {
                if (khongtrungmadg(madg)) {
                    break;
                }
                madg++;
            }
            docgia dg = new docgia();
            dg.setMadg(madg);
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
            listdocgia.add(dg);
            ioFile.ghi(listdocgia, "docgia.DAT");
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập tất cả thông tin!");
        }
    }//GEN-LAST:event_themdgActionPerformed

    private void suadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suadgActionPerformed

        int hangdg;
        hangdg = banghienthidg.getSelectedRow(); 
        if (hangdg != -1) {
            nhaptendg.setText(model1.getValueAt(hangdg, 1).toString());
            nhapdiachi.setText(model1.getValueAt(hangdg, 2).toString());
            nhapemail.setText(model1.getValueAt(hangdg, 3).toString());
            nhapsdt.setText(model1.getValueAt(hangdg, 4).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn sửa!");
        }

    }//GEN-LAST:event_suadgActionPerformed

    private void xoadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoadgActionPerformed

        int hangdg = banghienthidg.getSelectedRow();
        if (hangdg != -1) {
            model1.removeRow(hangdg);
            listdocgia.remove(hangdg);
            ioFile.ghi(listdocgia, "docgia.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn xóa!");
        }
    }//GEN-LAST:event_xoadgActionPerformed

    private void luudgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luudgActionPerformed

        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {
            int hangdg = banghienthidg.getSelectedRow();
            docgia dg = new docgia();
            dg.setMadg(Integer.parseInt(model1.getValueAt(hangdg, 0).toString()));//(3)
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));

            listdocgia.set(hangdg, dg);
            ioFile.ghi(listdocgia, "docgia.DAT");
            model1.setValueAt(dg.getMadg(), hangdg, 0);
            model1.setValueAt(dg.getTendg(), hangdg, 1);
            model1.setValueAt(dg.getDiachi(), hangdg, 2);
            model1.setValueAt(dg.getEmaildg(), hangdg, 3);
            model1.setValueAt(dg.getSdtdg(), hangdg, 4);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }//GEN-LAST:event_luudgActionPerformed

    private void nuthuytim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuytim1ActionPerformed

    }//GEN-LAST:event_nuthuytim1ActionPerformed

    private void chontimsach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chontimsach1ActionPerformed

    }//GEN-LAST:event_chontimsach1ActionPerformed

    private void nuttimsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimsachActionPerformed

        model.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model);
        banghienthisach.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoasach.getText()));
    }//GEN-LAST:event_nuttimsachActionPerformed

    private void nuttimdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimdgActionPerformed
 
        model1.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model1);
        banghienthidg.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoadg.getText()));
    }//GEN-LAST:event_nuttimdgActionPerformed

    private void nutthemkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutthemkhachActionPerformed
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int mapm = 1000;
            while (true) {
                if (khongtrungmapm(mapm)) {
                    break;
                }
                mapm++;
            }
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(mapm);
            pm.setNgaymuon(nhapngay.getText());
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            listphieumuon.add(pm);
            ioFile.ghi(listphieumuon, "phieumuon.DAT");
            model2.addRow(new Object[]{
                pm.getMaphieumuon(), pm.getMadocgia(), pm.getMadausach(), pm.getNgaymuon()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_nutthemkhachActionPerformed

    private void nútuakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nútuakhachmuonActionPerformed
        int hangpm;
        hangpm = banghienthiphieumuon.getSelectedRow(); 
        if (hangpm != -1) {
            nhapmadgpm.setText(model2.getValueAt(hangpm, 1).toString());
            nhapmaspm.setText(model2.getValueAt(hangpm, 2).toString());
            nhapngay.setText(model2.getValueAt(hangpm, 3).toString());

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn phiếu mượn muốn sửa!");
        }
    }//GEN-LAST:event_nútuakhachmuonActionPerformed

    private void nutluukhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutluukhachmuonActionPerformed
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int hangpm = banghienthiphieumuon.getSelectedRow();
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(Integer.parseInt(model2.getValueAt(hangpm, 0).toString()));
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            pm.setNgaymuon(nhapngay.getText());

            listphieumuon.set(hangpm, pm);
            ioFile.ghi(listphieumuon, "phieumuon.DAT");
            model2.setValueAt(pm.getMadocgia(), hangpm, 1);
            model2.setValueAt(pm.getMadausach(), hangpm, 2);
            model2.setValueAt(pm.getNgaymuon(), hangpm, 3);
            model2.setValueAt(pm.getMaphieumuon(), hangpm, 0);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");

        }
    }//GEN-LAST:event_nutluukhachmuonActionPerformed

    private void nuttimpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimpmActionPerformed
          model2.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model2);
        banghienthiphieumuon.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoapm.getText()));
        
    }//GEN-LAST:event_nuttimpmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int tongSoLuongSach = 0;
        int sopm = banghienthiphieumuon.getRowCount();
        for (int i = 0; i < banghienthisach.getRowCount(); i++) {
            int soLuong = Integer.parseInt(banghienthisach.getValueAt(i, 6).toString());
            tongSoLuongSach += soLuong;
        }
    
        tongsosach.setText("" + (tongSoLuongSach - sopm));
        tongsopm.setText  (""+sopm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nhapgiathanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapgiathanhActionPerformed

    }//GEN-LAST:event_nhapgiathanhActionPerformed

    private void nhapnhaxuatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapnhaxuatbanActionPerformed

    }//GEN-LAST:event_nhapnhaxuatbanActionPerformed

    private void nhapngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapngayActionPerformed

    }//GEN-LAST:event_nhapngayActionPerformed

    private void nhapmadgpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapmadgpmActionPerformed

    }//GEN-LAST:event_nhapmadgpmActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giaodien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NutThoat3;
    private javax.swing.JTable banghienthidg;
    private javax.swing.JTable banghienthiphieumuon;
    private javax.swing.JTable banghienthisach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luudg;
    private javax.swing.JButton luusach;
    private javax.swing.JTextField nhapdiachi;
    private javax.swing.JTextField nhapemail;
    private javax.swing.JTextField nhapgiathanh;
    private javax.swing.JTextField nhapmadgpm;
    private javax.swing.JTextField nhapmaspm;
    private javax.swing.JTextField nhapngay;
    private javax.swing.JTextField nhapnhaxuatban;
    private javax.swing.JTextField nhapsdt;
    private javax.swing.JTextField nhapsoluongsach;
    private javax.swing.JTextField nhaptacgia;
    private javax.swing.JTextField nhaptendg;
    private javax.swing.JTextField nhaptensach;
    private javax.swing.JTextField nhaptheloaisach;
    private javax.swing.JTextField nhaptukhoadg;
    private javax.swing.JTextField nhaptukhoapm;
    private javax.swing.JTextField nhaptukhoasach;
    private javax.swing.JButton nutThoat1;
    private javax.swing.JButton nutThoat2;
    private javax.swing.JButton nuthuy1;
    private javax.swing.JButton nuthuy2;
    private javax.swing.JButton nuthuy3;
    private javax.swing.JButton nutluukhachmuon;
    private javax.swing.JButton nutsuasach;
    private javax.swing.JButton nutthemkhach;
    private javax.swing.JButton nuttimdg;
    private javax.swing.JButton nuttimpm;
    private javax.swing.JButton nuttimsach;
    private javax.swing.JButton nutxoa;
    private javax.swing.JButton nutxoakhachmuon;
    private javax.swing.JButton nútuakhachmuon;
    private javax.swing.JButton suadg;
    private javax.swing.JButton themdg;
    private javax.swing.JButton themsach;
    private javax.swing.JComboBox<String> tinhtrangsach;
    private javax.swing.JTextField tongsopm;
    private javax.swing.JTextField tongsosach;
    private javax.swing.JButton xoadg;
    // End of variables declaration//GEN-END:variables

    private Object getValueAt(int sosach) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
