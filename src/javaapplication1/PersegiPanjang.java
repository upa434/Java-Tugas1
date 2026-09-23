package javaapplication1;

import java.util.Scanner;

public class PersegiPanjang {
    double panjang;
    double lebar;

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersegiPanjang pp = new PersegiPanjang();

        System.out.println("=== HITUNG PERSEGI PANJANG ===");
        System.out.print("Masukkan panjang: ");
        pp.panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        pp.lebar = input.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Keliling = " + pp.hitungKeliling());
        System.out.println("Luas     = " + pp.hitungLuas());
        input.close();
    }
}