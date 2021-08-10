package view;

import controller.QLDanhBa;
import model.DanhBa;
import stogera.FileDanhBa;

import java.util.List;
import java.util.Scanner;

public class QLDanhBaView {
    private List<DanhBa> danhBaList = FileDanhBa.readFile("danhBa.txt");
    private QLDanhBa qlDanhBa = new QLDanhBa(danhBaList);
    private Validate validate = new Validate();

    public DanhBa newDanhBa(){
        System.out.println("Nhap so dien thoai : ");
        int sdt = validate.inputInteger();
        System.out.println("Nhap nhom danh ba");
        String nhomDanhBa = validate.checkEmpty();
        System.out.println("Nhap ten :");
        String ten = validate.checkEmpty();
        System.out.println("Nhap ngay sinh : ");
        String ngaySinh = validate.checkEmpty();
        System.out.println("Nhap gioi tinh :");
        String gioiTinh = validate.checkEmpty();
        System.out.println("Nhap dia chi :");
        String diaChi = validate.checkEmpty();
        System.out.println("Nhap email :");
        String email = validate.checkEmpty();

        DanhBa newDanhBa = new DanhBa(sdt,nhomDanhBa,ten,ngaySinh,gioiTinh,diaChi,email);
        return newDanhBa;
    }

    public void addDanhBa(){
        qlDanhBa.add(newDanhBa());
    }

    public void editDanhBa(int sdt){
        sdt = validate.inputInteger();
        System.out.println("Nhap nhom danh ba");
        String nhomDanhBa = validate.checkEmpty();
        System.out.println("Nhap ten :");
        String ten = validate.checkEmpty();
        System.out.println("Nhap ngay sinh : ");
        String ngaySinh = validate.checkEmpty();
        System.out.println("Nhap gioi tinh :");
        String gioiTinh = validate.checkEmpty();
        System.out.println("Nhap dia chi :");
        String diaChi = validate.checkEmpty();
        System.out.println("Nhap email :");
        String email = validate.checkEmpty();

        DanhBa newDanhBa = new DanhBa(sdt,nhomDanhBa,ten,ngaySinh,gioiTinh,diaChi,email);

        qlDanhBa.edit(sdt,newDanhBa);
    }

    public void deleteDanhba(){
        System.out.println("Nhap so dien thoai can xoa");
        int sdt = validate.inputInteger();
        qlDanhBa.delete(sdt);
    }

    public void searchDanhBa(){
        System.out.println("Nhap ten can tim kiem :");
        String name = validate.checkEmpty();
        System.out.println("Thong tin can tim voi ten la "+name+ ": ");
        for (DanhBa o: qlDanhBa.findByName(name)
             ) {
            System.out.println(o);
        }
    }

    public void showDanhBa(){
        System.out.println("Danh sach danh ba :");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhBaList.size(); i++) {
            System.out.println("nhan enter de hien thi tiep :");
            String enter = scanner.nextLine();
            if (enter.equals("")){
                System.out.println(danhBaList.get(i).toString());
            }
        }
    }



}
