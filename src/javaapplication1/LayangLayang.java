package javaapplication1;

import java.util.Scanner;

public class LayangLayang {
    double a, b;
    double d1, d2;

    public double hitungKeliling() {
        return 2 * (a + b);
    }

    public double hitungLuas() {
        return 0.5 * d1 * d2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LayangLayang ly = new LayangLayang();

        System.out.println("=== HITUNG LAYANG-LAYANG ===");
        System.out.print("Masukkan sisi a: ");
        ly.a = input.nextDouble();
        System.out.print("Masukkan sisi b: ");
        ly.b = input.nextDouble();
        System.out.print("Masukkan diagonal 1: ");
        ly.d1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        ly.d2 = input.nextDouble();

        System.out.println("----------------------------");
        System.out.println("Keliling = " + ly.hitungKeliling());
        System.out.println("Luas     = " + ly.hitungLuas());
        input.close();
    }
}