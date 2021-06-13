/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.model.GiangVienQTKD;
import java.util.List;

/**
 *
 * @author NHS
 */
public interface gvQTKDAO {
      public List<GiangVienQTKD> getlist();
    public int update(GiangVienQTKD a, String MaGv);
}
