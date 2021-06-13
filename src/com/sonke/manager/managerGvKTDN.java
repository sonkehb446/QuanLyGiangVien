/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.manager;

import com.sonke.dao.gvKTDNDAOimpl;
import com.sonke.model.GiangVienKTDN;
import java.util.List;

/**
 *
 * @author NHS
 */
public class managerGvKTDN implements ThongKe{

    private List<GiangVienKTDN> listGiangVien;
    private gvKTDNDAOimpl gvKTDN;

    public managerGvKTDN() {
        gvKTDN = new gvKTDNDAOimpl();
        listGiangVien = gvKTDN.getlist();
    }

    public managerGvKTDN(List<GiangVienKTDN> listGiangVien) {
        this.listGiangVien = listGiangVien;
    }

    public List<GiangVienKTDN> ShowList() {
        return listGiangVien;
    }

    public int CapNhap(GiangVienKTDN a, String MaGV) {
        return gvKTDN.update(a, MaGV);
    }
    
    @Override
    public int TkSoluongGiangVien() {
        int sum = 0;
        for (GiangVienKTDN giangVienCNTT : listGiangVien) {
            sum++;
        }
        
        return sum;
    }
    
    @Override
    public double TkTongLuongGiangVien(){
        double sum = 0;
        for (GiangVienKTDN giangVienCNTT : listGiangVien) {
            sum +=giangVienCNTT.getLuong();
        }
        return sum;
    }
    
    @Override
    public double TkSoLuongPhaiTra(){
        double sum = 0;
        for (GiangVienKTDN giangVienCNTT : listGiangVien) {
            sum +=giangVienCNTT.getThucLinh();
        }
        return sum;
    }

    @Override
    public int SoLuongNoLuong() {
      int sum = 0;
        for (GiangVienKTDN GiangVienKTDN : listGiangVien) {
            if (GiangVienKTDN.getTinhTrang() != null) {
                if (GiangVienKTDN.getTinhTrang().equalsIgnoreCase("Chưa Thanh Toán")) {
                    System.out.println(GiangVienKTDN.getTinhTrang());
                    sum++;
                }
            }

        }
        return sum;
    }

    @Override
    public double TongTienNoLuong() {
        double sum = 0;
        for (GiangVienKTDN GiangVienKTDN : listGiangVien) {
            if (GiangVienKTDN.getTinhTrang() != null) {
                if (GiangVienKTDN.getTinhTrang().equalsIgnoreCase("Chưa Thanh Toán")) {
                    sum += GiangVienKTDN.getThucLinh();
                }
            }
        }

        return sum;
    }
}
