/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.manager;

import com.sonke.dao.gvCNTTDAO;
import com.sonke.dao.gvCNTTDaoImpl;
import com.sonke.model.GiangVienCNTT;
import java.util.List;

/**
 *
 * @author NHS
 */
public class managerGvCNTT implements ThongKe {

    private List<GiangVienCNTT> listGiangVien;
    private gvCNTTDaoImpl gvCNTT;

    public managerGvCNTT() {
        gvCNTT = new gvCNTTDaoImpl();
        listGiangVien = gvCNTT.getlist();
    }

    public managerGvCNTT(List<GiangVienCNTT> listGiangVien) {
        this.listGiangVien = listGiangVien;
    }

    public List<GiangVienCNTT> ShowList() {
        return listGiangVien;
    }

    public int CapNhap(GiangVienCNTT a, String MaGV) {
        return gvCNTT.update(a, MaGV);
    }

    @Override
    public int TkSoluongGiangVien() {
        int sum = 0;
        for (GiangVienCNTT giangVienCNTT : listGiangVien) {
            sum++;
        }

        return sum;
    }

    @Override
    public double TkTongLuongGiangVien() {
        double sum = 0;
        for (GiangVienCNTT giangVienCNTT : listGiangVien) {
            sum += giangVienCNTT.getLuong();
        }
        return sum;
    }

    @Override
    public double TkSoLuongPhaiTra() {
        double sum = 0;
        for (GiangVienCNTT giangVienCNTT : listGiangVien) {
            sum += giangVienCNTT.getThucLinh();
        }
        return sum;
    }

    @Override
    public int SoLuongNoLuong() {
        int sum = 0;
        for (GiangVienCNTT giangVienCNTT : listGiangVien) {
            if (giangVienCNTT.getTinhTrang() != null) {
                if (giangVienCNTT.getTinhTrang().equalsIgnoreCase("Chưa Thanh Toán")) {
                    sum++;
                }
            }

        }
        return sum;
    }

    @Override
    public double TongTienNoLuong() {
        double sum = 0;
        for (GiangVienCNTT giangVienCNTT : listGiangVien) {
            if (giangVienCNTT.getTinhTrang() != null) {
                if (giangVienCNTT.getTinhTrang().equalsIgnoreCase("Chưa Thanh Toán")) {
                    sum += giangVienCNTT.getThucLinh();
                }
            }
        }

        return sum;
    }
    
    public void SapXepByLuong(){
        for (int i = 0; i < listGiangVien.size()-1 ; i++) {
            for (int j = i; j < listGiangVien.size(); j++) {
                
            }
        }
    }

}
