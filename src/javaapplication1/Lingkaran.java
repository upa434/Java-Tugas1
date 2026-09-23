package javaapplication1;

import java.util.Scanner;

public class Lingkaran {
    double r;

    public double hitungKeliling() {
        return 2 * 3.14 * r;
    }

    public double hitungLuas() {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();

        System.out.println("=== HITUNG LINGKARAN ===");
        System.out.print("Masukkan jari-jari (r): ");
        l.r = input.nextDouble();

        System.out.println("------------------------");
        System.out.println("Keliling = " + l.hitungKeliling());
        System.out.println("Luas     = " + l.hitungLuas());
        input.close();
    }
}