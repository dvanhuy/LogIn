
package Service;

import Define.Product;
import Getconnect.ConnectServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>();
        Connection connection = ConnectServer.getConnection();
        String sql = "SELECT * FROM SanPham";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            
            while( rs.next()) {
                Product product = new Product();
                
                product.setMaSP(rs.getString("maSP"));// tên cột
                product.setTenSP(rs.getString("tenSP"));
                product.setDonGiaBan(rs.getFloat("donGiaBan"));
                product.setTenNSX(rs.getString("tenNSX"));
                product.setSoLuongHienCon(rs.getInt("soLuongHienCon"));
                
                products.add(product);
            }
        } catch(SQLException e){
            System.out.println("lay lai du lieu loi");
        }
        return products;
    }
    
    public Product searchSanPham(String id)
    {
        Product product= new Product();
        Connection connect = ConnectServer.getConnection();
        
        try {
            String sql=  "select * \n" +
                         "from SanPham \n" +
                         "where maSP=? \n";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            product.setMaSP(rs.getString("maSP"));// tên cột
            product.setTenSP(rs.getString("tenSP"));
            product.setDonGiaBan(rs.getFloat("donGiaBan"));
            product.setTenNSX(rs.getString("tenNSX"));
            product.setSoLuongHienCon(rs.getInt("soLuongHienCon"));
            
            return product;
            
        }
        catch(SQLException e)
        {
            System.out.println("tim sp theo ma khong thay");
            return null;
        }      
    }
    
    public void deteleTaiLieu(String id)
    {
        Connection connection = ConnectServer.getConnection();
        String sql = "delete SanPham "
                + "where maSP=?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);        
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
                System.out.println("ham xoa loi");
        }
    }
    
    
    public Product getdataProduct(String productid)
    {
        Product product= new Product();
        Connection connect = ConnectServer.getConnection();
        
        try {
            String sql=  "select * " +
                         "from SanPham " +
                         "where maSP=? ";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1,productid);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            product.setMaSP(rs.getString("maSP"));// tên cột
            product.setTenSP(rs.getString("tenSP"));
            product.setDonGiaBan(rs.getFloat("donGiaBan"));
            product.setTenNSX(rs.getString("tenNSX"));
            product.setSoLuongHienCon(rs.getInt("soLuongHienCon"));
            
            return product;
            
        }
        catch(SQLException e)
        {
            System.out.println("tim product theo ma khong thay");
            return null;
        }      
    }
    
    public void updateDataProduct(Product product)
    {
        Connection connect = ConnectServer.getConnection();
        try {
            String sql=  "UPDATE SanPham "
                    + "SET tenSP=?,donGiaBan=?,tenNSX=? ,soLuongHienCon=? "
                    + "WHERE maSP=?";
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            pstmt.setString(1, product.getTenSP());
            pstmt.setFloat(2, product.getDonGiaBan());
            pstmt.setString(3, product.getTenNSX());
            pstmt.setInt(4, product.getSoLuongHienCon());
            pstmt.setString(5, product.getMaSP());
            
            pstmt.execute();
        }
        catch(SQLException e)
        {
            System.out.println("Lỗi lúc cập nhật dữ liệu SP lên");
        }      
    }
    
    public void addUser(Product product)
    {
            Connection connection = ConnectServer.getConnection();
            
            String sql = "INSERT INTO SanPham "
                    + "values(dbo.FN_idTiepSanPham(),?,?,?,?)";
            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, product.getTenSP());
                preparedStatement.setFloat(2, product.getDonGiaBan());
                preparedStatement.setString(3, product.getTenNSX());
                preparedStatement.setInt(4, product.getSoLuongHienCon());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
                System.out.println("Lổi tại lúc chèn dữ liệu");
        }
    }
    
}
