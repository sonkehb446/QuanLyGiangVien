/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.model.GiangVienCNTT;
import java.util.List;

/**
 *
 * @author NHS
 */
public interface gvCNTTDAO {
    public List<GiangVienCNTT> getlist();
    public int update(GiangVienCNTT a, String MaGv);
    
}
