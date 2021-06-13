/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.main;

import com.sonke.dao.GiangVienDAOimpl;
import com.sonke.dao.KhoaDAOImpl;
import com.sonke.manager.managerGvCNTT;
import com.sonke.manager.managerGvKTDN;
import com.sonke.manager.managerGvQTKD;
import com.sonke.model.GiangVien;
import com.sonke.model.Khoa;
import com.sonke.view.Login;
import com.sonke.view.Menu;
import java.util.List;

/**
 *
 * @author NHS
 */
public class Main {

    public static void main(String[] args) {
//        managerGvCNTT a = new  managerGvCNTT();
//        a.ShowList();
//        
//        
//        managerGvKTDN b = new  managerGvKTDN();
//        b.ShowList();
//        
//        
//        managerGvQTKD c = new  managerGvQTKD();
//        c.ShowList();

        Login a = new Login();
        a.setVisible(true);
    }
    
}
