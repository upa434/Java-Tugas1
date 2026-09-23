package javaapplication1;

import java.util.Scanner;

public class SegitigaSamaSisi {
    double sisi;
    double tinggi;

    public double hitungKeliling() {
        return 3 * sisi;
    }

    public double hitungLuas() {
        return 0.5 * sisi * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SegitigaSamaSisi sss = new SegitigaSamaSisi();

        System.out.println("=== HITUNG SEGITIGA SAMA SISI ===");
        System.out.print("Masukkan sisi (a): ");
        sss.sisi = input.nextDouble();
        System.out.print("Masukkan tinggi (t): ");
        sss.tinggi = input.nextDouble();

        System.out.println("---------------------------------");
        System.out.println("Keliling = " + sss.hitungKeliling());
        System.out.println("Luas     = " + sss.hitungLuas());
        input.close();
    }
}