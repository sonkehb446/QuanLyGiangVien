/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonke.model;

/**
 *
 * @author NHS
 */
public class GiangVienQTKD extends GiangVien {

    public GiangVienQTKD() {
    }

    public GiangVienQTKD(String MaGv, String HoTen, String MaKhoa, boolean GioiTinh, String DiaChi, float Hday, float TamUng) {
        super(MaGv, HoTen, MaKhoa, GioiTinh, DiaChi, Hday, TamUng);
    }

    public GiangVienQTKD(String MaGv, String HoTen, String MaKhoa, boolean GioiTinh, String DiaChi) {
        super(MaGv, HoTen, MaKhoa, GioiTinh, DiaChi);
    }

    public GiangVienQTKD(String MaGv, String HoTen, String MaKhoa, boolean GioiTinh, String DiaChi, float Hday, float TamUng, float Luong, float ThucLinh, String TinhTrang) {
        super(MaGv, HoTen, MaKhoa, GioiTinh, DiaChi, Hday, TamUng, Luong, ThucLinh, TinhTrang);
    }

    @Override
    public double tinhThucLinh() {
        return super.tinhThucLinh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTinhTrang(String TinhTrang) {
        super.setTinhTrang(TinhTrang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTinhTrang() {
        return super.getTinhTrang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDiaChi(String DiaChi) {
        super.setDiaChi(DiaChi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDiaChi() {
        return super.getDiaChi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGioiTinh(boolean GioiTinh) {
        super.setGioiTinh(GioiTinh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isGioiTinh() {
        return super.isGioiTinh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaKhoa(String MaKhoa) {
        super.setMaKhoa(MaKhoa); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaKhoa() {
        return super.getMaKhoa(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHoTen(String HoTen) {
        super.setHoTen(HoTen); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHoTen() {
        return super.getHoTen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaGv(String MaGv) {
        super.setMaGv(MaGv); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaGv() {
        return super.getMaGv(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setThucLinh(float ThucLinh) {
        super.setThucLinh(ThucLinh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getThucLinh() {
        return super.getThucLinh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTamUng(float TamUng) {
        super.setTamUng(TamUng); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getTamUng() {
        return super.getTamUng(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHday(float Hday) {
        super.setHday(Hday); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getHday() {
        return super.getHday(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLuong(float Luong) {
        super.setLuong(Luong); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getLuong() {
        return super.getLuong(); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
