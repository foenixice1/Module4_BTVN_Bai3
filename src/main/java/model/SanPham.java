package model;

public class SanPham {
    int id;
    String ten;
    String mau;
    String gia;
    String loaiSP;

    public SanPham() {
    }

    public SanPham(int id, String ten, String mau, String gia, String loai) {
        this.id = id;
        this.ten = ten;
        this.mau = mau;
        this.gia = gia;
        this.loaiSP = loaiSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
}
