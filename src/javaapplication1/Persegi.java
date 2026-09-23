package javaapplication1;

import java.util.Scanner;

public class Persegi {
    double sisi;

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persegi p = new Persegi();

        System.out.println("=== HITUNG PERSEGI ===");
        System.out.print("Masukkan sisi: ");
        p.sisi = input.nextDouble();

        System.out.println("----------------------");
        System.out.println("Keliling = " + p.hitungKeliling());
        System.out.println("Luas     = " + p.hitungLuas());
        input.close();
    }
}