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
public class GiangVien {

    protected String MaGv;
    protected String HoTen;
    protected String MaKhoa;
    protected boolean GioiTinh;
    protected String DiaChi;
    protected float Hday;
    protected float TamUng;
    protected float Luong;
    protected float ThucLinh;
    protected String TinhTrang;

    public GiangVien() {
    }

    public GiangVien(String MaGv, String HoTen, String MaKhoa, boolean GioiTinh, String DiaChi, float Hday, float TamUng) {
        this.MaGv = MaGv;
        this.HoTen = HoTen;
        this.MaKhoa = MaKhoa;
        this.GioiTinh = GioiTinh;

        this.DiaChi = DiaChi;
        this.Hday = Hday;
        this.TamUng = TamUng;
    }

    public GiangVien(String MaGv, String HoTen, String MaKhoa, boolean GioiTinh, String DiaChi) {
        this.MaGv = MaGv;
        this.HoTen = HoTen;
        this.MaKhoa = MaKhoa;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public GiangVien(String MaGv, String HoTen, String MaKhoa, boolean GioiTinh, String DiaChi, float Hday, float TamUng, float Luong, float ThucLinh,String TinhTrang) {
        this.MaGv = MaGv;
        this.HoTen = HoTen;
        this.MaKhoa = MaKhoa;
        this.GioiTinh = GioiTinh;

        this.DiaChi = DiaChi;
        this.Hday = Hday;
        this.TamUng = TamUng;
        this.Luong = Luong;
        this.ThucLinh = ThucLinh;
        this.TinhTrang =TinhTrang;
    }

    public double tinhLuong() {
        return (double) (getHday() * (200));
    }

    public double tinhThucLinh() {
        double a = tinhLuong();
        return (a - getTamUng());
    }
//    public implements float implements Luong();
//
//    public float implements ThucLinh();

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }
    
    public float getHday() {
        return Hday;
    }

    public void setHday(float Hday) {
        this.Hday = Hday;
    }

    public float getTamUng() {
        return TamUng;
    }

    public void setTamUng(float TamUng) {
        this.TamUng = TamUng;
    }

    public float getThucLinh() {
        return ThucLinh;
    }

    public void setThucLinh(float ThucLinh) {
        this.ThucLinh = ThucLinh;
    }

    public String getMaGv() {
        return MaGv;
    }

    public void setMaGv(String MaGv) {
        this.MaGv = MaGv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
     @Override
    public String toString() {
        return String.format("%-15s%-20s%-10s%-10s%6f%20f%20f%25f%30s", getMaGv(),getHoTen(),getMaKhoa(),getDiaChi(),getHday(),getTamUng(),getLuong(),getThucLinh(),getTinhTrang());
        
    }
    
    

}
