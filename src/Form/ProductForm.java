
package Form;

import Define.Product;
import Define.User;
import Service.ProductService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductForm extends javax.swing.JFrame {

    ProductService productService;
    DefaultTableModel defaultTableModel;
    User usercode;
     
    public ProductForm() {
        initComponents();
        productService = new ProductService();
    }
    
    public ProductForm(User user) {
        initComponents();
        productService = new ProductService();
        tentaikhoan.setText(user.getTenTK());
        tenvaitro.setText(user.getVaiTro());
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }    
        };
        tabledata.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên SP");
        defaultTableModel.addColumn("Đơn giá");
        defaultTableModel.addColumn("Tên NSX");
        defaultTableModel.addColumn("Số lượng");
        
        setTableData(productService.getAllProduct());
        
        if (user.getVaiTro().equals("User"))
        {
            ButtonThem.setEnabled(false);
            ButtonSua.setEnabled(false);
            ButtonXoa.setEnabled(false);
        }
        
        usercode = new User(user);
        
    }

    private void setTableData(List<Product> products)
    {
        products.forEach((i) -> {
            defaultTableModel.addRow(new Object[]{i.getMaSP(),i.getTenSP(),i.getDonGiaBan(),
                i.getTenNSX(),i.getSoLuongHienCon()});
        }); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ButtonThem = new javax.swing.JButton();
        ButtonXoa = new javax.swing.JButton();
        ButtonSua = new javax.swing.JButton();
        ButtonTim = new javax.swing.JButton();
        ButtonThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tentaikhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tenvaitro = new javax.swing.JTextField();
        signoutbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sản phẩm");

        jPanel2.setLayout(new java.awt.GridLayout(1, 5, 20, 20));

        ButtonThem.setBackground(new java.awt.Color(51, 255, 51));
        ButtonThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonThem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonThem.setText("Thêm");
        ButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThemActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonThem);

        ButtonXoa.setBackground(new java.awt.Color(255, 51, 51));
        ButtonXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        ButtonXoa.setText("Xóa");
        ButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXoaActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonXoa);

        ButtonSua.setBackground(new java.awt.Color(51, 51, 255));
        ButtonSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonSua.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSua.setText("Sửa");
        ButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSuaActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSua);

        ButtonTim.setBackground(new java.awt.Color(255, 102, 255));
        ButtonTim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonTim.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTim.setText("Tìm");
        ButtonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonTim);

        ButtonThoat.setBackground(new java.awt.Color(102, 102, 102));
        ButtonThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonThoat.setForeground(new java.awt.Color(255, 255, 255));
        ButtonThoat.setText("Thoát");
        ButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThoatActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonThoat);

        tabledata.setModel(new javax.swing.table.DefaultTableModel(
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
        tabledata.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabledata);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý sản phẩm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản :");

        tentaikhoan.setEditable(false);
        tentaikhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tentaikhoan.setText("Chưa đăng nhập");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Vai trò :");

        tenvaitro.setEditable(false);
        tenvaitro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tenvaitro.setText("User");

        signoutbutton.setBackground(new java.awt.Color(255, 51, 51));
        signoutbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signoutbutton.setForeground(new java.awt.Color(255, 255, 255));
        signoutbutton.setText("Đăng xuất");
        signoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbuttonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Users");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tentaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tenvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tentaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tenvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signoutbutton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThemActionPerformed
        new Addproduct(usercode).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonThemActionPerformed

    private void ButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXoaActionPerformed
        int row = tabledata.getSelectedRow();
        String id="";
        if (row == -1) {
            String x=JOptionPane.showInputDialog(null,"Nhập mã tài liệu cần xóa");
            if (x==null) System.out.print("");
            else {
                id=x;
                productService.deteleTaiLieu(x);
            }
        }
        else
        {
            id+=String.valueOf(tabledata.getValueAt (row, 0));
            int confirm = JOptionPane.showConfirmDialog(this, "Ban chac chan muon xoa khong?");
            if (confirm == JOptionPane. YES_OPTION)
            {
                String userId =String.valueOf(tabledata.getValueAt (row, 0));
                productService.deteleTaiLieu(userId);
            }
        }
        defaultTableModel.setRowCount(0);
        setTableData(productService.getAllProduct());
    }//GEN-LAST:event_ButtonXoaActionPerformed

    private void ButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSuaActionPerformed
        int row = tabledata.getSelectedRow();
        if (row == -1) {
            String x=JOptionPane.showInputDialog(null,"Nhập mã tài liệu cần sửa");
            if (x==null || x.equals(""));
            else if (productService.searchSanPham(x)==null)
            {
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã "+x+" trong danh sách", "Sửa", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                new UpdateProduct(x,usercode).setVisible(true);
                this.dispose();
            }
        }
        else
        {
            String userId =String.valueOf(tabledata.getValueAt (row, 0));
            new UpdateProduct(userId,usercode).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ButtonSuaActionPerformed

    private void ButtonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimActionPerformed
        String x=JOptionPane.showInputDialog(null,"Nhập mã tài liệu cần tìm");
        if (x==null) ;
        else if (productService.searchSanPham(x)==null)
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy mã "+x+" trong danh sách", "Tìm", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            new Search(productService.searchSanPham(x),usercode).setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_ButtonTimActionPerformed

    private void ButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonThoatActionPerformed

    private void signoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbuttonActionPerformed
        new SignIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signoutbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ListUser(usercode).setVisible(true);
        this.dispose();      
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
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        User user = new User();
        user.setVaiTro("Admin");
        user.setTenTK("huy");
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new ProductForm(user).setVisible(true);
        }      
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSua;
    private javax.swing.JButton ButtonThem;
    private javax.swing.JButton ButtonThoat;
    private javax.swing.JButton ButtonTim;
    private javax.swing.JButton ButtonXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton signoutbutton;
    private javax.swing.JTable tabledata;
    private javax.swing.JTextField tentaikhoan;
    private javax.swing.JTextField tenvaitro;
    // End of variables declaration//GEN-END:variables
}
