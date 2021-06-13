/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.model.GiangVien;
import java.util.List;

/**
 *
 * @author NHS
 */
public interface GiangVienDAO {

    public List<GiangVien> getList();

    public int ThemGV(GiangVien a);

    public int SuaGV(GiangVien a, String MaGv);

    public int XoaGV(String MaGiangVien);
}
