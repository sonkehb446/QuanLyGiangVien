/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.dao;

import com.sonke.model.GiangVienKTDN;
import java.util.List;

/**
 *
 * @author NHS
 */
public interface gvKTDNDAO {
      public List<GiangVienKTDN> getlist();
    public int update(GiangVienKTDN a, String MaGv);
}
