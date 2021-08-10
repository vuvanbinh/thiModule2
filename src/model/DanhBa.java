package model;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private int sdt;
    private String nhomDanhBa;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String email;

    public DanhBa() {
    }

    public DanhBa(int sdt, String nhomDanhBa, String ten,
                  String ngaySinh, String gioiTinh, String diaChi, String email) {
        this.sdt = sdt;
        this.nhomDanhBa = nhomDanhBa;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                " So dien thoai ='" + sdt + '\'' +
                ", Nhom danh ba ='" + nhomDanhBa + '\'' +
                ", Ten ='" + ten + '\'' +
                ", Ngay sinh ='" + ngaySinh + '\'' +
                ", Gioi Tinh ='" + gioiTinh + '\'' +
                ", Dia chi ='" + diaChi + '\'' +
                ", Email ='" + email + '\'' +
                '}';
    }
}
