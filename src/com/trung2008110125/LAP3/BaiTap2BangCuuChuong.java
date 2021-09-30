package com.trung2008110125.LAP3;

public class BaiTap2BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("======Bang cuu chuong =======");
        for(int i = 1; i <= 10;i++){
            System.out.printf("\n--------BANG NHAN %d--------\n", i);
            for(int j = 0; j < 10; j++){
                System.out.printf("\t%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
