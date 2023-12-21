package QLCB;

import java.util.Scanner;

public class NhanVien extends CanBo
{
    Scanner in = new Scanner(System.in);
    
    String congViec;
    
    NhanVien()
    {
        super();
    }
    NhanVien(String hoTen)
    {
        super(hoTen);
    }
    NhanVien(String hoTen, String Tuoi)
    {
        super(hoTen, Tuoi );
    }
    NhanVien(String hoTen, String Tuoi, String gioiTinh)
    {
        super(hoTen, Tuoi, gioiTinh);
    }
    NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi)
    {
        super(hoTen, Tuoi, gioiTinh, diaChi);
    }
    NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec)
    {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    
    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }
    public String getHoTen()
    {
        return hoTen;
    }
    public void setTuoi(String ngaySinh)
    {
        this.Tuoi = Tuoi;
    }
    public String getTuoi()
    {
        return getTuoi();
    }
    public void setGioiTinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }
    public String getGioiTinh()
    {
        return gioiTinh;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getDiaChi()
    {
        return diaChi;
    }
    public void setCongViec(String congViec)
    {
        this.congViec = congViec;
    }
    public String getCongViec()
    {
        return congViec;
    }
    
    public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap cong viec: ");
        congViec = in.nextLine();
        System.out.print("\n");
    }
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Cong viec: " +congViec);
    }
}


