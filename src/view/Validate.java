package view;

import java.util.Scanner;

public class Validate {
    Scanner scanner = new Scanner(System.in);

    public int inputInteger(){
        int number = 0;
        while (true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Giu lieu nhap vao phai la so.\nNhap lai : ");
            }
        }
        return number;
    }

    public  String checkEmpty() {
        while (true) {
            String s = scanner.nextLine();
            if (s.trim().isEmpty() != true) {
                return s;
            } else {
                System.out.println("Du lieu dang bo trong, vui long nhap lai.\nNhap lai : ");
            }
        }
    }
}
