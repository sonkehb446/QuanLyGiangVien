/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.ConnectionJDBC.OpenConnectionJDBC;
import com.sonke.model.Khoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NHS
 */
public class KhoaDAOImpl implements KhoaDAO {

    @Override
    public List<Khoa> getList() {
        Connection conn = null;
        try {
            conn = OpenConnectionJDBC.OpenJDBC();
        } catch (SQLException ex) {
            Logger.getLogger(KhoaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * from TB_Khoa";
        List<Khoa> ListKhoa = new ArrayList();
        try {
            //Truy Van + Lay Du Lieu
            Statement st = conn.createStatement();
            //con tro
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Khoa ab = new Khoa(rs.getString("MaKhoa"), rs.getString("TenKhoa"));
                ListKhoa.add(ab);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }finally{
         try {
                conn.close();
                System.out.println("huy ThanhCong");
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }}
       
        return ListKhoa;
    }
}
