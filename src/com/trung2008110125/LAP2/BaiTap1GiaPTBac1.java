package com.trung2008110125.LAP2;
import java.util.Scanner;

public class BaiTap1GiaPTBac1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Giai phuong trinh ax+b=0");
        
        System.out.print("Nhap vao 2 so a va b: ");
        Double a= scanner.nextDouble(); 
        Double b= scanner.nextDouble(); 
        if(a==0)    
        { if(b==0)
            System.out.println("Vo so nghiem");
          else 
            System.out.println("Vo nghiem");
         }      
        else
        {Double x=-b/a;
        System.out.println("Nghiem x= "+x);
        }

    }
}
