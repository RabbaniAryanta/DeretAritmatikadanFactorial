package TugasRumahwoyy;

import java.util.Scanner;

public class factorial {
    // menghitung faktorial
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        // menghitung dan menampilkan hasil
        int hasilFaktorial = hitungFaktorial(angka);
        System.out.println(" = " + hasilFaktorial);
        
        scanner.close();
    }

    public static int hitungFaktorial(int n) {
        int temp = 1;
        System.out.println(n + "!");
        for (int i = n; i > 0; i--) {
            temp *= i;
            System.out.print(i);
            if (i != 1) {
                System.out.print(" x ");
            } else {
                System.out.print("");
            }
        }
        return temp;
    }
}
