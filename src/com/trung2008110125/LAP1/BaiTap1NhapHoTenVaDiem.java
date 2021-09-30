package com.trung2008110125.LAP1;
import java.util.Scanner;
public class BaiTap1NhapHoTenVaDiem {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Họ và tên: ");

        String hoTen=scanner.nextLine();

        System.out.print("Điểm TB: ");

        double diemTB=scanner.nextDouble();

        System.out.printf("%s %.2fđiểm",hoTen,diemTB);


    }
    
}