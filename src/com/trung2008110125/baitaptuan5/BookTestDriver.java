package com.trung2008110125.baitaptuan5;

public class BookTestDriver {
    public static void main(String[] args) {
        Book book1 = new Book(200);
        book1.getGiaBan(10000);
        book1.getGiaNhap(7000);
        book1.getLoai("Sach giao khoa");
        book1.getNhaXuatBan("Bo GD&DT");
        book1.getNamXuatBan(2021);
        book1.getSoLuong(100);
        book1.bookshow();
    }
}
