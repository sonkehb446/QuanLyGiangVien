/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.ConnectionJDBC.OpenConnectionJDBC;
import com.sonke.model.GiangVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NHS
 */
public class GiangVienDAOimpl implements GiangVienDAO {

    private Connection conn;
    private static ArrayList<GiangVien> arr;

    @Override
    public List<GiangVien> getList() {
        String TruyVan = "SELECT * from TB_GV";
        //Lay Du lieu
        Statement st;
        try {
            arr = new ArrayList();
            conn = OpenConnectionJDBC.OpenJDBC();
            st = conn.createStatement();
            ResultSet re = st.executeQuery(TruyVan);
            while (re.next()) {
                GiangVien a = new GiangVien(re.getString("MaGV"),
                        re.getString("FullName"), re.getString("Khoa"),
                        re.getBoolean("GioiTinh"), re.getString("DiaChi"),
                        re.getFloat("SoHDay"),
                        re.getFloat("TamUng"),
                        re.getFloat("Luong"), re.getFloat("ThucLinh"),
                        re.getString("TinhTrang"));
                arr.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("lOI");
        } finally {
            try {
                conn.close();
                System.out.println("Huy Thanh Cong");
            } catch (SQLException ex) {
                System.out.println("lOI");
            }
        }
        return arr;
    }

    @Override
    public int ThemGV(GiangVien a) {
        //Lay Du lieu
        int check = 1;
        try {
            String sql = "INSERT INTO TB_GV(MaGV,FullName,GioiTinh,Khoa,DiaChi ) VALUES (?,?,?,?,?)";
            conn = OpenConnectionJDBC.OpenJDBC();
            PreparedStatement st = conn.prepareCall(sql); // Chen Du lieu Vao CSDL
            st.setString(1, a.getMaGv());
            st.setString(2, a.getHoTen());
            st.setBoolean(3, a.isGioiTinh());
            st.setString(4, a.getMaKhoa());
            st.setString(5, a.getDiaChi());
            arr.add(a);
            st.execute();
            check = 0;

        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
                System.out.println("Huy Thanh Cong");
            } catch (SQLException ex) {
                System.out.println("lOI");
            }
        }
        return check;
    }

    @Override
    public int SuaGV(GiangVien a, String MaGv) {
        int check =1;
        try {
            String sql = "update TB_GV set MaGV =?, FullName=?, GioiTinh=?, Khoa=?, DiaChi=? where MaGV =?";
            conn = OpenConnectionJDBC.OpenJDBC();
            PreparedStatement st = conn.prepareCall(sql);
            st.setString(1, a.getMaGv());
            st.setString(2, a.getHoTen());
            st.setBoolean(3, a.isGioiTinh());
            st.setString(4, a.getMaKhoa());
            st.setString(5, a.getDiaChi());
            st.setString(6, MaGv);
            st.execute();
            check = 0;

        } catch (SQLException ex) {
            System.out.println("Loi");
            System.out.println(ex.toString());
        } finally {
            try {
                conn.close();
                System.out.println("Huy Thanh Cong");
            } catch (SQLException ex) {
                System.out.println("lOI");
            }
        }
        return check;
    }

    @Override
    public int XoaGV(String MaGiangVien) {
        int check =1;
        try {
            String sql = "delete from TB_GV WHere MaGV=?";
            conn = OpenConnectionJDBC.OpenJDBC();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, MaGiangVien);
            ps.execute();
            check = 0;

        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                conn.close();
                System.out.println("Huy Thanh Cong");
            } catch (SQLException ex) {
                System.out.println("lOI");
            }
        }
        return check;
    }

}
