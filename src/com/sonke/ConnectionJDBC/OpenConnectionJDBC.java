/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.ConnectionJDBC;

import com.sonke.dao.GiangVienDAO;
import java.security.Security;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NHS
 */
public class OpenConnectionJDBC {

    private static Connection conn;
    private static String user;
    private static String pass;
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=qlgv";

    public static Connection OpenJDBC() throws SQLException {
        user = "sa"; // tài khoản đăng nhập vào sql , mật khẩu ,
        pass = "12";
        conn = null;
        Connection c =null;
        //nạp driver và kết nối với cơ sở nếu thành công trả về kết nối thành công
        try {
            Security.setProperty("jdk.tls.disabledAlgorithms", "");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("KET NOI THANH CONG");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
}
