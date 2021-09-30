package com.trung2008110125.LAP3;
import java.util.Scanner;
public class BaiTap3MangSoNguyen {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);
        
    do {
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
        
 
    int array[] = new int[n];
        
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
        

    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }

   
     for (int i = 0; i < n - 1; i++) {
    for (int j = i + 1; j <= n - 1; j++) {
        if (array[i] < array[j]) {
            tempSort = array[i];
            array[i] = array[j];
            array[j] = tempSort;
        }
    }
    }

    System.out.println("\nMảng sau khi sắp xếp theo thứ tự giảm dần là: ");
    for (int i = 0; i < n; i++) {
    System.out.print(array[i] + "\t");       
}

    
      for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (array[i] > array[j]) {
                tempSort = array[i];
                array[i] = array[j];
                array[j] = tempSort;
            }
        }
        }
        

        System.out.println("\nMảng sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t"); 
        
         }

        
         timMin(array,n);

         trungBinhCong(array, n);
        

  
}

static void timMin(int a[], int n){
int min = a[0];
for(int m = 1; m < n; m++){
    if(min > a[m]){
        min = a[m];
    }
}
System.out.println("\nPhần tử có giá trị nhỏ nhất trong mảng là: " + min);
}


static void trungBinhCong(int a[], int n){
int tong = 0;
int dem=0;
for(int k = 0; k < n; k++){
    if(a[k] % 3 == 0){
        tong += a[k];
        dem++;
    }
}
double tongTB = tong/dem;
System.out.printf("Trung bình cộng các phần tử chia hết cho 3 là: %.2f", tongTB);
}
}
