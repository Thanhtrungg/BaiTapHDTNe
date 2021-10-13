package com.trung2008110125.baitaptuan5;
import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);
    int gianhap,giaban,soluong,namxuatban;
    String nhaxuatban,loai;
    void getGiaNhap(int x) {
        gianhap = x;
    }
    void getGiaBan(int x) {
        giaban = x;
    }
    void getLoai(String type) {
        loai = type ;
    }
    void getSoLuong(int x) {
        soluong = x;
    }
    void getNhaXuatBan(String publisher) {
        nhaxuatban = publisher ;
    }
    void getNamXuatBan(int x) {
        namxuatban = x;
    }
    void bookshow() {
        System.out.println("Nha xuat ban: "+nhaxuatban);
        System.out.println("Nam xuat ban: "+namxuatban); 
        System.out.println("Gia nhap: "+gianhap);
        System.out.println("Gia ban: "+giaban);
        System.out.println("The loai:  "+loai);
        System.out.println("So luong: "+soluong);

    }
    Book(int amount) {
        soluong = amount;
    }
}

