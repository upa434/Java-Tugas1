package javaapplication1;

import java.util.Scanner;

public class SegitigaSamaKaki {
    double alas;
    double sisiKaki;
    double tinggi;

    public double hitungKeliling() {
        return alas + (2 * sisiKaki);
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SegitigaSamaKaki sk = new SegitigaSamaKaki();

        System.out.println("=== HITUNG SEGITIGA SAMA KAKI ===");
        System.out.print("Masukkan alas (a): ");
        sk.alas = input.nextDouble();
        System.out.print("Masukkan sisi kaki (b): ");
        sk.sisiKaki = input.nextDouble();
        System.out.print("Masukkan tinggi (t): ");
        sk.tinggi = input.nextDouble();

        System.out.println("---------------------------------");
        System.out.println("Keliling = " + sk.hitungKeliling());
        System.out.println("Luas     = " + sk.hitungLuas());
        input.close();
    }
}