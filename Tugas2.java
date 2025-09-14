import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double massa, kecepatan, ketinggian, EP, EK, EM;

        System.out.print("Masukkkan massa : ");
        massa = scanner.nextDouble();
        System.out.print("Masukkan kecepatan : ");
        kecepatan  = scanner.nextDouble();
        System.out.print("Masukkan ketinggian : ");
        ketinggian = scanner.nextDouble();

        //misal gravitasi 10m/s2
        EP = massa*10*ketinggian;
        EK = 0.5*massa*kecepatan*kecepatan;
        EM = EP + EK;

        System.out.printf("%-5s= %.0f,   ","massa", massa);
        System.out.printf("%-5s= %.0f,   ","keceptan", kecepatan);
        System.out.printf("%-5s= %.0f%n","ketinggian", ketinggian);
        System.out.printf("%-25s= %.1f%n","Energi potensial", EP);
        System.out.printf("%-25s= %.1f%n","Energi kinetik", EK);
        System.out.printf("%-25s= %.1f%n","Energi kinetik", EM);

        scanner.close();
    }
}
