package view;

import controller.QLDanhBa;

public class Run {
    static Validate validate = new Validate();
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        QLDanhBaView qlDanhBaView = new QLDanhBaView();
        int choice = -1;
        while (choice!=8){
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---- \nChọn chức năng theo số(để tiếp tục)");
            System.out.print("1. Xem danh sách \n2. Thêm mới \n3. Cập nhật \n4. Xoá \n5. Tìm kiếm" +
                    "\n6. Đọc từ file \n7. Ghi vào file \n8. Thoát \nChọn chức năng: ");
            choice = validate.inputInteger();
            switch (choice){
                case 1 :
                    qlDanhBaView.showDanhBa();
                    break;
                case 2 :
                    System.out.println("Nhap cac thong tin :");
                    qlDanhBaView.addDanhBa();
                    break;
                case 3 :
                    System.out.println("Nhap so dien thoai muon cap nhat :");
                    int sdt = validate.inputInteger();
                    qlDanhBaView.editDanhBa(sdt);
                    break;
                case 4 :
                    qlDanhBaView.deleteDanhba();
                    break;
                case 5 :
                    qlDanhBaView.searchDanhBa();
                    break;
                case 6 :
                    System.out.println("Da luu danh ba");
                case 7 :
                    System.out.println("Da luu danh ba");
            }
        }
    }
}
