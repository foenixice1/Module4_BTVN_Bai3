package service;

import model.LoaiSP;
import model.SanPham;

import java.util.ArrayList;

public class SanPhamService {
    public ArrayList<SanPham> list = new ArrayList<>();
    public ArrayList<LoaiSP> listLoai = new ArrayList<>();

    public SanPhamService() {
        listLoai.add(new LoaiSP("VN"));
        listLoai.add(new LoaiSP("TQ"));
        list.add(new SanPham(1,"Tao","Do","5000",listLoai.get(0).getTenLoai()));
        list.add(new SanPham(2,"Nho","Tim","10000",listLoai.get(0).getTenLoai()));
        list.add(new SanPham(3,"Chuoi","Vang","2000",listLoai.get(1).getTenLoai()));
        list.add(new SanPham(4,"Buoi","Xanh","15000",listLoai.get(1).getTenLoai()));
    }
    public void save(SanPham sanPham) {
        list.add(sanPham);
    }
    public void edit(SanPham sanPham, int index) {
        list.set(index,sanPham);
    }
    public void delete(int index){
        list.remove(index);
    }
}
