/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.ConnectionJDBC.OpenConnectionJDBC;
import com.sonke.model.GiangVienCNTT;
import com.sonke.model.GiangVienKTDN;
import com.sonke.model.GiangVienQTKD;
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
public class gvQTKDAOimpl implements gvQTKDAO {

    private static Connection conn;
    private static ArrayList<GiangVienQTKD> arr;

    @Override
    public List<GiangVienQTKD> getlist() {
        String TruyVan = "SELECT * from TB_GV where Khoa ='QTKD'";
        //Lay Du lieu
        Statement st;
        try {
            arr = new ArrayList();
            conn = OpenConnectionJDBC.OpenJDBC();
            st = conn.createStatement();
            ResultSet re = st.executeQuery(TruyVan);
            while (re.next()) {
                GiangVienQTKD a = new GiangVienQTKD(re.getString("MaGV"),
                        re.getString("FullName"), re.getString("Khoa"),
                        re.getBoolean("GioiTinh"), re.getString("DiaChi"),
                        re.getFloat("SoHDay"),
                        re.getFloat("TamUng"),
                        re.getFloat("Luong"), re.getFloat("ThucLinh"),
                        re.getString("TinhTrang"));
                arr.add(a);
            }

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

        return arr;
    }

    @Override
    public int update(GiangVienQTKD a, String MaGv) {
        Connection conn = null;
        int check = 1;
        try {
            String sql = "update TB_GV set SoHDay =?, TamUng=?, Luong=?, ThucLinh=?, TinhTrang=? where MaGV =?";
//             String sql = "update TB_GV set FullName=?,GioiTinh=?,Khoa=?,DiaChi=? where MaGV = ?";

            conn = OpenConnectionJDBC.OpenJDBC();
            PreparedStatement st = conn.prepareCall(sql);
            st.setFloat(1, a.getHday());
            st.setFloat(2, a.getTamUng());
            st.setDouble(3, a.tinhLuong());
            st.setDouble(4, a.tinhThucLinh());
            st.setString(5, a.getTinhTrang());
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

}
