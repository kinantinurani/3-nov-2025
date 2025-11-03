import java.util.Scanner;

public class VolumeTabung {
    // Fungsi untuk menghitung volume tabung
    static double hitungVolume(double r, double t) {
        double volume = 3.14 * r * r * t;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(jari, tinggi);
        System.out.println("Volume tabung adalah: " + volume + " cm³");

        input.close();
    }
}

