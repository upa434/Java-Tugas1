package javaapplication1;

import java.util.Scanner;

public class JajaranGenjang {
    double alas;
    double sisiMiring;
    double tinggi;

    public double hitungKeliling() {
        return 2 * (alas + sisiMiring);
    }

    public double hitungLuas() {
        return alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JajaranGenjang jg = new JajaranGenjang();

        System.out.println("=== HITUNG JAJARAN GENJANG ===");
        System.out.print("Masukkan alas (a): ");
        jg.alas = input.nextDouble();
        System.out.print("Masukkan sisi miring (b): ");
        jg.sisiMiring = input.nextDouble();
        System.out.print("Masukkan tinggi (t): ");
        jg.tinggi = input.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Keliling = " + jg.hitungKeliling());
        System.out.println("Luas     = " + jg.hitungLuas());
        input.close();
    }
}