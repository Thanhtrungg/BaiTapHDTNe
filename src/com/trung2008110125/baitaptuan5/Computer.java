package com.trung2008110125.baitaptuan5;
import java.util.Scanner;
public class Computer {
    Scanner scanner = new Scanner(System.in);
    int ram,nguon,ssd,hdd;
    String cpu,vga,main;
    void getCPU(String x) {
        cpu = x;
    }
    void getMainboard(String x) {
        main = x;
    }
    void getRAM(int x) {
        ram = x;
    }
    void getSSD(int x) {
        ssd = x;
    }
    void getHDD(int x) {
        hdd = x;
    }
    void getNguon(int x) {
        nguon = x;
    }
    void getVGA(String x) {
        vga = x;
    }
    void showComputer() {
        System.out.println("CPU: "+cpu);
        System.out.println("Mainboard: "+main);
        System.out.println("RAM: "+ram+"GB");
        System.out.println("SSD: "+ssd+"GB");
        System.out.println("HDD: "+hdd+"GB");
        System.out.println("VGA: "+vga);
        System.out.println("Nguon: "+nguon+"W");

    }
}


