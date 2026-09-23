package javaapplication1;

import java.util.Scanner;

public class BelahKetupat {
    double sisi;
    double d1;
    double d2;

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return 0.5 * d1 * d2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BelahKetupat bk = new BelahKetupat();

        System.out.println("=== HITUNG BELAH KETUPAT ===");
        System.out.print("Masukkan sisi (p): ");
        bk.sisi = input.nextDouble();
        System.out.print("Masukkan diagonal 1: ");
        bk.d1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        bk.d2 = input.nextDouble();

        System.out.println("----------------------------");
        System.out.println("Keliling = " + bk.hitungKeliling());
        System.out.println("Luas     = " + bk.hitungLuas());
        input.close();
    }
}