/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.manager;

import com.sonke.dao.gvQTKDAOimpl;
import com.sonke.model.GiangVienQTKD;
import java.util.List;

/**
 *
 * @author NHS
 */
public class managerGvQTKD implements ThongKe {

    private List<GiangVienQTKD> listGiangVien;
    private gvQTKDAOimpl gvQTKD;

    public managerGvQTKD() {
        gvQTKD = new gvQTKDAOimpl();
        listGiangVien = gvQTKD.getlist();
    }

    public managerGvQTKD(List<GiangVienQTKD> listGiangVien) {
        this.listGiangVien = listGiangVien;
    }

    public List<GiangVienQTKD> ShowList() {
        return listGiangVien;
    }

    public int CapNhap(GiangVienQTKD a, String MaGV) {
        return gvQTKD.update(a, MaGV);
    }

    @Override
    public int TkSoluongGiangVien() {
        int sum = 0;
        for (GiangVienQTKD giangVienCNTT : listGiangVien) {
            sum++;
        }

        return sum;
    }

    @Override
    public double TkTongLuongGiangVien() {
        double sum = 0;
        for (GiangVienQTKD giangVienCNTT : listGiangVien) {
            sum += giangVienCNTT.getLuong();
        }
        return sum;
    }

    @Override
    public double TkSoLuongPhaiTra() {
        double sum = 0;
        for (GiangVienQTKD giangVienCNTT : listGiangVien) {
            sum += giangVienCNTT.getThucLinh();
        }
        return sum;
    }

    @Override
    public int SoLuongNoLuong() {
         int sum = 0;
        for (GiangVienQTKD GiangVienQTKD : listGiangVien) {
            if (GiangVienQTKD.getTinhTrang() != null) {
                if (GiangVienQTKD.getTinhTrang().equalsIgnoreCase("Chưa Thanh Toán")) {
                    System.out.println(GiangVienQTKD.getTinhTrang());
                    sum++;
                }
            }

        }
        return sum;
    }

    @Override
    public double TongTienNoLuong() {
        double sum = 0;
        for (GiangVienQTKD GiangVienQTKD : listGiangVien) {
            if (GiangVienQTKD.getTinhTrang() != null) {
                if (GiangVienQTKD.getTinhTrang().equalsIgnoreCase("Chưa Thanh Toán")) {
                    sum += GiangVienQTKD.getThucLinh();
                }
            }
        }

        return sum;
    }
}
