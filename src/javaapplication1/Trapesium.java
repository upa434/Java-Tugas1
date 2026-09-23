package javaapplication1;

import java.util.Scanner;

public class Trapesium {
    double a, b, c, d;
    double tinggi;

    public double hitungKeliling() {
        return a + b + c + d;
    }

    public double hitungLuas() {
        return 0.5 * (a + c) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Trapesium tp = new Trapesium();

        System.out.println("=== HITUNG TRAPESIUM ===");
        System.out.print("Masukkan sisi a (alas atas): ");
        tp.a = input.nextDouble();
        System.out.print("Masukkan sisi b: ");
        tp.b = input.nextDouble();
        System.out.print("Masukkan sisi c (alas bawah): ");
        tp.c = input.nextDouble();
        System.out.print("Masukkan sisi d: ");
        tp.d = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tp.tinggi = input.nextDouble();

        System.out.println("------------------------");
        System.out.println("Keliling = " + tp.hitungKeliling());
        System.out.println("Luas     = " + tp.hitungLuas());
        input.close();
    }
}