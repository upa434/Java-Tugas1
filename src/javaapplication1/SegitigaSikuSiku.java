package javaapplication1;

import java.util.Scanner;

public class SegitigaSikuSiku {
    double alas;
    double tinggi;
    double sisiMiring;

    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SegitigaSikuSiku ss = new SegitigaSikuSiku();

        System.out.println("=== HITUNG SEGITIGA SIKU-SIKU ===");
        System.out.print("Masukkan alas (a): ");
        ss.alas = input.nextDouble();
        System.out.print("Masukkan tinggi (b): ");
        ss.tinggi = input.nextDouble();
        System.out.print("Masukkan sisi miring (c): ");
        ss.sisiMiring = input.nextDouble();

        System.out.println("---------------------------------");
        System.out.println("Keliling = " + ss.hitungKeliling());
        System.out.println("Luas     = " + ss.hitungLuas());
        input.close();
    }
}