/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.manager;

import com.sonke.dao.GiangVienDAOimpl;
import com.sonke.model.GiangVien;
import java.util.List;

/**
 *
 * @author NHS
 */
public class managerGV {

    private List<GiangVien> listGiangVien;
    private GiangVienDAOimpl gvCNTT;

    public managerGV() {
        gvCNTT = new GiangVienDAOimpl();
        listGiangVien = gvCNTT.getList();
    }

    public List<GiangVien> ShowList() {
        return listGiangVien;
    }

    public int ThemGV(GiangVien a) {
       return gvCNTT.ThemGV(a);
    }

    public int SuaGV(GiangVien a, String MaGv) {
        return gvCNTT.SuaGV(a, MaGv);
    }

    public int Xoa(String MaGiangVien) {
        return gvCNTT.XoaGV(MaGiangVien);
    }

}
