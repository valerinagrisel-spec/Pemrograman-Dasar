import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        char ulang;

        do {
            System.out.println("==== Program Hitung Luas Bangun Datar ====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();


            switch (pilihan) {
                case 1 : 
                System.out.print("Masukkan sisi: ");
                int sisi = in.nextInt();

                int luasPersegi = hitungLuasPersegi(sisi);
                System.out.println("Luas Persegi adalah " +luasPersegi); break;
                

                case 2 : 
                System.out.print("Masukkan panjang: ");
                double pjg = in.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = in.nextDouble();

                double luasPersegiPanjang = hitungLuasPersegi(pjg, lebar);

                System.out.println("Luas Persegi Panjang adalah " +luasPersegiPanjang);
                System.out.println(); break;


                case 3 :
                System.out.print("Masukkan alas segitiga: ");
                double alasSgt = in.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSgt = in.nextDouble();

                double luasSgt = hitungLuasSegitiga(alasSgt, tinggiSgt);

                System.out.println("Luas Segitiga adalah " +luasSgt);
                System.out.println(); break;


                case 4 :
                System.out.print("Masukkan jari-jari lingkaran: ");
                double rLingkaran = in.nextDouble();
                
                double luasLingkaran = hitungLuasLingkaran(rLingkaran);

                System.out.println("Luas lingkaran adalah " +luasLingkaran);
                System.out.println(); break;
                

                case 0 : 
                System.out.println("Program selesai"); 
                return;


                default : System.out.println("Pilihan tidak valid!");
                System.out.println();
            } 

            System.out.print("Apakah Anda ingin mengulang? (y/n): ");
            ulang = in.next().charAt(0);
            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');
        in.close();
    }


    // fungsi luas persegi
    public static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    // fungsi luas persegi panjang
    public static double hitungLuasPersegi(double pjg, double lebar) {
        return pjg * lebar;
    }

    // fungsi luas segitiga
    public static double hitungLuasSegitiga(double alasSgt, double tinggiSgt) {
        return 0.5 * alasSgt * tinggiSgt;
    }

    // fungsi luas lingkaran
    public static double hitungLuasLingkaran(double rLingkaran) {
        return 3.14 * rLingkaran * rLingkaran;
    }

}
