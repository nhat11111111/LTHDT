package QLCB;
import java.util.Scanner;

public class KySu extends CanBo
{
    Scanner in = new Scanner(System.in);
    
    String nganhDaoTao;
    
    KySu()
    {
        super();
    }
    KySu(String hoTen)
    {
        super(hoTen);
    }
    KySu(String hoTen, String tuoi)
    {
        super(hoTen, tuoi);
    }
    KySu(String hoTen, String Tuoi, String gioiTinh)
    {
        super(hoTen, Tuoi, gioiTinh);
    }
    KySu(String hoTen, String Tuoi, String gioiTinh, String diaChi)
    {
        super(hoTen, Tuoi, gioiTinh, diaChi);
    }
    KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao)
    {
        super(hoTen, Tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
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
        return Tuoi;
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
    public void setNganhDaoTao(String nganhDaoTao)
    {
        this.nganhDaoTao = nganhDaoTao;
    }
    public String getNganhDaoTao(String nganhDaoTao)
    {
        return nganhDaoTao;
    }
    
    public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap nganh dao tao: ");
        nganhDaoTao = in.nextLine();
        System.out.print("\n");
    }
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Nganh dao tao: " +nganhDaoTao);
    }
}

