package com.trung2008110125.baitaptuan5;

public class ComputertestDriver {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.getCPU("i5 10400F");
        pc.getMainboard("B460");
        pc.getRAM(16);
        pc.getSSD(256);
        pc.getHDD(1);
        pc.getVGA("GTX 1650 Super");
        pc.getNguon(500);
        pc.showComputer();
    }
}

