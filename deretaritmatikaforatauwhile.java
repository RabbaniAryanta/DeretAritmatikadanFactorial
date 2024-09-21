package TugasRumahwoyy;

import java.util.Scanner;

public class deretaritmatikaforatauwhile{
/*
** program untuk menampilkan deret aritmatika dengan menggunakan For atau While
** pengguna diminta untuk memasukkan angka awal, akhir dan beda.
** lalu program akan menampilkan deret aritmatika dengan menggunakan For atau While.
** beda boleh negatif, positif, tetapi jika negatif maka angka awal diharuskan untuk lebih 
   besar daripada angka akhir.
*/

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        // buat input
        System.out.println("Masukkan Angka awal");
        int awal = f.nextInt();

        System.out.println("Masukkan Angka akhir");
        int akhir = f.nextInt();

        System.out.println("Masukkan Angka beda (boleh negatif dengan input diberi negatif sebelum angka)");
        int beda = f.nextInt();

        // memasukkan mau menggunakan for atau while
        System.out.println("Pilih mode Perhitungan");
        System.out.println("1.) For");
        System.out.println("2.) While");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = f.nextInt();

        // for atau while
        switch (pilihan) {
            case 1:
                // for
                if (beda > 0) {
                    // positif
                    System.out.println("Perhitungan for");
                    for (int i = awal; i <= akhir; i += beda) {
                        System.out.println(i + " ");
                    }
                } else if (beda < 0) {
                    // negatif
                    System.out.println("Perhitungan for");
                    for (int i = awal; i >= akhir; i += beda) {
                        System.out.println(i + " ");

                    }
                } else {
                    System.out.println("invalid");
                }
                break;
            case 2:
                // while
                if (beda > 0) {
                    // positif
                    int i = awal;
                    System.out.println("Perhitungan while");
                    while (i <= akhir) {
                        System.out.println(i + " ");
                        i += beda;
                    }

                } else if (beda < 0) {
                    // negatif
                    int i = awal;
                    System.out.println("Perhitungan while");
                    while (i >= akhir) {
                        System.out.println(i + " ");
                        i += beda;
                    }
                } else {
                    System.out.println("invalid");
                }
                break;
        }
        f.close();

    }

}
